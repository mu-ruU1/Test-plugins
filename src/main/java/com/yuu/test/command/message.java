package com.yuu.test.command;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class message implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (args[0].equalsIgnoreCase("1")) {
            sender.sendMessage("サブコマンド1");
        } else if (args[0].equalsIgnoreCase("2")) {
            sender.sendMessage("サブコマンド2");
        } else if (args[0].equalsIgnoreCase("3")) {
            sender.sendMessage("サブコマンド3");
        } else {
            sender.sendMessage("サブコマンドは1,2,3しかありません");
        }


//        //コマンドを実行した人に送信
//        sender.sendMessage("[" + ChatColor.GREEN + "メッセージ01" + ChatColor.WHITE + "]");
//
//        //サーバー全体に送信
//        Bukkit.broadcastMessage("全員に送信");
        return true;
    }
}
