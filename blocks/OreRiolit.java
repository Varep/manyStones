package com.varep.manystones.blocks;

import java.util.Random;

import com.varep.manystones.MSMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;

public class OreRiolit extends Block {

	public OreRiolit() {
		super(Material.rock);
		this.setBlockName("OreRiolit");
		this.setCreativeTab(MSMod.TabMS);
		this.setHardness(5F);
		this.setResistance(500F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.0F);
		this.setUnlocalizedName("OreRiolit");
		this.setBlockTextureName("manystones:OreRiolit");
	}

	private void setUnlocalizedName(String string) {
		
		
	}
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
	  return Items.quartz;
	}
	
	@Override
	public int quantityDropped(Random par1Random)
	{
	  return 3;
	}
}