package zen.cantaloupe.disaster;

import java.lang.Math;

import jdk.jfr.internal.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
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
    private static boolean hasStorm;
  
    private static BukkitTask task2;

    public AcidRain(naturalDisaster plugin) {
        this.plugin = plugin;
        this.obj = this;
        hasStorm = true;
       // world =  get the player somehow and do player.getWorld();

    }
    public static void setTask2(BukkitTask t){
        task2 = t;
    }
    public static BukkitTask getTask2(){
        return task2;
    }
    public static void setHasStorm(boolean s){
        hasStorm = s;
    }
    
    public static boolean getHasStorm(){
        return hasStorm;
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
        Player[] players = Bukkit.getServer().getOnlinePlayers().toArray(new Player[0]);
        if (level == 1) {
            
            for (int i = 0; i < players.length; i++){
                players[ i ].sendMessage("A drizzle of Acid Rain is about to fall down upon ye terra");
            }
            Bukkit.broadcastMessage("A drizzle of Acid Rain is about to fall down upon ye terra");
            time = 3000;
            System.out.println(level);
        } else if (level == 2) {
            for (int i = 0; i < players.length; i++){
                players[ i ].sendMessage("A bit of Acid Rain is about to fall");
            }
            Bukkit.broadcastMessage("A bit of Acid Rain is about to fall");
            time = 6000;
            System.out.println(level);
        } else if (level == 3) {
            for (int i = 0; i < players.length; i++){
                players[ i ].sendMessage("An Acid Rain storm is rolling in");
            }
            Bukkit.broadcastMessage("An Acid Rain storm is rolling in");
            time = 12000;
            System.out.println(level);
        } else if (level == 4) {
            for (int i = 0; i < players.length; i++){
                players[ i ].sendMessage("A large amount of Acid Rain is about to rain down upon ye");
            }
            Bukkit.broadcastMessage("A large amount of Acid Rain is about to rain down upon ye");
            time = 18000;
            System.out.println(level);
        } else if (level == 5) {
            for (int i = 0; i < players.length; i++){
                players[ i ].sendMessage("A hurricane of an Acid Rain storm is about to occur!!!");
            }
            Bukkit.broadcastMessage("A hurricane of an Acid Rain storm is about to occur!!!");
            time = 24000;
            System.out.println(level);
        }
        world = Bukkit.getServer().getWorld("disaster");
        world.setStorm(true);
        task2 = (BukkitTask) new AcidDamage(plugin).runTaskTimer(plugin, 40, 40);
        BukkitTask task = (BukkitTask) new ChanceCount(plugin).runTaskLater(plugin, time);
        
       
    }

    public static void exposedDamage(Player player){
        if (player.getLocation().getBlockY() + 1 > player.getWorld().getHighestBlockYAt(player.getLocation())) {
            player.damage(.5);
        }
    }


    public static World getWorld() {
        return world;
    }




}