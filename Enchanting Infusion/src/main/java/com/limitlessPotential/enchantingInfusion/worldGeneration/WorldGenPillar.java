package com.limitlessPotential.enchantingInfusion.worldGeneration;

import java.util.Random;
import java.io.PrintStream;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenPillar extends WorldGenerator{

	public WorldGenPillar() {
		
	}
	
	public boolean generate(World world, Random rand, int x, int y, int z) {
		if(world.getBlock(x, y, z)!= Blocks.dirt) {
			return false;
		}
	}
	
	int block = Blocks.stonebrick;
	
	
	
	
	
	
	
}
