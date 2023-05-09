package com.alternativewill.defendersofberk.entity.client.armor;

import com.alternativewill.defendersofberk.item.custom.NightFuryArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class NightFuryArmorRenderer extends GeoArmorRenderer<NightFuryArmorItem> {
    public NightFuryArmorRenderer() {
        super(new NightFuryArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
