package net.jamilo.newmod.item;

import net.jamilo.newmod.NewMod;
import net.jamilo.newmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewMod.MODID);

    public static final RegistryObject<CreativeModeTab> CUSTOM_TAB = CREATIVE_MODE_TABS.register("custom_tab", () ->  CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TIN.get())).title(Component.translatable("creativetab.custom_tab")).displayItems(((itemDisplayParameters, output) -> {
        output.accept(ModItems.RAW_TIN.get());
        output.accept(ModItems.TIN.get());
        output.accept(ModBlocks.TIN_BLOCK.get());
    })).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
