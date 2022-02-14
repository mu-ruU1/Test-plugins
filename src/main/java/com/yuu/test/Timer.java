package com.yuu.test;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class Timer {

    public static  int count = 10;

    public static void countdown(){
        BukkitRunnable task = new BukkitRunnable() {
            public void run() {

                Bukkit.broadcastMessage("現在" + count + "秒");
                if (count == 0){
                    Bukkit.broadcastMessage("カウントダウンが終了しました");
                    this.cancel();
                }

                count --;
            }
        };
        task.runTaskTimer(Test.getPlugin(),0L,20L);
    }
}
