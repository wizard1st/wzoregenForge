package wz.oregen.block.special;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import wz.oregen.block.AdditionOreBlock;

public class UraniumOreBlock extends AdditionOreBlock {

	public UraniumOreBlock(Properties properties) {
		super(properties);
	}
	
	public boolean removedByPlayer(BlockState state, World world, BlockPos pos, PlayerEntity player,
			boolean willHarvest, FluidState fluid) {
		getBlock().onBlockHarvested(world, pos, state, player);
		BlockPos bPos = pos.north(2).west(2).up(2);
		BlockPos ePos = pos.south(2).east(2).down(2);
		AxisAlignedBB aabb = new AxisAlignedBB(bPos,ePos);
		for(int x = (int)aabb.minX; x<= aabb.maxX; x++) {
			for(int y = (int)aabb.minY ; y<= aabb.maxY; y++) {
				for (int z=(int)aabb.minZ; z<= aabb.maxZ; z++) {
					List<LivingEntity> listEntity = world.getEntitiesWithinAABB(LivingEntity.class, new AxisAlignedBB(new BlockPos(x,y,z)));
					for(LivingEntity entity : listEntity) {
						entity.addPotionEffect(new EffectInstance(Effects.POISON,1200,4));
					}
				}
			}
		}
		return world.setBlockState(pos, fluid.getBlockState(), world.isRemote ? 11 : 3);
	}
}
