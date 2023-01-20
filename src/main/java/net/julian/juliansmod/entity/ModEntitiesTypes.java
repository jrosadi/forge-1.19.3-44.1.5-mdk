package net.julian.juliansmod.entity;

import net.julian.juliansmod.JuliansMod;
import net.julian.juliansmod.entity.custom.IceBall;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntitiesTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, JuliansMod.MOD_ID);

    public static final RegistryObject<EntityType<IceBall>> ICE_BALL =
            ENTITY_TYPES.register("ice_ball",
                    ()->EntityType.Builder.of(IceBall::new, MobCategory.MISC).sized(0.3f,0.3f)
                            .clientTrackingRange(4).updateInterval(20)
                            .build(new ResourceLocation(JuliansMod.MOD_ID,"ice_ball").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
