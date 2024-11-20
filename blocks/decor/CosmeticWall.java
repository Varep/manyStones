package com.varep.manystones.blocks.decor;

import com.varep.manystones.MSMod;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class CosmeticWall extends BlockWall {

	Block block;

	public CosmeticWall(Block block, String Name, float Hard, String texture) {
		super(block);
		this.block = block;
		this.setCreativeTab(MSMod.TabMS);
		this.setHardness(Hard);
		this.setResistance(500F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.0F);
		this.setBlockTextureName(texture);
		setBlockName(Name +  "Wall");
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return true;
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return block.getIcon(side, 0);
	}

}

	
	
/*	
	Block block;
	public CosmeticWall(Block block, String Name, float Hard, String texture) {
		super(block);
		this.setBlockName(Name);
		this.block = block;
		this.setCreativeTab(MSMod.TabMS);
		this.setHardness(Hard);
		this.setResistance(500F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.0F);
		this.setBlockTextureName(texture);

	}
	
	
	
	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return true;
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return block.getIcon(side, 0);
	}

	

	

}
	
*/
