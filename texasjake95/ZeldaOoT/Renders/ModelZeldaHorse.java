package texasjake95.ZeldaOoT.Renders;
import net.minecraft.src.*;
public class ModelZeldaHorse extends ModelBase
{
  //fields
    ModelRenderer head1;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer neck;
    ModelRenderer head2;
  
  public ModelZeldaHorse()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      head1 = new ModelRenderer(this, 0, 5);
      head1.addBox(-1.5F, -3F, -8F, 3, 3, 8);
      head1.setRotationPoint(-2F, -2F, -11F);
      head1.setTextureSize(64, 64);
      head1.mirror = true;
      setRotation(head1, 0F, 0F, 0F);
      body = new ModelRenderer(this, 34, 0);
      body.addBox(-4F, -8F, -7F, 8, 16, 7);
      body.setRotationPoint(-2F, 2F, 0F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 1.570796F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 16);
      leg1.addBox(-3F, 0F, -2F, 3, 15, 3);
      leg1.setRotationPoint(-3F, 9F, 7F);
      leg1.setTextureSize(64, 64);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 16);
      leg2.addBox(-1F, 0F, -2F, 3, 15, 3);
      leg2.setRotationPoint(0F, 9F, 7F);
      leg2.setTextureSize(64, 64);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-3F, 0F, -3F, 3, 15, 3);
      leg3.setRotationPoint(-3F, 9F, -5F);
      leg3.setTextureSize(64, 64);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(-1F, 0F, -3F, 3, 15, 3);
      leg4.setRotationPoint(0F, 9F, -5F);
      leg4.setTextureSize(64, 64);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      neck = new ModelRenderer(this, 22, 0);
      neck.addBox(-1.5F, -7F, -1.5F, 3, 9, 3);
      neck.setRotationPoint(-2F, 2F, -8F);
      neck.setTextureSize(64, 64);
      neck.mirror = true;
      setRotation(neck, 0.7435722F, 0F, 0F);
      head2 = new ModelRenderer(this, 0, 0);
      head2.addBox(-1.5F, -1F, -4F, 3, 1, 4);
      head2.setRotationPoint(-2F, -5F, -11F);
      head2.setTextureSize(64, 64);
      head2.mirror = true;
      setRotation(head2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    head1.render(f5);
    body.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    neck.render(f5);
    head2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
  {

      this.body.rotateAngleX = ((float)Math.PI / 2F);
      this.leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
  }

}
