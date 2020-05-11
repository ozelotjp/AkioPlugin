package app.ozelot.akioplugin;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.Plugin;

public class EventListener implements Listener {

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Location location = player.getLocation();
        String x = String.valueOf((int) location.getX());
        String y = String.valueOf((int) location.getY());
        String z = String.valueOf((int) location.getZ());
        String message = event.getDeathMessage();
        message += " (" + x + "/" + y + "/" + z + ")";
        event.setDeathMessage(message);
    }
}
