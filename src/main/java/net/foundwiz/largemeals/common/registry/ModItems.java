package net.foundwiz.largemeals.common.registry;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.BlockItem;
import net.foundwiz.largemeals.common.FoodValues;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.foundwiz.largemeals.LargeMeals;

import static vectorwing.farmersdelight.common.registry.ModItems.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LargeMeals.MOD_ID);

    //Sweets
    public static final RegistryObject<Item> SWEET_BERRY_CUSTARD = ITEMS.register("sweet_berry_custard",
            () -> new ConsumableItem(foodItem(FoodValues.SWEET_BERRY_CUSTARD).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16)));

    //Soups and Stews
    public static final RegistryObject<Item> PUFFERFISH_BROTH = ITEMS.register("pufferfish_broth",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.PUFFERFISH_BROTH), true));
    public static final RegistryObject<Item> RED_SOUP = ITEMS.register("red_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.RED_SOUP), true));
    public static final RegistryObject<Item> POTATO_SOUP = ITEMS.register("potato_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.POTATO_SOUP), true));

    //Plated Meals
    public static final RegistryObject<Item> COD_DELUXE = ITEMS.register("cod_deluxe",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.COD_DELUXE), true));
    public static final RegistryObject<Item> COD_SURPRISE = ITEMS.register("cod_surprise",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.COD_SURPRISE), true));
    public static final RegistryObject<Item> HEARTY_LUNCH = ITEMS.register("hearty_lunch",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.HEARTY_LUNCH), true));

    //Feasts
    public static final RegistryObject<Item> OMURICE_BLOCK = ITEMS.register("omurice_block",
            () -> new BlockItem(ModBlocks.OMURICE_BLOCK.get(), basicItem().stacksTo(1)));
    public static final RegistryObject<Item> OMURICE = ITEMS.register("omurice",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.OMURICE), true));
    public static final RegistryObject<Item> MUSHROOM_POT_PIE = ITEMS.register("mushroom_pot_pie",
            () -> new BlockItem(ModBlocks.MUSHROOM_POT_PIE.get(), basicItem().stacksTo(1)));
    public static final RegistryObject<Item> MUSHROOM_POT_PIE_SLICE = ITEMS.register("mushroom_pot_pie_slice",
            () -> new ConsumableItem(foodItem(FoodValues.MUSHROOM_POT_PIE_SLICE), true));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}