package com.varep.manystones.blocks;

import java.util.Random;

import com.varep.manystones.MSMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;

public class OreKimberlit extends Block {

	public OreKimberlit() {
		super(Material.rock);
		this.setBlockName("OreKimberlit");
		this.setCreativeTab(MSMod.TabMS);
		this.setHardness(5F);
		this.setResistance(500F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.0F);
		this.setUnlocalizedName("OreKimberlit");
		this.setBlockTextureName("manystones:OreKimberlit");
	}

	private void setUnlocalizedName(String string) {
		
		
	}
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
	  return Items.emerald;
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