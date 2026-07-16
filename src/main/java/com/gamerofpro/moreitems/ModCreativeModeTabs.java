package com.gamerofpro.moreitems.registry;

import com.gamerofpro.moreitems.MoreItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(ForgeRegistries.CREATIVE_MODE_TABS, MoreItems.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MORE_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("more_items", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("creativetab.moreitems"))
                            .icon(() -> new ItemStack(ModItems.FLASHLIGHT.get()))
                            .displayItems((parameters, output) -> {
                                output.accept(ModItems.FLASHLIGHT.get());
                            })
                            .build()
            );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
