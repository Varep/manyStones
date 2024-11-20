package com.varep.manystones.core;

import com.varep.manystones.MSMod;
import com.varep.manystones.blocks.WorldBlocks;
import com.varep.manystones.blocks.decor.Decor;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;

public class Crafting {

	static ItemStack witherSkull = new ItemStack(Items.skull, 1, 1);
	
	
	@EventHandler
	public static void init()
	{
		
		/*diabaz
		*/
		 
		GameRegistry.addRecipe(new ItemStack(Decor.smooth_diabaz, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), WorldBlocks.diabaz,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.big_brick_diabaz, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), Decor.smooth_diabaz,
				  }
				);	
		
		GameRegistry.addRecipe(new ItemStack(Decor.brick1_diabaz, 4),
				  new Object[]{
				    "X0X", "0Y0", "X0X",
				    ('X'), Decor.big_brick_diabaz, 
				    ('Y'), Decor.light_concrete,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.brick2_diabaz, 4),
				  new Object[]{
				    "X0X", "0Y0", "X0X",
				    ('X'), Decor.big_brick_diabaz, 
				    ('Y'), Decor.dark_concrete,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.pillar_diabaz, 6),
				  new Object[]{
				    "X0X", "X0X", "X0X",
				    ('X'), Decor.smooth_diabaz, 
				    
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.carved_diabaz, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), Decor.pillar_diabaz,
				  }
				);	
		
		GameRegistry.addRecipe(new ItemStack(Decor.wall_diabaz_brick2, 6),
				  new Object[]{
				    "XXX", "XXX", "000",
				    ('X'), Decor.brick2_diabaz, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.wall_diabaz, 6),
				  new Object[]{
				    "XXX", "XXX", "000",
				    ('X'), WorldBlocks.diabaz, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.slab_diabaz, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), WorldBlocks.diabaz, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.slab_smooth_diabaz, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.smooth_diabaz, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_brick1_diabaz, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.brick1_diabaz, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_brick2_diabaz, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.brick2_diabaz, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_big_brick_diabaz, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.big_brick_diabaz, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.stair_diabaz, 6),
				  new Object[]{
				    "X00", "XX0", "XXX",
				    ('X'), WorldBlocks.diabaz, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.stair_smooth_diabaz, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.smooth_diabaz, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.stair_brick_diabaz, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.brick2_diabaz, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.stair_big_brick_diabaz, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.big_brick_diabaz, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.fence_diabaz, 6),
				  new Object[]{
					"X0X", "X0X", "000",
				    ('X'), WorldBlocks.diabaz, 
				  }
				);
		
		//dolomit
		
		GameRegistry.addRecipe(new ItemStack(Decor.smooth_dolomit, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), WorldBlocks.dolomit,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.big_brick_dolomit, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), Decor.smooth_dolomit,
				  }
				);	
		
		GameRegistry.addRecipe(new ItemStack(Decor.brick1_dolomit, 4),
				  new Object[]{
				    "X0X", "0Y0", "X0X",
				    ('X'), Decor.big_brick_dolomit, 
				    ('Y'), Decor.light_concrete,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.brick2_dolomit, 4),
				  new Object[]{
				    "X0X", "0Y0", "X0X",
				    ('X'), Decor.big_brick_dolomit, 
				    ('Y'), Decor.dark_concrete,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.pillar_dolomit, 6),
				  new Object[]{
				    "X0X", "X0X", "X0X",
				    ('X'), Decor.smooth_dolomit, 
				    
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.carved_dolomit, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), Decor.pillar_dolomit,
				  }
				);	
		
		GameRegistry.addRecipe(new ItemStack(Decor.wall_dolomit_brick2, 6),
				  new Object[]{
				    "XXX", "XXX", "000",
				    ('X'), Decor.brick2_dolomit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.wall_dolomit, 6),
				  new Object[]{
				    "XXX", "XXX", "000",
				    ('X'), WorldBlocks.dolomit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.slab_dolomit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), WorldBlocks.dolomit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.slab_smooth_dolomit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.smooth_dolomit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_brick1_dolomit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.brick1_dolomit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_brick2_dolomit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.brick2_dolomit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_big_brick_dolomit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.big_brick_dolomit, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.stair_dolomit, 6),
				  new Object[]{
				    "X00", "XX0", "XXX",
				    ('X'), WorldBlocks.dolomit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.stair_smooth_dolomit, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.smooth_dolomit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.stair_brick_dolomit, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.brick2_dolomit, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.stair_big_brick_dolomit, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.big_brick_dolomit, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.fence_dolomit, 6),
				  new Object[]{
					"X0X", "X0X", "000",
				    ('X'), WorldBlocks.dolomit, 
				  }
				);
		
		//riolit
		
		GameRegistry.addRecipe(new ItemStack(Decor.smooth_riolit, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), WorldBlocks.riolit,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.big_brick_riolit, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), Decor.smooth_riolit,
				  }
				);	
		
		GameRegistry.addRecipe(new ItemStack(Decor.brick1_riolit, 4),
				  new Object[]{
				    "X0X", "0Y0", "X0X",
				    ('X'), Decor.big_brick_riolit, 
				    ('Y'), Decor.light_concrete,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.brick2_riolit, 4),
				  new Object[]{
				    "X0X", "0Y0", "X0X",
				    ('X'), Decor.big_brick_riolit, 
				    ('Y'), Decor.dark_concrete,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.pillar_riolit, 6),
				  new Object[]{
				    "X0X", "X0X", "X0X",
				    ('X'), Decor.smooth_riolit, 
				    
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.carved_riolit, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), Decor.pillar_riolit,
				  }
				);	
		
		GameRegistry.addRecipe(new ItemStack(Decor.wall_riolit_brick2, 6),
				  new Object[]{
				    "XXX", "XXX", "000",
				    ('X'), Decor.brick2_riolit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.wall_riolit, 6),
				  new Object[]{
				    "XXX", "XXX", "000",
				    ('X'), WorldBlocks.riolit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.slab_riolit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), WorldBlocks.riolit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.slab_smooth_riolit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.smooth_riolit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_brick1_riolit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.brick1_riolit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_brick2_riolit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.brick2_riolit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_big_brick_riolit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.big_brick_riolit, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.stair_riolit, 6),
				  new Object[]{
				    "X00", "XX0", "XXX",
				    ('X'), WorldBlocks.riolit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.stair_smooth_riolit, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.smooth_riolit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.stair_brick_riolit, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.brick2_riolit, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.stair_big_brick_riolit, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.big_brick_riolit, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.fence_riolit, 6),
				  new Object[]{
					"X0X", "X0X", "000",
				    ('X'), WorldBlocks.riolit, 
				  }
				);
		
		//pyroxenit
		
		GameRegistry.addRecipe(new ItemStack(Decor.smooth_pyroxenit, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), WorldBlocks.pyroxenit,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.big_brick_pyroxenit, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), Decor.smooth_pyroxenit,
				  }
				);	
		
		GameRegistry.addRecipe(new ItemStack(Decor.brick1_pyroxenit, 4),
				  new Object[]{
				    "X0X", "0Y0", "X0X",
				    ('X'), Decor.big_brick_pyroxenit, 
				    ('Y'), Decor.light_concrete,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.brick2_pyroxenit, 4),
				  new Object[]{
				    "X0X", "0Y0", "X0X",
				    ('X'), Decor.big_brick_pyroxenit, 
				    ('Y'), Decor.dark_concrete,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.pillar_pyroxenit, 6),
				  new Object[]{
				    "X0X", "X0X", "X0X",
				    ('X'), Decor.smooth_pyroxenit, 
				    
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.carved_pyroxenit, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), Decor.pillar_pyroxenit,
				  }
				);	
		
		GameRegistry.addRecipe(new ItemStack(Decor.wall_pyroxenit_brick2, 6),
				  new Object[]{
				    "XXX", "XXX", "000",
				    ('X'), Decor.brick2_pyroxenit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.wall_pyroxenit, 6),
				  new Object[]{
				    "XXX", "XXX", "000",
				    ('X'), WorldBlocks.pyroxenit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.slab_pyroxenit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), WorldBlocks.pyroxenit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.slab_smooth_pyroxenit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.smooth_pyroxenit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_brick1_pyroxenit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.brick1_pyroxenit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_brick2_pyroxenit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.brick2_pyroxenit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_big_brick_pyroxenit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.big_brick_pyroxenit, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.stair_pyroxenit, 6),
				  new Object[]{
				    "X00", "XX0", "XXX",
				    ('X'), WorldBlocks.pyroxenit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.stair_smooth_pyroxenit, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.smooth_pyroxenit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.stair_brick_pyroxenit, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.brick2_pyroxenit, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.stair_big_brick_pyroxenit, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.big_brick_pyroxenit, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.fence_pyroxenit, 6),
				  new Object[]{
					"X0X", "X0X", "000",
				    ('X'), WorldBlocks.pyroxenit, 
				  }
				);
		
		//kimberlit
		
		GameRegistry.addRecipe(new ItemStack(Decor.smooth_kimberlit, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), WorldBlocks.kimberlit,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.big_brick_kimberlit, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), Decor.smooth_kimberlit,
				  }
				);	
		
		GameRegistry.addRecipe(new ItemStack(Decor.brick1_kimberlit, 4),
				  new Object[]{
				    "X0X", "0Y0", "X0X",
				    ('X'), Decor.big_brick_kimberlit, 
				    ('Y'), Decor.light_concrete,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.brick2_kimberlit, 4),
				  new Object[]{
				    "X0X", "0Y0", "X0X",
				    ('X'), Decor.big_brick_kimberlit, 
				    ('Y'), Decor.dark_concrete,
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.pillar_kimberlit, 6),
				  new Object[]{
				    "X0X", "X0X", "X0X",
				    ('X'), Decor.smooth_kimberlit, 
				    
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.carved_kimberlit, 4),
				  new Object[]{
				    "AA", "AA",
				    ('A'), Decor.pillar_kimberlit,
				  }
				);	
		
		GameRegistry.addRecipe(new ItemStack(Decor.wall_kimberlit_brick2, 6),
				  new Object[]{
				    "XXX", "XXX", "000",
				    ('X'), Decor.brick2_kimberlit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.wall_kimberlit, 6),
				  new Object[]{
				    "XXX", "XXX", "000",
				    ('X'), WorldBlocks.kimberlit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.slab_kimberlit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), WorldBlocks.kimberlit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.slab_smooth_kimberlit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.smooth_kimberlit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_brick1_kimberlit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.brick1_kimberlit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_brick2_kimberlit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.brick2_kimberlit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.slab_big_brick_kimberlit, 6),
				  new Object[]{
				    "XXX", "000", "000",
				    ('X'), Decor.big_brick_kimberlit, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.stair_kimberlit, 6),
				  new Object[]{
				    "X00", "XX0", "XXX",
				    ('X'), WorldBlocks.kimberlit, 
				  }
				);	
		GameRegistry.addRecipe(new ItemStack(Decor.stair_smooth_kimberlit, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.smooth_kimberlit, 
				  }
				);
		GameRegistry.addRecipe(new ItemStack(Decor.stair_brick_kimberlit, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.brick2_kimberlit, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.stair_big_brick_kimberlit, 6),
				  new Object[]{
					"X00", "XX0", "XXX",
				    ('X'), Decor.big_brick_kimberlit, 
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(Decor.fence_kimberlit, 6),
				  new Object[]{
					"X0X", "X0X", "000",
				    ('X'), WorldBlocks.kimberlit, 
				  }
				);
		
		//andesit
		
				GameRegistry.addRecipe(new ItemStack(Decor.smooth_andesit, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), WorldBlocks.andesit,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.big_brick_andesit, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), Decor.smooth_andesit,
						  }
						);	
				
				GameRegistry.addRecipe(new ItemStack(Decor.brick1_andesit, 4),
						  new Object[]{
						    "X0X", "0Y0", "X0X",
						    ('X'), Decor.big_brick_andesit, 
						    ('Y'), Decor.light_concrete,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.brick2_andesit, 4),
						  new Object[]{
						    "X0X", "0Y0", "X0X",
						    ('X'), Decor.big_brick_andesit, 
						    ('Y'), Decor.dark_concrete,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.pillar_andesit, 6),
						  new Object[]{
						    "X0X", "X0X", "X0X",
						    ('X'), Decor.smooth_andesit, 
						    
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.carved_andesit, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), Decor.pillar_andesit,
						  }
						);	
				
				GameRegistry.addRecipe(new ItemStack(Decor.wall_andesit_brick2, 6),
						  new Object[]{
						    "XXX", "XXX", "000",
						    ('X'), Decor.brick2_andesit, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.wall_andesit, 6),
						  new Object[]{
						    "XXX", "XXX", "000",
						    ('X'), WorldBlocks.andesit, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.slab_andesit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), WorldBlocks.andesit, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.slab_smooth_andesit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.smooth_andesit, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_brick1_andesit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.brick1_andesit, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_brick2_andesit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.brick2_andesit, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_big_brick_andesit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.big_brick_andesit, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.stair_andesit, 6),
						  new Object[]{
						    "X00", "XX0", "XXX",
						    ('X'), WorldBlocks.andesit, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.stair_smooth_andesit, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.smooth_andesit, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.stair_brick_andesit, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.brick2_andesit, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.stair_big_brick_andesit, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.big_brick_andesit, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.fence_andesit, 6),
						  new Object[]{
							"X0X", "X0X", "000",
						    ('X'), WorldBlocks.andesit, 
						  }
						);
				
				//diorit
				
				GameRegistry.addRecipe(new ItemStack(Decor.smooth_diorit, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), WorldBlocks.diorit,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.big_brick_diorit, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), Decor.smooth_diorit,
						  }
						);	
				
				GameRegistry.addRecipe(new ItemStack(Decor.brick1_diorit, 4),
						  new Object[]{
						    "X0X", "0Y0", "X0X",
						    ('X'), Decor.big_brick_diorit, 
						    ('Y'), Decor.light_concrete,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.brick2_diorit, 4),
						  new Object[]{
						    "X0X", "0Y0", "X0X",
						    ('X'), Decor.big_brick_diorit, 
						    ('Y'), Decor.dark_concrete,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.pillar_diorit, 6),
						  new Object[]{
						    "X0X", "X0X", "X0X",
						    ('X'), Decor.smooth_diorit, 
						    
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.carved_diorit, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), Decor.pillar_diorit,
						  }
						);	
				
				GameRegistry.addRecipe(new ItemStack(Decor.wall_diorit_brick2, 6),
						  new Object[]{
						    "XXX", "XXX", "000",
						    ('X'), Decor.brick2_diorit, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.wall_diorit, 6),
						  new Object[]{
						    "XXX", "XXX", "000",
						    ('X'), WorldBlocks.diorit, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.slab_diorit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), WorldBlocks.diorit, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.slab_smooth_diorit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.smooth_diorit, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_brick1_diorit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.brick1_diorit, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_brick2_diorit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.brick2_diorit, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_big_brick_diorit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.big_brick_diorit, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.stair_diorit, 6),
						  new Object[]{
						    "X00", "XX0", "XXX",
						    ('X'), WorldBlocks.diorit, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.stair_smooth_diorit, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.smooth_diorit, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.stair_brick_diorit, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.brick2_diorit, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.stair_big_brick_diorit, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.big_brick_diorit, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.fence_diorit, 6),
						  new Object[]{
							"X0X", "X0X", "000",
						    ('X'), WorldBlocks.diorit, 
						  }
						);
				
				//granit
				
				GameRegistry.addRecipe(new ItemStack(Decor.smooth_granit, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), WorldBlocks.granit,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.big_brick_granit, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), Decor.smooth_granit,
						  }
						);	
				
				GameRegistry.addRecipe(new ItemStack(Decor.brick1_granit, 4),
						  new Object[]{
						    "X0X", "0Y0", "X0X",
						    ('X'), Decor.big_brick_granit, 
						    ('Y'), Decor.light_concrete,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.brick2_granit, 4),
						  new Object[]{
						    "X0X", "0Y0", "X0X",
						    ('X'), Decor.big_brick_granit, 
						    ('Y'), Decor.dark_concrete,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.pillar_granit, 6),
						  new Object[]{
						    "X0X", "X0X", "X0X",
						    ('X'), Decor.smooth_granit, 
						    
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.carved_granit, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), Decor.pillar_granit,
						  }
						);	
				
				GameRegistry.addRecipe(new ItemStack(Decor.wall_granit_brick2, 6),
						  new Object[]{
						    "XXX", "XXX", "000",
						    ('X'), Decor.brick2_granit, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.wall_granit, 6),
						  new Object[]{
						    "XXX", "XXX", "000",
						    ('X'), WorldBlocks.granit, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.slab_granit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), WorldBlocks.granit, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.slab_smooth_granit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.smooth_granit, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_brick1_granit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.brick1_granit, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_brick2_granit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.brick2_granit, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_big_brick_granit, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.big_brick_granit, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.stair_granit, 6),
						  new Object[]{
						    "X00", "XX0", "XXX",
						    ('X'), WorldBlocks.granit, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.stair_smooth_granit, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.smooth_granit, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.stair_brick_granit, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.brick2_granit, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.stair_big_brick_granit, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.big_brick_granit, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.fence_granit, 6),
						  new Object[]{
							"X0X", "X0X", "000",
						    ('X'), WorldBlocks.granit, 
						  }
						);
				
				//marble
				
				GameRegistry.addRecipe(new ItemStack(Decor.smooth_marble, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), WorldBlocks.marble,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.big_brick_marble, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), Decor.smooth_marble,
						  }
						);	
				
				GameRegistry.addRecipe(new ItemStack(Decor.brick1_marble, 4),
						  new Object[]{
						    "X0X", "0Y0", "X0X",
						    ('X'), Decor.big_brick_marble, 
						    ('Y'), Decor.light_concrete,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.brick2_marble, 4),
						  new Object[]{
						    "X0X", "0Y0", "X0X",
						    ('X'), Decor.big_brick_marble, 
						    ('Y'), Decor.dark_concrete,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.pillar_marble, 6),
						  new Object[]{
						    "X0X", "X0X", "X0X",
						    ('X'), Decor.smooth_marble, 
						    
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.carved_marble, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), Decor.pillar_marble,
						  }
						);	
				
				GameRegistry.addRecipe(new ItemStack(Decor.wall_marble_brick2, 6),
						  new Object[]{
						    "XXX", "XXX", "000",
						    ('X'), Decor.brick2_marble, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.wall_marble, 6),
						  new Object[]{
						    "XXX", "XXX", "000",
						    ('X'), WorldBlocks.marble, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.slab_marble, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), WorldBlocks.marble, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.slab_smooth_marble, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.smooth_marble, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_brick1_marble, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.brick1_marble, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_brick2_marble, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.brick2_marble, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_big_brick_marble, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.big_brick_marble, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.stair_marble, 6),
						  new Object[]{
						    "X00", "XX0", "XXX",
						    ('X'), WorldBlocks.marble, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.stair_smooth_marble, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.smooth_marble, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.stair_brick_marble, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.brick2_marble, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.stair_big_brick_marble, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.big_brick_marble, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.fence_marble, 6),
						  new Object[]{
							"X0X", "X0X", "000",
						    ('X'), WorldBlocks.marble, 
						  }
						);
				
				//limestone
				
				GameRegistry.addRecipe(new ItemStack(Decor.smooth_limestone, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), WorldBlocks.limestone,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.big_brick_limestone, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), Decor.smooth_limestone,
						  }
						);	
				
				GameRegistry.addRecipe(new ItemStack(Decor.brick1_limestone, 4),
						  new Object[]{
						    "X0X", "0Y0", "X0X",
						    ('X'), Decor.big_brick_limestone, 
						    ('Y'), Decor.light_concrete,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.brick2_limestone, 4),
						  new Object[]{
						    "X0X", "0Y0", "X0X",
						    ('X'), Decor.big_brick_limestone, 
						    ('Y'), Decor.dark_concrete,
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.pillar_limestone, 6),
						  new Object[]{
						    "X0X", "X0X", "X0X",
						    ('X'), Decor.smooth_limestone, 
						    
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.carved_limestone, 4),
						  new Object[]{
						    "AA", "AA",
						    ('A'), Decor.pillar_limestone,
						  }
						);	
				
				GameRegistry.addRecipe(new ItemStack(Decor.wall_limestone_brick2, 6),
						  new Object[]{
						    "XXX", "XXX", "000",
						    ('X'), Decor.brick2_limestone, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.wall_limestone, 6),
						  new Object[]{
						    "XXX", "XXX", "000",
						    ('X'), WorldBlocks.limestone, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.slab_limestone, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), WorldBlocks.limestone, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.slab_smooth_limestone, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.smooth_limestone, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_brick1_limestone, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.brick1_limestone, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_brick2_limestone, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.brick2_limestone, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.slab_big_brick_limestone, 6),
						  new Object[]{
						    "XXX", "000", "000",
						    ('X'), Decor.big_brick_limestone, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.stair_limestone, 6),
						  new Object[]{
						    "X00", "XX0", "XXX",
						    ('X'), WorldBlocks.limestone, 
						  }
						);	
				GameRegistry.addRecipe(new ItemStack(Decor.stair_smooth_limestone, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.smooth_limestone, 
						  }
						);
				GameRegistry.addRecipe(new ItemStack(Decor.stair_brick_limestone, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.brick2_limestone, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.stair_big_brick_limestone, 6),
						  new Object[]{
							"X00", "XX0", "XXX",
						    ('X'), Decor.big_brick_limestone, 
						  }
						);
				
				GameRegistry.addRecipe(new ItemStack(Decor.fence_limestone, 6),
						  new Object[]{
							"X0X", "X0X", "000",
						    ('X'), WorldBlocks.limestone, 
						  }
						);
		
		/* Dust */
		GameRegistry.addShapelessRecipe(new ItemStack(Decor.dark_concrete, 32), new Object[] {Items.water_bucket, Blocks.gravel, Blocks.clay, Blocks.clay});
		GameRegistry.addShapelessRecipe(new ItemStack(Decor.light_concrete, 32), new Object[] {Items.water_bucket, Blocks.sand, Blocks.clay, Blocks.clay});
		
		//Items 
		GameRegistry.addRecipe(new ItemStack(MSMod.AmetistHelmet, 1),
				  new Object[]{
					"XYX", "XZX", "000",
				    ('X'), MSMod.ametist, 
				    ('Z'), Items.diamond_helmet, 
				    ('Y'), witherSkull,
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(MSMod.AmetistChestPlate, 1),
				  new Object[]{
					"XYX", "XZX", "XXX",
				    ('X'), MSMod.ametist, 
				    ('Z'), Items.diamond_chestplate, 
				    ('Y'), witherSkull,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(MSMod.AmetistLeggings, 1),
				  new Object[]{
					"XYX", "XZX", "X0X",
				    ('X'), MSMod.ametist, 
				    ('Z'), Items.diamond_leggings, 
				    ('Y'), witherSkull,
				  }
				);
		GameRegistry.addRecipe(new ItemStack(MSMod.AmetistBoots, 1),
				  new Object[]{
					"0Y0", "XZX", "X0X",
				    ('X'), MSMod.ametist, 
				    ('Z'), Items.diamond_boots, 
				    ('Y'), witherSkull,
				  }
				);
		
		GameRegistry.addRecipe(new ItemStack(MSMod.AmetistHammer, 1),
				  new Object[]{
					"YYY", "YXY", "0X0",
				    ('Y'), Decor.ametist_block, 
				    ('X'), Items.stick, 
				  }
				);
		
		////////
		GameRegistry.addRecipe(new ItemStack(WorldBlocks.prizmarine, 1),
				  new Object[]{
					"YYY", "YYY", "YYY",
				   
				    ('Y'), MSMod.prizmarine_shard, 
				  }
				);
		
		/* 
		GameRegistry.addRecipe(new ItemStack(WorldBlocks.doloto, 1),
				  new Object[]{
					"X00", "0Y0", "00Z",
				    ('X'), Items.diamond, 
				    ('Y'), Items.blaze_powder, 
				    ('Z'), Items.stick, 
				  }
				);
		*/
		GameRegistry.addSmelting(MSMod.ore_dolomit, new ItemStack(Items.iron_ingot, 1), 1.0F);
	}
}
