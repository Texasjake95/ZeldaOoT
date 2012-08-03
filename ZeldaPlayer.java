package net.minecraft.src.ZeldaOoT;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.PlayerAPI;
import net.minecraft.src.PlayerBase;
import net.minecraft.src.World;

public class ZeldaPlayer extends PlayerBase
{ZeldaMana Mana = new ZeldaMana();

	public ZeldaPlayer(PlayerAPI playerapi) {
		super(playerapi);
	}	
	
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);
		this.Mana.readNBT(par1NBTTagCompound);
	}
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);
		this.Mana.writeNBT(par1NBTTagCompound);
	}
}