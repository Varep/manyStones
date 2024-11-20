package com.varep.manystones.world;

import java.util.Random;

import com.varep.manystones.MSMod;
import com.varep.manystones.MainConfig;
import com.varep.manystones.blocks.WorldBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;


	public class StoneGenerator implements IWorldGenerator {

		@Override
		public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		    generateOverworld(rand, chunkX, chunkZ, world);
		   

		}

		private void generateOverworld(Random rand, int chunkX, int chunkZ, World world) {

		  generateOverworld(world, rand, chunkX * 16, chunkZ * 16);
		}

		public void generateOverworld(World world, Random rand, int blockXPos, int blockZPos) {

			addOreSpawn(WorldBlocks.diabaz, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.diabaz_minBlockCount, MainConfig.diabaz_maxBlockCount, MainConfig.diabaz_minVeinCount, MainConfig.diabaz_maxVeinCount, MainConfig.diabaz_chance, MainConfig.diabaz_minY, MainConfig.diabaz_maxY);
			
			addOreSpawn(WorldBlocks.riolit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.riolit_minBlockCount, MainConfig.riolit_maxBlockCount, MainConfig.riolit_minVeinCount, MainConfig.riolit_maxVeinCount, MainConfig.riolit_chance, MainConfig.riolit_minY, MainConfig.riolit_maxY);
			
			addOreSpawn(WorldBlocks.dolomit, Blocks.sandstone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.dolomit_minBlockCount, MainConfig.dolomit_maxBlockCount, MainConfig.dolomit_minVeinCount, MainConfig.dolomit_maxVeinCount, MainConfig.dolomit_chance, MainConfig.dolomit_minY, MainConfig.dolomit_maxY);
			
			addOreSpawn(WorldBlocks.andesit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.andesit_minBlockCount, MainConfig.andesit_maxBlockCount, MainConfig.andesit_minVeinCount, MainConfig.andesit_maxVeinCount, MainConfig.andesit_chance, MainConfig.andesit_minY, MainConfig.andesit_maxY);
			
			addOreSpawn(WorldBlocks.granit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.granit_minBlockCount, MainConfig.granit_maxBlockCount, MainConfig.granit_minVeinCount, MainConfig.granit_maxVeinCount, MainConfig.granit_chance, MainConfig.granit_minY, MainConfig.granit_maxY);
			
			addOreSpawn(WorldBlocks.limestone, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.limestone_minBlockCount, MainConfig.limestone_maxBlockCount, MainConfig.limestone_minVeinCount, MainConfig.limestone_maxVeinCount, MainConfig.limestone_chance, MainConfig.limestone_minY, MainConfig.limestone_maxY);
			
			addOreSpawn(WorldBlocks.marble, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.marble_minBlockCount, MainConfig.marble_maxBlockCount, MainConfig.marble_minVeinCount, MainConfig.marble_maxVeinCount, MainConfig.marble_chance, MainConfig.marble_minY, MainConfig.marble_maxY);
			
			addOreSpawn(WorldBlocks.diorit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.diorit_minBlockCount, MainConfig.diorit_maxBlockCount, MainConfig.diorit_minVeinCount, MainConfig.diorit_maxVeinCount, MainConfig.diorit_chance, MainConfig.diorit_minY, MainConfig.diorit_maxY);
			
			addOreSpawn(WorldBlocks.pyroxenit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.pyroxenit_minBlockCount, MainConfig.pyroxenit_maxBlockCount, MainConfig.pyroxenit_minVeinCount, MainConfig.pyroxenit_maxVeinCount, MainConfig.pyroxenit_chance, MainConfig.pyroxenit_minY, MainConfig.pyroxenit_maxY);
		//Prizmarine in marines	
			if (world.getBiomeGenForCoords(blockXPos, blockZPos) == BiomeGenBase.ocean) {
			addOreSpawn(WorldBlocks.prizmarine, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.prizmarine_minBlockCount, MainConfig.prizmarine_maxBlockCount, MainConfig.prizmarine_minVeinCount, MainConfig.prizmarine_maxVeinCount, MainConfig.prizmarine_chance, MainConfig.prizmarine_minY, MainConfig.prizmarine_maxY);
			if (world.getBiomeGenForCoords(blockXPos, blockZPos) == BiomeGenBase.deepOcean) {
				addOreSpawn(WorldBlocks.prizmarine, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.prizmarine_minBlockCount, MainConfig.prizmarine_maxBlockCount, MainConfig.prizmarine_minVeinCount, MainConfig.prizmarine_maxVeinCount, MainConfig.prizmarine_chance, MainConfig.prizmarine_minY, MainConfig.prizmarine_maxY);
				if (world.getBiomeGenForCoords(blockXPos, blockZPos) == BiomeGenBase.beach) {
					addOreSpawn(WorldBlocks.prizmarine, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.prizmarine_minBlockCount, MainConfig.prizmarine_maxBlockCount, MainConfig.prizmarine_minVeinCount, MainConfig.prizmarine_maxVeinCount, MainConfig.prizmarine_chance, MainConfig.prizmarine_minY, MainConfig.prizmarine_maxY);
				}}}
		//Kimberlite in mountains
			if 	(world.getBiomeGenForCoords(blockXPos, blockZPos) == BiomeGenBase.extremeHills) {addOreSpawn(WorldBlocks.kimberlit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.kimberlit_minBlockCount, MainConfig.kimberlit_maxBlockCount, MainConfig.kimberlit_minVeinCount, MainConfig.kimberlit_maxVeinCount, MainConfig.kimberlit_chance, MainConfig.kimberlit_minY, MainConfig.kimberlit_maxY);};
			if	(world.getBiomeGenForCoords(blockXPos, blockZPos) == BiomeGenBase.taigaHills) {addOreSpawn(WorldBlocks.kimberlit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.kimberlit_minBlockCount, MainConfig.kimberlit_maxBlockCount, MainConfig.kimberlit_minVeinCount, MainConfig.kimberlit_maxVeinCount, MainConfig.kimberlit_chance, MainConfig.kimberlit_minY, MainConfig.kimberlit_maxY);}; 
			if	(world.getBiomeGenForCoords(blockXPos, blockZPos) == BiomeGenBase.desertHills){addOreSpawn(WorldBlocks.kimberlit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.kimberlit_minBlockCount, MainConfig.kimberlit_maxBlockCount, MainConfig.kimberlit_minVeinCount, MainConfig.kimberlit_maxVeinCount, MainConfig.kimberlit_chance, MainConfig.kimberlit_minY, MainConfig.kimberlit_maxY);}; 
			if	(world.getBiomeGenForCoords(blockXPos, blockZPos) == BiomeGenBase.extremeHillsEdge){addOreSpawn(WorldBlocks.kimberlit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.kimberlit_minBlockCount, MainConfig.kimberlit_maxBlockCount, MainConfig.kimberlit_minVeinCount, MainConfig.kimberlit_maxVeinCount, MainConfig.kimberlit_chance, MainConfig.kimberlit_minY, MainConfig.kimberlit_maxY);}; 
			if	(world.getBiomeGenForCoords(blockXPos, blockZPos) == BiomeGenBase.extremeHillsPlus){addOreSpawn(WorldBlocks.kimberlit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.kimberlit_minBlockCount, MainConfig.kimberlit_maxBlockCount, MainConfig.kimberlit_minVeinCount, MainConfig.kimberlit_maxVeinCount, MainConfig.kimberlit_chance, MainConfig.kimberlit_minY, MainConfig.kimberlit_maxY);}; 
			if	(world.getBiomeGenForCoords(blockXPos, blockZPos) == BiomeGenBase.birchForestHills){addOreSpawn(WorldBlocks.kimberlit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.kimberlit_minBlockCount, MainConfig.kimberlit_maxBlockCount, MainConfig.kimberlit_minVeinCount, MainConfig.kimberlit_maxVeinCount, MainConfig.kimberlit_chance, MainConfig.kimberlit_minY, MainConfig.kimberlit_maxY);}; 
			if	(world.getBiomeGenForCoords(blockXPos, blockZPos) == BiomeGenBase.iceMountains){addOreSpawn(WorldBlocks.kimberlit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.kimberlit_minBlockCount, MainConfig.kimberlit_maxBlockCount, MainConfig.kimberlit_minVeinCount, MainConfig.kimberlit_maxVeinCount, MainConfig.kimberlit_chance, MainConfig.kimberlit_minY, MainConfig.kimberlit_maxY);};
			if	(world.getBiomeGenForCoords(blockXPos, blockZPos) == BiomeGenBase.savannaPlateau){addOreSpawn(WorldBlocks.kimberlit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.kimberlit_minBlockCount, MainConfig.kimberlit_maxBlockCount, MainConfig.kimberlit_minVeinCount, MainConfig.kimberlit_maxVeinCount, MainConfig.kimberlit_chance, MainConfig.kimberlit_minY, MainConfig.kimberlit_maxY);};
		}	
		
		public static void addOreSpawn(Block ore, Block replace, World world, Random rand, int blockXPos, int blockZPos, int maxX, int maxZ,
		int minVeinSize, int maxVeinSize, int minVeinsPerChunk, int maxVeinsPerChunk, int chanceToSpawn, int minY, int maxY) {
		  if (rand.nextInt(101) < (100 - chanceToSpawn)) return;
		  int veins = rand.nextInt(maxVeinsPerChunk - minVeinsPerChunk + 1) + minVeinsPerChunk;
		  for (int i = 0; i < veins; i++) {
		    int posX = blockXPos + rand.nextInt(maxX);
		    int posY = minY + rand.nextInt(maxY - minY);
		    int posZ = blockZPos + rand.nextInt(maxZ);
		    (new WorldGenMinable(ore, minVeinSize + rand.nextInt(maxVeinSize - minVeinSize + 1),
		      replace)).generate(world, rand, posX, posY, posZ);
		    if (MainConfig.debug_config == 1)
		    {System.out.println(ore + " " + posX + " " + posY + " " + posZ);}
		  }
		}}
	  


	 // addOreSpawn(ModBlocks.diabaz, world, rand, blockXPos, blockZPos, 8, 8, MSMod.diabaz_maxBlockCount, MSMod.diabaz_chance, MSMod.diabaz_minY, MSMod.diabaz_maxY);
	  //addOreSpawn(ModBlocks.riolit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MSMod.riolit_minBlockCount, MSMod.riolit_maxBlockCount, MSMod.riolit_minVeinCount, MSMod.riolit_maxVeinCount, MSMod.riolit_chance, MSMod.riolit_minY, MSMod.riolit_maxY);
	 // addOreSpawn(ModBlocks.kimberlit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MSMod.kimberlit_minBlockCount, MSMod.kimberlit_maxBlockCount, MSMod.kimberlit_minVeinCount, MSMod.kimberlit_maxVeinCount, MSMod.kimberlit_chance, MSMod.kimberlit_minY, MSMod.kimberlit_maxY);
	 // addOreSpawn(ModBlocks.dolomit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MSMod.dolomit_minBlockCount, MSMod.dolomit_maxBlockCount, MSMod.dolomit_minVeinCount, MSMod.dolomit_maxVeinCount, MSMod.dolomit_chance, MSMod.dolomit_minY, MSMod.dolomit_maxY);
	 // addOreSpawn(ModBlocks.pyroxenit, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, MSMod.pyroxenit_minBlockCount, MSMod.pyroxenit_maxBlockCount, MSMod.pyroxenit_minVeinCount, MSMod.pyroxenit_maxVeinCount, MSMod.pyroxenit_chance, MSMod.pyroxenit_minY, MSMod.pyroxenit_maxY);
	


	
	


	
	
	
	




