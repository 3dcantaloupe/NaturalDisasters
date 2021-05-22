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

public class AcidRain implements Listener{
    private naturalDisaster plugin;
    private int time;
    private AcidRain obj;
    private static World world;
    private static int count;

    public AcidRain(naturalDisaster plugin) {
        this.plugin = plugin;
        this.obj = this;
       // world =  get the player somehow and do player.getWorld();

    }



    public static int getCount() {
        return count;
    }

    public static void setCount(int c){
        count = c;
    }

    public void canAcid() throws InterruptedException {
        count = 19;
        System.out.println("IT WORKSSSSS LES GOOOO");
        if (count > 18){
            startAcid();
        }
        else{
        }
    }
    public void startAcid() {
        int level = (int) (Math.random() * 5) + 1;
        int time = 0;
        if (level == 1) {
            plugin.getServer().broadcastMessage("A drizzle of Acid Rain is about to fall down upon ye terra");
            time = 3000;
            System.out.println(level);
        } else if (level == 2) {
            plugin.getServer().broadcastMessage("A bit of Acid Rain is about to fall");
            time = 6000;
            System.out.println(level);
        } else if (level == 3) {
            plugin.getServer().broadcastMessage("An Acid Rain storm is rolling in");
            time = 12000;
            System.out.println(level);
        } else if (level == 4) {
            plugin.getServer().broadcastMessage("A large amount of Acid Rain is about to rain down upon ye");
            time = 18000;
            System.out.println(level);
        } else if (level == 5) {
            plugin.getServer().broadcastMessage("A hurricane of an Acid Rain storm is about to occur!!!");
            time = 24000;
            System.out.println(level);
        }
        world = Bukkit.getServer().getWorld("disaster");
        world.setStorm(true);
        BukkitTask task = (BukkitTask) new ChanceCount(plugin).runTaskLater(plugin, time);




    }
    public static World getWorld() {
        return world;
    }




}