package com.varep.manystones.blocks.decor;

import com.varep.manystones.MSMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

public class CosmeticFence extends BlockFence {

	public CosmeticFence(Block block, String Name, float Hard, String texture) {
		super(texture, Material.rock);
		this.setBlockName(Name);
		this.setCreativeTab(MSMod.TabMS);
		this.setHardness(Hard);
		this.setResistance(500F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.0F);
		this.setBlockTextureName(texture);

	}

}
