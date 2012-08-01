package net.minecraft.src.ZeldaOoT;

import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ModLoader;
import net.minecraft.src.NBTTagCompound;

public class ZeldaMana {
	Minecraft mc = ModLoader.getMinecraftInstance();
	private static int ManaBar = 100;
	private static int prevManaBar = 100;
	public static int getCurrentMana()
	{
		return ManaBar;
	}
	public static void addMana(int par1)
	{
		 ManaBar = Math.min(par1 + ManaBar, 100);
	}
	public static void removeMana(int par1)
	{
		ManaBar = ManaBar-par1;
	}
	public static void setManaBar(int par1)
    {
        ManaBar = par1;
    }
	public void onUpdate(EntityPlayer par1EntityPlayer)
    {
		prevManaBar = ManaBar;
		
    }
	public void readNBT(NBTTagCompound par1NBTTagCompound)
    {
	if (par1NBTTagCompound.hasKey("ManaBar"))
    {
		ZeldaMana.ManaBar = par1NBTTagCompound.getInteger("ManaBar");
    }
    }
	public void writeNBT(NBTTagCompound par1NBTTagCompound)
    {	
        par1NBTTagCompound.setInteger("ManaBar", ZeldaMana.ManaBar);
        
    }

}
