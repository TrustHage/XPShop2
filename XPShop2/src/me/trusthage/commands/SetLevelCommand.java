/*    */ package me.trusthage.commands;
/*    */ 
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class SetLevelCommand implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
/*    */   {
/* 12 */     if (!(sender instanceof Player)) return false;
/* 13 */     Player player = (Player)sender;
/*    */     
/* 15 */     if (player.getLevel() >= 1) {
/* 16 */       player.setLevel(0);
/*    */     } else {
/* 18 */       player.setLevel(500);
/*    */     }
/*    */     
/* 21 */     return false;
/*    */   }
/*    */ }
