package net.minecraft.src.ZeldaOoT;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityList;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Facing;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;
import net.minecraft.src.forge.ITextureProvider;

public class ItemZeldaBomb extends Item implements ITextureProvider{

	public ItemZeldaBomb(int par1) {
		super(par1);
		
	}
	public String getTextureFile()
     {
             return "/ZeldaOoT/Resources/Items.png";
     }
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7)
    {
        if (par3World.isRemote)
        {
            return true;
        }
       
        else
        {
            int var8 = par3World.getBlockId(par4, par5, par6);
            par4 += Facing.offsetsXForSide[par7];
            par5 += Facing.offsetsYForSide[par7];
            par6 += Facing.offsetsZForSide[par7];
            double var9 = 0.0D;

            if (par7 == 1 && var8 == Block.fence.blockID || var8 == Block.netherFence.blockID)
            {
                var9 = 0.5D;
            }

            if (spawnCreature(par3World, "ZeldaBomb", (double)par4 + 0.5D, (double)par5 + var9, (double)par6 + 0.5D) && !par2EntityPlayer.capabilities.isCreativeMode)
            {
                --par1ItemStack.stackSize;
            }

            return true;
        }
    	
}
	    		
   	public static boolean spawnCreature(World par0World, String Name, double par2, double par4, double par6)
	        {
	            
	           
	                Entity var8 = EntityList.createEntityByName(Name, par0World);
	                
	                if (var8 != null)
	                {
	                    var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0F, 0.0F);
	                    par0World.spawnEntityInWorld(var8);
	                }

	                return var8 != null;
	            }
	        
Minecraft mc = ModLoader.getMinecraftInstance();
}
