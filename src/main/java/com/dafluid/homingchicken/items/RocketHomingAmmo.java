package com.dafluid.homingchicken.items;

import com.dafluid.homingchicken.utils.Localization;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;

import net.minecraft.client.resources.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class RocketHomingAmmo extends Item {
    public RocketHomingAmmo(){
        setMaxStackSize(64);
        setMaxDamage(0);
    }


    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(Localization.itemString(this,"tooltip"));
    }

    @Override
    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target, EnumHand hand) {
        if(hand== EnumHand.MAIN_HAND) {
            playerIn.sendMessage(new TextComponentString("Hello World"));
            return true;
        }
        return false;
    }
}
