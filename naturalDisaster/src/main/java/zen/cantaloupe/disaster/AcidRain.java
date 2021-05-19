package zen.cantaloupe.disaster;

import java.lang.Math;

import jdk.jfr.internal.Utils;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import java.util.concurrent.TimeUnit;
import org.bukkit.World;
//import org.bukkit.event.weather;

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
        if (level == 1){
            Bukkit.broadcastMessage("A very timid Acid Rain is about to fall down upon ye terra");
            time = 30;
        }
        else if (level == 2){
            Bukkit.broadcastMessage("Some little amount of Acid Rain is about to fall");
            time = 60;
        }
        else if (level == 3){
            Bukkit.broadcastMessage("A moderately sized Acid Rain storm is about to occur");
            time = 120;
        }
        else if (level == 4){
            Bukkit.broadcastMessage("A decently large amount of Acid Rain is about to rain down upon ye");
            time = 200;
        }
        else if (level == 5){
            Bukkit.broadcastMessage("A very long Acid Rain storm is about to occur!!! (it lasts a day!)");
            time = 300;
        }
        World world = Bukkit.getServer().getWorld("disaster");

    for ( int i = 0; i < 22; i++) {
        world.setStorm(true);
//            try {
//                TimeUnit.SECONDS.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        System.out.println("i is :" + i);
        world.setStorm(false);
    }
//            try {
//                TimeUnit.SECONDS.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

//            System.out.println("i is :" + i);

        //world.setStorm(); get the world in the constructor

    }




}