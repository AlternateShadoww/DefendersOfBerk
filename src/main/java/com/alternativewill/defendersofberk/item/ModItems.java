package com.alternativewill.defendersofberk.item;

import com.alternativewill.defendersofberk.DefendersOfBerk;
import com.alternativewill.defendersofberk.item.custom.NightFuryArmorItem;
import com.alternativewill.defendersofberk.item.custom.WingedNightFuryArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DefendersOfBerk.MOD_ID);


    public static final RegistryObject<Item> NIGHTFURYSCALE = ITEMS.register("nightfury_scales",
            () -> new Item(new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> NIGHTFURYSCALEHELMET = ITEMS.register("nightfury_helmet",
            () -> new NightFuryArmorItem(ModArmorMaterials.NIGHTFURYSCALE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NIGHTFURYSCALECHESTPLATE = ITEMS.register("nightfury_chestplate",
            () -> new NightFuryArmorItem(ModArmorMaterials.NIGHTFURYSCALE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NIGHTFURYSCALELEGGINGS = ITEMS.register("nightfury_leggings",
            () -> new NightFuryArmorItem(ModArmorMaterials.NIGHTFURYSCALE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NIGHTFURYSCALEBOOTS = ITEMS.register("nightfury_boots",
            () -> new NightFuryArmorItem(ModArmorMaterials.NIGHTFURYSCALE, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> WINGEDNIGHTFURYSCALECHESTPLATE = ITEMS.register("winged_nightfury_chestplate",
            () -> new WingedNightFuryArmorItem(ModArmorMaterials.NIGHTFURYSCALE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
