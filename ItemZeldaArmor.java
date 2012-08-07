package texasjake95.ZeldaOoT;
import java.util.ArrayList;
import net.minecraft.src.*;


import static texasjake95.ZeldaOoT.Resource.ZeldaItems.*;
import net.minecraft.src.forge.*;

public class ItemZeldaArmor extends ItemArmor implements ITextureProvider, IArmorTextureProvider
{
         
    	
	public ItemZeldaArmor(int i, EnumArmorMaterial enumarmormaterial, int j, int k) 
	{
		
		super(i, enumarmormaterial, j, k);
		
	}

	 public String getTextureFile()
        {
                return "/ZeldaOoT/Resources/Items.png";
        }
        public String getArmorTextureFile(ItemStack itemstack)
        {
                if(itemstack.itemID == helmetGZelda.shiftedIndex || 
                   itemstack.itemID == plateGZelda.shiftedIndex || 
                   itemstack.itemID == bootsGZelda.shiftedIndex)
                {
                        return "/ZeldaOoT/Resources/Armor/GZelda1.png";
                }
                if(itemstack.itemID == legsGZelda.shiftedIndex)
                {
                        return "/ZeldaOoT/Resources/Armor/GZelda2.png";
                }
                
                if(itemstack.itemID == plateBZelda.shiftedIndex||
                        itemstack.itemID == bootsBZelda.shiftedIndex)
                {
                             return "/ZeldaOoT/Resources/Armor/BZelda1.png";
                }
                if(itemstack.itemID == plateRZelda.shiftedIndex)
                {
                        return "/ZeldaOoT/Resources/Armor/RZelda1.png";
                }
                
                return  "/ZeldaOoT/Resources/Armor/GZelda1.png";
                     
                          
                
                
        }
        public void addCreativeItems(ArrayList itemList)
    	{
        	itemList.add(new ItemStack(this));
       	}
}
