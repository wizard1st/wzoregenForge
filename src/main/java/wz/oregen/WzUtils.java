package wz.oregen;

import org.apache.commons.lang3.ArrayUtils;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class WzUtils {

	@SafeVarargs
	public static Item[] MergeItemList(Item[]... ItemArray) {
		Item[] retItem = null;
		for(Item[] itemArr: ItemArray) {
			retItem = (Item[]) ArrayUtils.addAll(retItem, itemArr);
		}
		return retItem;
	}
	@SafeVarargs
	public static Block[] MergeBlockList(Block[]... blockArray) {
		Block[] retBlocks = null;
		for(Block[] blockArr: blockArray) {
			retBlocks = (Block[]) ArrayUtils.addAll(retBlocks, blockArr);
		}
		return retBlocks;
	}
	public static Item register(String key, Item item) {
		return item.setRegistryName("wzoregen", key);
	}

	public static BlockItem register(String key, Block blockIn, Item.Properties properties) {
		return (BlockItem) new BlockItem(blockIn, properties).setRegistryName("wzoregen", key);
	}
	public static Block register(String key, Block block) {
		return block.setRegistryName("wzoregen", key);
	}
	
}
