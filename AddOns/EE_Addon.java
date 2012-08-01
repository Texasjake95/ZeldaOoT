package net.minecraft.src.ZeldaOoT.AddOns;

import java.lang.reflect.Method;

import net.minecraft.src.ModLoader;
import net.minecraft.src.ZeldaOoT.Resource.ItemMaps;

public class EE_Addon {
	public static void init() {
		try {
			ModLoader.getLogger().finer(AddonHandler.getLogMessage("Equivalent Exchange 2 detected; attempting to initialize EE2 addon"));
			
			AddonHandler.EE2 = true;

			ModLoader.getLogger().finer(AddonHandler.getLogMessage("Equivalent Exchange 2 initialized"));
		}
		catch (Exception e) {
			ModLoader.getLogger().fine(AddonHandler.getLogMessage("Failed to initialize EE2 Addon"));
			e.printStackTrace(System.err);
		}
	}

	public static void getEMC() {
		if(AddonHandler.EE2 == true) 
		   {
		   try {
		   
	      Class<?> equivexmaps = Class.forName("ee.EEMaps");
	      Method addEMC = equivexmaps.getMethod("addEMC", int.class, int.class, int.class);
	      Method addMeta = equivexmaps.getMethod("addMeta", int.class, int.class);
	      
	      for (int x = 0; x < ItemMaps.EMC.length + 1; x++)
	      {
	      // for each EMC value
	      addEMC.invoke(null, ItemMaps.ItemList[x], 0, ItemMaps.EMC[x]);
	      // for each block
	      addMeta.invoke(null, ItemMaps.ItemList[x], 0);}
	      
	    } catch (Exception ex) {
	    }
	  }
		
	}

}
