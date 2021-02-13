package wz.oregen.block;

import java.util.Arrays;
import java.util.List;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import wz.oregen.WzUtils;

/** List of Dense Ore **/

public class DenseOres {
	
	//overworld
	public static Block DENSE_COAL_ORE = WzUtils.register("dense_coal_ore", new DenseOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block DENSE_DIAMOND_ORE = WzUtils.register("dense_diamond_ore", new DenseOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block DENSE_EMERALD_ORE = WzUtils.register("dense_emerald_ore", new DenseOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block DENSE_GOLD_ORE = WzUtils.register("dense_gold_ore", new DenseOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block DENSE_IRON_ORE = WzUtils.register("dense_iron_ore", new DenseOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block DENSE_LAPIS_ORE = WzUtils.register("dense_lapis_ore", new DenseOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block DENSE_REDSTONE_ORE = WzUtils.register("dense_redstone_ore", new DenseOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	
	public static BlockItem DENSE_COAL_ORE_ITEM = WzUtils.register("dense_coal_ore", DENSE_COAL_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem DENSE_DIAMOND_ORE_ITEM = WzUtils.register("dense_diamond_ore", DENSE_DIAMOND_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem DENSE_EMERALD_ORE_ITEM = WzUtils.register("dense_emerald_ore", DENSE_EMERALD_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem DENSE_GOLD_ORE_ITEM = WzUtils.register("dense_gold_ore", DENSE_GOLD_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem DENSE_IRON_ORE_ITEM = WzUtils.register("dense_iron_ore", DENSE_IRON_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem DENSE_LAPIS_ORE_ITEM = WzUtils.register("dense_lapis_ore", DENSE_LAPIS_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem DENSE_REDSTONE_ORE_ITEM = WzUtils.register("dense_redstone_ore", DENSE_REDSTONE_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	
	//nether
	public static Block DENSE_GOLD_NETHER_ORE = WzUtils.register("dense_gold_nether_ore", new DenseOreBlock(AbstractBlock.Properties.create(Material.ROCK,MaterialColor.NETHERRACK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F).sound(SoundType.NETHER_ORE)));
	public static Block DENSE_QUARTZ_NETHER_ORE = WzUtils.register("dense_quartz_nether_ore", new DenseOreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F).sound(SoundType.NETHER_ORE)));
	
	public static BlockItem DENSE_GOLD_NETHER_ORE_ITEM = WzUtils.register("dense_gold_nether_ore", DENSE_GOLD_NETHER_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem DENSE_QUARTZ_NETHER_ORE_ITEM = WzUtils.register("dense_quartz_nether_ore", DENSE_QUARTZ_NETHER_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	
	public static List<Block> getBlockList() {
		return Arrays.asList(DENSE_COAL_ORE,DENSE_DIAMOND_ORE,DENSE_EMERALD_ORE,
				DENSE_GOLD_ORE,DENSE_IRON_ORE,DENSE_LAPIS_ORE,DENSE_REDSTONE_ORE,DENSE_GOLD_NETHER_ORE,DENSE_QUARTZ_NETHER_ORE);
	}
	
	public static List<Item> getItemList() {
		return Arrays.asList(DENSE_COAL_ORE_ITEM,DENSE_DIAMOND_ORE_ITEM,DENSE_EMERALD_ORE_ITEM,
				DENSE_EMERALD_ORE_ITEM,DENSE_GOLD_ORE_ITEM,DENSE_IRON_ORE_ITEM,DENSE_LAPIS_ORE_ITEM,
				DENSE_REDSTONE_ORE_ITEM,DENSE_GOLD_NETHER_ORE_ITEM,DENSE_QUARTZ_NETHER_ORE_ITEM);
	}


}
