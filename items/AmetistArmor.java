package com.varep.manystones.items;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.varep.manystones.MSMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class AmetistArmor extends ItemArmor {

   private AttributeModifier knockBack = new AttributeModifier("KnockBackModifier", 0.25D, 0);
   private AttributeModifier move = new AttributeModifier("movementspeed", -0.005D, 0);

   public AmetistArmor(ArmorMaterial armorMaterial, int rendarIndex, int armorType) {
      super(armorMaterial, rendarIndex, armorType);
   }

   public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
      return this.armorType == 2 ? "manystones:textures/models/armor/ametist_layer_2.png" : "manystones:textures/models/armor/ametist_layer_1.png";
   }

   public Multimap getItemAttributeModifiers() {
      Multimap multimap = HashMultimap.create();
      multimap.put(SharedMonsterAttributes.knockbackResistance.getAttributeUnlocalizedName(), this.knockBack);
      multimap.put(SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), this.move);
      return multimap;
   }
   public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
	      Random r = new Random();
	      if (armor.getItem() == MSMod.AmetistChestPlate && player.isPotionActive(Potion.poison.id)) {
		         player.removePotionEffect(Potion.poison.id);
		      }
	      if (armor.getItem() == MSMod.AmetistChestPlate && !player.isPotionActive(Potion.fireResistance.id)) {
		         player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 100, 1));
		      }
   }
   
   
}

