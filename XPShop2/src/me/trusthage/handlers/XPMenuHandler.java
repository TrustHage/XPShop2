/*    */ package me.trusthage.handlers;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.inventory.InventoryClickEvent;

/*    */ 
/*    */ import me.trusthage.menus.BuyMenu;
/*    */ import me.trusthage.menus.MainMenu;
/*    */ import me.trusthage.menus.buy.BDiamond;
/*    */ import me.trusthage.menus.buy.BGold;
/*    */ import me.trusthage.menus.buy.building.BuildP1;
/*    */ import me.trusthage.menus.sell.SDiamond;
/*    */ import me.trusthage.menus.sell.SGold;
/*    */ import me.trusthage.other.Main;
/*    */ 
/*    */ public class XPMenuHandler implements org.bukkit.event.Listener
/*    */ {
/* 21 */   MainMenu mainmenu = new MainMenu();
/* 22 */   BuyMenu buymenu = new BuyMenu();
/* 23 */   BDiamond buydiamond = new BDiamond();
/* 24 */   SDiamond selldiamond = new SDiamond();
/* 25 */   BGold buygold = new BGold();
/* 26 */   SGold sellgold = new SGold();
/* 27 */   BuildP1 buildp1 = new BuildP1();
/*    */   
/* 29 */   org.bukkit.configuration.file.FileConfiguration config = Main.plugin.getConfig();
/*    */   
/*    */ 
/*    */   @EventHandler
/*    */   public void onXPShopClick(InventoryClickEvent e)
/*    */   {
/* 35 */     if (!ChatColor.stripColor(e.getInventory().getName()).equalsIgnoreCase("XPShop Main Menu")) { return;
/*    */     }
/* 37 */     Player player = (Player)e.getWhoClicked();
/* 38 */     e.setCancelled(true);
/*    */     
/* 40 */     if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == Material.AIR) || (!e.getCurrentItem().hasItemMeta())) { return;
/*    */     }
/* 42 */     switch (e.getCurrentItem().getType()) {
/*    */     case BOOK: 
/* 44 */       this.buymenu.openBuyMenu(player.getPlayer());
/* 45 */       break;
/*    */     default: 
/* 47 */       player.closeInventory();
/*    */     }
/*    */     
/*    */   }
/*    */   
/*    */ 
/*    */   @EventHandler
/*    */   public void onBuyMenuClick(InventoryClickEvent e)
/*    */   {
/* 56 */     if (!ChatColor.stripColor(e.getInventory().getName()).equalsIgnoreCase("Buy Menu")) { return;
/*    */     }
/* 58 */     Player player = (Player)e.getWhoClicked();
/* 59 */     e.setCancelled(true);
/*    */     
/* 61 */     if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == Material.AIR) || (!e.getCurrentItem().hasItemMeta())) { return;
/*    */     }
/* 63 */     switch (e.getCurrentItem().getType()) {
/*    */     case BRICK: 
/* 65 */       buildp1.openBuildBuyP1(player.getPlayer());
/* 66 */       break;
/*    */     case LAVA_BUCKET: 
/* 68 */       this.buygold.openGoldBuyMenu(player.getPlayer());
/* 69 */       break;
/*    */     case GOLD_BARDING: 
/* 71 */       this.mainmenu.openGUI(player.getPlayer());
/* 72 */       break;
/*    */     default: 
/* 74 */       player.closeInventory();
/*    */     }
/*    */   }
/*    */ }