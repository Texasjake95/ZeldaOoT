package texasjake95.ZeldaOoT;

import java.util.ArrayList;
import java.util.Random;
import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;
import static texasjake95.ZeldaOoT.Resource.ZeldaItems.*;

public class BlockZeldaOre extends Block implements ITextureProvider{

	
	public BlockZeldaOre(int i, int j) {
		super(i, j, Material.rock);
		setHardness(5.0F);
		setResistance(10.0F);
		setStepSound(Block.soundStoneFootstep);
		
		}
	@Override
    protected int damageDropped(int metadata)
    {switch (metadata)
		{
		case 1: return 1;
		case 2: return 2;
		case 3: return 3;
		case 4: return 4;
		case 5: return 0;
		case 6: return 1;
		case 7: return 2;
		case 8: return 8;
		case 9: return 9;
		case 10: return 0;
		case 11: return 11;
		case 12: return 12;
		case 13: return 0;
		case 14: return 0;
		case 15: return 4;
		default: return 0;
		}
    }
		
		@Override
		public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
			switch (metadata)
			{
			case 1: return 1;
			case 2: return 2;
			case 3: return 3;
			case 4: return 4;
			case 5: return 5;
			case 6: return 6;
			case 7: return 7;
			case 8: return 8;
			case 9: return 9;
			case 10: return 10;
			case 11: return 11;
			case 12: return 12;
			case 13: return 13;
			case 14: return 14;
			case 15: return 15;
			default: return 0;
			
			}
		}
		public int idDropped(int i, Random random, int j) 
		{
	       switch(i)
	       {
	       case 1: return Gems.shiftedIndex;
			case 2: return Gems.shiftedIndex; 
			case 3: return this.blockID;
			case 4: return this.blockID;
			case 5: return Gems.shiftedIndex;
			case 6: return Gems.shiftedIndex;
			case 7: return Gems.shiftedIndex;
			case 8: return this.blockID;
			case 9: return this.blockID;
			case 10: return Item.coal.shiftedIndex;
			case 11: return this.blockID;
			case 12: return this.blockID;
			case 13: return Item.redstone.shiftedIndex;
			case 14: return Item.diamond.shiftedIndex;
			case 15: return Item.dyePowder.shiftedIndex;
			default: return Gems.shiftedIndex;
	       }
	    }
		
		public int quantityDropped(int meta, int fortune, Random random)
		{
		switch(meta){
		case 13: return 4 + random.nextInt(2);
		case 15: return 4 + random.nextInt(5);
		default: return 1;
		}
		}
		

		@Override
		public String getTextureFile(){
			return"/ZeldaOoT/Resources/Blocks.png"; 
		}

	public void addCreativeItems(ArrayList itemList)
	{
		itemList.add(new ItemStack(this));
	}

}
