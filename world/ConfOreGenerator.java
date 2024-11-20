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

	public class ConfOreGenerator implements IWorldGenerator {

		@Override
		public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		    generateOverworld(rand, chunkX, chunkZ, world);
			}

		private void generateOverworld(Random rand, int chunkX, int chunkZ, World world) {
			generateOverworld(world, rand, chunkX * 16, chunkZ * 16);
			}
		
			public void generateOverworld(World world, Random rand, int blockXPos, int blockZPos) {
					addOreSpawn(MSMod.ore_diabaz, WorldBlocks.diabaz, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.diabaz_ore_minBlockCount, MainConfig.diabaz_ore_maxBlockCount, MainConfig.diabaz_ore_minVeinCount, MainConfig.diabaz_ore_maxVeinCount, MainConfig.diabaz_ore_chance, MainConfig.diabaz_ore_minY, MainConfig.diabaz_ore_maxY);
					addOreSpawn(MSMod.ore_riolit, WorldBlocks.riolit, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.riolit_ore_minBlockCount, MainConfig.riolit_ore_maxBlockCount, MainConfig.riolit_ore_minVeinCount, MainConfig.riolit_ore_maxVeinCount, MainConfig.riolit_ore_chance, MainConfig.riolit_ore_minY, MainConfig.riolit_ore_maxY);
					addOreSpawn(MSMod.ore_kimberlit, WorldBlocks.kimberlit, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.kimberlit_ore_minBlockCount, MainConfig.kimberlit_ore_maxBlockCount, MainConfig.kimberlit_ore_minVeinCount, MainConfig.kimberlit_ore_maxVeinCount, MainConfig.kimberlit_ore_chance, MainConfig.kimberlit_ore_minY, MainConfig.kimberlit_ore_maxY);
					addOreSpawn(MSMod.ore_pyroxenit, WorldBlocks.pyroxenit, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.pyroxenit_ore_minBlockCount, MainConfig.pyroxenit_ore_maxBlockCount, MainConfig.pyroxenit_ore_minVeinCount, MainConfig.pyroxenit_ore_maxVeinCount, MainConfig.pyroxenit_ore_chance, MainConfig.pyroxenit_ore_minY, MainConfig.pyroxenit_ore_maxY);
					addOreSpawn(MSMod.ore_dolomit, WorldBlocks.dolomit, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.dolomit_ore_minBlockCount, MainConfig.dolomit_ore_maxBlockCount, MainConfig.dolomit_ore_minVeinCount, MainConfig.dolomit_ore_maxVeinCount, MainConfig.dolomit_ore_chance, MainConfig.dolomit_ore_minY, MainConfig.dolomit_ore_maxY);
					addOreSpawn(MSMod.ore_prizmarine, WorldBlocks.prizmarine, world, rand, blockXPos, blockZPos, 16, 16, MainConfig.prizmarine_ore_minBlockCount, MainConfig.prizmarine_ore_maxBlockCount, MainConfig.prizmarine_ore_minVeinCount, MainConfig.prizmarine_ore_maxVeinCount, MainConfig.prizmarine_ore_chance, MainConfig.prizmarine_ore_minY, MainConfig.prizmarine_ore_maxY);
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
		}
	}
