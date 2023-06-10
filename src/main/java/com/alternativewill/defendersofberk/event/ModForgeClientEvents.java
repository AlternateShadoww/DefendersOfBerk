package com.alternativewill.defendersofberk.event;

import com.alternativewill.defendersofberk.DefendersOfBerk;
import com.alternativewill.defendersofberk.item.custom.NightFuryArmorItem;
import com.alternativewill.defendersofberk.network.NetworkHandler;
import com.alternativewill.defendersofberk.network.NightFuryArmorWingTogglePacket;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

import java.util.Iterator;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModForgeClientEvents {

    public static final KeyMapping TOGGLE_ARMOR_WINGS = new KeyMapping(DefendersOfBerk.MOD_ID + ".key.toggle_armor_wings", GLFW.GLFW_KEY_H, "DefendersOfBerk"); // Translation id, key, category name

    // SHOULD ONLY EVER RUN ON CLIENT
    @SubscribeEvent
    public static void onKeyPress(InputEvent.KeyInputEvent e) {

        if (TOGGLE_ARMOR_WINGS.isDown()) {
            //DefendersOfBerk.LOGGER.debug("Key pressed!");

            assert Minecraft.getInstance().player != null; // bc client
            LocalPlayer player = Minecraft.getInstance().player;

            Iterator<ItemStack> it = player.getArmorSlots().iterator();
            it.next();
            it.next();
            ItemStack stack = it.next(); // get chest piece; 1.18 is a wild place
            if (stack.getItem() instanceof NightFuryArmorItem item) {
                player.playSound(SoundEvents.ARMOR_EQUIP_ELYTRA, 1.0f, 1.0f);
                item.toggleWingsEnabled();
                NetworkHandler.INSTANCE.sendToServer(new NightFuryArmorWingTogglePacket(player.getId()));
                //DefendersOfBerk.LOGGER.debug("Packet sent");
            }
        }

    }
}