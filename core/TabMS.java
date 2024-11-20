package com.varep.manystones.core;





import com.varep.manystones.blocks.decor.Decor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class TabMS extends CreativeTabs {

	public TabMS(String lable) {
		  super(lable);
		}

		@Override
		public Item getTabIconItem()
		{
		  return Item.getItemFromBlock(Decor.ametist_block);
		}
	}
