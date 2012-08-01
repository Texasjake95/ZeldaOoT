package net.minecraft.src.ZeldaOoT;

import java.util.ArrayList;
import net.minecraft.src.*;


import net.minecraft.src.forge.*;

public class ItemZeldaSword extends ItemSword implements ITextureProvider
{
        
	public ItemZeldaSword(int i, EnumToolMaterial enumtoolmaterial)
        {
                super(i, enumtoolmaterial);
        }
        
        public String getTextureFile()
        {
                return "/ZeldaOoT/Resources/Items.png";
        }
        public void addCreativeItems(ArrayList itemList)
    	{
    		itemList.add(new ItemStack(this));
    	}


}