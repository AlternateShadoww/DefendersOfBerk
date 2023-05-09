package com.alternativewill.defendersofberk.entity.client.armor;

import com.alternativewill.defendersofberk.item.custom.NightFuryArmorItem;
import com.alternativewill.defendersofberk.item.custom.WingedNightFuryArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WingedNightFuryArmorRenderer extends GeoArmorRenderer<WingedNightFuryArmorItem> {
    public WingedNightFuryArmorRenderer() {
        super(new WingedNightFuryArmorModel());

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
