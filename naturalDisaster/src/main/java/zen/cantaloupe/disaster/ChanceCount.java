package zen.cantaloupe.disaster;


import java.lang.Math;

import jdk.jfr.internal.Utils;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import java.util.concurrent.TimeUnit;
import org.bukkit.World;
//import org.bukkit.event.weather;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.plugin.java.JavaPlugin;


public class ChanceCount extends BukkitRunnable{
    private naturalDisaster plugin;
    public ChanceCount(naturalDisaster plugin) {
        this.plugin = plugin;
        // world =  get the player somehow and do player.getWorld();

    }
    public void run() {
        Bukkit.broadcastMessage("Storm has passed");

        AcidRain.getWorld().setStorm(false);
        
        AcidRain.getTask2().cancel();
        
    }
}
