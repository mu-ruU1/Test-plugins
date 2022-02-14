package com.yuu.test;

import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("環境構築できた。");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
