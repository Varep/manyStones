package com.varep.manystones.blocks;

import com.varep.manystones.MSMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class WorldBlock  extends Block {

	public WorldBlock(String Name, float Hard, int LevelMine, String texture) {
	super(Material.rock);
	this.setBlockName(Name);
	this.setCreativeTab(MSMod.TabMS);
	this.setHardness(Hard);
	this.setResistance(500F);
	this.setHarvestLevel("pickaxe", LevelMine);
	this.setLightLevel(0.0F);
	this.setBlockTextureName(texture);

}
}
