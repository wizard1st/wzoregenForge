package wz.oregen.world;

import java.util.ArrayList;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import wz.oregen.block.AdditionOres;
import wz.oregen.block.DenseOres;

@Mod.EventBusSubscriber
public class OreGeneration {

	private static final ArrayList<ConfiguredFeature<?, ?>> overworldOres = new ArrayList<ConfiguredFeature<?, ?>>();
	private static final ArrayList<ConfiguredFeature<?, ?>> netherOres = new ArrayList<ConfiguredFeature<?, ?>>();

	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name,
			ConfiguredFeature<FC, ?> configuredFeature) {
		return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "wzoregen:" + name, configuredFeature);
	}

	public static void registerOre() {
		// overworld
		overworldOres.add(register("dense_coal_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
				OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, DenseOres.DENSE_COAL_ORE.getDefaultState(), 4)))
						.range(64).square() // spawn height start
						.func_242731_b(16)); // chunk spawn frequency

		overworldOres.add(register("dense_gold_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
				OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, DenseOres.DENSE_GOLD_ORE.getDefaultState(), 4)))
						.range(32).square() // spawn height start
						.func_242731_b(16)); // chunk spawn frequency

		overworldOres.add(register("dense_iron_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
				OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, DenseOres.DENSE_IRON_ORE.getDefaultState(), 6)))
						.range(64).square() // spawn height start
						.func_242731_b(16)); // chunk spawn frequency

		overworldOres.add(register("dense_lapis_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
				OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, DenseOres.DENSE_LAPIS_ORE.getDefaultState(), 8)))
						.range(32).square() // spawn height start
						.func_242731_b(4)); // chunk spawn frequency

		overworldOres.add(register("dense_redstone_ore",
				Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
								DenseOres.DENSE_REDSTONE_ORE.getDefaultState(), 8))).range(16).square() // spawn height
																										// start
										.func_242731_b(8)); // chunk spawn frequency

		overworldOres.add(register("dense_diamond_ore",
				Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
								DenseOres.DENSE_DIAMOND_ORE.getDefaultState(), 4))).range(8).square() // spawn height
																										// start
										.func_242731_b(1)); // chunk spawn frequency

		overworldOres.add(register("dense_emerald_ore",
				Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
								DenseOres.DENSE_EMERALD_ORE.getDefaultState(), 1))).range(32).square() // spawn height
																										// start
										.func_242731_b(2)); // chunk spawn frequency

		overworldOres.add(register("rainbow_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
				OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, AdditionOres.RAINBOW_ORE.getDefaultState(), 4)))
						.range(64).square() // spawn height start
						.func_242731_b(4)); // chunk spawn frequency

		overworldOres.add(register("uranium_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
				OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, AdditionOres.URANIUM_ORE.getDefaultState(), 6)))
						.range(4).square() // spawn height start
						.func_242731_b(2)); // chunk spawn frequency
		
		overworldOres.add(register("aluminium_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
				OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, AdditionOres.ALUMINIUM_ORE.getDefaultState(), 2)))
						.range(128).square() // spawn height start
						.func_242731_b(6)); // chunk spawn frequency
		
		overworldOres.add(register("amethyst_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
				OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, AdditionOres.AMETHYST_ORE.getDefaultState(), 4)))
						.range(32).square() // spawn height start
						.func_242731_b(6)); // chunk spawn frequency
		
		overworldOres.add(register("ruby_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
				OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, AdditionOres.RUBY_ORE.getDefaultState(), 4)))
						.range(32).square() // spawn height start
						.func_242731_b(6)); // chunk spawn frequency
		
		overworldOres.add(register("sapphire_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
				OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, AdditionOres.SAPPHIRE_ORE.getDefaultState(), 4)))
						.range(32).square() // spawn height start
						.func_242731_b(6)); // chunk spawn frequency

//		 nether
		netherOres.add(register("dense_gold_nether_ore",
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
						DenseOres.DENSE_GOLD_NETHER_ORE.getDefaultState(), 4))).range(128).square() // spawn height
																									// start
								.func_242731_b(16)); // chunk spawn frequency

		netherOres.add(register("dense_quartz_nether_ore",
				Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
						DenseOres.DENSE_GOLD_NETHER_ORE.getDefaultState(), 4))).range(128).square() // spawn height
																									// start
								.func_242731_b(16)); // chunk spawn frequency
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void gen(BiomeLoadingEvent event) {
		BiomeGenerationSettingsBuilder generation = event.getGeneration();
		if (event.getCategory().equals(Biome.Category.NETHER)) {
			for (ConfiguredFeature<?, ?> ore : netherOres) {
				if (ore != null)
					generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
			}
		}
		for (ConfiguredFeature<?, ?> ore : overworldOres) {
			if (ore != null) {
				generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
			}
		}
	}
}
