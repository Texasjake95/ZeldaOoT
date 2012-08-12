package texasjake95.ZeldaOoT;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;
import static texasjake95.ZeldaOoT.Resource.ZeldaItems.*;
import static texasjake95.ZeldaOoT.ZeldaMana.*;


public class ItemZeldaBow extends Item implements ITextureProvider
{ 
	public ItemZeldaBow(int par1)
    {
        super(par1);
        this.maxStackSize = 1;
        this.setMaxDamage(0);
    }
	public int getIconIndex(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
	    {
	     
	        if (usingItem != null && usingItem.getItem().shiftedIndex == HeroBow.shiftedIndex)
	        {
	        	
	        	int k = usingItem.getMaxItemUseDuration() - useRemaining;
	            if (k >= 18) return mod_ZeldaOoT.ItemTexture(15, 15);
	            if (k >  13) return mod_ZeldaOoT.ItemTexture(14, 15);
	            if (k >   0) return mod_ZeldaOoT.ItemTexture(13, 15);
	        }
	       return mod_ZeldaOoT.ItemTexture(8, 1);
	       
	    }
	 public int getIconFromDamage(int i)
     {
             switch(i){
                             case 1: return mod_ZeldaOoT.ItemTexture(9, 1);
                             default: return mod_ZeldaOoT.ItemTexture(8, 1);         
     }
}
	
	 public int setDamageFromMetadata(int i, int metadata)
	{
	switch(metadata)
	{
	    case 1: return 1;
	    default: return 0;
	}
	}
	private String[] names = new String[]{"Normal", "Fire", "Ice", "Bomb" };
	public String getItemNameIS(ItemStack itemstack)
    {
        return names[itemstack.getItemDamage()];
    }
	 public String getTextureFile()
     {
             return "/ZeldaOoT/Resources/Items.png";
     }
    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
    {
    	int a = par1ItemStack.getItemDamage();
    	 
        if (ForgeHooks.onArrowLoose(par1ItemStack, par2World, par3EntityPlayer, getMaxItemUseDuration(par1ItemStack) - par4))
        {
            return;
        }
        
        boolean var5 = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;
        boolean Creative = par3EntityPlayer.capabilities.isCreativeMode;
        if (var5 || par3EntityPlayer.inventory.hasItem(Item.arrow.shiftedIndex))
        {
            int var6 = this.getMaxItemUseDuration(par1ItemStack) - par4;
            float var7 = (float)var6 / 20.0F;
            var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;

            if ((double)var7 < 0.1D)
            {
                return;
            }

            if (var7 > 1.0F)
            {
                var7 = 1.0F;
            }

            EntityZeldaArrow var8 = new EntityZeldaArrow(par2World, par3EntityPlayer, var7 * 2.0F);
           
            if (var7 == 1.0F)
            {
                var8.arrowCritical = true;
            }

            if (a == 0)
            {
            	var8.explode = false;
            	var8.FireArrow = false;
            	var8.IceArrow = false;
            }
           if (a == 1)
           {
        	   if (ZeldaMana.getCurrentMana() >= 10)
        	   {
        	   var8.FireArrow();
        	   ZeldaMana.removeMana(10);
        	   }
        	   if (ZeldaMana.getCurrentMana() <10)
        		   
        	   {
        		   mc.ingameGUI.addChatMessage("Not Enough Mana");
        	   }
        	  
           }
           if (a == 2)
           {
        	   var8.IceArrow = true;
           }
            if (a == 3 & (par3EntityPlayer.inventory.hasItem(Bomb.shiftedIndex) || Creative) )
            {
            	var8.explode = true;
            	if (!Creative)
            	{
            		par3EntityPlayer.inventory.consumeInventoryItem(Bomb.shiftedIndex);
            	}
            }

            par1ItemStack.damageItem(1, par3EntityPlayer);
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);

            if (!var5)
            {
                par3EntityPlayer.inventory.consumeInventoryItem(Item.arrow.shiftedIndex);
            }
            else
            {
                var8.doesArrowBelongToPlayer = false;
            }

            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(var8);
            }
        }
    }

    public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        return par1ItemStack;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
    	return EnumAction.bow;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        ItemStack stack = ForgeHooks.onArrowNock(par1ItemStack, par2World, par3EntityPlayer);
        if (stack != null)
        {
            return stack;
        }
        
        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(Item.arrow.shiftedIndex))
        {
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        }
       
        return par1ItemStack;
    }
   
    
    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
   
    
    public int getItemEnchantability()
    {
        return 0;
    }
	Minecraft mc = ModLoader.getMinecraftInstance();

	
}

