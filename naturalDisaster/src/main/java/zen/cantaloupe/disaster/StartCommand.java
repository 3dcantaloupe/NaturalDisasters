package zen.cantaloupe.disaster;

import java.lang.Math;

import jdk.jfr.internal.Utils;
import jdk.jfr.internal.tool.Main;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import java.util.concurrent.TimeUnit;
import org.bukkit.World;
//import org.bukkit.event.weather;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

public class StartCommand implements CommandExecutor {
    private naturalDisaster plugin;
    public StartCommand(naturalDisaster p){
        plugin = p;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.isOp()){
                AcidRain storm = new AcidRain(plugin);
                if (args[0] != null){
                    storm.startStormCommand(Integer.valueOf(args[0]));
                    return true;
                }
                else{
                    player.sendMessage("Please input the number of seconds the storm will last");
                    return false;
                }


            }
            else{
                player.sendMessage("Please be an OP");
                return false;
            }

        }
        return false;
    }
}