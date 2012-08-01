package net.minecraft.src.ZeldaOoT;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraft.src.ModLoader;
import net.minecraft.src.World;
import net.minecraft.src.forge.Configuration;

public class ZeldaWorldConfig 
{static Minecraft mc = ModLoader.getMinecraftInstance();
	static String Save = mc.theWorld.getWorldInfo().getWorldName() + "";
	public static Configuration config;
	
public static void initProps(String mod){

		
		File newFile = new File(Minecraft.getMinecraftDir() + "/saves/" + Save + mod + ".cfg");
		config.load();
		config.save();
}

}
