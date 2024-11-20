package com.varep.manystones.blocks;

import java.util.Random;

import com.varep.manystones.MSMod;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;


public class OrePyroxenit extends Block {

	public OrePyroxenit() {
		super(Material.rock);
		this.setBlockName("OrePyroxenit");
		this.setCreativeTab(MSMod.TabMS);
		this.setHardness(50F);
		this.setResistance(500F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.0F);
		this.setUnlocalizedName("OrePyroxenit");
		this.setBlockTextureName("manystones:OrePyroxenit");
	}

	private void setUnlocalizedName(String string) {
		
		
	}
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
	  return MSMod.ametist;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		if (rand.nextInt(101) <= 80)
		{
			return 1;
		}
			return 2;
	}
}