package com.varep.manystones.blocks.decor;

import com.varep.manystones.MSMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class CosmeticPillar extends Block {

	public IIcon[] icons = new IIcon[6];
			
	public CosmeticPillar(String Name, float Hard, String texture) {
	super(Material.rock);
	this.setBlockName(Name);
	this.setCreativeTab(MSMod.TabMS);
	this.setHardness(Hard);
	this.setResistance(500F);
	this.setHarvestLevel("pickaxe", 2);
	this.setLightLevel(0.0F);
	this.setBlockTextureName(texture);
	
	
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
	
		this.icons[0] = reg.registerIcon(this.textureName + "_" + 1);
		this.icons[1] = reg.registerIcon(this.textureName + "_" + 1);
		this.icons[2] = reg.registerIcon(this.textureName + "_" + 2);
		this.icons[3] = reg.registerIcon(this.textureName + "_" + 2);
		this.icons[4] = reg.registerIcon(this.textureName + "_" + 2);
		this.icons[5] = reg.registerIcon(this.textureName + "_" + 2);
				
	/*			for (int i = 0; i < 6; i ++) {
			if ((i==1) || (i==0)) {
				this.icons[i] = reg.registerIcon(this.textureName + "_" + 1);
			}
	    		this.icons[i] = reg.registerIcon(this.textureName + "_" + 2);
		}
	*/
	}
	
	  @Override
	  public IIcon getIcon(int side, int meta) {
	    return this.icons[side];
	  }		
}
	

