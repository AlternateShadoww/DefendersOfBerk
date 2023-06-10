package com.alternativewill.defendersofberk.network;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class NetworkHandler {

    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
            new ResourceLocation("mymodid", "main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );

    public static void registerPackets() {
        int i = 0;
        INSTANCE.registerMessage(i, NightFuryArmorWingTogglePacket.class, NightFuryArmorWingTogglePacket::serialize, NightFuryArmorWingTogglePacket::deserialize, new NightFuryArmorWingTogglePacket.Handler());
    }
}
