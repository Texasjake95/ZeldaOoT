package net.minecraft.src.ZeldaOoT.Resource;

import static net.minecraft.src.ZeldaOoT.Resource.ZeldaItems.*;

import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.ZeldaOoT.EntityZeldaBomb;
import net.minecraft.src.ZeldaOoT.EntityZeldaHorse;
import net.minecraft.src.ZeldaOoT.ItemBlockZeldaOre;
import net.minecraft.src.ZeldaOoT.AddOns.AddonHandler;
import net.minecraft.src.forge.MinecraftForgeClient;
import net.minecraft.src.forge.oredict.OreDictionary;

public class ZeldaRegister {

	public static void Register() 
	{

		 OreDictionary.registerOre("gemEmerald", new ItemStack(Gems,1,0));
		 OreDictionary.registerOre("gemRuby", new ItemStack(Gems,1,1));
		 OreDictionary.registerOre("gemSapphire", new ItemStack(Gems,1,2));
		 OreDictionary.registerOre("ingotCopper", new ItemStack(Gems,1,3));
		 OreDictionary.registerOre("ingotTin", new ItemStack(Gems,1,4));
		 OreDictionary.registerOre("oreEmerald", new ItemStack(oreBlock,1,0));
		 OreDictionary.registerOre("oreRuby", new ItemStack(oreBlock,1,1));
		 OreDictionary.registerOre("oreSapphire", new ItemStack(oreBlock,1,2));
		 OreDictionary.registerOre("oreCopper", new ItemStack(oreBlock,1,3));
		 OreDictionary.registerOre("oreTin", new ItemStack(oreBlock,1,4));
		 OreDictionary.registerOre("oreEmerald", new ItemStack(oreBlock,1,5));
		 OreDictionary.registerOre("oreRuby", new ItemStack(oreBlock,1,6));
		 OreDictionary.registerOre("oreSapphire", new ItemStack(oreBlock,1,7));
		 OreDictionary.registerOre("oreCopper", new ItemStack(oreBlock,1,8));
		 OreDictionary.registerOre("oreTin", new ItemStack(oreBlock,1,9));
		 OreDictionary.registerOre("oreCoal", new ItemStack(oreBlock,1,10));
		 OreDictionary.registerOre("oreIron", new ItemStack(oreBlock,1,11));
		 OreDictionary.registerOre("oreGold", new ItemStack(oreBlock,1,12));
		 OreDictionary.registerOre("oreRedstone", new ItemStack(oreBlock,1,13));
		 OreDictionary.registerOre("oreDiamond", new ItemStack(oreBlock,1,14));
		 OreDictionary.registerOre("oreLapisLazuli", new ItemStack(oreBlock,1,15));
		ModLoader.registerBlock(oreBlock , ItemBlockZeldaOre.class);
		AddonHandler.RegisterBlocks();
		
		ModLoader.registerEntityID(EntityZeldaBomb.class, "ZeldaBomb", ModLoader.getUniqueEntityId());
		ModLoader.registerEntityID(EntityZeldaHorse.class, "ZeldaHorse", ModLoader.getUniqueEntityId());
		
		MinecraftForgeClient.registerSoundHandler(new ZeldaSoundHandler());
		
	}

}
