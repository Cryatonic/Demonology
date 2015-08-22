package com.Cryatonic.item;

import com.Cryatonic.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TestItem extends Item {
	protected TestItem() {
		this.setTextureName(RefStrings.MODID + ":SaStnStk");
	}

	
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static Item Test;
	
	public static void initializeItem() {
		Test = new Item().setUnlocalizedName("Test").setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(Test, Test.getUnlocalizedName().substring(5));
	}

}
