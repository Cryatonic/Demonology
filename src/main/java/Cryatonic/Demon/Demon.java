package Cryatonic.Demon;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "Demon", name = "Demonology", version = "0.01")
public class Demon {
	
	public static Item itemTest2;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		int testblock;
		//Item/Block init and registering
		//Config handling
		itemTest2 = new ItemTest2().setUnlocalizedName("ItemTest2");
		
		
		GameRegistry.registerItem(itemTest2, itemTest2.getUnlocalizedName().substring(5)); }
		
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, TileEntity, entity, GUI and Packet Registering
		GameRegistry.addRecipe(new ItemStack(itemTest2), new Object[]{"   "," O ","O  ", 'O', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(itemTest2), new Object[]{"   ","  O"," O ", 'O', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(itemTest2), new Object[]{" O ","O  ","   ", 'O', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(itemTest2), new Object[]{"  O"," O ","   ", 'O', Blocks.obsidian});
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
