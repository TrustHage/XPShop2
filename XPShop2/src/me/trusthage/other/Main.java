package me.trusthage.other;
 
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.trusthage.commands.SetLevelCommand;
import me.trusthage.handlers.BuildP1Handler;
import me.trusthage.handlers.BuildP2Handler;
import me.trusthage.handlers.BuildP3Handler;
import me.trusthage.handlers.BuildP4Handler;
import me.trusthage.handlers.BuildP5Handler;
import me.trusthage.handlers.DecorP1Handler;
import me.trusthage.handlers.DecorP2Handler;
import me.trusthage.handlers.DecorP3Handler;
import me.trusthage.handlers.DecorP4Handler;
import me.trusthage.handlers.XPMenuHandler;
import me.trusthage.menus.MainMenu;
 
public class Main extends JavaPlugin
	{
	public static int startCountdownId = 0;
	public static Main plugin;
	Logger logger = Logger.getLogger("Minecraft");
	ConsoleFilter filter = new ConsoleFilter();
	
	public void onEnable()
	{
		plugin = this;
		getServer().getLogger().setFilter(filter);
		this.logger.info("XPShop has been enabled.");
		getCommand("xpshop").setExecutor(new MainMenu());
		getCommand("setlevel").setExecutor(new SetLevelCommand());
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
		AutoSaveStart();
   
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new XPMenuHandler(), this);
		pm.registerEvents(new BuildP1Handler(), this);
		pm.registerEvents(new BuildP2Handler(), this);
		pm.registerEvents(new BuildP3Handler(), this);
		pm.registerEvents(new BuildP4Handler(), this);
		pm.registerEvents(new BuildP5Handler(), this);
		pm.registerEvents(new DecorP1Handler(), this);
		pm.registerEvents(new DecorP2Handler(), this);
		pm.registerEvents(new DecorP3Handler(), this);
		pm.registerEvents(new DecorP4Handler(), this);
		
	}
   
	public void onDisable()
	{
		saveDefaultConfig();
		this.logger.info("XPShop has been disabled.");
		AutoSaveStop();
	}
	
	@SuppressWarnings("deprecation")
	public void AutoSaveStart(){
		Bukkit.broadcastMessage("AAN!");
		AutoSave.timeLeft = getConfig().getInt("AutoSave Time");
		startCountdownId = getServer().getScheduler().scheduleSyncRepeatingTask(this, new AutoSave(this), 20L, 20L);
	}
	
	public  void AutoSaveStop(){
		getServer().getScheduler().cancelTask(startCountdownId);
	}
	
	public  void AutoSaveReload(){
		AutoSaveStop();
		AutoSaveStart();
	}
}