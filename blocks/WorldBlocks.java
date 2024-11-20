package com.varep.manystones.blocks;

import com.varep.manystones.MSMod;
import com.varep.manystones.blocks.decor.CosmeticBlock;
import com.varep.manystones.blocks.decor.CosmeticFence;
import com.varep.manystones.blocks.decor.CosmeticPillar;
import com.varep.manystones.blocks.decor.CosmeticSlab;
import com.varep.manystones.blocks.decor.CosmeticStairs;
import com.varep.manystones.blocks.decor.CosmeticWall;
import com.varep.manystones.blocks.decor.Decor;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class WorldBlocks {

	public static Block diabaz;
	public static Block riolit;
	public static Block kimberlit;
	public static Block pyroxenit;
	public static Block dolomit;
	public static Block prizmarine;
	public static Block andesit;
	public static Block diorit;
	public static Block granit;
	public static Block marble;
	public static Block limestone;
	
	@EventHandler
	public static void init()
	{
		
		diabaz = new WorldBlock("Diabaz", 5F, 2, "manystones:BlockDiabaz");
		riolit = new WorldBlock("Riolit", 8F, 2, "manystones:BlockRiolit");
		kimberlit = new WorldBlock("Kimberlit", 10F, 2, "manystones:BlockKimberlit");
		pyroxenit = new WorldBlock("Pyroxenit", 16F, 2, "manystones:BlockPyroxenit");
		dolomit = new WorldBlock("Dolomit", 2F, 2, "manystones:BlockDolomit");
		prizmarine = new WorldBlock("Prizmarine", 4F, 2, "manystones:BlockPrizmarine");
		andesit = new WorldBlock("Andesit", 2F, 1, "manystones:BlockAndesit");
		diorit = new WorldBlock("Diorit", 2F, 1, "manystones:BlockDiorit");
		granit = new WorldBlock("Granit", 2F, 1, "manystones:BlockGranit");
		marble = new WorldBlock("Marble", 2F, 1, "manystones:BlockMarble");
		limestone = new WorldBlock("Limestone", 2F, 1, "manystones:BlockLimestone");
		
		
		GameRegistry.registerBlock(diabaz, "Diabaz");
		GameRegistry.registerBlock(riolit, "Riolit");
		GameRegistry.registerBlock(kimberlit, "Kimberlit");
		GameRegistry.registerBlock(pyroxenit, "Pyroxenit");
		GameRegistry.registerBlock(dolomit, "Dolomit");
		GameRegistry.registerBlock(andesit, "Prizmarine");
		GameRegistry.registerBlock(diorit, "Diorit");
		GameRegistry.registerBlock(granit, "Granit");
		GameRegistry.registerBlock(marble, "Marble");
		GameRegistry.registerBlock(limestone, "Limestone");
	}
		
}
