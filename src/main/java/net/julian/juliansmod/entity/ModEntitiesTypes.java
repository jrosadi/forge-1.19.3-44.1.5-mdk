package net.julian.juliansmod.entity;

import net.julian.juliansmod.JuliansMod;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntitiesTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, JuliansMod.MOD_ID);


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
