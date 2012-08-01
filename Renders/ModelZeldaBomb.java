package net.minecraft.src.ZeldaOoT.Renders;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;
import net.minecraft.src.Render;

public class ModelZeldaBomb extends ModelBase
{
	 ModelRenderer fuse2;
	    ModelRenderer bomb;
	    ModelRenderer fuse3;
	    ModelRenderer cap;
	    ModelRenderer fuse1;
	  
	  public ModelZeldaBomb()
	  {
	    textureWidth = 64;
	    textureHeight = 32;
	    
	      fuse2 = new ModelRenderer(this, 36, 0);
	      fuse2.addBox(0F, 0F, 0F, 2, 1, 1);
	      fuse2.setRotationPoint(0F, 7F, 0F);
	      fuse2.setTextureSize(64, 32);
	      fuse2.mirror = true;
	      setRotation(fuse2, 0F, 0F, 0F);
	      bomb = new ModelRenderer(this, 0, 0);
	      bomb.addBox(0F, 0F, 0F, 5, 5, 5);
	      bomb.setRotationPoint(-2F, 0F, -2F);
	      bomb.setTextureSize(64, 32);
	      bomb.mirror = true;
	      setRotation(bomb, 0F, 0F, 0F);
	      fuse3 = new ModelRenderer(this, 42, 0);
	      fuse3.addBox(0F, 0F, 0F, 2, 1, 1);
	      fuse3.setRotationPoint(1F, 8F, 0F);
	      fuse3.setTextureSize(64, 32);
	      fuse3.mirror = true;
	      setRotation(fuse3, 0F, 0F, 0F);
	      cap = new ModelRenderer(this, 20, 0);
	      cap.addBox(0F, 0F, 0F, 3, 1, 3);
	      cap.setRotationPoint(-1F, 5F, -1F);
	      cap.setTextureSize(64, 32);
	      cap.mirror = true;
	      setRotation(cap, 0F, 0F, 0F);
	      fuse1 = new ModelRenderer(this, 32, 0);
	      fuse1.addBox(0F, 0F, 0F, 1, 1, 1);
	      fuse1.setRotationPoint(0F, 6F, 0F);
	      fuse1.setTextureSize(64, 32);
	      fuse1.mirror = true;
	      setRotation(fuse1, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5);
	    fuse2.render(f5);
	    bomb.render(f5);
	    fuse3.render(f5);
	    cap.render(f5);
	    fuse1.render(f5);
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	  
	  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.setRotationAngles(f, f1, f2, f3, f4, f5);
	  }
}
