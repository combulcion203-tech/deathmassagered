
package me.chatgpt.deathmessagered;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class DeathMessageRed extends JavaPlugin
        implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager()
                .registerEvents(this, this);
        getLogger().info("DeathMessageRed activado.");
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onDeath(PlayerDeathEvent event) {
        Component original = event.deathMessage();

        if (original != null) {
            event.deathMessage(
                original.color(NamedTextColor.RED)
            );
        }
    }
}
