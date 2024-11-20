package com.varep.manystones.items;

import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class AmetistHammer extends ItemSword {
	
	private ToolMaterial field_150933_b;
	private float attackDamage;
	private AttributeModifier move = new AttributeModifier("movementspeed", -0.02D, 0);
	
	public AmetistHammer(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	      this.field_150933_b = p_i45356_1_;
	      this.maxStackSize = 1;
	      this.attackDamage = 7.0F + p_i45356_1_.getDamageVsEntity();
	   }

	   public Multimap getItemAttributeModifiers() {
	      Multimap multimap = super.getItemAttributeModifiers();
	      multimap.removeAll(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName());
	      multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.attackDamage, 0));
	      multimap.put(SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), this.move); 
	      return multimap;
	   }

}