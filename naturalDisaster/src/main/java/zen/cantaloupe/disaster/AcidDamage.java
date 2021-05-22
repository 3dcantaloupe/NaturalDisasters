package zen.cantaloupe.disaster;


import java.lang.Math;

import jdk.jfr.internal.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.event.Listener;
import java.util.concurrent.TimeUnit;
import org.bukkit.World;
//import org.bukkit.event.weather;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

public class AcidDamage extends BukkitRunnable{
    private naturalDisaster plugin;
    Player[] players = Bukkit.getServer().getOnlinePlayers().toArray(new Player[0]);

    public AcidDamage(naturalDisaster plugin) {
        this.plugin = plugin;

    }
    public void run() {
        
        for (Player player : players){
            AcidRain.exposedDamage(player);
            System.out.println("Damaged player!");
        }
    }
}
