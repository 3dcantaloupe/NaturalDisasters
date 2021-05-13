package zen.cantaloupe.sampletesting;

import org.bukkit.plugin.java.JavaPlugin;

public final class SampleTesting extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Hello World!");

        getServer().getPluginManager().registerEvents(new BreakBlock(), this);  // if not in this class, use main
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
