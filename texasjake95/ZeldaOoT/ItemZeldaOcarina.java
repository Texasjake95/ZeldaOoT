package texasjake95.ZeldaOoT;
import net.minecraft.client.Minecraft;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class ItemZeldaOcarina extends Item implements ITextureProvider
{Minecraft mc = ModLoader.getMinecraftInstance();

	
	public ItemZeldaOcarina(int par1) 
	{
		super(par1);
        setHasSubtypes(true);
        maxStackSize = 1;
	}
	
	 public int getIconFromDamage(int i)
     {
             switch(i){
                             case 1: return mod_ZeldaOoT.ItemTexture(12, 1);
                             case 2: return mod_ZeldaOoT.ItemTexture(13, 1);
                             case 3: return mod_ZeldaOoT.ItemTexture(14, 1);
                             case 4: return mod_ZeldaOoT.ItemTexture(15, 1);
                             default: return mod_ZeldaOoT.ItemTexture(11,1);         
     }
}
	
	public int setDamageFromMetadata(int i, int metadata)
	{
	switch(metadata)
	{
	    case 1: return 1;
	    case 2: return 2;
	    case 3: return 3;
	    case 4: return 4;
	    default: return 0;
	}
	}
	private String[] names = new String[]{"Rain", "Sun", "Heal", "Time" , "Horse"};
	public String getItemNameIS(ItemStack itemstack)
    {
        return names[itemstack.getItemDamage()];
    }
	 public String getTextureFile()
     {
             return "/ZeldaOoT/Resources/Items.png";
     }
	 public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer par3EntityPlayer)
	    {int a = itemstack.getItemDamage();
		if (a == 3 || a ==  4)
		{
			return itemstack;
		}
		else if (a == 2)
		{
			Song_of_Healing(world, itemstack);
		}
		else if (a == 1)
		{
			SunsSong(world, itemstack);
		}
		else if (a == 0)
		{			  
			Song_of_Storms(world, itemstack);		
		}
		return itemstack;
		
				
	 }
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7)
	{int a = par1ItemStack.getItemDamage();
		 if (a == 4){double x = mc.thePlayer.posX;
			double y = mc.thePlayer.posY;
			double z = mc.thePlayer.posZ;
			 if (par3World.isRemote)
		 
	        {
	            return true;
	        }
			 
	        else
	        {par3World.playSoundEffect(x, y, z, "Ocarina.Epona_Song", 50F, 1F);
	            int var8 = par3World.getBlockId(par4, par5, par6);
	            par4 += Facing.offsetsXForSide[par7];
	            par5 += Facing.offsetsYForSide[par7];
	            par6 += Facing.offsetsZForSide[par7];
	            double var9 = 0.0D;

	            if (par7 == 1 && var8 == Block.fence.blockID || var8 == Block.netherFence.blockID)
	            {
	                var9 = 0.5D;
	            }
	            
	            spawnCreature(par3World, "ZeldaHorse", (double)par4 + 0.5D, (double)par5 + var9, (double)par6 + 0.5D);
	            

	            return true;
	        }
		 }
		return true;
		
	}
	public static boolean spawnCreature(World par0World, String Name, double par2, double par4, double par6)
    {
        
       
            Entity var8 = EntityList.createEntityByName(Name, par0World);
            
            if (var8 != null)
            {
                var8.setLocationAndAngles(par2, par4, par6, par0World.rand.nextFloat() * 360.0F, 0.0F);
                par0World.spawnEntityInWorld(var8);
            }

            return var8 != null;
        }
	
	private  Object SunsSong(World world, ItemStack itemstack )
	{	long time = world.getWorldTime();
	double x = mc.thePlayer.posX;
	double y = mc.thePlayer.posY;
	double z = mc.thePlayer.posZ;
	boolean par1 = true;
	boolean par2 = false;
	int LVL = mc.thePlayer.experienceLevel;
	int TL = mc.thePlayer.experienceTotal;
	float XP = mc.thePlayer.experience;
	int health = mc.thePlayer.getHealth();
	int hunger = mc.thePlayer.getFoodStats().getFoodLevel();	
	if (12000 < time)
		{
			world.playSoundEffect(x, y, z, "Ocarina.Suns_Song", 50F, 1F);
			mc.theWorld.setWorldTime(0);
			
		}
		if (0 < time & time < 12000)
		{
			
		   world.playSoundEffect(x, y, z, "Ocarina.Suns_Song", 50F, 1F);
		   mc.theWorld.setWorldTime(12000);
		    
		   }
	return itemstack; 
	}
	private  Object Song_of_Storms(World world, ItemStack itemstack )

	{	double x = mc.thePlayer.posX;
	double y = mc.thePlayer.posY;
	double z = mc.thePlayer.posZ;
	boolean par1 = true;
	boolean par2 = false;
	int LVL = mc.thePlayer.experienceLevel;
	int TL = mc.thePlayer.experienceTotal;
	float XP = mc.thePlayer.experience;
	int health = mc.thePlayer.getHealth();
	int hunger = mc.thePlayer.getFoodStats().getFoodLevel();	
		if (world.isRaining())
		{
		world.playSoundEffect(x, y, z, "Ocarina.Song_of_Storms", 1F, 1F);
		world.getWorldInfo().setRaining(par2);
		return itemstack;
		}
		else if (!world.isRaining())
		{
			world.playSoundEffect(x, y, z, "Ocarina.Song_of_Storms", 1F, 1F);
			world.getWorldInfo().setRaining(par1);
			return itemstack;
		}

	return itemstack; 
	}
	private  Object Song_of_Healing(World world, ItemStack itemstack )
	{double x = mc.thePlayer.posX;
	double y = mc.thePlayer.posY;
	double z = mc.thePlayer.posZ;
	boolean par1 = true;
	boolean par2 = false;
	int LVL = mc.thePlayer.experienceLevel;
	int TL = mc.thePlayer.experienceTotal;
	float XP = mc.thePlayer.experience;
	int health = mc.thePlayer.getHealth();
	int hunger = mc.thePlayer.getFoodStats().getFoodLevel();
		if(LVL >= 1 & (hunger < 20 || health < 20))
		{
		if (health > hunger & hunger < 20)
		{
			if (20 - hunger >= 5)
			{
			world.playSoundEffect(x, y, z, "Ocarina.Song_of_Healing", 50F, 1F);
			mc.thePlayer.getFoodStats().setFoodLevel(hunger + 5);
			mc.thePlayer.setXPStats(XP, TL, LVL-1);
			return itemstack;
			}
			if (20 - hunger <= 5)
			{
		    world.playSoundEffect(x, y, z, "Ocarina.Song_of_Healing", 50F, 1F);
			mc.thePlayer.getFoodStats().setFoodLevel((20 - hunger) + hunger);
			mc.thePlayer.setXPStats(XP, TL, LVL-1);
			return itemstack;
			}
			
		}
		if (hunger > health & health < 20)
		{
			if (20 - health >= 5)
			{
			world.playSoundEffect(x, y, z, "Ocarina.Song_of_Healing", 50F, 1F);
			mc.thePlayer.setHealth(health + 5);
			mc.thePlayer.setXPStats(XP, TL, LVL-1);
			return itemstack;
			}
			if (20 - health <= 5)
			{
			world.playSoundEffect(x, y, z, "Ocarina.Song_of_Healing", 50F, 1F);
			mc.thePlayer.setHealth((20 - health) + health);
			mc.thePlayer.setXPStats(XP, TL, LVL-1);
			return itemstack;
			}
		}
	 
	}
		return itemstack;
	}

	 
	
}
