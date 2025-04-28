package com.min01.gambler.event;

import com.min01.gambler.Gambler;
import com.min01.gambler.entity.ModEntities;
import com.min01.gambler.entity.living.EntityGambler;
import com.min01.gambler.item.ModItems;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gambler.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventHandler
{
    @SubscribeEvent
    public static void onEntityAttributeCreation(EntityAttributeCreationEvent event) 
    {
    	event.put(ModEntities.GAMBLER.get(), EntityGambler.createAttributes().build());
    }
    
    @SubscribeEvent
    public static void onBuildCreativeModeTabContents(BuildCreativeModeTabContentsEvent event) 
    {
    	if(event.getTabKey() == CreativeModeTabs.SPAWN_EGGS)
    	{
    		event.accept(ModItems.GAMBLER_SPAWN_EGG.get());
    	}
    }
}
