package net.minecraft.src.ZeldaOoT;

import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.ZeldaOoT.Resource.ItemMaps;
import net.minecraft.src.forge.Configuration;

public class ConfigWriter
{

/**
 * Adds a new Item Config line
 *
 * @param Config Name
 * @param config
 * @param default value
 */
public static int ItemConfig (String ItemName, Configuration config, int def)
{
	return Integer.parseInt(config.getOrCreateIntProperty(ItemName, Configuration.CATEGORY_ITEM, def).value);
}

/**
 * Adds a new Block Config line
 *
 * @param Config Name
 * @param config
 * @param default value
 */
public static int BlockConfig (String BlockName, Configuration config, int def)
{
	return Integer.parseInt(config.getOrCreateBlockIdProperty(BlockName, def).value);
}

/**
 * Adds a new Block Config line
 *
 * @param Config Name
 * @param config
 * @param default value
 */
public static int BlockConfig1 (String ItemName, Configuration config, int def)
{
	return Integer.parseInt(config.getOrCreateIntProperty(ItemName, Configuration.CATEGORY_BLOCK, def).value);
}

/**
 * Adds a new Config line
 * Used for Integers and is able to put in new categories
 *
 * @param Config Name
 * @param config
 * @param default value
 * @param cat  0 = block 1 = item 2 = general 3 = new category
 */
public static int INTConfig (String ItemName, Configuration config, int def, int cat , String Category)
{String SetCategory = null;
	switch (cat)
	{
	case 0: SetCategory = Configuration.CATEGORY_BLOCK;
	case 1: SetCategory = Configuration.CATEGORY_ITEM;
	case 2: SetCategory = Configuration.CATEGORY_GENERAL;
	case 3: SetCategory = Category;
	}
	
	
	return Integer.parseInt(config.getOrCreateIntProperty(ItemName, SetCategory, def).value);
}



/**
 * Adds a new Config line
 * Used for Booleans and is able to put in new categories
 *
 * @param Config Name
 * @param config
 * @param default value
 * @param cat  0 = block 1 = item 2 = general 3 = new category
 */

public static boolean BooleanConfig (String BooleanName, Configuration config, boolean def, int cat , String Category)
{String SetCategory = null;
	switch (cat)
	{
	case 0: SetCategory = Configuration.CATEGORY_BLOCK;
	case 1: SetCategory = Configuration.CATEGORY_ITEM;
	case 2: SetCategory = Configuration.CATEGORY_GENERAL;
	case 3: SetCategory = Category;
	}
	
	
	return Boolean.parseBoolean(config.getOrCreateBooleanProperty(BooleanName, SetCategory, def).value);
}

/**
 * Adds a new Boolean Config line
 *
 * @param Config Name
 * @param config
 * @param default value
 */
public static boolean BooleanConfig (String BooleanName, Configuration config, boolean def)
{
	return Boolean.parseBoolean(config.getOrCreateBooleanProperty(BooleanName, Configuration.CATEGORY_GENERAL, def).value);
}

/**
 * Makes new File for Config
 *
 * @param mod
 */
public static File GetFile(String mod)
{
	return new File(Minecraft.getMinecraftDir() + "/config/" + mod + ".cfg");	
}




/**
 * A Try/Catch function for unexpected results
 *
 * @param File
 * @param Mod
 */
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
