package com.dafluid.homingchicken;

import com.dafluid.homingchicken.environment.IModEnvironment;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = HomingChickenMod.MODID, name = HomingChickenMod.NAME, version = HomingChickenMod.VERSION)
@Mod.EventBusSubscriber
public class HomingChickenMod
{
    public static final String MODID = "homingchicken";
    public static final String NAME = "Homing Chicken";
    public static final String VERSION = "@VERSION@";

    @Mod.Instance(MODID)
    public static HomingChickenMod instance;

    @SidedProxy(clientSide = "com.dafluid.homingchicken.environment.client.ClientProxy", serverSide = "com.dafluid.homingchicken.environment.server.ServerProxy")
    public static IModEnvironment proxy;

    public static final Logger LOGGER = LogManager.getLogger(HomingChickenMod.MODID);

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        LOGGER.info("Starting initialization...");
        proxy.init();
    }
}
