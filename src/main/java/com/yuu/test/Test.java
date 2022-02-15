package com.yuu.test;

import com.yuu.test.command.countdown;
import com.yuu.test.command.countup;
import com.yuu.test.command.message;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    private static JavaPlugin plugin;

    public static String noPermittion = ChatColor.RED + "＠あなたに実行する権限はありません";

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("プラグインが動いてます");

        plugin = this;

        getCommand("message").setExecutor(new message());
        getCommand("countdown").setExecutor(new countdown());
        getCommand("countup").setExecutor(new countup());

        super.onEnable();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
    }

    public static JavaPlugin getPlugin() {
        return plugin;
    }
}
