package com.alternativewill.defendersofberk.event;


import com.alternativewill.defendersofberk.DefendersOfBerk;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = DefendersOfBerk.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerArmorRenderer(final EntityRenderersEvent.AddLayers event) {
    }

    @SubscribeEvent
    public static void registerKeybindings(FMLClientSetupEvent e) {
        ClientRegistry.registerKeyBinding(ModForgeClientEvents.TOGGLE_ARMOR_WINGS);
    }

}

