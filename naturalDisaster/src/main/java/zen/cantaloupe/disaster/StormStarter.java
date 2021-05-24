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


public class StormStarter extends BukkitRunnable{
    private naturalDisaster plugin;
    private static AcidRain storm;
    public StormStarter(naturalDisaster plugin, AcidRain s) {
        this.plugin = plugin;
        storm = s;
    }
    public void run() {


        try {
            storm.canAcid();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
