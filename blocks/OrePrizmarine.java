package com.varep.manystones.blocks;

import java.util.Random;

import com.varep.manystones.MSMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OrePrizmarine extends Block {


	public OrePrizmarine() {
		super(Material.rock);
		this.setBlockName("OrePrizmarine");
		this.setCreativeTab(MSMod.TabMS);
		this.setHardness(5F);
		this.setResistance(500F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.0F);
		this.setUnlocalizedName("OrePrizmarine");
		this.setBlockTextureName("manystones:OrePrizmarine");
	}
	
	private void setUnlocalizedName(String string) {
	}
	
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
	  return Items.dye;
	}
	
	@Override
	public int quantityDropped(Random par1Random)
	{
	  return 1+par1Random.nextInt(3);
	}
	public int damageDropped(int p_149692_1_)
    {
        return this == MSMod.ore_prizmarine ? 4 : 0;
    }

}
