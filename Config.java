package texasjake95.ZeldaOoT;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import texasjake95.Core.ConfigWriter;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;
import net.minecraft.src.forge.*; 

public class Config extends ConfigWriter{

	public static Configuration config;
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
	public static boolean GemGen;
	public static boolean CopperGen;
	public static boolean TinGen;
	public static boolean NetherGen;
	public static boolean InitZelda;
	
		public static void initIC2Props()
	{
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
	
		config = CreateConfig(mod);

		config.load();
		AutoAssign(config);
		oreBlockBlockID = BlockConfig("Ores",config, 1);
  	    swordMasterShiftedIndex = ItemConfig("Master Sword", config, 8000);
        GemsShiftedIndex = ItemConfig("Emerald",  config, 8000);
        SpiritualStonesShiftedIndex = ItemConfig("Spiritual Stones", config, 8000);
        ClothSheetShiftedIndex = ItemConfig("Cloth Sheet",  config, 8003);
        swordKokiriShiftedIndex = ItemConfig("Kokiri Sword",  config, 8004);
        swordGuildedShiftedIndex = ItemConfig("Guilded Sword",  config, 8005);
        swordRazorShiftedIndex = ItemConfig("Razor Sword",  config, 8006);
        helmetGZeldaShiftedIndex = ItemConfig("Green Hood",  config, 8007);
        plateGZeldaShiftedIndex = ItemConfig("Green Tunic",  config, 8008);
        legsGZeldaShiftedIndex = ItemConfig("Tunic Leggings",  config, 8009);
        bootsGZeldaShiftedIndex = ItemConfig("Boots",  config, 8010);
        plateRZeldaShiftedIndex = ItemConfig("Red Tunic",  config, 8011);
        plateBZeldaShiftedIndex = ItemConfig("Blue Tunic",  config, 8012);
        bootsBZeldaShiftedIndex = ItemConfig("Iron Boots",  config, 8013);
        HeroBowShiftedIndex = ItemConfig("Hero Bow",  config, 8014);
        OcarinaShiftedIndex = ItemConfig("Ocarina of Time",  config, 8015);
        ArrowPowers = BooleanConfig("Arrow Powers", config, false);
        ZeldaBombItemShiftedIndex = ItemConfig("Bomb",  config, 8016);
        
        GemGen = BooleanConfig("Gem Generation", config, true, 3, "World Gen");
        CopperGen = BooleanConfig("Copper Generation", config, true, 3, "World Gen");
        TinGen = BooleanConfig("Tin Generation", config, true, 3, "World Gen");
        NetherGen = BooleanConfig("Nether Generation", config, true, 3, "World Gen");
     
        config.save();
        InitZelda = CoreConfig(mod);
	}
	
	

}
