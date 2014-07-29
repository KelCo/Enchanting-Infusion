package com.limitlessPotential.enchantingInfusion;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.FMLCommonHandler;
import com.limitlessPotential.enchantingInfusion.ServerTickHandler;

public class ClientProxy extends CommonProxy{

	public void registerRenderInformation() {
		
	}
	
	public void registerRenderThings() {
		FMLCommonHandler.instance().bus().register(new ServerTickHandler(Minecraft.getMinecraft()));
	}
	
	
}
