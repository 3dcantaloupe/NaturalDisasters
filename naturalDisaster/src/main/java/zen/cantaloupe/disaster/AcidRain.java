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
    private World world;

    public AcidRain() {
        this.plugin = plugin;
        this.obj = this;
       // world =  get the player somehow and do player.getWorld();

    }
    public void canAcid() throws InterruptedException {
        int count = 19;
        System.out.println("IT WORKSSSSS LES GOOOO");
        int t = 0;
//        while ( t < 100){
//            int randNumber = (int) (Math.random() * 20);
//            TimeUnit.SECONDS.sleep(3);
//            System.out.println(randNumber);
//            count = randNumber;
//            t++;
//        }

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
            Bukkit.broadcastMessage("A drizzle of Acid Rain is about to fall down upon ye terra");
            time = 3000;
        } else if (level == 2) {
            Bukkit.broadcastMessage("A bit of Acid Rain is about to fall");
            time = 6000;
        } else if (level == 3) {
            Bukkit.broadcastMessage("An Acid Rain storm is rolling in");
            time = 12000;
        } else if (level == 4) {
            Bukkit.broadcastMessage("A large amount of Acid Rain is about to rain down upon ye");
            time = 18000;
        } else if (level == 5) {
            Bukkit.broadcastMessage("A hurricane of an Acid Rain storm is about to occur!!!");
            time = 24000;
        }
        world = Bukkit.getServer().getWorld("disaster");

//    for ( int i = 0; i < 5; i++) {
//        world.setStorm(true);
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("i is :" + i);
//        world.setStorm(false);

//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("i is :" + i);

        //world.setStorm(); get the world in the constructor

        world.setStorm(true);
//        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
//            @Override
//            public void run() {
//                world.setStorm(false);s
//            }
//        }, 600); //change 600 to time later

        System.out.println("HIIII");
        BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
        scheduler.runTaskLater(plugin, new Runnable() {
            @Override
            public void run() {
                world.setStorm(false);
            }
        }, 100L);


    }




}