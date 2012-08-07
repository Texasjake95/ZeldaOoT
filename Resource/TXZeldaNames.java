package texasjake95.ZeldaOoT.Resource;

import texasjake95.Core.INameHandler;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import texasjake95.ZeldaOoT.AddOns.*;
import static texasjake95.ZeldaOoT.Resource.ZeldaItems.*;

public class TXZeldaNames implements INameHandler{

	public void getNames() {
		ModLoader.addName ( new ItemStack(Ocarina, 1,0), "Ocarina of Time - Song of Storms");
	    ModLoader.addName ( new ItemStack(Ocarina, 1,1), "Ocarina of Time - Sun's Song");
	    ModLoader.addName ( new ItemStack(Ocarina, 1,2), "Ocarina of Time - Song of Healing");
		ModLoader.addName ( new ItemStack(Ocarina, 1,3), "Ocarina of Time");

		ModLoader.addName ( new ItemStack(SpiritualStones, 1, 0), "Goron's Ruby");
		ModLoader.addName ( new ItemStack(SpiritualStones, 1, 1), "Zora's Sapphire");
		ModLoader.addName ( new ItemStack(SpiritualStones, 1, 2), "Kokiri's Emerald");
		
		ModLoader.addName(ClothSheet, "Cloth Sheet");
		
		ModLoader.addName ( new ItemStack(HeroBow, 1,0), "Hero's Bow");
	    ModLoader.addName ( new ItemStack(HeroBow, 1,1), "Hero's Bow - Fire");
	    ModLoader.addName ( new ItemStack(HeroBow, 1,2), "Hero's Bow - Ice");
	    ModLoader.addName ( new ItemStack(HeroBow, 1,3), "Hero's Bow - Bomb");
	    
	    ModLoader.addName ( helmetGZelda, "Green Hood");
		ModLoader.addName ( plateGZelda, "Green Tunic");
		ModLoader.addName ( legsGZelda, "Tunic Leggings");
		ModLoader.addName ( bootsGZelda, "Tunic Boots");
		
		ModLoader.addName ( helmetGZelda, "Green Hood");
		ModLoader.addName ( plateRZelda, "Red Tunic");
		ModLoader.addName ( legsGZelda, "Tunic Leggings");
		ModLoader.addName ( bootsGZelda, "Tunic Boots");
		
		ModLoader.addName ( helmetGZelda, "Green Hood");
		ModLoader.addName ( plateBZelda, "Blue Tunic");
		ModLoader.addName ( legsGZelda, "Tunic Leggings");
		ModLoader.addName ( bootsBZelda, "Iron Boots");
		
		ModLoader.addName ( swordMaster, "Master Sword");
		ModLoader.addName ( swordKokiri, "Kokiri Sword");
		ModLoader.addName ( swordGuilded, "Guilded Sword");
		ModLoader.addName ( swordRazor, "Razor Sword");
		
		ModLoader.addName ( Bomb, "Bomb");
		
		ModLoader.addName ( new ItemStack(Gems, 1,0), "Emerald");
		ModLoader.addName ( new ItemStack(Gems, 1,1), "Ruby");
		ModLoader.addName ( new ItemStack(Gems, 1,2), "Sapphire");
		ModLoader.addName ( new ItemStack(Gems, 1,3), "Copper Ingot");
		ModLoader.addName ( new ItemStack(Gems, 1,4), "Tin Ingot");

		ModLoader.addLocalization("ItemBlockZeldaOreXXX.name", "Emerald Ore"); 
		ModLoader.addLocalization("ItemBlockZeldaOreXXX2.name", "Ruby Ore");
		ModLoader.addLocalization("ItemBlockZeldaOreXXX3.name", "Sapphire Ore");
		ModLoader.addLocalization("ItemBlockZeldaOreXXX4.name", "Copper Ore");
		ModLoader.addLocalization("ItemBlockZeldaOreXXX5.name", "Tin Ore"); 
		ModLoader.addLocalization("ItemBlockZeldaOreXXX6.name", "Emerald Ore");
		ModLoader.addLocalization("ItemBlockZeldaOreXXX7.name", "Ruby Ore");
		ModLoader.addLocalization("ItemBlockZeldaOreXXX8.name", "Sapphire Ore");
		ModLoader.addLocalization("ItemBlockZeldaOreXXX9.name", "Copper Ore"); 
		ModLoader.addLocalization("ItemBlockZeldaOreXXX10.name", "Tin Ore");
		ModLoader.addLocalization("ItemBlockZeldaOreXXX11.name", "Coal Ore");
		ModLoader.addLocalization("ItemBlockZeldaOreXXX12.name", "Iron Ore");
		ModLoader.addLocalization("ItemBlockZeldaOreXXX13.name", "Gold Ore"); 
		ModLoader.addLocalization("ItemBlockZeldaOreXXX14.name", "Redstone Ore");
		ModLoader.addLocalization("ItemBlockZeldaOreXXX15.name", "Diamond Ore");
		ModLoader.addLocalization("ItemBlockZeldaOreXXX16.name", "Lapis Ore");
		
		AddonHandler.GetNames();
		
		
	}

	@Override
	public String getModName() {
		return "ZeldaOoT";
	}

}
