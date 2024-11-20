package com.varep.manystones.items;

import java.util.List;

import com.varep.manystones.MSMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class AmetistChestplate extends AmetistArmor{

	public AmetistChestplate(ArmorMaterial armorMaterial, int rendarIndex, int armorType) {
		super(MSMod.AmetistArmorMaterial, 0, 1);
		
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	   {
	       par3List.add(this.getItemTitle());
	   }    
	   public String getItemTitle()
	   {
	       return "Gives immunity to poison and fire";
	   }    
	  
}
