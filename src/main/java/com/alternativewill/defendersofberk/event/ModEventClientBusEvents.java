package com.alternativewill.defendersofberk.event;


import com.alternativewill.defendersofberk.DefendersOfBerk;
import com.alternativewill.defendersofberk.entity.client.armor.NightFuryArmorRenderer;
import com.alternativewill.defendersofberk.entity.client.armor.WingedNightFuryArmorRenderer;
import com.alternativewill.defendersofberk.item.custom.NightFuryArmorItem;
import com.alternativewill.defendersofberk.item.custom.WingedNightFuryArmorItem;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import software.bernie.example.GeckoLibMod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = DefendersOfBerk.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(NightFuryArmorItem.class, new NightFuryArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(WingedNightFuryArmorItem.class, new WingedNightFuryArmorRenderer());

    }
}