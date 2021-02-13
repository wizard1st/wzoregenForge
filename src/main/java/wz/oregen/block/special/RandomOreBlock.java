package wz.oregen.block.special;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RandomOreBlock extends Block{

	List<Item> LIST_ITEM = Arrays.asList(Items.IRON_INGOT,Items.DIAMOND,Items.GOLD_INGOT, Items.GOLD_NUGGET, 
			Items.IRON_NUGGET, Items.EMERALD, Items.COAL, Items.CHARCOAL, Items.REDSTONE, Items.LAPIS_LAZULI);
	
	public RandomOreBlock(Properties properties) {
		super(properties);
	}
	public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state,
			@Nullable TileEntity te, ItemStack stack) {
		super.harvestBlock(worldIn, player, pos, state, te, stack);
		if (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack) == 0) {
			int rndItem = worldIn.rand.nextInt(LIST_ITEM.size()-1);
			int amount =  worldIn.rand.nextInt(2)+1;
			worldIn.addEntity(new ItemEntity(worldIn, pos.getX()+0.5, pos.getY()+0.5,pos.getZ()+0.5, 
					new ItemStack(LIST_ITEM.get(rndItem),amount)));
		}
	}
}
