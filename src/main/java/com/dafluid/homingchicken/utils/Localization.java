package com.dafluid.homingchicken.utils;

import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Localization {
    @SideOnly(Side.CLIENT)
    public static String itemString(Item item, String key, Object... params){
        return I18n.format("item."+item.getUnlocalizedName()+"."+key,params);
    }
}
