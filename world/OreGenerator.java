

package com.varep.manystones.world;

import java.util.Random;

import com.varep.manystones.MSMod;
import com.varep.manystones.MainConfig;
import com.varep.manystones.blocks.WorldBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;


	public class OreGenerator implements IWorldGenerator {

		@Override
		public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		    generateOverworld(rand, chunkX, chunkZ, world);
			}

		

		private void generateOverworld(Random rand, int chunkX, int chunkZ, World world) {
			generateOverworld(world, rand, chunkX * 16, chunkZ * 16);
			}
		
			public void generateOverworld(World world, Random rand, int blockXPos, int blockZPos) {
					addOreSpawn(MSMod.ore_diabaz, WorldBlocks.diabaz, world, rand, blockXPos, blockZPos, 16, 16, 15, 30, 5, 15, 100, 1, 230);
					addOreSpawn(MSMod.ore_riolit, WorldBlocks.riolit, world, rand, blockXPos, blockZPos, 16, 16, 15, 30, 5, 30, 100, 1, 230);
					addOreSpawn(MSMod.ore_kimberlit, WorldBlocks.kimberlit, world, rand, blockXPos, blockZPos, 16, 16, 15, 30, 5, 15, 100, 1, 230);
					addOreSpawn(MSMod.ore_pyroxenit, WorldBlocks.pyroxenit, world, rand, blockXPos, blockZPos, 16, 16, 15, 30, 5, 25, 100, 1, 230);
					addOreSpawn(MSMod.ore_dolomit, WorldBlocks.dolomit, world, rand, blockXPos, blockZPos, 16, 16, 15, 30, 5, 45, 100, 1, 230);
					addOreSpawn(MSMod.ore_prizmarine, WorldBlocks.prizmarine, world, rand, blockXPos, blockZPos, 16, 16, 15, 30, 25, 100, 150, 1, 230);
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
