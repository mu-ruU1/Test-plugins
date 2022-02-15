package com.yuu.test.command;

import com.yuu.test.Test;
import com.yuu.test.Timer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class countup implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        //権限設定
        if (sender.hasPermission("TestPlugin.command.countup") || sender.isOp()) {
            Timer.countup();
        } else {
            sender.sendMessage(Test.noPermittion);
        }

        return true;
    }
}
