package com.varep.manystones.blocks;

import java.util.Random;

import com.varep.manystones.MSMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;

public class OreDolomit extends Block {

	public OreDolomit() {
		super(Material.rock);
		this.setBlockName("OreDolomit");
		this.setCreativeTab(MSMod.TabMS);
		this.setHardness(5F);
		this.setResistance(500F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.0F);
		this.setUnlocalizedName("OreDolomit");
		this.setBlockTextureName("manystones:OreDolomit");
	}

	private void setUnlocalizedName(String string) {
		
		
	}
	
}