package com.limitlessPotential.enchantingInfusion.enchantments;

import com.limitlessPotential.enchantingInfusion.MyCode;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EnchantmentSpeed extends Enchantment{

	
	
	public EnchantmentSpeed(int id, int rarity) {
		super(id, rarity, EnumEnchantmentType.armor_feet);
		this.setName("speed");
		
	}
	
	public int getMinEnchantability(int par1) {
		return 15 + (par1 - 1) * 10;
	}
	
	public int getMaxEnchantablility(int par1) {
		return this.getMinEnchantability(par1) + 15;
	}

	public int getMaxLevel() {
		return 4;
	}
	

	
	
	
}
