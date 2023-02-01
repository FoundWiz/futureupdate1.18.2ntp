package net.foundwiz.largemeals.common;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import vectorwing.farmersdelight.common.registry.ModEffects;
import net.minecraft.world.food.FoodProperties;

import static vectorwing.farmersdelight.common.FoodValues.*;

public class FoodValues {
    //Sweets
    public static final FoodProperties SWEET_BERRY_CUSTARD = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60, 0), 1.0F).build();

    //Bowl Foods
    public static final FoodProperties PUFFERFISH_BROTH = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties RED_SOUP = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.7f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), SHORT_DURATION, 0), 1.0F).build();
    public static final FoodProperties POTATO_SOUP = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F).build();

    //Plated Foods
    public static final FoodProperties COD_DELUXE = (new FoodProperties.Builder())
            .nutrition(9).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties COD_SURPRISE = (new FoodProperties.Builder())
            .nutrition(9).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), SHORT_DURATION, 0), 1.0F).build();
    public static final FoodProperties HEARTY_LUNCH = (new FoodProperties.Builder())
            .nutrition(14).saturationMod(0.9f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();

    //Feast Portions
    public static final FoodProperties OMURICE = (new FoodProperties.Builder())
            .nutrition(13).saturationMod(0.7f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), LONG_DURATION, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties MUSHROOM_POT_PIE_SLICE = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.7f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F).build();

    //Feast
    public static final FoodProperties ROAST_CHICKEN = (new FoodProperties.Builder())
            .nutrition(14).saturationMod(0.75f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties STUFFED_PUMPKIN = (new FoodProperties.Builder())
            .nutrition(14).saturationMod(0.75f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F).build();
}