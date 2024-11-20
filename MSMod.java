package com.varep.manystones;

import java.util.Random;



import com.varep.manystones.blocks.OreDiabaz;
import com.varep.manystones.blocks.OreDolomit;
import com.varep.manystones.blocks.OreKimberlit;
import com.varep.manystones.blocks.OrePrizmarine;

import com.varep.manystones.blocks.OrePyroxenit;
import com.varep.manystones.blocks.OreRiolit;
import com.varep.manystones.blocks.WorldBlocks;
import com.varep.manystones.blocks.decor.CosmeticBlock;
import com.varep.manystones.blocks.decor.CosmeticFence;
import com.varep.manystones.blocks.decor.CosmeticPillar;
import com.varep.manystones.blocks.decor.CosmeticSlab;
import com.varep.manystones.blocks.decor.CosmeticStairs;
import com.varep.manystones.blocks.decor.Decor;

import com.varep.manystones.core.Crafting;
import com.varep.manystones.core.TabMS;
import com.varep.manystones.core.proxy.CommonProxy;
import com.varep.manystones.items.AmetistArmor;
import com.varep.manystones.items.AmetistChestplate;
import com.varep.manystones.items.AmetistHammer;
import com.varep.manystones.items.Doloto;
import com.varep.manystones.items.ItemAmetist;
import com.varep.manystones.items.ItemPrizmarineShard;
import com.varep.manystones.items.ModItems;
import com.varep.manystones.world.ConfOreGenerator;
import com.varep.manystones.world.OreGenerator;
import com.varep.manystones.world.StoneGenerator;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;

@Mod (modid = "MSMod", name="Many Stones", version = "1.5.0")

public class MSMod {

		public static final String MOD_ID = "MSMod";
		public static final String MOD_NAME = "Many Stones";
		public static final String VERSION_NUMBER = "1.5.0";
		public static final String RESOURCE_PREFIX = "MSMod".toLowerCase() + ":";
		
		public static Item ametist;
		public static Item prizmarine_shard;
		public static Item doloto;
		
		public static Item AmetistHelmet; 
		public static Item AmetistChestPlate; 
		public static Item AmetistLeggings; 
		public static Item AmetistBoots; 
		public static Item AmetistHammer;
		
		
		
		public static Block ore_diabaz;
		public static Block ore_riolit;
		public static Block ore_kimberlit;
		public static Block ore_pyroxenit;
		public static Block ore_dolomit;
		public static Block ore_prizmarine;
		
		  
		  
		public static Random random = new Random();
		
		public static final ToolMaterial AmetistToolMaterial = EnumHelper.addToolMaterial("AmetistTool", 4, 4000, 16.0F, 9.0F, 10);
		public static final ArmorMaterial AmetistArmorMaterial = EnumHelper.addArmorMaterial("AmetistArmor", 1500, new int[]{5, 10, 8, 5}, 20);

	
		   
		@Instance ("MSMod")
		   public static MSMod instance;
		   @SidedProxy(
		      clientSide = "com.varep.manystones.core.proxy.ClientProxy",
		      serverSide = "com.varep.manystones.core.proxy.CommonProxy"
		   )
		public static CommonProxy proxy;
		public static Decor decor;
		public static WorldBlocks world_blocks;
		public static MainConfig main_config;
		public static Crafting crafting;
		public static CreativeTabs TabMS = new TabMS("59");
		public static StoneGenerator stonegen = new StoneGenerator();
		public static OreGenerator oregen = new OreGenerator();
		public static ConfOreGenerator conforegen = new ConfOreGenerator();
		@EventHandler
		public void preLoad(FMLPreInitializationEvent event)
		{
			
			
			ametist = new ItemAmetist();
			doloto = new Doloto();
			prizmarine_shard = new ItemPrizmarineShard();
			GameRegistry.registerItem(ametist, "Ametist");
			GameRegistry.registerItem(doloto, "Doloto");
			GameRegistry.registerItem(prizmarine_shard, "PrizmarineShard");
			
			ore_diabaz = new OreDiabaz();
			ore_riolit = new OreRiolit();
			ore_kimberlit = new OreKimberlit();
			ore_pyroxenit = new OrePyroxenit();
			ore_dolomit = new OreDolomit();
			ore_prizmarine = new OrePrizmarine();
			  
			
			
			GameRegistry.registerBlock(ore_diabaz, "OreDiabaz");
			GameRegistry.registerBlock(ore_riolit, "OreRiolit");
			GameRegistry.registerBlock(ore_kimberlit, "OreKimberlit");
			GameRegistry.registerBlock(ore_pyroxenit, "OrePyroxenit");
			GameRegistry.registerBlock(ore_dolomit, "OreDolomit");
			GameRegistry.registerBlock(ore_prizmarine, "OrePrizmarine");
			
			AmetistHelmet = (new AmetistArmor(AmetistArmorMaterial, 0, 0)).setUnlocalizedName("ametist_helmet").setTextureName("manystones:ametist_helmet").setCreativeTab(TabMS);
		  //  AmetistChestPlate = (new AmetistArmor(AmetistArmorMaterial, 0, 1)).setUnlocalizedName("ametist_chestplate").setTextureName("manystones:ametist_chestplate").setCreativeTab(TabMS);
			AmetistChestPlate = (new AmetistChestplate(MSMod.AmetistArmorMaterial, 0, 1)).setUnlocalizedName("ametist_chestplate").setTextureName("manystones:ametist_chestplate").setCreativeTab(TabMS);
			AmetistLeggings = (new AmetistArmor(AmetistArmorMaterial, 0, 2)).setUnlocalizedName("ametist_leggings").setTextureName("manystones:ametist_leggings").setCreativeTab(TabMS);
		    AmetistBoots = (new AmetistArmor(AmetistArmorMaterial, 0, 3)).setUnlocalizedName("ametist_boots").setTextureName("manystones:ametist_boots").setCreativeTab(TabMS);
		      
		    AmetistHammer = (new com.varep.manystones.items.AmetistHammer(AmetistToolMaterial)).setUnlocalizedName("AmetistHammer").setTextureName("manystones:AmetistHammer").setCreativeTab(TabMS);
		     		    
			GameRegistry.registerItem(AmetistHelmet, AmetistHelmet.getUnlocalizedName().substring(0));
		    GameRegistry.registerItem(AmetistChestPlate, AmetistChestPlate.getUnlocalizedName().substring(0));
		    GameRegistry.registerItem(AmetistLeggings, AmetistLeggings.getUnlocalizedName().substring(0));
		    GameRegistry.registerItem(AmetistBoots, AmetistBoots.getUnlocalizedName().substring(0));
		      
		    GameRegistry.registerItem(AmetistHammer, AmetistHammer.getUnlocalizedName().substring(0));  
		    
				
				world_blocks.init();
				decor.init();
				proxy.preInit();
				crafting.init();
		
		
			   
		}
		@EventHandler
	    public void preInit(FMLPreInitializationEvent event) {
	        MainConfig.load(event);
		}
		 @EventHandler
		   public void load(FMLInitializationEvent event) {
			 
			 proxy.init();
			// GameRegistry.registerWorldGenerator(new ManyStonesGenerator(), 0);
			 GameRegistry.registerWorldGenerator(stonegen, 0);
			 if (MainConfig.ore_config == 0) {
			 GameRegistry.registerWorldGenerator(oregen, 1);
			 System.out.println("Enabled normal ore generation");}
			 
			 else
				 {GameRegistry.registerWorldGenerator(conforegen, 2);
				 System.out.println("Enabled configurable ore generation");}
		 }
		 
		 @EventHandler
		   public void postInit(FMLPostInitializationEvent event) {
		      proxy.postInit();
		      

		 }

}