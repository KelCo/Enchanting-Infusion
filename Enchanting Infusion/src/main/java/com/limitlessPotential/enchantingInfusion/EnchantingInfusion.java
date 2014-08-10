package com.limitlessPotential.enchantingInfusion;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.limitlessPotential.enchantingInfusion.CommonProxy;
import com.limitlessPotential.enchantingInfusion.ClientProxy;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)

public class EnchantingInfusion {

	//Instance Of Forge
	@Instance(value = References.MODID)
	public static EnchantingInfusion instance;
	
	//Locations Of Client And Server Proxy Code
	@SidedProxy(clientSide = com.limitlessPotential.enchantingInfusion.References.Client, serverSide = com.limitlessPotential.enchantingInfusion.References.Common)
	public static CommonProxy proxy;
	
	@EventHandler  //1.6.2
	public void Preload (FMLPreInitializationEvent PreEvent) {
		proxy.registerRenderers();
		proxy.registerRenderThings();
		
	MyCode.MyBlocks();
	MyCode.MyItems();
	MyCode.MySeeds();
	MyCode.MyOreGen();
	MyCode.MyStructures();
	MyCode.MyBiomes();
	MyCode.MyEnchantments();
	MyCode.MyRecipes();
	
	}
	
	@Metadata
	public static ModMetadata meta;
	
	
	@EventHandler  //1.6.2
	//@PostInit  //1.6.2
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	
	
	
}
