package com.varep.manystones.core.proxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {
	public void registerEvents() {
		
		}
	
	public void preInit() {
   }

   public void init() {
	   this.registerTileEntities();
   }

   public void postInit() {
   }


   public void registerTileEntities() {
   }

}