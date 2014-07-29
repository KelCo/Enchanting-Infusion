package com.limitlessPotential.enchantingInfusion;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import com.limitlessPotential.enchantingInfusion.ClientProxy;
import com.limitlessPotential.enchantingInfusion.enchantments.EnchantmentSpeed;

public class ServerTickHandler {

	private Minecraft mc;
	
	public ServerTickHandler(Minecraft mc) {
		this.mc = mc;
	}
	
	@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent event) {
		if(event.player.getCurrentArmor(0)!= null) {
			ItemStack boots = event.player.getCurrentArmor(0);
		
			if(boots.getItem() == Items.diamond_boots || boots.getItem() == Items.golden_boots || boots.getItem() == Items.iron_boots || boots.getItem() == Items.leather_boots || boots.getItem() == Items.chainmail_boots) {
				int j = EnchantmentHelper.getEnchantmentLevel(MyCode.speed.effectId, boots);
			if(j > 0) {
				event.player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 0, j - 1));
			}
			
			
			}
		
		
		}
		
	}

		@SubscribeEvent
		public void onPlayerTick2(PlayerTickEvent event) {
			if(event.player.getCurrentArmor(1)!= null) {
				ItemStack pants = event.player.getCurrentArmor(1);
		
				if(pants.getItem() == Items.diamond_leggings || pants.getItem() == Items.golden_leggings || pants.getItem() == Items.iron_leggings || pants.getItem() == Items.leather_leggings || pants.getItem() == Items.chainmail_leggings) {
					int k = EnchantmentHelper.getEnchantmentLevel(MyCode.jump.effectId, pants);
					if(k > 0) {
						event.player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 0, k - 1));
		
				}
		
		
		
				}
		
		
		
		
		
	}
	
	
	
		}
	
}
