package texasjake95.ZeldaOoT;
import java.util.ArrayList;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class ItemZelda extends Item implements ITextureProvider{
	

	public ItemZelda(int par1) {
		super(par1);
		maxStackSize = 64;
	}
	public String getTextureFile()
    {
            return "/ZeldaOoT/Resources/Items.png";
    }
    public void addCreativeItems(ArrayList itemList)
	{
		itemList.add(new ItemStack(this));
	}
}
