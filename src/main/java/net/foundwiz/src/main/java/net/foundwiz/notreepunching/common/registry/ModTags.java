package net.foundwiz.notreepunching.common.registry;

import net.foundwiz.notreepunching.NoTreePunching;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    //Blocks that requires stone or better tool to drop.
    public static final TagKey<Block> NEEDS_FLINT_TOOL = modBlockTag("needs_flint_tool");

    private static TagKey<Item> modItemTag(String path) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(NoTreePunching.MOD_ID + ":" + path));
    }
    private static TagKey<Block> modBlockTag(String path) {
        return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(NoTreePunching.MOD_ID + ":" + path));
    }
}