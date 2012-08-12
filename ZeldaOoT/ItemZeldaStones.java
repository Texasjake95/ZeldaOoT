package texasjake95.ZeldaOoT;
import net.minecraft.src.forge.*;
import net.minecraft.src.*;


public class ItemZeldaStones extends Item implements ITextureProvider
{

	
	public ItemZeldaStones(int par1) 
	{
		super(par1);
        setHasSubtypes(true);
        maxStackSize = 1;
	}
	
	public int getIconFromDamage(int i)
	{
	switch(i)
	{
		case 1: return mod_ZeldaOoT.ItemTexture(4,0);
		case 2: return mod_ZeldaOoT.ItemTexture(5,0);
		default: return mod_ZeldaOoT.ItemTexture(3,0);
	}
	}
	public int setDamageFromMetadata(int i, int metadata)
	{
	switch(metadata)
	{
	    case 1: return 1;
	    case 2: return 2;
	    default: return 0;
	}
	}
	private String[] names = new String[]{ "Goron's Ruby", "Zora's Sapphire", "Kokiri's Emerald"};
	public String getItemNameIS(ItemStack itemstack)
    {
        return names[itemstack.getItemDamage()];
    }
	 public String getTextureFile()
     {
             return "/ZeldaOoT/Resources/Items.png";
     }
}