package wz.oregen.block;

import java.util.Arrays;
import java.util.List;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import wz.oregen.WzUtils;
import wz.oregen.block.special.LavaBlock;
import wz.oregen.block.special.RandomOreBlock;
import wz.oregen.block.special.UraniumOreBlock;
import wz.oregen.block.special.WaterBlock;

public class AdditionOres {
	public static Block RAINBOW_ORE = WzUtils.register("rainbow_ore", new AdditionOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block RAINBOW_BLOCK = WzUtils.register("rainbow_block", new AdditionOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block URANIUM_ORE = WzUtils.register("uranium_ore", new UraniumOreBlock(AbstractBlock.Properties.create(Material.ROCK)
			.setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block DIRT_DIAMOND_ORE = WzUtils.register("dirt_diamond_ore", new AdditionOreBlock(AbstractBlock.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5F).sound(SoundType.GROUND)));
	public static Block LAVA_BLOCK_ORE = WzUtils.register("lava_block", new LavaBlock(AbstractBlock.Properties.create(Material.ROCK)
			.hardnessAndResistance(3.0F, 3.0F).sound(SoundType.GLASS).setLightLevel((state) -> {
	      return 15;
	   })));
	public static Block RANDOM_ORE = WzUtils.register("random_ore", new RandomOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block ALUMINIUM_ORE = WzUtils.register("aluminium_ore", new AdditionOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block AMETHYST_ORE = WzUtils.register("amethyst_ore", new AdditionOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block RUBY_ORE = WzUtils.register("ruby_ore",new AdditionOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block SAPPHIRE_ORE = WzUtils.register("sapphire_ore", new AdditionOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block RUBY_BLOCK = WzUtils.register("ruby_block",new AdditionOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block SAPPHIRE_BLOCK = WzUtils.register("sapphire_block",new AdditionOreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
	public static Block WATER_BLOCK = WzUtils.register("water_block", new WaterBlock(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS)));
	
	public static BlockItem RAINBOW_ORE_ITEM = WzUtils.register("rainbow_ore", RAINBOW_ORE,new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem RAINBOW_BLOCK_ITEM = WzUtils.register("rainbow_block", RAINBOW_BLOCK,new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem URANIUM_ORE_ITEM = WzUtils.register("uranium_ore", URANIUM_ORE,new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem DIRT_DIAMOND_ORE_ITEM = WzUtils.register("dirt_diamond_ore", DIRT_DIAMOND_ORE,new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem LAVA_BLOCK_ORE_ITEM = WzUtils.register("lava_block", LAVA_BLOCK_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem RANDOM_ORE_ITEM = WzUtils.register("random_ore", RANDOM_ORE,  new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem ALUMINIUM_ORE_ITEM = WzUtils.register("aluminium_ore", ALUMINIUM_ORE,  new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem AMETHYST_ORE_ITEM = WzUtils.register("amethyst_ore", AMETHYST_ORE,  new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem RUBY_ORE_ITEM = WzUtils.register("ruby_ore", RUBY_ORE,  new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem SAPPHIRE_ORE_ITEM = WzUtils.register("sapphire_ore", SAPPHIRE_ORE,  new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem RUBY_BLOCK_ITEM = WzUtils.register("ruby_block", RUBY_BLOCK,  new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem SAPPHIRE_BLOCK_ITEM = WzUtils.register("sapphire_block", SAPPHIRE_BLOCK,  new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	public static BlockItem WATER_BLOCK_ITEM = WzUtils.register("water_block", WATER_BLOCK, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
	
	public static Item RAINBOW_STONE = WzUtils.register("rainbow_stone", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static Item URANIUM_SHARD = WzUtils.register("uranium_shard", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static Item URANIUM_INGOT = WzUtils.register("uranium_ingot", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static Item DIAMOND_SHARD = WzUtils.register("diamond_shard", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static Item ALUMINIUM_INGOT = WzUtils.register("aluminium_ingot", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static Item AMETHYST = WzUtils.register("amethyst", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static Item RUBY = WzUtils.register("ruby", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static Item SAPPHIRE = WzUtils.register("sapphire", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

	public static List<Block> getBlockList() {
		return Arrays.asList(RAINBOW_ORE,RAINBOW_BLOCK,URANIUM_ORE,DIRT_DIAMOND_ORE,LAVA_BLOCK_ORE,RANDOM_ORE,
				ALUMINIUM_ORE,AMETHYST_ORE,RUBY_ORE,SAPPHIRE_ORE,RUBY_BLOCK,SAPPHIRE_BLOCK,WATER_BLOCK);
	}
	public static List<Item> getItemList() {
		return Arrays.asList(AMETHYST,RUBY,ALUMINIUM_INGOT,
				SAPPHIRE,RAINBOW_ORE_ITEM,RAINBOW_BLOCK_ITEM,RAINBOW_STONE,
				URANIUM_ORE_ITEM,URANIUM_SHARD,URANIUM_INGOT,DIRT_DIAMOND_ORE_ITEM,
				DIAMOND_SHARD,LAVA_BLOCK_ORE_ITEM,RANDOM_ORE_ITEM,
				ALUMINIUM_ORE_ITEM,AMETHYST_ORE_ITEM,RUBY_ORE_ITEM,SAPPHIRE_ORE_ITEM,RUBY_BLOCK_ITEM,SAPPHIRE_BLOCK_ITEM,WATER_BLOCK_ITEM);
	}
}
