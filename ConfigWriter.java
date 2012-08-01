package net.minecraft.src.ZeldaOoT;

import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.ZeldaOoT.Resource.ItemMaps;
import net.minecraft.src.forge.Configuration;

public class ConfigWriter
{

public static int ItemConfig (String ItemName, Configuration config, int def)
{
return Integer.parseInt(config.getOrCreateIntProperty(ItemName, Configuration.CATEGORY_ITEM, def).value);
}


public static int BlockConfig (String BlockName, Configuration config, int def)
{
return Integer.parseInt(config.getOrCreateBlockIdProperty(BlockName, def).value);
}

public static int BlockConfig1 (String ItemName, Configuration config, int def)
{
return Integer.parseInt(config.getOrCreateIntProperty(ItemName, Configuration.CATEGORY_BLOCK, def).value);
}

public static boolean BooleanConfig (String BooleanName, Configuration config, boolean def)
{
return Boolean.parseBoolean(config.getOrCreateBooleanProperty(BooleanName, Configuration.CATEGORY_GENERAL, def).value);
}

public static File GetFile(String mod)
{
return new File(Minecraft.getMinecraftDir() + "/config/" + mod + ".cfg");	
}

public static void ErrorCatcher(File newFile, String mod)
{
	try{
		newFile.createNewFile();
		System.out.println("Successfully created/read configuration file"); 
	}

	catch(IOException e){
		System.out.println("Could not create configuration file for "+ mod + ". Reason:");
		System.out.println(e);
	}	
}
}
