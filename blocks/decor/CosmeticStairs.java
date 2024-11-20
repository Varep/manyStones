package com.varep.manystones.blocks.decor;

import com.varep.manystones.MSMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;

public class CosmeticStairs extends BlockStairs {

	public CosmeticStairs(Block block, String Name, float Hard, String texture) {
		super(block, 0);
		this.setBlockName(Name);
		this.setCreativeTab(MSMod.TabMS);
		this.setHardness(Hard);
		this.setResistance(500F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.0F);
		this.setBlockTextureName(texture);
		this.setLightOpacity(0);

	
}

	
	
}
