/*    */ package me.trusthage.handlers;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.inventory.InventoryClickEvent;

import me.trusthage.menus.BuyMenu;
/*    */ import me.trusthage.menus.buy.building.BuildP4;
/*    */ import me.trusthage.other.Main;
/*    */ 
/*    */ public class BuildP5Handler implements org.bukkit.event.Listener
/*    */ {
/* 16 */   BuildP4 buildp4 = new BuildP4();
/* 17 */   BuyMenu buymenu = new BuyMenu();
/*    */   
/*    */   @org.bukkit.event.EventHandler
/*    */   public void onBuildP2Blick(InventoryClickEvent e)
/*    */   {
/* 22 */     if (!ChatColor.stripColor(e.getInventory().getName()).equalsIgnoreCase("Building Blocks             Page: 5")) { return;
/*    */     }
/* 24 */     Player player = (Player)e.getWhoClicked();
/* 25 */     e.setCancelled(true);
/*    */     
/* 27 */     if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == Material.AIR) || (!e.getCurrentItem().hasItemMeta()) || (e.getCurrentItem().getItemMeta().getDisplayName().equals("-"))) return;
/* 28 */     Integer cfg = Integer.valueOf(Main.plugin.getConfig().getInt(e.getCurrentItem().getData().toString()));
/*    */     
/*    */ 
/* 31 */     if (player.getLevel() >= cfg.intValue())
/* 32 */       switch (e.getCurrentItem().getType()) {
/*    */       case ENDER_PEARL: 
/* 34 */         this.buildp4.openBuildBuyP4(player.getPlayer());
/* 35 */         break;
/*    */       case BARRIER: 
/* 37 */         buymenu.openBuyMenu(player.getPlayer());
/* 38 */         break;
/*    */       default: 
/* 40 */         player.closeInventory();
/*    */         
/*    */ 
/* 43 */         break; } else {
/* 44 */       player.sendMessage(ChatColor.RED + "You don't have enough XP to buy that.");
/*    */     }
/*    */   }
/*    */ }