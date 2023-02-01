package net.foundwiz.testmod;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

public class ModTags {

    public static final TagKey<Block> NEEDS_FLINT_TOOL = modBlockTag("needs_flint_tool");

    private static TagKey<Block> modBlockTag(String path) {
        return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(TestMod.MODID + ":" + path));
    }
}
