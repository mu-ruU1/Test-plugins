package com.yuu.test.command;

import com.yuu.test.Test;
import com.yuu.test.Timer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class countdown implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender.hasPermission("TestPlugin.command.countdown") || sender.isOp()) {
            Timer.countdown();
        } else {
            sender.sendMessage(Test.noPermittion);
        }

        return true;
    }
}
