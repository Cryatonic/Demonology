package com.demon.demonology;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "demonology", name="Demonology", version = "1.7.10")
public class Demonology 
{
	@Mod.Instance("Demonology")
	public static Demonology instance;
	
	@SidedProxy(clientSide = "com.demon.demonology.proxy.ClientProxy", serverSide = "com.demon.demonology.proxy.ServerProxy")
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		
	}
}