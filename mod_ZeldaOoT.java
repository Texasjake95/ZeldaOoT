package net.minecraft.src.ZeldaOoT;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import net.minecraft.client.Minecraft;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;
import net.minecraft.src.ZeldaOoT.AddOns.*;
import net.minecraft.src.ZeldaOoT.Renders.*;
import net.minecraft.src.ZeldaOoT.Resource.*;
import static net.minecraft.src.ZeldaOoT.Resource.ZeldaItems.*;



public class mod_ZeldaOoT extends BaseMod
{	
	
	public static int ItemTexture(int i, int j)
	{
		int index =  j*16+i;
		return index;
	}
	public static KeyBinding Switch = new KeyBinding("Switch", 19);
	public static KeyBinding ShowMana = new KeyBinding("Show Mana", 50);
	public void keyboardEvent(KeyBinding keybinding)
	    {World world = mc.theWorld;
	   ItemStack itemStack = mc.thePlayer.inventory.getCurrentItem();
	    if(keybinding == Switch)
	    {	if (world != null){
	    	if(itemStack == null)
	    		{
	    	
	    		return;
	    		}
	    	if(itemStack.itemID == Ocarina.shiftedIndex)
	    	 	{
	    			int z = itemStack.getItemDamage();
	    			
	    			if( z == 0)
	    				{
	    					itemStack.setItemDamage(1);
	    					return;
	    				}
	    			else if ( z == 1)	
	    				{
	    					itemStack.setItemDamage(2);
	    					return;
	    				}
	    			else if ( z == 2)	
	    				{
	    					itemStack.setItemDamage(3);
	    					return;
	    				}
	    			else if ( z == 3)	
    				{
    					itemStack.setItemDamage(0);
    					return;
    				}
	    			else if ( z == 4)	
    				{
    					itemStack.setItemDamage(0);
    					return;
    				}
	    	  
	    	  
	    	 }
	    	if(itemStack.itemID == HeroBow.shiftedIndex)
	    		{
	    			int z = itemStack.getItemDamage();
	    			int par0 = 0;
	    			int par1 = 1;
	    			int par2 = 2;
	    			int par3 = 3;
	    			if( z == 0)
	    			{
	    				itemStack.setItemDamage(par1);
	    				return;
	    			}
	    			else if ( z == 1)	
	    			{
	    				itemStack.setItemDamage(par2);
	    				return;
	    			}
	    			else if ( z == 2)	
	    			{
	    				itemStack.setItemDamage(par3);
	    				return;
	    			}
	    			else if ( z == 3)	
	    			{
	    				itemStack.setItemDamage(par0);
	    				return;
	    			}
	    		}
	    }
	    }
	    
	    else if (keybinding == ShowMana)
	    {
	    	mc.thePlayer.addChatMessage("Current Mana: "+ZeldaPlayer.Mana.getCurrentMana()+"");
	    }
	    }
		
	
	
	@Override
	public String getVersion() {
		
		return "Beta 1.0.0 for Minecraft 1.2.5";
	}
	@Override
	 public String getPriorities()
    {
        return "after:*";
    }

	public void load() 
	{		 
		 //new ZeldaUpdateHandler(this);
		
		ZeldaRegister.Register();
			
		ZeldaRecipes.GetRecipes();
   		
		ZeldaNames.getNames();
		
		GetTextures();
		PlayerAPI.register("ZeldaPlayer", ZeldaPlayer.class);
		
		MinecraftForge.setBlockHarvestLevel(oreBlock, "pickaxe", 2);
		ModLoader.registerKey(this, Switch, false);
		ModLoader.registerKey(this, ShowMana, false);
		ModLoader.addLocalization("Switch", "Switch");
	    ModLoader.addLocalization("ShowMana", "Show Mana");
	    ModLoader.setInGameHook(this, true, true);
	    ModLoader.setInGUIHook(this, true, true);
	}
	public void modsLoaded() {
	   EE_Addon.getEMC();
	   AddonHandler.initAddons();
		if (AddonHandler.IC2 == true)
		{
			Config.initIC2Props();
		}
		if (AddonHandler.RPW == true)
		{
			Config.initRP2Props();
		}
		
	  	}
	private void GetTextures() {

		MinecraftForgeClient.preloadTexture("/ZeldaOoT/Resources/Blocks.png");
		MinecraftForgeClient.preloadTexture("/ZeldaOoT/Resources/Items.png");
		MinecraftForgeClient.preloadTexture("/ZeldaOoT/Resources/Armor/GZelda1.png");
		MinecraftForgeClient.preloadTexture("/ZeldaOoT/Resources/Armor/GZelda2.png");
		MinecraftForgeClient.preloadTexture("/ZeldaOoT/Resources/Armor/RZelda1.png");
		MinecraftForgeClient.preloadTexture("/ZeldaOoT/Resources/Armor/GBZelda1.png");
		MinecraftForgeClient.preloadTexture("/ZeldaOoT/Resources/Entities/Bomb.png");
		MinecraftForgeClient.preloadTexture("/ZeldaOoT/Resources/Entities/Horse.png");
		
	}
	public boolean onTickInGame(float time, Minecraft minecraftInstance)
	{
		Minecraft mc = ModLoader.getMinecraftInstance();
		ItemStack a1 = mc.thePlayer.inventory.armorInventory[3];
		ItemStack b1 = mc.thePlayer.inventory.armorInventory[2];
		ItemStack c1 = mc.thePlayer.inventory.armorInventory[1];
		ItemStack d1 = mc.thePlayer.inventory.armorInventory[0];
		PotionEffect Dig = new PotionEffect(Potion.digSpeed.id, 10, 2);
		if (a1 != null )
		{
			return true;
		}
			
		if(b1 != null)
		{
			if(b1 != null & b1.itemID == plateGZelda.shiftedIndex)
				{
					return true;
				}
			else if(b1 != null & b1.itemID == plateRZelda.shiftedIndex )
				{
					if (mc.thePlayer.handleLavaMovement() == true)
						{
							mc.thePlayer.capabilities.disableDamage = true;
							return true;
						}
				
					else if (mc.thePlayer.handleLavaMovement() == false)
						{
							mc.thePlayer.capabilities.disableDamage = false;
							return true;
						}
					else if(mc.thePlayer.isBurning())
						{
							mc.thePlayer.extinguish();
							return true;
						}
				}
			else if(b1 != null & b1.itemID == plateBZelda.shiftedIndex )
				{
					if (mc.thePlayer.getAir()== 0)
						{
							mc.thePlayer.setAir(300);
							return true;
						}
					else if (mc.thePlayer.handleWaterMovement() == true)
					{
						mc.thePlayer.addPotionEffect(Dig);
							
					}
				}
		}
		else if (d1 != null)
		{
			
		}
		
		
	return true;
			
		
    }
    public void addRenderer(Map map)
    {ModelZeldaHorse horse = new ModelZeldaHorse();
                   map.put(EntityZeldaArrow.class, new RenderZeldaArrow());
                   map.put(EntityZeldaBomb.class, new RenderZeldaBomb());
                   map.put(EntityZeldaHorse.class, new RenderZeldaHorse(horse, 0));
                   
    }
    static {
		Config.initProps("ZeldaOoT");
		
	}
	public void generateSurface(World world, Random random, int chunkX, int chunkZ)
    {
		if (AddonHandler.RPW == false & Config.GemGen == true)
		   {
        for(int l = 0; l < 13; l++)
                 {
                         int i1 = chunkX + random.nextInt(16);
                         int j1 =random.nextInt(50);
                         int k1 = chunkZ + random.nextInt(16);
                         (new WorldGenMineableMeta(oreBlock.blockID, 0, 5)).generate(world, random, i1, j1, k1);
                 }
              for(int l = 0; l < 13; l++)
              {
                      int i1 = chunkX + random.nextInt(16);
                      int j1 =random.nextInt(50);
                      int k1 = chunkZ + random.nextInt(16);
                      (new WorldGenMineableMeta(oreBlock.blockID, 1, 5)).generate(world, random, i1, j1, k1);
              }
              for(int l = 0; l < 13; l++)
              {
                      int i1 = chunkX + random.nextInt(16);
                      int j1 =random.nextInt(50);
                      int k1 = chunkZ + random.nextInt(16);
                      (new WorldGenMineableMeta(oreBlock.blockID, 2, 5)).generate(world, random, i1, j1, k1);
              }
		   }
             
 
		if (Config.IC2Copper == false & Config.RP2Copper == false & Config.CopperGen == true)
		{
			for(int l = 0; l < 20; l++)
         {
                 int i1 = chunkX + random.nextInt(16);
                 int j1 =random.nextInt(80);
                 int k1 = chunkZ + random.nextInt(16);
                 (new WorldGenMineableMeta(oreBlock.blockID, 3, 9)).generate(world, random, i1, j1, k1);
         }
			
		}
		if (Config.IC2Tin == false & Config.RP2Tin == false & Config.TinGen == true)
		{
			for(int l = 0; l < 20; l++)
         {
                 int i1 = chunkX + random.nextInt(16);
                 int j1 =random.nextInt(80);
                 int k1 = chunkZ + random.nextInt(16);
                 
         }
		}
	}
	public void generateNether(World world, Random random, int chunkX, int chunkZ)
    {
		
		if (Config.NetherGen == true)
		{
		//Nether Emerald
        for(int l = 0; l < 13; l++)
                 {
                         int i1 = chunkX + random.nextInt(16);
                         int j1 =random.nextInt(50);
                         int k1 = chunkZ + random.nextInt(16);
                         (new WorldGenNetherOreMeta(oreBlock.blockID, 5, 5)).generate(world, random, i1, j1, k1);
                 }//Nether Ruby
              for(int l = 0; l < 13; l++)
              {
                      int i1 = chunkX + random.nextInt(16);
                      int j1 =random.nextInt(50);
                      int k1 = chunkZ + random.nextInt(16);
                      (new WorldGenNetherOreMeta(oreBlock.blockID, 6, 5)).generate(world, random, i1, j1, k1);
              }//Nether Sapphire
              for(int l = 0; l < 13; l++)
              {
                      int i1 = chunkX + random.nextInt(16);
                      int j1 =random.nextInt(50);
                      int k1 = chunkZ + random.nextInt(16);
                      (new WorldGenNetherOreMeta(oreBlock.blockID, 7, 5)).generate(world, random, i1, j1, k1);
              }
            
 
            //Nether Copper
			for(int l = 0; l < 20; l++)
         {
                 int i1 = chunkX + random.nextInt(16);
                 int j1 =random.nextInt(80);
                 int k1 = chunkZ + random.nextInt(16);
                 (new WorldGenNetherOreMeta(oreBlock.blockID, 8, 9)).generate(world, random, i1, j1, k1);
         }
		
		//Nether Tin
			for(int l = 0; l < 20; l++)
         {
                 int i1 = chunkX + random.nextInt(16);
                 int j1 =random.nextInt(80);
                 int k1 = chunkZ + random.nextInt(16);
                 (new WorldGenNetherOreMeta(oreBlock.blockID, 9, 9)).generate(world, random, i1, j1, k1);
         }//Nether Coal
			 for (int var5 = 0; var5 < 20; ++var5)
		        {
		            int var6 = chunkX + random.nextInt(16);
		            int var7 = random.nextInt(128) + 0;
		            int var8 = chunkZ +  random.nextInt(16);
		            (new WorldGenNetherOreMeta(oreBlock.blockID, 10, 16)).generate(world, random, var6, var7, var8);
		        }//Nether Iron
			 for (int var5 = 0; var5 < 20; ++var5)
		        {
		            int var6 = chunkX + random.nextInt(16);
		            int var7 = random.nextInt(64) + 0;
		            int var8 = chunkZ +  random.nextInt(16);
		            (new WorldGenNetherOreMeta(oreBlock.blockID, 11, 8)).generate(world, random, var6, var7, var8);
		        }// Nether Gold
			 for (int var5 = 0; var5 < 2; ++var5)
		        {
		            int var6 = chunkX + random.nextInt(16);
		            int var7 = random.nextInt(32) + 0;
		            int var8 = chunkZ +  random.nextInt(16);
		            (new WorldGenNetherOreMeta(oreBlock.blockID, 12, 8)).generate(world, random, var6, var7, var8);
		        }//Nether Redstone
			 for (int var5 = 0; var5 < 8; ++var5)
		        {
		            int var6 = chunkX + random.nextInt(16);
		            int var7 = random.nextInt(16) + 0;
		            int var8 = chunkZ +  random.nextInt(16);
		            (new WorldGenNetherOreMeta(oreBlock.blockID, 13, 7)).generate(world, random, var6, var7, var8);
		        }//Nether Diamond
			 for (int var5 = 0; var5 < 1; ++var5)
		        {
		            int var6 = chunkX + random.nextInt(16);
		            int var7 = random.nextInt(16) + 0;
		            int var8 = chunkZ +  random.nextInt(16);
		            (new WorldGenNetherOreMeta(oreBlock.blockID, 14, 7)).generate(world, random, var6, var7, var8);
		        }//Nether Lapis
			 for (int var5 = 0; var5 < 1; ++var5)
		        {
				 	int var6 = chunkX + random.nextInt(16);		            
				 	int var7 = random.nextInt(16) + random.nextInt(16) +0 ;
				 	int var8 = chunkZ + random.nextInt(16);
				 	(new WorldGenNetherOreMeta(oreBlock.blockID, 15, 6)).generate(world, random, var6, var7, var8);
		        }
		}
		       
		
	}
	
	
	 Minecraft mc = ModLoader.getMinecraftInstance(); 
}


	
	
	


    