package texasjake95.ZeldaOoT.AddOns;

import static codechicken.nei.API.*;
import codechicken.nei.*;
import net.minecraft.src.*;
import static texasjake95.ZeldaOoT.Resource.ZeldaItems.*;


public class NEIZeldaOoTConfig extends AddonHandler implements IConfigureNEI{
	 
	public static void init() {
		try {
			ModLoader.getLogger().finer(getLogMessage("NEI detected; attempting to initialize NEI addon"));
			
			NEI = true;

			ModLoader.getLogger().finer(getLogMessage("NEI initialized"));
		}
		catch (Exception e) {
			ModLoader.getLogger().fine(getLogMessage("Failed to initialize NEI Addon"));
			e.printStackTrace(System.err);
		}
	}

	
	
	
	
	public void loadConfig() {
		if (NEI == true)
			{
		HideItems();
		addSubset();
			}
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
		
		addToRange("Blocks", ZeldaOoTBlocks);
		addToRange("Items", ZeldaOoTItems);
		addToRange("Items.Weapons.Swords", ZeldaOoTSwords);
		addToRange("Items.Armor.Boots", ZeldaOoTBoots);
		addToRange("Items.Armor.ChestPlates", ZeldaOoTPlates);
		addToRange("Items.Armor.Helmets", ZeldaOoTHelmet);
		addToRange("Items.Armor.Leggings", ZeldaOoTLegs);
		addSetRange("ZeldaOoT", ZeldaOoT);
		addSetRange("ZeldaOoT.Blocks", ZeldaOoTBlocks);
		addSetRange("ZeldaOoT.Items", ZeldaOoTItems);
		addSetRange("ZeldaOoT.Items.Weapons.Swords", ZeldaOoTSwords);
		addSetRange("ZeldaOoT.Items.Armor.Boots", ZeldaOoTBoots);
		addSetRange("ZeldaOoT.Items.Armor.ChestPlate", ZeldaOoTPlates);
		addSetRange("ZeldaOoT.Items.Armor.Helmets", ZeldaOoTHelmet);
		addSetRange("ZeldaOoT.Items.Armor.Leggings", ZeldaOoTLegs);
		
	}
	
	
	
	
}
