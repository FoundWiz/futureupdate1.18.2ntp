package net.foundwiz.notreepunching.integration.biomesoplenty;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BiomesOPlentyTags {
    public static final TagKey<Item> STRIPPED_CHERRY_LOGS = biomesoplentyItemTag("stripped_cherry_logs");
    public static final TagKey<Item> STRIPPED_DEAD_LOGS = biomesoplentyItemTag("stripped_dead_logs");
    public static final TagKey<Item> STRIPPED_FIR_LOGS = biomesoplentyItemTag("stripped_fir_logs");
    public static final TagKey<Item> STRIPPED_HELLBARK_LOGS = biomesoplentyItemTag("stripped_hellbark_logs");
    public static final TagKey<Item> STRIPPED_JACARANDA_LOGS = biomesoplentyItemTag("stripped_jacaranda_logs");
    public static final TagKey<Item> STRIPPED_MAGIC_LOGS = biomesoplentyItemTag("stripped_magic_logs");
    public static final TagKey<Item> STRIPPED_MAHOGANY_LOGS = biomesoplentyItemTag("stripped_mahogany_logs");
    public static final TagKey<Item> STRIPPED_PALM_LOGS = biomesoplentyItemTag("stripped_palm_logs");
    public static final TagKey<Item> STRIPPED_REDWOOD_LOGS = biomesoplentyItemTag("stripped_redwood_logs");
    public static final TagKey<Item> STRIPPED_UMBRAN_LOGS = biomesoplentyItemTag("stripped_umbran_logs");
    public static final TagKey<Item> STRIPPED_WILLOW_LOGS = biomesoplentyItemTag("stripped_willow_logs");

    private static TagKey<Item> biomesoplentyItemTag(String path) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("biomesoplenty", path));
    }
    private static TagKey<Block> biomesoplentyBlockTag(String path) {
        return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("biomesoplenty", path));
    }
}
