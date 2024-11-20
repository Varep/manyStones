package com.varep.manystones.blocks.decor;

import com.varep.manystones.MSMod;

import net.minecraft.item.Item;

public class Concrete extends Item {
	public Concrete(String name, String texture) {
		this.setTextureName(texture);
		this.setUnlocalizedName(name);
		this.setCreativeTab(MSMod.TabMS);
		setContainerItem(this);
		}
}
