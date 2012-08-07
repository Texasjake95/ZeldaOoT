package texasjake95.ZeldaOoT.AddOns;

import net.minecraft.src.BaseMod;
import net.minecraft.src.ModLoader;
import texasjake95.ZeldaOoT.Config;
import texasjake95.ZeldaOoT.Resource.ZeldaItems;

public class AddonHandler {
public static boolean IC2 = false;
public static boolean RPW = false;
public static boolean TC2 = false;
public static boolean NEI = false;
public static boolean EE2 = false;
public static boolean x = false;

public static void GetNames()
{
	RedPower_AddOn.GetNames();
	IC2_AddOn.GetNames();
	ThaumCraft_AddOn.GetNames();
}
public static void GetRecipes()
{
	RedPower_AddOn.GetRecipes();
	IC2_AddOn.GetRecipes();
	ThaumCraft_AddOn.GetRecipes();
}
public static void RegisterBlocks()
{
	RedPower_AddOn.RegisterBlocks();
}

public static void Items() {
	
	
}
public static void Blocks() {
	RedPower_AddOn.Blocks();
	
	
}



public static final String MOD_NAME = "ZeldaOoT";

public static final String LOGGER_PREFIX = "[" + MOD_NAME + "] ";

public static String getLogMessage(String logMessage) {
	return LOGGER_PREFIX + logMessage;
}

public static void initAddons() {
	ModLoader.getLogger().finer(getLogMessage("Checking for addons needing initializing"));
	boolean addonsFound = false;

	
	for (BaseMod mod : ModLoader.getLoadedMods()) {
		
		if (mod.toString().contains("mod_IC2")) {
			IC2_AddOn.init();
			addonsFound = true;
		}
		if (mod.toString().contains("mod_ThaumCraft")) {
			ThaumCraft_AddOn.init();
			addonsFound = true;
		}
		if (mod.toString().contains("mod_RedPowerWorld")) {
			RedPower_AddOn.init();
			addonsFound = true;
		}
		if (mod.toString().contains("mod_NotEnoughItems")) {
			NEIZeldaOoTConfig.init();
			addonsFound = true;
		}
		if (mod.toString().contains("mod_EE")) {
			EE_Addon.init();
			addonsFound = true;
		}
		
	}
	if (addonsFound)
		{ModLoader.getLogger().finer(getLogMessage("Done initializing addons"));
	
		}
	
	else
		ModLoader.getLogger().finer(getLogMessage("No addons for loaded mods found"));
	
	if(AddonHandler.RPW == false & Config.GemGen == true)
	{
		ModLoader.getLogger().finer(AddonHandler.getLogMessage("Gem Ores Initialized"));
	}
	
	if(AddonHandler.RPW == true || Config.GemGen == false)
	{
		ModLoader.getLogger().finer(AddonHandler.getLogMessage("Gem Ores Not Initialized"));
	}
	
	if (Config.IC2Copper == false & Config.RP2Copper == false & Config.CopperGen == true)
	{
		ModLoader.getLogger().finer(AddonHandler.getLogMessage("Copper Ore Initialized"));
	}
	
	if (Config.IC2Copper == true || Config.RP2Copper == true || Config.CopperGen == false)
	{
		ModLoader.getLogger().finer(AddonHandler.getLogMessage("Copper Ore Not Initialized"));
	}
	
	if (Config.IC2Tin == false & Config.RP2Tin == false & Config.TinGen == true)
	{			
		ModLoader.getLogger().finer(AddonHandler.getLogMessage("Tin Ore Initialized"));
	}
	
	if (Config.IC2Tin == true || Config.RP2Tin == true || Config.TinGen == false)
	{
		ModLoader.getLogger().finer(AddonHandler.getLogMessage("Tin Ore Not Initialized"));
	}

}

public static void EMC() {
	ThaumCraft_AddOn.EMC();
	
}
}
