package com.alternativewill.defendersofberk.entity.client.armor;

import com.alternativewill.defendersofberk.DefendersOfBerk;
import com.alternativewill.defendersofberk.item.custom.NightFuryArmorItem;
import com.alternativewill.defendersofberk.item.custom.WingedNightFuryArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WingedNightFuryArmorModel extends AnimatedGeoModel<WingedNightFuryArmorItem> {

    @Override
    public ResourceLocation getModelLocation(WingedNightFuryArmorItem object) {
        return new ResourceLocation(DefendersOfBerk.MOD_ID, "geo/wingednightfuryarmor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(WingedNightFuryArmorItem object) {
        return new ResourceLocation(DefendersOfBerk.MOD_ID, "textures/models/armor/nightfuryarmor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(WingedNightFuryArmorItem animatable) {
        return new ResourceLocation(DefendersOfBerk.MOD_ID, "animations/armor_animation.json");
    }
}
