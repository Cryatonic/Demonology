package com.Cryatonic.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CompressedSandstone {
	public static void mainRegistry() {
		initializeBlock();
		registerBlock();
	}
	
	public static Block ComSaStn;
	
	public static void initializeBlock() {
		ComSaStn = new ComSaStn(Material.ground).setBlockName("ComSaStn").setCreativeTab(CreativeTabs.tabBlock);

	}
	
	public static void registerBlock() {
		GameRegistry.registerBlock(ComSaStn, ComSaStn.getUnlocalizedName().substring(5));

	}
}
