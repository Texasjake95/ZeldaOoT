package net.minecraft.src.ZeldaOoT.Renders;
import org.lwjgl.opengl.GL11;

import net.minecraft.src.*;
import net.minecraft.src.ZeldaOoT.*;

public class RenderZeldaHorse extends RenderLiving
{
    public RenderZeldaHorse(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    public void renderHorse(EntityZeldaHorse par1EntityCow, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityCow, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderHorse((EntityZeldaHorse)par1EntityLiving, par2, par4, par6, par8, par9);
    }

   
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderHorse((EntityZeldaHorse)par1Entity, par2, par4, par6, par8, par9);
    }
}

