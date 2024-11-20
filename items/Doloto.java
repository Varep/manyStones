package com.varep.manystones.items;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.varep.manystones.MSMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class Doloto extends Item {
	public Doloto() {
	this.setTextureName("manystones:Doloto");
	this.setUnlocalizedName("Doloto");
	this.setCreativeTab(MSMod.TabMS);
	setContainerItem(this);
	}
	 public static Random rand;
	  

	   public List getHudInfo(ItemStack itemStack) {
	      List info = new LinkedList();
	      info.add("Use Left: " + (itemStack.getMaxDamage() - itemStack.getItemDamage()));
	      return info;
	   }

	   public boolean hasContainerItem(ItemStack stack) {
	      return true;
	   }

	   public ItemStack getContainerItem(ItemStack stack) {
	      ItemStack ret = stack.copy();
	      Random Random = new Random();
		ret.attemptDamageItem(1, Random);
	      return ret;
	   }

	   public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack) {
	      return false;
	   }

}