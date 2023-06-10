package com.alternativewill.defendersofberk.event;


import com.alternativewill.defendersofberk.DefendersOfBerk;
import com.alternativewill.defendersofberk.entity.client.armor.NightFuryArmorRenderer;
import com.alternativewill.defendersofberk.item.custom.NightFuryArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = DefendersOfBerk.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(NightFuryArmorItem.class, NightFuryArmorRenderer::new);
    }

}