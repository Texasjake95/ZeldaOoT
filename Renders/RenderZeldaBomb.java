package net.minecraft.src.ZeldaOoT.Renders;
import org.lwjgl.opengl.GL11;

import net.minecraft.src.*;
import net.minecraft.src.ZeldaOoT.*;

public class RenderZeldaBomb extends Render{
	 
	protected ModelBase ModelZeldaBomb;

	    public RenderZeldaBomb()
	    {
	        this.shadowSize = 0.25F;
	        this.ModelZeldaBomb = new ModelZeldaBomb();
	    }

	public void RenderZeldaBomb(EntityZeldaBomb par1EntityBoat, double par2, double par4, double par6, float par8, float par9)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)par2, (float)par4, (float)par6);
        GL11.glRotatef(0, 0.0F, 2.0F, 0.0F);
        float var12 = 1F;
        GL11.glScalef(var12, var12, var12);
        GL11.glScalef(1.0F / var12, 1.0F / var12, 1.0F / var12);
        this.loadTexture("/ZeldaOoT/Resources/Entities/Bomb.png");
        this.ModelZeldaBomb.render(par1EntityBoat, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }
		
public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
{
    this.RenderZeldaBomb((EntityZeldaBomb)par1Entity, par2, par4, par6, par8, par9);
}

		
		
		
	}

