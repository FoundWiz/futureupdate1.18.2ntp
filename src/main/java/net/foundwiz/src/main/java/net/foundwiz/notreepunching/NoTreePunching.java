package net.foundwiz.notreepunching;

import com.mojang.logging.LogUtils;
import net.foundwiz.notreepunching.common.event.GroundBreakingEvent;
import net.foundwiz.notreepunching.common.event.PlanksBreakingEvent;
import net.foundwiz.notreepunching.common.event.StonesBreakingEvent;
import net.foundwiz.notreepunching.common.event.WoodBreakingEvent;
import net.foundwiz.notreepunching.common.registry.ModItems;
import net.foundwiz.notreepunching.recipe.DamageItemRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import net.minecraft.world.level.levelgen.feature.Feature;

//The value here should match an entry in the META-INF/mods.toml file.
@Mod(NoTreePunching.MOD_ID)
public class NoTreePunching {
    public static final String MOD_ID = "notreepunching";

    //Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final RecipeSerializer<DamageItemRecipe> DAMAGE_ITEM_RECIPE = new DamageItemRecipe.Serializer();

    public NoTreePunching() {
        //Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(new GroundBreakingEvent());
        MinecraftForge.EVENT_BUS.register(new PlanksBreakingEvent());
        MinecraftForge.EVENT_BUS.register(new StonesBreakingEvent());
        MinecraftForge.EVENT_BUS.register(new WoodBreakingEvent());

        modEventBus.addListener(this::setup);

        //Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        //Some preinit codes
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onRegisterSerializers(
                final RegistryEvent.Register<RecipeSerializer<?>> event) {
            event.getRegistry().register(DAMAGE_ITEM_RECIPE
                    .setRegistryName(new ResourceLocation(NoTreePunching.MOD_ID, "damage_tools")));
        }
    }
}