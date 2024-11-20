package com.varep.manystones.blocks;

import java.util.Random;

import com.varep.manystones.MSMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OreDiabaz extends Block {

	public OreDiabaz() {
		super(Material.rock);
		this.setBlockName("OreDiabaz");
		this.setCreativeTab(MSMod.TabMS);
		this.setHardness(5F);
		this.setResistance(500F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.0F);
		this.setUnlocalizedName("OreDiabaz");
		this.setBlockTextureName("manystones:OreDiabaz");
	}

	private void setUnlocalizedName(String string) {
		
		
	}
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
	  return Items.diamond;
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
