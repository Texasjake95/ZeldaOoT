package texasjake95.ZeldaOoT.Resource;

import net.minecraft.src.Block;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.forge.EnumHelper;
import texasjake95.ZeldaOoT.BlockZeldaOre;
import texasjake95.ZeldaOoT.Config;
import texasjake95.ZeldaOoT.ItemZelda;
import texasjake95.ZeldaOoT.ItemZeldaArmor;
import texasjake95.ZeldaOoT.ItemZeldaBomb;
import texasjake95.ZeldaOoT.ItemZeldaBow;
import texasjake95.ZeldaOoT.ItemZeldaGems;
import texasjake95.ZeldaOoT.ItemZeldaOcarina;
import texasjake95.ZeldaOoT.ItemZeldaStones;
import texasjake95.ZeldaOoT.ItemZeldaSword;
import texasjake95.ZeldaOoT.AddOns.AddonHandler;

public class ZeldaItems{

	public static Block oreBlock;
	
	
	public static  Item Gems;

	public static  Item SpiritualStones;
	public static Item ClothSheet;
	
	static EnumArmorMaterial ZeldaArmor = EnumHelper.addArmorMaterial("Zelda", 0, new int[] {2, 5, 4, 2}, 0);
	static EnumToolMaterial RazorSword = EnumHelper.addToolMaterial("Razor", 1, 100, 4F, 2, 0);
	static EnumToolMaterial GuildedSword = EnumHelper.addToolMaterial("GuildedSword", 1, 0, 4F, 4, 0);
	static EnumToolMaterial KokiriSword = EnumHelper.addToolMaterial("KokiriSword", 1, 0, 4F, 0, 0);
	
	   
	public static  Item swordKokiri;
	public static  Item swordRazor;
    public static  Item swordGuilded;
    
    public static  Item swordMaster;
    
    public static  Item helmetGZelda;
    public static  Item plateGZelda;
    public static  Item legsGZelda;
	public static  Item bootsGZelda;
	
	public static  Item plateRZelda;
	
	public static  Item plateBZelda; 
	public static  Item bootsBZelda;

	public static  Item HeroBow;
    public static  Item Ocarina;
    public static  Item Bomb;


	public static boolean isLoaded = false;
    static{
    	AddonHandler.Blocks();
    	AddonHandler.Items();
    	AddonHandler.EMC();
    	}
    public static void Init()
    {
if (Config.InitZelda == true)
{
 
			oreBlock = new BlockZeldaOre (Config.oreBlockBlockID, 0).setBlockName("oreEmerald");
				
				
			   Gems = (new ItemZeldaGems(Config.GemsShiftedIndex-256)).setIconCoord(0,0).setItemName("gemEmerald");

			   SpiritualStones = (new ItemZeldaStones(Config.SpiritualStonesShiftedIndex-256)).setIconCoord(3,0).setItemName("Stones");
			  ClothSheet = (new ItemZelda(Config.ClothSheetShiftedIndex-256)).setIconCoord(6,0).setItemName("ClothSheet");			
			   
			   swordKokiri = (new ItemZeldaSword(Config.swordKokiriShiftedIndex-256, KokiriSword)).setIconCoord(7, 0).setItemName("swordCopper");
			   swordRazor = (new ItemZeldaSword(Config.swordRazorShiftedIndex-256, RazorSword)).setIconCoord(8,0).setItemName("swordRazor");
		       swordGuilded = (new ItemZeldaSword(Config.swordGuildedShiftedIndex-256, GuildedSword)).setIconCoord(9,0).setItemName("swordGuilded");
		    
		       swordMaster = (new ItemZeldaSword(Config.swordMasterShiftedIndex-256, GuildedSword)).setIconCoord(10,0).setItemName("swordMaster");
		    
		       helmetGZelda = (new ItemZeldaArmor(Config.helmetGZeldaShiftedIndex-256, ZeldaArmor, 8, 0)).setIconCoord(11, 0).setItemName("helmetGZelda");
		       plateGZelda = (new ItemZeldaArmor(Config.plateGZeldaShiftedIndex-256, ZeldaArmor, 8, 1)).setIconCoord (12, 0).setItemName("plateGZelda");
		       legsGZelda = (new ItemZeldaArmor(Config.legsGZeldaShiftedIndex-256, ZeldaArmor, 8, 2)).setIconCoord (13, 0).setItemName("legGZelda");
			   bootsGZelda = (new ItemZeldaArmor(Config.bootsGZeldaShiftedIndex-256, ZeldaArmor, 8, 3)).setIconCoord(14, 0).setItemName("bootsGZelda");
			
			   plateRZelda = (new ItemZeldaArmor(Config.plateRZeldaShiftedIndex-256, ZeldaArmor, 8, 1)).setIconCoord (0, 1).setItemName("plateRZelda");
			
			   plateBZelda = (new ItemZeldaArmor(Config.plateBZeldaShiftedIndex-256, ZeldaArmor, 8, 1)).setIconCoord (5, 1).setItemName("plateBZelda"); 
			   bootsBZelda = (new ItemZeldaArmor(Config.bootsBZeldaShiftedIndex-256, ZeldaArmor, 8, 3)).setIconCoord(7, 1).setItemName("bootsBZelda");

			   HeroBow = (new ItemZeldaBow(Config.HeroBowShiftedIndex-256)).setIconCoord(8,1).setItemName("HeroBow");
		       Ocarina= (new ItemZeldaOcarina(Config.OcarinaShiftedIndex-256)).setIconCoord(11,1).setItemName("Ocarina");
		       Bomb= (new ItemZeldaBomb(Config.ZeldaBombItemShiftedIndex-256)).setIconCoord(0,2).setItemName("Bomb");
		       isLoaded = true;
}
    }
}
