package com.yuu.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

public class Timer {

    public static int count = 10;
    public static int countA = 0;

    public static void countdown() {
        BukkitRunnable task = new BukkitRunnable() {
            public void run() {

                Bukkit.broadcastMessage("現在 " + count + "秒");
                if (count == 0) {
                    Bukkit.broadcastMessage("--カウントダウンが終了しました--");
                    count = 11;
                    this.cancel();
                }

                count--;
            }
        };
        task.runTaskTimer(Test.getPlugin(), 0L, 20L);
    }

    public static void countup() {
        BukkitRunnable task = new BukkitRunnable() {
            public void run() {

                if (countA == 0) {
                    Bukkit.broadcastMessage(ChatColor.YELLOW + "カウントアップスタート!!");
                } else {
                    Bukkit.broadcastMessage("現在 " + countA + "秒");
                }
                countA++;
                if (countA == 11) {
                    this.cancel();
                }
            }
        };
        task.runTaskTimer(Test.getPlugin(), 0L, 20L);
    }
}
