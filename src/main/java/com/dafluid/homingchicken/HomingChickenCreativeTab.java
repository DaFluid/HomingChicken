package com.dafluid.homingchicken;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class HomingChickenCreativeTab extends CreativeTabs {

    public HomingChickenCreativeTab() {
        super("homingchicken");
    }

    @Override
    public String getTranslatedTabLabel() {
        return super.getTranslatedTabLabel();
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.EGG);
    }
}
