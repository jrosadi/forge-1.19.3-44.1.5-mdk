package net.julian.juliansmod.event;

import net.julian.juliansmod.JuliansMod;
import net.julian.juliansmod.item.ModItems;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = JuliansMod.MOD_ID)
    public static class ForgeEvents {

        @SubscribeEvent
        public static void onLivingHurt(LivingHurtEvent event) {
            if(event.getEntity() instanceof Player) {
                if(event.getSource().isExplosion()){
                    if(event.getEntity().getMainHandItem().getItem() == ModItems.TNT_SWORD.get()){
                        event.setCanceled(true);
                    }
                }
            }
        }
    }

    @Mod.EventBusSubscriber(modid = JuliansMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {

    }
}