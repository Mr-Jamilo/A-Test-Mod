package net.jamilo.newmod.item;

import net.jamilo.newmod.NewMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,NewMod.MODID);

    public static final RegistryObject<Item> TIN = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOTORO = ITEMS.register("totoro", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
