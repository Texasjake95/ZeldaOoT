package texasjake95.ZeldaOoT.Resource;

import static texasjake95.ZeldaOoT.Resource.ZeldaItems.*;
import texasjake95.Core.EasyRegister;
import texasjake95.Core.IRegisterHandler;

import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import texasjake95.ZeldaOoT.EntityZeldaBomb;
import texasjake95.ZeldaOoT.EntityZeldaHorse;
import texasjake95.ZeldaOoT.ItemBlockZeldaOre;
import texasjake95.ZeldaOoT.mod_ZeldaOoT;
import texasjake95.ZeldaOoT.AddOns.AddonHandler;
import net.minecraft.src.forge.MinecraftForgeClient;
import net.minecraft.src.forge.oredict.OreDictionary;

public class TXZeldaRegister extends EasyRegister implements IRegisterHandler{

	public void Register() 
	{

		 RegisterOre("gemEmerald", new ItemStack(Gems,1,0));
		 RegisterOre("gemRuby", new ItemStack(Gems,1,1));
		 RegisterOre("gemSapphire", new ItemStack(Gems,1,2));
		 RegisterOre("ingotCopper", new ItemStack(Gems,1,3));
		 RegisterOre("ingotTin", new ItemStack(Gems,1,4));
		 RegisterOre("oreEmerald", new ItemStack(oreBlock,1,0));
		 RegisterOre("oreRuby", new ItemStack(oreBlock,1,1));
		 RegisterOre("oreSapphire", new ItemStack(oreBlock,1,2));
		 RegisterOre("oreCopper", new ItemStack(oreBlock,1,3));
		 RegisterOre("oreTin", new ItemStack(oreBlock,1,4));
		 RegisterOre("oreEmerald", new ItemStack(oreBlock,1,5));
		 RegisterOre("oreRuby", new ItemStack(oreBlock,1,6));
		 RegisterOre("oreSapphire", new ItemStack(oreBlock,1,7));
		 RegisterOre("oreCopper", new ItemStack(oreBlock,1,8));
		 RegisterOre("oreTin", new ItemStack(oreBlock,1,9));
		 RegisterOre("oreCoal", new ItemStack(oreBlock,1,10));
		 RegisterOre("oreIron", new ItemStack(oreBlock,1,11));
		 RegisterOre("oreGold", new ItemStack(oreBlock,1,12));
		 RegisterOre("oreRedstone", new ItemStack(oreBlock,1,13));
		 RegisterOre("oreDiamond", new ItemStack(oreBlock,1,14));
		 RegisterOre("oreLapisLazuli", new ItemStack(oreBlock,1,15));
		 RegisterBlock(oreBlock , ItemBlockZeldaOre.class);
		 AddonHandler.RegisterBlocks();
		
		 ModLoader.registerEntityID(EntityZeldaBomb.class, "ZeldaBomb", ModLoader.getUniqueEntityId());
		 ModLoader.registerEntityID(EntityZeldaHorse.class, "ZeldaHorse", ModLoader.getUniqueEntityId());
		
		 RegisterSound(new ZeldaSoundHandler());
		 RegisterKey(new mod_ZeldaOoT(), mod_ZeldaOoT.Switch, false);
		 RegisterKey(new mod_ZeldaOoT(), mod_ZeldaOoT.ShowMana, false);
	}

	

	@Override
	public String getModName() {
		return "ZeldaOoT";
	}

}
