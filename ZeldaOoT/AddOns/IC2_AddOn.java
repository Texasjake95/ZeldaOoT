package texasjake95.ZeldaOoT.AddOns;

import texasjake95.Core.AddOns.AddonHandlerCore;
import texasjake95.Core.AddOns.IC2_AddOnCore;
import texasjake95.Core.AddOns.Interfaces.IIC2AddOn;
import codechicken.nei.API;
import net.minecraft.src.*;
import static texasjake95.ZeldaOoT.Resource.ZeldaItems.*;
import net.minecraft.src.ic2.api.*;

public class IC2_AddOn extends IC2_AddOnCore implements IIC2AddOn
{
	public static ItemStack goldDust= null;
	public static ItemStack ironDust= null;
	
	
	public static void init() {
		try {
			ModLoader.getLogger().finer(AddonHandler.getLogMessage("IC2 detected; attempting to initialize IC2 addon"));
				
			
			
			ModLoader.getLogger().finer(AddonHandler.getLogMessage("IC2 initialized"));
		}
		catch (Exception e) {
			ModLoader.getLogger().fine(AddonHandler.getLogMessage("Failed to initialize IC2 Addon"));
			e.printStackTrace(System.err);
		}
	}

	
	public static void GetRecipes()
	{
		
	}

	public static void GetNames() {
	
		
	}

	public static void NEI() 
	{
		if(IC2 == false)
		{
		API.hideItem(swordGuilded.shiftedIndex);
		API.hideItem(swordRazor.shiftedIndex);
		}
		
	}


	@Override
	public void getNames() {
		if (IC2 == true)
	       {goldDust = Items.getItem("goldDust");
	    	ironDust= Items.getItem("ironDust");
	    	   if(x == true){ModLoader.addRecipe(new ItemStack(swordGuilded, 1), new Object[] {
	    		"XXX",
	    		Character.valueOf('X'), IC2_AddOn.goldDust});}
	    	   Ic2Recipes.addMaceratorRecipe(new ItemStack(oreBlock,1, 11), new ItemStack(ironDust.getItem() , 2));
	    	   Ic2Recipes.addMaceratorRecipe(new ItemStack(oreBlock,1, 12), new ItemStack(goldDust.getItem() , 2));	       
	       }
		
	}


	@Override
	public void getRecipes() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void Register() {
		// TODO Auto-generated method stub
		
	}


}
