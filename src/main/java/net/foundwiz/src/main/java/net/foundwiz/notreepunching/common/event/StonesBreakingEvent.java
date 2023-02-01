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

public class StonesBreakingEvent {
    @SubscribeEvent
    public void registerEvent(PlayerEvent.BreakSpeed event) {
        final List<Material> hardMaterials = Lists.newArrayList(Material.HEAVY_METAL, Material.METAL, Material.STONE);
        if (event.getState() == null || event.getPlayer() == null) {
            return;
        }
        ItemStack heldItem = event.getPlayer().getMainHandItem();
        if (!hardMaterials.contains(event.getState().getMaterial())) {
            return;
        }
        if (event.getState().is(ForgeTags.ALWAYS_BREAKABLE_STONE_BLOCKS)) {
            return;
        }
        if (heldItem.is(ForgeTags.SPECIAL_PICKAXES)) {
            return;
        }
        if (!heldItem.canPerformAction(ToolActions.PICKAXE_DIG)) {
            event.setCanceled(true);
        }
    }
}