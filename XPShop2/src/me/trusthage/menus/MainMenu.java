/*    */ package me.trusthage.menus;
/*    */ 
/*    */ import java.util.ArrayList;

/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.Inventory;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ public class MainMenu
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
/*    */   {
/* 20 */     if (!(sender instanceof Player)) return false;
/* 21 */     Player player = (Player)sender;
/*    */     
/* 23 */     if (player.hasPermission("trusthage.xpshop")) {
/* 24 */       openGUI(player.getPlayer());
/*    */     }
/*    */     
/* 27 */     return false;
/*    */   }
/*    */   
/*    */ 
/*    */   public void openGUI(Player player)
/*    */   {
/* 33 */     ArrayList<String> lore = new ArrayList<String>();
/*    */     
/* 35 */     Inventory mainmenu = Bukkit.createInventory(null, 9, "XPShop Main Menu");
/*    */     
/* 37 */     ItemStack buy = new ItemStack(Material.BOOK);
/* 38 */     ItemMeta buyMeta = buy.getItemMeta();
/* 39 */     lore.add(String.format("%sBuy items with your XP", new Object[] { ChatColor.AQUA }));
/* 40 */     buyMeta.setLore(lore);
/*    */     
/* 42 */     buyMeta.setDisplayName(ChatColor.RED + "Buy with XP");
/* 43 */     buy.setItemMeta(buyMeta);
/*    */     
/* 45 */     mainmenu.setItem(1, buy);
/*    */     
/* 47 */     player.openInventory(mainmenu);
/*    */   }
/*    */ }