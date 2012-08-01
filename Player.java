package net.minecraft.src.ZeldaOoT;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class Player extends EntityPlayer
{	ZeldaMana Mana = new ZeldaMana();

	public Player(World par1World) {
		super(par1World);
		
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
	@Override
	public void func_6420_o() {
		// TODO Auto-generated method stub
		
	}
}
