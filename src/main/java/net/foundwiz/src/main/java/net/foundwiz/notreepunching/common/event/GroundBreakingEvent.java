package net.foundwiz.notreepunching.common.event;

import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class GroundBreakingEvent {
    @SubscribeEvent
    public void registerEvent(PlayerEvent.BreakSpeed event) {
        if (event.getState().getMaterial() == Material.DIRT
                || event.getState().getMaterial() == Material.SAND
                || event.getState().getMaterial() == Material.GRASS) {
            //If not holding a shovel
            if (!event.getPlayer().getMainHandItem().isCorrectToolForDrops(event.getState())) {
                event.setNewSpeed(event.getOriginalSpeed() / 4);
            }
        }
    }
}