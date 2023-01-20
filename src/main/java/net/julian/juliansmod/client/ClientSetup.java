package net.julian.juliansmod.client;

import net.julian.juliansmod.JuliansMod;
import net.julian.juliansmod.client.renderer.entity.IceBallRenderer;
import net.julian.juliansmod.entity.ModEntitiesTypes;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = JuliansMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    @SubscribeEvent
    public static void doSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(ModEntitiesTypes.ICE_BALL.get(), IceBallRenderer::new);
    }
}