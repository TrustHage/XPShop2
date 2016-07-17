package me.trusthage.other;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class AutoSave extends BukkitRunnable{
	
	public static int timeLeft;
	Main plugin;
	
	public AutoSave(Main pl){
		plugin = pl;
	}
	
	String message = Main.plugin.getConfig().getString("AutoSave Message");
	
	public void run(){
		if(timeLeft == 0 ){
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "save-all");
			Bukkit.broadcastMessage(message);
			
			Main.plugin.AutoSaveReload();
			
		}
		timeLeft -= 1;
	}

}
