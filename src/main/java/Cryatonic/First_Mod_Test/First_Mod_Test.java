package Cryatonic.First_Mod_Test;

import com.sun.org.apache.xml.internal.security.encryption.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "fmt", name = "First Mod Tutorial", version = "1.0")
public class First_Mod_Test {

	public static Item itemTest; 
	public static Block blockTest;
	public static Item itemYuck;
	public static Item itemGross;
	public static Item itemBarf;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		int testblock;
		//Item/Block init and registering
		//Config handling
		itemTest = new ItemTest().setUnlocalizedName("ItemTest");
		blockTest = new BlockTest(Material.leaves).setBlockName("BlockTest");
		itemYuck = new ItemFood(1, 0.3F, false).setUnlocalizedName("ItemYuck");
		itemGross = new ItemFood(3, 0.7F, false).setUnlocalizedName("ItemGross");
		itemBarf = new ItemFood(6, 0.9F, true).setUnlocalizedName("ItemBarf");
		
		
		
		
		
		
		
		GameRegistry.registerItem(itemTest, itemTest.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockTest, blockTest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemYuck, itemYuck.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemGross, itemGross.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemBarf, itemBarf.getUnlocalizedName().substring(5));
		System.out.println(blockTest.getUnlocalizedName().substring(5)); 
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, TileEntity, entity, GUI and Packet Registering
		GameRegistry.addRecipe(new ItemStack(itemTest), new Object[]{"   "," D ","   ", 'D', Blocks.dirt});
		GameRegistry.addRecipe(new ItemStack(blockTest, 4), new Object[]{"DDD","DWD","DDD", 'D', Blocks.dirt, 'W', Blocks.log});
		GameRegistry.addSmelting(itemYuck, new ItemStack(itemGross), 3.0F); 
		GameRegistry.addRecipe(new ItemStack(itemYuck, 10), new Object[]{"   "," D "," W ", 'D', Blocks.dirt, 'W', Items.water_bucket});
		GameRegistry.addSmelting(itemGross, new ItemStack(itemBarf), 3.0F);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
