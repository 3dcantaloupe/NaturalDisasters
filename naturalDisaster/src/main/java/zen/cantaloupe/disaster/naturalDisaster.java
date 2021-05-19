package zen.cantaloupe.disaster;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.TimeUnit;
public final class naturalDisaster extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Hello World!");
        getServer().getPluginManager().registerEvents(new AcidRain(), this);
        try {
            AcidRain storm = new AcidRain();
            storm.canAcid();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
        public void onDisable() {
            // Plugin shutdown logic
        }

}
