package com.min01.gambler;

import com.min01.gambler.entity.ModEntities;
import com.min01.gambler.item.ModItems;
import com.min01.gambler.network.ModNetwork;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Gambler.MODID)
public class Gambler
{
    public static final String MODID = "gambler";
    
	public Gambler() 
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ModEntities.ENTITY_TYPES.register(bus);
		ModItems.ITEMS.register(bus);
		
		ModNetwork.registerMessages();
	}
}
