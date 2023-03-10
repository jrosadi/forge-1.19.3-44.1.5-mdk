package net.julian.juliansmod;

import com.mojang.logging.LogUtils;
import net.julian.juliansmod.block.ModBlocks;
import net.julian.juliansmod.entity.ModEntitiesTypes;
import net.julian.juliansmod.item.ModItems;
import net.julian.juliansmod.entity.render.entity.IceBallRenderer;
import net.julian.juliansmod.util.ModItemProperties;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JuliansMod.MOD_ID)
public class JuliansMod
{
    public static final String MOD_ID = "juliansmod";
    private static final Logger LOGGER = LogUtils.getLogger();
    //Important comment

    public JuliansMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntitiesTypes.register(modEventBus);


        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        EntityRenderers.register(ModEntitiesTypes.ICE_BALL.get(), IceBallRenderer::new);

        ModItemProperties.addCustomItemProperties();
    }
    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntitiesTypes.ICE_BALL.get(), IceBallRenderer::new);

            ModItemProperties.addCustomItemProperties();
        }
    }
}
