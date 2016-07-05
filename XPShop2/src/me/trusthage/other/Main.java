/*    */ package me.trusthage.other;
/*    */ 
/*    */ import java.util.logging.Logger;

/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.plugin.PluginManager;
/*    */ import org.bukkit.plugin.java.JavaPlugin;

/*    */ import me.trusthage.commands.SetLevelCommand;
/*    */ import me.trusthage.handlers.BuildP1Handler;
/*    */ import me.trusthage.handlers.BuildP4Handler;
/*    */ import me.trusthage.handlers.BuildP5Handler;
/*    */ import me.trusthage.handlers.XPMenuHandler;
/*    */ import me.trusthage.menus.MainMenu;
/*    */ 
/*    */ public class Main extends JavaPlugin
/*    */ {
/*    */   public static Main plugin;
/* 21 */   Logger logger = Logger.getLogger("Minecraft");
/*    */   
/*    */   public void onEnable()
/*    */   {
/* 25 */     plugin = this;
/* 26 */     this.logger.info("XPShop has been enabled.");
/* 27 */     getCommand("xpshop").setExecutor(new MainMenu());
/* 28 */     getCommand("setlevel").setExecutor(new SetLevelCommand());
/* 29 */     getConfig().options().copyDefaults(true);
/* 30 */     saveDefaultConfig();
/*    */     
/* 32 */     PluginManager pm = Bukkit.getServer().getPluginManager();
/* 33 */     pm.registerEvents(new XPMenuHandler(), this);
/* 34 */     pm.registerEvents(new BuildP1Handler(), this);
/* 35 */     pm.registerEvents(new me.trusthage.handlers.BuildP2Handler(), this);
/* 36 */     pm.registerEvents(new me.trusthage.handlers.BuildP3Handler(), this);
/* 37 */     pm.registerEvents(new BuildP4Handler(), this);
/* 38 */     pm.registerEvents(new BuildP5Handler(), this);
/*    */   }
/*    */   
/*    */   public void onDisable()
/*    */   {
/* 43 */     saveDefaultConfig();
/* 44 */     this.logger.info("XPShop has been disabled.");
/*    */   }
/*    */ }