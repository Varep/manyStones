package com.varep.manystones.blocks.decor;

import com.varep.manystones.MSMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

public class CosmeticSlab extends BlockSlab {

	public CosmeticSlab(String Name, float Hard, String texture) {
		super(false, Material.rock);
		this.setBlockName(Name);
		this.setCreativeTab(MSMod.TabMS);
		this.setHardness(Hard);
		this.setResistance(500F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.0F);
		this.setBlockTextureName(texture);
		this.setLightOpacity(0);
}

	@Override
	public String func_150002_b(int p_150002_1_) {
		
		return null;
	}
}