package com.yuu.test;

import com.yuu.test.command.message;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("プラグインが動いてます");
        super.onEnable();

        getCommand("message").setExecutor(new message());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
    }
    public static JavaPlugin getPlugin(){
        return plugin;
    }
}
