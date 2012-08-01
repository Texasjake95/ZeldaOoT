package net.minecraft.src.ZeldaOoT.AddOns;

import net.minecraft.src.*;
import net.minecraft.src.ZeldaOoT.*;
import net.minecraft.src.ZeldaOoT.Resource.ItemMaps;
import static net.minecraft.src.ZeldaOoT.Resource.ZeldaItems.*;
import net.minecraft.src.thaumcraft.api.*;

public class ThaumCraft_AddOn extends AddonHandler
{
	public static void init() {
		try {
			ModLoader.getLogger().finer(AddonHandler.getLogMessage("ThaumCraft detected; attempting to initialize ThaumCraft addon"));
			
			AddonHandler.TC2 = true;

			ModLoader.getLogger().finer(AddonHandler.getLogMessage("ThaumCraft initialized"));
		}
		catch (Exception e) {
			ModLoader.getLogger().fine(AddonHandler.getLogMessage("Failed to initialize ThaumCraft Addon"));
			e.printStackTrace(System.err);
		}
	}

	
	
public static void GetRecipes()
{
	
	
	if (AddonHandler.TC2 == true)
	{//TODO VIS math :P
		RecipesInfuser.infusing().addInfusing(new ItemStack(plateRZelda), 250, new ItemStack[]{new ItemStack(plateGZelda),new ItemStack(Item.bucketLava)});
		RecipesInfuser.infusing().addInfusing(new ItemStack(plateBZelda), 250, new ItemStack[]{new ItemStack(plateGZelda),new ItemStack(Item.bucketWater)});
		RecipesInfuser.infusing().addInfusing(new ItemStack(swordMaster), 300, new ItemStack[]{new ItemStack(SpiritualStones, 1,2),new ItemStack(SpiritualStones, 1,0),new ItemStack(SpiritualStones, 1,1),new ItemStack(swordKokiri), new ItemStack(Item.ingotIron)});
		RecipesCrucible.smelting().addSmelting(plateBZelda.shiftedIndex, 48);
		RecipesCrucible.smelting().addSmelting(swordMaster.shiftedIndex, ItemMaps.swordMasterVis);
		RecipesCrucible.smelting().addSmelting(Gems.shiftedIndex, ItemMaps.GemsVis);
		RecipesCrucible.smelting().addSmelting(SpiritualStones.shiftedIndex, ItemMaps.SpiritualStonesVis);
		RecipesCrucible.smelting().addSmelting(ClothSheet.shiftedIndex, ItemMaps.ClothSheetVis);
		RecipesCrucible.smelting().addSmelting(swordKokiri.shiftedIndex, ItemMaps.swordKokiriVis);
		//RecipesCrucible.smelting().addSmelting(swordGuilded.shiftedIndex, ItemMaps.swordGuildedVis);
		//RecipesCrucible.smelting().addSmelting(swordRazor.shiftedIndex, ItemMaps.swordRazorVis);
		RecipesCrucible.smelting().addSmelting(helmetGZelda.shiftedIndex, ItemMaps.helmetGZeldaVis);
		RecipesCrucible.smelting().addSmelting(plateGZelda.shiftedIndex, ItemMaps.plateGZeldaVis);
		RecipesCrucible.smelting().addSmelting(legsGZelda.shiftedIndex, ItemMaps.legsGZeldaVis);
		RecipesCrucible.smelting().addSmelting(bootsGZelda.shiftedIndex, ItemMaps.bootsGZeldaVis);
		RecipesCrucible.smelting().addSmelting(plateRZelda.shiftedIndex, ItemMaps.plateRZeldaVis);
		RecipesCrucible.smelting().addSmelting(plateBZelda.shiftedIndex, ItemMaps.plateBZeldaVis);
		RecipesCrucible.smelting().addSmelting(bootsBZelda.shiftedIndex, ItemMaps.bootsBZeldaVis);
		RecipesCrucible.smelting().addSmelting(HeroBow.shiftedIndex, ItemMaps.HeroBowVis);
		RecipesCrucible.smelting().addSmelting(Ocarina.shiftedIndex, ItemMaps.OcarinaVis);

	}
	if (AddonHandler.TC2 == false)
	{
		 ModLoader.addRecipe(new ItemStack(plateBZelda, 1), new Object[] { "X X","XYX","XXX", 'X', ClothSheet, 'Y', Item.bucketWater});
		 ModLoader.addRecipe(new ItemStack(plateRZelda, 1), new Object[] { "X X","XYX","XXX", 'X', ClothSheet, 'Y', Item.bucketLava});
		 ModLoader.addRecipe(new ItemStack(swordMaster, 1), new Object[] { " 5 ","143"," 2 ", '1',new ItemStack(SpiritualStones, 1,2),'2',new ItemStack(SpiritualStones, 1,0),'3',new ItemStack(SpiritualStones, 1,1),'4',swordKokiri,'5', Item.ingotIron});
	} 
}

public static void GetNames() 
{
	
	
}
public static void EMC()
{
	if (AddonHandler.TC2 == true)
	{
		ItemMaps.plateRZeldaEMC = 1216;
		ItemMaps.plateBZeldaEMC = 1153;
	}
	if (AddonHandler.TC2 == false)
	{
		ItemMaps.plateRZeldaEMC = 1168;
		ItemMaps.plateBZeldaEMC = 1105;
	}
}
}
