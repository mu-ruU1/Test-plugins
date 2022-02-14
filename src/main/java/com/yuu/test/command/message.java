package com.yuu.test.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class message implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        //コマンドを実行した人に送信
        sender.sendMessage("[" + ChatColor.GREEN + "メッセージ01" + ChatColor.WHITE + "]");

        //サーバー全体に送信
        Bukkit.broadcastMessage("全員に送信");
        return true;
    }
}
