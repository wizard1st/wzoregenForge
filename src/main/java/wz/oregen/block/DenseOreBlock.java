package wz.oregen.block;

import java.util.Random;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.server.ServerWorld;

public class DenseOreBlock extends Block {
	public DenseOreBlock(AbstractBlock.Properties properties) {
		super(properties);
	}

	protected int getExperience(Random rand) {
		if (this == DenseOres.DENSE_COAL_ORE) {
			return MathHelper.nextInt(rand, 2, 6);
		} else if (this == DenseOres.DENSE_DIAMOND_ORE) {
			return MathHelper.nextInt(rand, 9, 21);
		} else if (this == DenseOres.DENSE_EMERALD_ORE) {
			return MathHelper.nextInt(rand, 9, 21);
		} else if (this == DenseOres.DENSE_LAPIS_ORE) {
			return MathHelper.nextInt(rand, 6, 15);
	    } else if (this == DenseOres.DENSE_QUARTZ_NETHER_ORE) {
	        return MathHelper.nextInt(rand, 12, 15);
		} else {
			return this == DenseOres.DENSE_GOLD_NETHER_ORE ? MathHelper.nextInt(rand, 0, 3) : 0;
		}
	}

	@SuppressWarnings("deprecation")
	public void spawnAdditionalDrops(BlockState state, ServerWorld worldIn, BlockPos pos, ItemStack stack) {
		super.spawnAdditionalDrops(state, worldIn, pos, stack);
	}

	@Override
	public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune,
			int silktouch) {
		return silktouch == 0 ? this.getExperience(RANDOM) : 0;
	}
}
