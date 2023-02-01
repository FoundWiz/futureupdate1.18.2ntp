package net.foundwiz.notreepunching.common.registry;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ForgeTags {
    //Items that are supposed to be registered as an axe.
    public static final TagKey<Item> SPECIAL_AXES = forgeItemTag("special_axes");
    //Items that are supposed to be registered as a pickaxe.
    public static final TagKey<Item> SPECIAL_PICKAXES = forgeItemTag("special_pickaxes");
    //Wood blocks that are always breakable even if not holding an axe.
    public static final TagKey<Block> ALWAYS_BREAKABLE_WOOD_BLOCKS = forgeBlockTag("always_breakable_wood_blocks");
    //Stone blocks that are always breakable even if not holding a pickaxe.
    public static final TagKey<Block> ALWAYS_BREAKABLE_STONE_BLOCKS = forgeBlockTag("always_breakable_stone_blocks");

    private static TagKey<Item> forgeItemTag(String path) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("forge", path));
    }
    private static TagKey<Block> forgeBlockTag(String path) {
        return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("forge", path));
    }
}
