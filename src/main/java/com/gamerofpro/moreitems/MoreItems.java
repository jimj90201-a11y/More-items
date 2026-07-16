package com.gamerofpro.moreitems;

import com.gamerofpro.moreitems.registry.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MoreItems.MOD_ID)
public class MoreItems {

    public static final String MOD_ID = "moreitems";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MoreItems() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
    }
}
