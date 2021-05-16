package zen.cantaloupe.disaster;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.TimeUnit;
public final class naturalDisaster extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Hello World!");
        getServer().getPluginManager().registerEvents(new AcidRain(), this);
        try {
            AcidRain.canAcid();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

 throws InterruptedException 
    });
        System.out.println("IT WORKSSSSS LES GOOOO"
bolean t = true;
        while ( t = tue){
    @Ove    TimeUnit.SECONDr.sleep(3);
            Sride
        }
    public void onDisable() {
        // Plugin shutdown logic
    }
}
