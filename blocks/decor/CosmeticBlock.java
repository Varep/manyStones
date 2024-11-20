package com.varep.manystones.blocks.decor;

import com.varep.manystones.MSMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CosmeticBlock extends Block {

	public CosmeticBlock(String Name, float Hard, String texture) {
	super(Material.rock);
	this.setBlockName(Name);
	this.setCreativeTab(MSMod.TabMS);
	this.setHardness(Hard);
	this.setResistance(500F);
	this.setHarvestLevel("pickaxe", 2);
	this.setLightLevel(0.0F);
	this.setBlockTextureName(texture);

}
}