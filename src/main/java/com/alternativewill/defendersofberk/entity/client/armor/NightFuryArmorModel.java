package com.alternativewill.defendersofberk.entity.client.armor;

import com.alternativewill.defendersofberk.DefendersOfBerk;
import com.alternativewill.defendersofberk.item.custom.NightFuryArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NightFuryArmorModel extends AnimatedGeoModel<NightFuryArmorItem> {

    @Override
    public ResourceLocation getModelLocation(NightFuryArmorItem object) {
        return new ResourceLocation(DefendersOfBerk.MOD_ID, "geo/nightfuryarmor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(NightFuryArmorItem object) {
        return new ResourceLocation(DefendersOfBerk.MOD_ID, "textures/models/armor/nightfuryarmor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(NightFuryArmorItem animatable) {
        return new ResourceLocation(DefendersOfBerk.MOD_ID, "animations/armor_animation.json");
    }
}
