package texasjake95.ZeldaOoT;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class ItemBlockZeldaOre extends ItemBlock {

	public ItemBlockZeldaOre(int blockID) {
		super(blockID);
		setHasSubtypes(true);
	}

	//returns the metadata of the block
	@Override
	public int getMetadata(int metadata)
	{
		return metadata;
	}

	// This is for your naming of the metablock
	private static final String blockNames[] =
	{
		"XXX","XXX2","XXX3","XXX4",
		"XXX5","XXX6","XXX7","XXX8",
		"XXX9","XXX10","XXX11","XXX12",
		"XXX13","XXX14","XXX15","XXX16"
	};

	@Override
	public String getItemNameIS(ItemStack itemstack){
		//this returns a string with the block name
		//example: blockXXX
		return new StringBuilder().append("ItemBlockZeldaOre").append(blockNames[itemstack.getItemDamage()]).toString();
	}
}