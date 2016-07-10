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
	public static Main plugin;
	Logger logger = Logger.getLogger("Minecraft");
   
	public void onEnable()
	{
		plugin = this;
		this.logger.info("XPShop has been enabled.");
		getCommand("xpshop").setExecutor(new MainMenu());
		getCommand("setlevel").setExecutor(new SetLevelCommand());
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
   
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
	}
}