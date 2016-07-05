/*    */ package me.trusthage.commands;
/*    */ 
/*    */ import net.md_5.bungee.api.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class XPShopCommand
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
/*    */   {
/* 14 */     if (!(sender instanceof Player)) return false;
/* 15 */     Player player = (Player)sender;
/*    */     
/* 17 */     if (!player.hasPermission("trusthage.xpshop"))
/*    */     {
/*    */ 
/* 20 */       player.sendMessage(ChatColor.RED + "You don't have access to that command.");
/*    */     }
/*    */     
/* 23 */     return false;
/*    */   }
/*    */ }