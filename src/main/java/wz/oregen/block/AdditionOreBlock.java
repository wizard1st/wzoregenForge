package wz.oregen.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.server.ServerWorld;

public class AdditionOreBlock extends Block{

	public AdditionOreBlock(Properties properties) {
		super(properties);
	}
	protected int getExperience(Random rand) {
		if (this == AdditionOres.RAINBOW_ORE) {
			return MathHelper.nextInt(rand, 10, 15);
		}else if(this == AdditionOres.URANIUM_ORE) {
			return MathHelper.nextInt(rand, 20, 30);
		}
		return 0;
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
