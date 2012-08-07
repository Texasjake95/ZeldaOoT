package texasjake95.ZeldaOoT.Resource;

import net.minecraft.src.*;
import texasjake95.ZeldaOoT.AddOns.AddonHandler;
import net.minecraft.src.forge.EnumHelper;
import texasjake95.ZeldaOoT.*;

public class ZeldaItems{

	public static Block oreBlock = new BlockZeldaOre (Config.oreBlockBlockID, 0).setBlockName("oreEmerald");
	
	
	public static final Item Gems = (new ItemZeldaGems(Config.GemsShiftedIndex-256)).setIconCoord(0,0).setItemName("gemEmerald");

	public static final Item SpiritualStones = (new ItemZeldaStones(Config.SpiritualStonesShiftedIndex-256)).setIconCoord(3,0).setItemName("Stones");
	public static Item ClothSheet = (new ItemZelda(Config.ClothSheetShiftedIndex-256)).setIconCoord(6,0).setItemName("ClothSheet");
	
	static EnumArmorMaterial ZeldaArmor = EnumHelper.addArmorMaterial("Zelda", 0, new int[] {2, 5, 4, 2}, 0);
	static EnumToolMaterial RazorSword = EnumHelper.addToolMaterial("Razor", 1, 100, 4F, 2, 0);
	static EnumToolMaterial GuildedSword = EnumHelper.addToolMaterial("GuildedSword", 1, 0, 4F, 4, 0);
	static EnumToolMaterial KokiriSword = EnumHelper.addToolMaterial("KokiriSword", 1, 0, 4F, 0, 0);
	
	   
	public static final Item swordKokiri = (new ItemZeldaSword(Config.swordKokiriShiftedIndex-256, KokiriSword)).setIconCoord(7, 0).setItemName("swordCopper");
	public static final Item swordRazor = (new ItemZeldaSword(Config.swordRazorShiftedIndex-256, RazorSword)).setIconCoord(8,0).setItemName("swordRazor");
    public static final Item swordGuilded = (new ItemZeldaSword(Config.swordGuildedShiftedIndex-256, GuildedSword)).setIconCoord(9,0).setItemName("swordGuilded");
    
    public static final Item swordMaster = (new ItemZeldaSword(Config.swordMasterShiftedIndex-256, GuildedSword)).setIconCoord(10,0).setItemName("swordMaster");
    
    public static final Item helmetGZelda = (new ItemZeldaArmor(Config.helmetGZeldaShiftedIndex-256, ZeldaArmor, 8, 0)).setIconCoord(11, 0).setItemName("helmetGZelda");
    public static final Item plateGZelda = (new ItemZeldaArmor(Config.plateGZeldaShiftedIndex-256, ZeldaArmor, 8, 1)).setIconCoord (12, 0).setItemName("plateGZelda");
    public static final Item legsGZelda = (new ItemZeldaArmor(Config.legsGZeldaShiftedIndex-256, ZeldaArmor, 8, 2)).setIconCoord (13, 0).setItemName("legGZelda");
	public static final Item bootsGZelda = (new ItemZeldaArmor(Config.bootsGZeldaShiftedIndex-256, ZeldaArmor, 8, 3)).setIconCoord(14, 0).setItemName("bootsGZelda");
	
	public static final Item plateRZelda = (new ItemZeldaArmor(Config.plateRZeldaShiftedIndex-256, ZeldaArmor, 8, 1)).setIconCoord (0, 1).setItemName("plateRZelda");
	
	public static final Item plateBZelda = (new ItemZeldaArmor(Config.plateBZeldaShiftedIndex-256, ZeldaArmor, 8, 1)).setIconCoord (5, 1).setItemName("plateBZelda"); 
	public static final Item bootsBZelda = (new ItemZeldaArmor(Config.bootsBZeldaShiftedIndex-256, ZeldaArmor, 8, 3)).setIconCoord(7, 1).setItemName("bootsBZelda");

	public static final Item HeroBow = (new ItemZeldaBow(Config.HeroBowShiftedIndex-256)).setIconCoord(8,1).setItemName("HeroBow");
    public static final Item Ocarina= (new ItemZeldaOcarina(Config.OcarinaShiftedIndex-256)).setIconCoord(11,1).setItemName("Ocarina");
    public static final Item Bomb= (new ItemZeldaBomb(Config.ZeldaBombItemShiftedIndex-256)).setIconCoord(0,2).setItemName("Bomb");
    static{
    	AddonHandler.Blocks();
    	AddonHandler.Items();
    	AddonHandler.EMC();
    	}
}
