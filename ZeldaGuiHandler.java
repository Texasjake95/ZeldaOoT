package net.minecraft.src.ZeldaOoT;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import net.minecraft.src.forge.IGuiHandler;

public class ZeldaGuiHandler implements IGuiHandler{

	@Override
	public Object getGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
				return z;
		
	}

}
