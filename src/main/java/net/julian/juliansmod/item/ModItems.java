package net.julian.juliansmod.item;

import net.julian.juliansmod.JuliansMod;
import net.julian.juliansmod.item.custom.TNTSwordItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JuliansMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_PICKAXE = ITEMS.register("zircon_pickaxe",
            () -> new PickaxeItem(ModTiers.ZIRCON, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> TNT_SWORD = ITEMS.register("tnt_sword",
            ()-> new TNTSwordItem(ModTiers.TNT, 1,1,new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
