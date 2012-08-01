package net.minecraft.src.ZeldaOoT;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import net.minecraft.client.Minecraft;

import net.minecraft.src.*;
import net.minecraft.src.forge.*; 

public class Config extends ConfigWriter{

	public static Configuration config;
	private static boolean autoAssign = true;
	public static int oreBlockBlockID;
	public static int swordMasterShiftedIndex;
	public static int GemsShiftedIndex;
	public static int SpiritualStonesShiftedIndex;
	public static int ClothSheetShiftedIndex;
	public static int swordKokiriShiftedIndex;
	public static int swordGuildedShiftedIndex;
	public static int swordRazorShiftedIndex;
	public static int helmetGZeldaShiftedIndex;
	public static int plateGZeldaShiftedIndex;
	public static int legsGZeldaShiftedIndex;
	public static int bootsGZeldaShiftedIndex;
	public static int plateRZeldaShiftedIndex;
	public static int plateBZeldaShiftedIndex;
	public static int bootsBZeldaShiftedIndex;
	public static int HeroBowShiftedIndex;
	public static int OcarinaShiftedIndex;
	public static boolean ArrowPowers;
	public static int ZeldaBombItemShiftedIndex;
	public static boolean IC2Copper = false;
	public static boolean IC2Tin = false;
	public static boolean RP2Copper = false;
	public static boolean RP2Tin = false;
	public static int ManaBarGuiId;
	
	public static void initIC2Props(){
		 File IC2Config = new File(Minecraft.getMinecraftDir(), "/config/IC2.cfg");
		
		
		try
	    {
			 
			 if(IC2Config.exists())
			 { BufferedReader buffer;
				 String line;
			 FileInputStream fileinputstream = new FileInputStream(IC2Config);
				buffer = new BufferedReader(new InputStreamReader(fileinputstream, "8859_1"));
				 
				 while(true)
					{line = buffer.readLine();
				 if(line == null)
				  {
				    break;
				  }
				 if (line.contains("enableWorldGenOreCopper=true"))
				 {
					 IC2Copper = true;continue;
				 }
				 else if (line.contains("enableWorldGenOreCopper=false"))
				 {
					 IC2Copper = false;continue;
				 }
				 if (line.contains("enableWorldGenOreTin=true"))
				 {
					 IC2Tin = true;continue;
				 }
				 if (line.contains("enableWorldGenOreTin=false"))
				 {
					 IC2Tin = false;continue;
				 }
			 }
	    }
	    }
			 catch (IOException e)
		        {
		            e.printStackTrace();
		        }
		}
	
	
	public static void initRP2Props()
	{File RP2Config = new File(Minecraft.getMinecraftDir(), "redpower/redpower.cfg");
	try
    {
		 
		 if(RP2Config.exists())
		 { BufferedReader buffer;
			 String line;
		 FileInputStream fileinputstream = new FileInputStream(RP2Config);
			buffer = new BufferedReader(new InputStreamReader(fileinputstream, "8859_1"));
			 
			 while(true)
				{line = buffer.readLine();
			 if(line == null)
			  {
			    break;
			  }
			 if (line.contains("copper=1"))
			 {
				 RP2Copper = true;continue;
			 }
			 else if (line.contains("copper=0"))
			 {
				 RP2Copper = false;continue;
			 }
			 if (line.contains("tin=1"))
			 {
				 RP2Tin = true;continue;
			 }
			 if (line.contains("tin=0"))
			 {
				 RP2Tin = false;continue;
			 }
		 }
    }
    }
		 catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	}
	public static void initProps(String mod){

		
		File newFile = new File(Minecraft.getMinecraftDir() + "/config/" + mod + ".cfg");

		
		try{
			newFile.createNewFile();
			System.out.println("Successfully created/read configuration file"); 
		}
	
		catch(IOException e){
			System.out.println("Could not create configuration file for mod_ZeldaOoT. Reason:");
			System.out.println(e);
		}

		
		config = new Configuration(newFile);

		
		config.load();
		oreBlockBlockID = Integer.parseInt(config.getOrCreateBlockIdProperty("Ores",250).value);
  	    swordMasterShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Master Sword",  Configuration.CATEGORY_ITEM, 8000).value);
        GemsShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Emerald",  Configuration.CATEGORY_ITEM, 8001).value);
        SpiritualStonesShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Spiritual Stones", Configuration.CATEGORY_ITEM, 8002).value);
        ClothSheetShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Cloth Sheet",  Configuration.CATEGORY_ITEM, 8003).value);
        swordKokiriShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Kokiri Sword",  Configuration.CATEGORY_ITEM, 8004).value);
        swordGuildedShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Guilded Sword",  Configuration.CATEGORY_ITEM, 8005).value);
        swordRazorShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Razor Sword",  Configuration.CATEGORY_ITEM, 8006).value);
        helmetGZeldaShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Green Hood",  Configuration.CATEGORY_ITEM, 8007).value);
        plateGZeldaShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Green Tunic",  Configuration.CATEGORY_ITEM, 8008).value);
        legsGZeldaShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Tunic Leggings",  Configuration.CATEGORY_ITEM, 8009).value);
        bootsGZeldaShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Boots",  Configuration.CATEGORY_ITEM, 8010).value);
        plateRZeldaShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Red Tunic",  Configuration.CATEGORY_ITEM, 8011).value);
        plateBZeldaShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Blue Tunic",  Configuration.CATEGORY_ITEM, 8012).value);
        bootsBZeldaShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Iron Boots",  Configuration.CATEGORY_ITEM, 8013).value);
        HeroBowShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Hero Bow",  Configuration.CATEGORY_ITEM, 8014).value);
        OcarinaShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Ocarina of Time",  Configuration.CATEGORY_ITEM, 8015).value);
        ArrowPowers = Boolean.parseBoolean(config.getOrCreateBooleanProperty("Arrow Powers", Configuration.CATEGORY_GENERAL, false).value);
        ZeldaBombItemShiftedIndex = Integer.parseInt(config.getOrCreateIntProperty("Bomb",  Configuration.CATEGORY_ITEM, 8016).value);
        
        config.save();
	}

}
