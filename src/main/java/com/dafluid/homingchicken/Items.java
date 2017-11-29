package com.dafluid.homingchicken;

import com.dafluid.homingchicken.items.RocketHomingAmmo;
import net.minecraft.item.Item;

public class Items {
    public static final Item rocketAmmo = initializeItemInstance(new RocketHomingAmmo(),"rocket_ammo");



    private static Item initializeItemInstance(Item item, String name){
        return item.setUnlocalizedName(name)
                .setRegistryName(HomingChickenMod.MODID,name)
                .setCreativeTab(HomingChickenMod.homingChickenTab);
    }
}
