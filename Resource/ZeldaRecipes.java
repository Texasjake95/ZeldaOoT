package texasjake95.ZeldaOoT.Resource;

import texasjake95.Core.EasyRecipes;
import texasjake95.Core.IRecipeHandler;
import texasjake95.ZeldaOoT.AddOns.AddonHandler;
import net.minecraft.src.forge.oredict.*;
import net.minecraft.src.*;
import static texasjake95.ZeldaOoT.Resource.ZeldaItems.*;

public class ZeldaRecipes extends EasyRecipes implements IRecipeHandler{

	public void getRecipes() {
		 	addRecipe(new ItemStack(Ocarina, 1, 3), new Object[] { "XYX","XXX","X  ", 'X', Block.glass, 'Y', Item.diamond});
			addRecipe(new ItemStack(HeroBow, 1, 0), new Object[] { "XYZ","Y Z","XYZ", 'X', Item.goldNugget, 'Y', Item.stick, 'Z', Item.silk});
			addRecipe(new ItemStack(HeroBow, 1, 0), new Object[] { " X","XY", 'X', Item.goldNugget, 'Y', Item.bow});
			
			ForgeOre(new ItemStack(SpiritualStones, 1,1),  "XYX","XXX","YXY", 'X', Item.goldNugget, 'Y', "gemSapphire");
			ForgeOre(new ItemStack(SpiritualStones, 1,0),  "XYX","XYX","XYX", 'X', Item.goldNugget, 'Y', "gemRuby");
			ForgeOre(new ItemStack(SpiritualStones, 1,2),  "XYY","XYX","XXX", 'X', Item.goldNugget, 'Y', "gemEmerald");
			
			addRecipe(new ItemStack(ClothSheet, 6), new Object[] { "XX","XX","XX", 'X', Block.cloth});
			
			addRecipe(new ItemStack(plateGZelda, 1), new Object[] { "X X","XXX","XXX", 'X', ClothSheet});
			addRecipe(new ItemStack(bootsGZelda, 1), new Object[] { "X X","X X", 'X', ClothSheet});
			addRecipe(new ItemStack(helmetGZelda, 1), new Object[] { "XXX","X X", 'X', ClothSheet});
			addRecipe(new ItemStack(legsGZelda, 1), new Object[] { "XXX","X X","X X", 'X', ClothSheet});
			addRecipe(new ItemStack(bootsBZelda, 1), new Object[] { "X X","X X","Y Y", 'X', ClothSheet, 'Y', Item.ingotIron});

			MetaSmelt(oreBlock.blockID, 3, new ItemStack(Gems, 1, 3));
			MetaSmelt(oreBlock.blockID, 4, new ItemStack(Gems, 1, 4));
			MetaSmelt(oreBlock.blockID, 8, new ItemStack(Gems, 1, 3));
			MetaSmelt(oreBlock.blockID, 9, new ItemStack(Gems, 1, 4));
			MetaSmelt(oreBlock.blockID, 11, new ItemStack(Item.ingotIron, 1));
			MetaSmelt(oreBlock.blockID, 12, new ItemStack(Item.ingotGold, 1));

						
			addRecipe(new ItemStack(swordKokiri), new Object[] { " X ","YYY", 'X', Item.ingotIron, 'Y', Item.stick});
			  //TODO Add recipes for Razor and Guilded
			AddonHandler.GetRecipes();
	}
	
	
}
