package zen.cantaloupe.disaster;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import java.util.concurrent.TimeUnit;
public final class naturalDisaster extends JavaPlugin {

    @Override
    public void onEnable() {


        getServer().getPluginManager().registerEvents(new AcidRain(this), this);

            AcidRain storm = new AcidRain(this);
            BukkitTask timer = (BukkitTask) new StormStarter(this, storm).runTaskTimer(this, 0, 24500);
            this.getCommand("startacid").setExecutor(new StartCommand(this));
            this.getCommand("endacid").setExecutor(new EndCommand(this));

    }

}
