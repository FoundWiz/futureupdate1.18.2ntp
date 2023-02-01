package net.foundwiz.notreepunching.common.event;

import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PlanksBreakingEvent {
    @SubscribeEvent
    public void registerEvent(PlayerEvent.BreakSpeed event) {
        if (event.getState().getMaterial() == Material.WOOD
                || event.getState().getMaterial() == Material.NETHER_WOOD) {
            //If not holding an axe
            if (!event.getPlayer().getMainHandItem().isCorrectToolForDrops(event.getState())) {
                event.setNewSpeed(event.getOriginalSpeed() / 3);
            }
        }
    }
}