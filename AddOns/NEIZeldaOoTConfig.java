package net.minecraft.src.ZeldaOoT.AddOns;

import codechicken.nei.*;
import net.minecraft.src.*;
import static net.minecraft.src.ZeldaOoT.Resource.ZeldaItems.*;


public class NEIZeldaOoTConfig extends AddonHandler implements IConfigureNEI{
	 
	public static void init() {
		try {
			ModLoader.getLogger().finer(AddonHandler.getLogMessage("NEI detected; attempting to initialize NEI addon"));
			
			AddonHandler.NEI = true;

			ModLoader.getLogger().finer(AddonHandler.getLogMessage("NEI initialized"));
		}
		catch (Exception e) {
			ModLoader.getLogger().fine(AddonHandler.getLogMessage("Failed to initialize NEI Addon"));
			e.printStackTrace(System.err);
		}
	}

	
	
	
	
	public void loadConfig() {
		if (AddonHandler.NEI == true)
			{
		HideItems();
		addSubset();
		Names();
			}
	}
	private void Names()
	{
		API.setOverrideName(oreBlock.blockID, 5, "Emerald Ore");
		API.setOverrideName(oreBlock.blockID, 6, "Ruby Ore");
		API.setOverrideName(oreBlock.blockID, 7, "Sapphire Ore");
		API.setOverrideName(oreBlock.blockID, 8, "Copper Ore");
		API.setOverrideName(oreBlock.blockID, 9, "Tin Ore");
	}
	private void HideItems()
	{
		IC2_AddOn.NEI();
	}
	private void addSubset()
	{
		MultiItemRange ZeldaOoTBlocks =  new MultiItemRange();
		ZeldaOoTBlocks.add(oreBlock, 0 ,15);
		
		MultiItemRange ZeldaOoTItems =  new MultiItemRange();
		
		ZeldaOoTItems.add(Gems.shiftedIndex);
		ZeldaOoTItems.add(SpiritualStones.shiftedIndex);
		ZeldaOoTItems.add(ClothSheet.shiftedIndex);
		ZeldaOoTItems.add(HeroBow.shiftedIndex);
		ZeldaOoTItems.add(Ocarina.shiftedIndex);
		
		MultiItemRange ZeldaOoTSwords = new MultiItemRange();
		ZeldaOoTSwords.add(swordKokiri.shiftedIndex);
		ZeldaOoTSwords.add(swordRazor.shiftedIndex);
		ZeldaOoTSwords.add(swordGuilded.shiftedIndex);
		ZeldaOoTSwords.add(swordMaster.shiftedIndex);
		
		MultiItemRange ZeldaOoTHelmet = new MultiItemRange();
		ZeldaOoTHelmet.add(helmetGZelda.shiftedIndex);
		
		MultiItemRange ZeldaOoTPlates = new MultiItemRange();
		ZeldaOoTPlates.add(plateGZelda.shiftedIndex);
		ZeldaOoTPlates.add(plateBZelda.shiftedIndex);
		ZeldaOoTPlates.add(plateRZelda.shiftedIndex);
		
		MultiItemRange ZeldaOoTLegs = new MultiItemRange();
		ZeldaOoTLegs.add(legsGZelda.shiftedIndex);
		
		MultiItemRange ZeldaOoTBoots = new MultiItemRange();
		ZeldaOoTBoots.add(bootsGZelda.shiftedIndex);
		ZeldaOoTBoots.add(bootsBZelda.shiftedIndex);
		
		MultiItemRange ZeldaOoT = new MultiItemRange();
		ZeldaOoT.add(oreBlock, 0 ,15);
		ZeldaOoT.add(bootsBZelda.shiftedIndex);
		ZeldaOoT.add(bootsGZelda.shiftedIndex);
		ZeldaOoT.add(Gems.shiftedIndex);
		ZeldaOoT.add(SpiritualStones.shiftedIndex);
		ZeldaOoT.add(ClothSheet.shiftedIndex);
		ZeldaOoT.add(swordKokiri.shiftedIndex);
		ZeldaOoT.add(swordRazor.shiftedIndex);
		ZeldaOoT.add(swordGuilded.shiftedIndex);
	   	ZeldaOoT.add(swordMaster.shiftedIndex);
	   	ZeldaOoT.add(helmetGZelda.shiftedIndex);
	   	ZeldaOoT.add(plateGZelda.shiftedIndex);
		ZeldaOoT.add(legsGZelda.shiftedIndex);
		ZeldaOoT.add(bootsGZelda.shiftedIndex);
		ZeldaOoT.add(plateRZelda.shiftedIndex);
		ZeldaOoT.add(plateBZelda.shiftedIndex);
		ZeldaOoT.add(bootsBZelda.shiftedIndex);
		ZeldaOoT.add(HeroBow.shiftedIndex);
		ZeldaOoT.add(Ocarina.shiftedIndex);
		
		API.addToRange("Blocks", ZeldaOoTBlocks);
		API.addToRange("Items", ZeldaOoTItems);
		API.addToRange("Items.Weapons.Swords", ZeldaOoTSwords);
		API.addToRange("Items.Armor.Boots", ZeldaOoTBoots);
		API.addToRange("Items.Armor.ChestPlates", ZeldaOoTPlates);
		API.addToRange("Items.Armor.Helmets", ZeldaOoTHelmet);
		API.addToRange("Items.Armor.Leggings", ZeldaOoTLegs);
		API.addSetRange("ZeldaOoT", ZeldaOoT);
		API.addSetRange("ZeldaOoT.Blocks", ZeldaOoTBlocks);
		API.addSetRange("ZeldaOoT.Items", ZeldaOoTItems);
		API.addSetRange("ZeldaOoT.Items.Weapons.Swords", ZeldaOoTSwords);
		API.addSetRange("ZeldaOoT.Items.Armor.Boots", ZeldaOoTBoots);
		API.addSetRange("ZeldaOoT.Items.Armor.ChestPlate", ZeldaOoTPlates);
		API.addSetRange("ZeldaOoT.Items.Armor.Helmets", ZeldaOoTHelmet);
		API.addSetRange("ZeldaOoT.Items.Armor.Leggings", ZeldaOoTLegs);
		
	}
	
	
	
	
}
