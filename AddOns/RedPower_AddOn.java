package net.minecraft.src.ZeldaOoT.AddOns;

import net.minecraft.src.*;
import net.minecraft.src.ZeldaOoT.*;
import static net.minecraft.src.ZeldaOoT.Resource.ZeldaItems.*;


public class RedPower_AddOn extends AddonHandler {

		
	public static void init() {
		try {
			ModLoader.getLogger().finer(AddonHandler.getLogMessage("RedPowerWorld detected; attempting to initialize RedPower addon"));
			
			AddonHandler.RPW = true;
			
			ModLoader.getLogger().finer(AddonHandler.getLogMessage("RedPowerWorld initialized"));
		}
		catch (Exception e) {
			ModLoader.getLogger().fine(AddonHandler.getLogMessage("Failed to initialize RedPowerWorld Addon"));
			e.printStackTrace(System.err);
		}
	}

	
	
	public static void GetNames()
	{
		
			
		
	}
		public static void RegisterBlocks ()
	{
		
			
		
	}
		public static void Blocks()
		{
				
	
			
			
			
		}




	public static void GetRecipes() {
		// TODO Auto-generated method stub
		
	}
}