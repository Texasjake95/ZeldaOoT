package texasjake95.ZeldaOoT.AddOns;

import codechicken.nei.API;
import net.minecraft.src.*;
import static texasjake95.ZeldaOoT.Resource.ZeldaItems.*;
import net.minecraft.src.ic2.api.*;

public class IC2_AddOn extends AddonHandler
{
	public static ItemStack goldDust= null;
	public static ItemStack ironDust= null;
	
	
	public static void init() {
		try {
			ModLoader.getLogger().finer(AddonHandler.getLogMessage("IC2 detected; attempting to initialize IC2 addon"));
				
			AddonHandler.IC2 = true;
			
			ModLoader.getLogger().finer(AddonHandler.getLogMessage("IC2 initialized"));
		}
		catch (Exception e) {
			ModLoader.getLogger().fine(AddonHandler.getLogMessage("Failed to initialize IC2 Addon"));
			e.printStackTrace(System.err);
		}
	}

	
	public static void GetRecipes()
	{
		if (AddonHandler.IC2 == true)
	       {goldDust = Items.getItem("goldDust");
	    	ironDust= Items.getItem("ironDust");
	    	   if(AddonHandler.x == true){ModLoader.addRecipe(new ItemStack(swordGuilded, 1), new Object[] {
	    		"XXX",
	    		Character.valueOf('X'), IC2_AddOn.goldDust});}
	    	   Ic2Recipes.addMaceratorRecipe(new ItemStack(oreBlock,1, 11), new ItemStack(ironDust.getItem() , 2));
	    	   Ic2Recipes.addMaceratorRecipe(new ItemStack(oreBlock,1, 12), new ItemStack(goldDust.getItem() , 2));	       
	       }
	}

	public static void GetNames() {
	
		
	}

	public static void NEI() 
	{
		if(AddonHandler.IC2 == false)
		{
		API.hideItem(swordGuilded.shiftedIndex);
		API.hideItem(swordRazor.shiftedIndex);
		}
		
	}

}
