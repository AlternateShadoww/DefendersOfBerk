package com.alternativewill.defendersofberk.network;

import com.alternativewill.defendersofberk.DefendersOfBerk;
import com.alternativewill.defendersofberk.item.custom.NightFuryArmorItem;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.network.NetworkEvent;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class NightFuryArmorWingTogglePacket {

    private int entityID;

    public NightFuryArmorWingTogglePacket() {
        this.entityID = 0;
    }

    public NightFuryArmorWingTogglePacket(int id) {
        this.entityID = id;
    }

    public static void serialize(final NightFuryArmorWingTogglePacket message, final FriendlyByteBuf buf) {
        buf.writeVarInt(message.entityID);
    }

    public static NightFuryArmorWingTogglePacket deserialize(final FriendlyByteBuf buf) {
        final NightFuryArmorWingTogglePacket message = new NightFuryArmorWingTogglePacket();
        message.entityID = buf.readVarInt();

        return message;
    }

    public static class Handler implements BiConsumer<NightFuryArmorWingTogglePacket, Supplier<NetworkEvent.Context>> {
        @Override
        public void accept(final NightFuryArmorWingTogglePacket message, final Supplier<NetworkEvent.Context> contextSupplier) {
            //DefendersOfBerk.LOGGER.debug("packet received!");

            final NetworkEvent.Context context = contextSupplier.get();
            context.enqueueWork(() -> {

                if (Minecraft.getInstance().level == null) {
                    return;
                }
                //DefendersOfBerk.LOGGER.debug("minecraft pressed!");


                Entity entity = Minecraft.getInstance().level.getEntity(message.entityID);

                if (entity == null) {
                    DefendersOfBerk.LOGGER.error("Received NightFuryArmorWingTogglePacket for null entity id " + message.entityID);
                    return;
                }

                if (entity instanceof ServerPlayer player) {
                    //DefendersOfBerk.LOGGER.debug("player found!");

                    Iterator<ItemStack> it = player.getArmorSlots().iterator();
                    it.next();
                    it.next();
                    ItemStack stack = it.next(); // get chest piece; 1.18 is a wild place

                    if (stack.getItem() instanceof NightFuryArmorItem item) {
                        //DefendersOfBerk.LOGGER.debug("wings toggled on server!");
                        item.toggleWingsEnabled();
                    }

                }
            });
            context.setPacketHandled(true);
        }
    }

}
