package net.minecraft.src.ZeldaOoT;

import net.minecraft.src.forge.*;
import net.minecraft.src.*;


public class ItemZeldaGems extends Item implements ITextureProvider
{

	
	public ItemZeldaGems(int par1) 
	{
		super(par1);
        setHasSubtypes(true);
        maxStackSize = 64;
	}
	
	public int getIconFromDamage(int i)
	{
	switch(i)
	{
		case 1: return mod_ZeldaOoT.ItemTexture(1,0);
		case 2: return mod_ZeldaOoT.ItemTexture(2,0);
		case 3: return mod_ZeldaOoT.ItemTexture(1, 2);
		case 4:	return mod_ZeldaOoT.ItemTexture(2, 2);
		default: return mod_ZeldaOoT.ItemTexture(0,0);
	}
	}
	public int setDamageFromMetadata(int i, int metadata)
	{
	switch(metadata)
	{
	    case 1: return 1;
	    case 2: return 2;
	    case 3: return 3;
	    case 4: return 4;
	    
	    default: return 0;
	}
	}
	private String[] names = new String[]{"Emerald", "Ruby", "Sapphire","Copper","Tin"};
	public String getItemNameIS(ItemStack itemstack)
    {
        return names[itemstack.getItemDamage()];
    }
	 public String getTextureFile()
     {
             return "/ZeldaOoT/Resources/Items.png";
     }
}