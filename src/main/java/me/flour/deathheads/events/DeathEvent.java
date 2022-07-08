package me.flour.deathheads.events;

import me.flour.deathheads.Initialize;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.Common;

import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.remain.CompMaterial;


public class DeathEvent implements Listener {

    @EventHandler
    public void onPlayerDeath(final EntityDeathEvent event) {

        if (!(event.getEntity() instanceof Player))
            return;

        final Player player = ((Player) event.getEntity()).getPlayer();

        if (player == null)
            return;

        if (player.getKiller() == null)
            return;





        int chance = Initialize.getRandomNumber(0, 10);


        if (chance == 2) {

            ItemStack head = ItemCreator.of(CompMaterial.PLAYER_HEAD, "&b&lGłowa " + player.getDisplayName(),
                    "&aLepiej nie zakładać...").skullOwner(event.getEntity().getName()).make();

            Common.broadcast("&a&l[GŁOWA] &bGracz " + player.getDisplayName() + " &bupuścił głowę...");
            player.getWorld().dropItem(player.getLocation(), head);

        }
    }
}
