package net.foundwiz.notreepunching.common.event;

import com.google.common.collect.Lists;
import net.foundwiz.notreepunching.common.registry.ForgeTags;
import net.foundwiz.notreepunching.common.registry.ModTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.List;

public class WoodBreakingEvent {
    @SubscribeEvent
    public void registerEvent(PlayerEvent.BreakSpeed event) {
        final List<Material> hardMaterials = Lists.newArrayList(Material.WOOD, Material.NETHER_WOOD);
        if (event.getState() == null || event.getPlayer() == null) {
            return;
        }
        ItemStack heldItem = event.getPlayer().getMainHandItem();
        if (!hardMaterials.contains(event.getState().getMaterial())) {
            return;
        }
        if (event.getState().is(ForgeTags.ALWAYS_BREAKABLE_WOOD_BLOCKS)) {
            return;
        }
        if (heldItem.is(ForgeTags.SPECIAL_AXES)) {
            return;
        }
        if (!heldItem.canPerformAction(ToolActions.AXE_DIG)) {
            event.setCanceled(true);
        }
    }
}