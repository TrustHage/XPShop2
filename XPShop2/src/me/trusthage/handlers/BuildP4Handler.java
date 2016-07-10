/*    */ package me.trusthage.handlers;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.inventory.InventoryClickEvent;

import me.trusthage.menus.BuyMenu;
/*    */ import me.trusthage.menus.buy.building.BuildP3;
/*    */ import me.trusthage.menus.buy.building.BuildP5;
/*    */ import me.trusthage.other.Main;
/*    */ 
/*    */ public class BuildP4Handler implements org.bukkit.event.Listener
/*    */ {
/* 17 */   BuildP3 buildp3 = new BuildP3();
/* 18 */   BuildP5 buildp5 = new BuildP5();
/* 19 */   BuyMenu buymenu = new BuyMenu();
/*    */   
/*    */   @org.bukkit.event.EventHandler
/*    */   public void onBuildP4Blick(InventoryClickEvent e)
/*    */   {
/* 24 */     if (!ChatColor.stripColor(e.getInventory().getName()).equalsIgnoreCase("Building Blocks             Page: 4")) { return;
/*    */     }
/* 26 */     Player player = (Player)e.getWhoClicked();
/* 27 */     e.setCancelled(true);
/*    */     
/* 29 */     if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == Material.AIR) || (!e.getCurrentItem().hasItemMeta()) || (e.getCurrentItem().getItemMeta().getDisplayName().equals("-"))) return;
/* 30 */     Integer cfg = Integer.valueOf(Main.plugin.getConfig().getInt(e.getCurrentItem().getData().toString()));
/*    */     
/*    */ 
/* 33 */     if (player.getLevel() >= cfg.intValue())
/* 34 */       switch (e.getCurrentItem().getType()) {
/*    */       case ENDER_PEARL: 
/* 36 */         if (e.getCurrentItem().getItemMeta().getDisplayName().equals("Next Page")) {
/* 37 */           this.buildp5.openBuildBuyP5(player.getPlayer());
/*    */         } else {
/* 39 */           this.buildp3.openBuildBuyP3(player.getPlayer());
/*    */         }
/* 41 */         break;
/*    */       case BARRIER: 
/* 43 */         buymenu.openBuyMenu(player.getPlayer());
/* 44 */         break;
/*    */       default: 
/* 46 */         player.closeInventory();
/*    */         
/*    */ 
/* 49 */         break; } else {
/* 50 */       player.sendMessage(ChatColor.RED + "You don't have enough XP to buy that.");
/*    */     }
/*    */   }
/*    */ }