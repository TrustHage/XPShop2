/*    */ package me.trusthage.menus.buy.building;
/*    */ 
/*    */ import net.md_5.bungee.api.ChatColor;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.Inventory;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ 
/*    */ public class BuildP5
/*    */ {
/*    */   public void openBuildBuyP5(Player player)
/*    */   {
/* 16 */     Inventory buildp5 = Bukkit.createInventory(null, 54, "Building Blocks             Page: 5");
/*    */     
/* 18 */     ItemStack back = new ItemStack(Material.BARRIER);
/* 19 */     ItemMeta backMeta = back.getItemMeta();
/* 20 */     ItemStack previouspage = new ItemStack(Material.ENDER_PEARL);
/* 21 */     ItemMeta previouspageMeta = previouspage.getItemMeta();
/*    */     
/* 23 */     backMeta.setDisplayName(ChatColor.RED + "Back");
/* 24 */     back.setItemMeta(backMeta);
/* 25 */     previouspageMeta.setDisplayName("Previous Page");
/* 26 */     previouspage.setItemMeta(previouspageMeta);
/*    */     
/* 28 */     buildp5.setItem(45, previouspage);
/* 29 */     buildp5.setItem(49, back);
/*    */     
/* 31 */     ItemStack line = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
/* 32 */     ItemMeta lineMeta = line.getItemMeta();
/* 33 */     lineMeta.setDisplayName("-");
/* 34 */     line.setItemMeta(lineMeta);buildp5.setItem(36, line);
/* 35 */     buildp5.setItem(37, line);
/* 36 */     buildp5.setItem(38, line);
/* 37 */     buildp5.setItem(39, line);
/* 38 */     buildp5.setItem(40, line);
/* 39 */     buildp5.setItem(41, line);
/* 40 */     buildp5.setItem(42, line);
/* 41 */     buildp5.setItem(43, line);
/* 42 */     buildp5.setItem(44, line);
/*    */     
/* 44 */     player.openInventory(buildp5);
/*    */   }
/*    */ }


/* Location:              G:\Java Projects\XPShop.jar!\me\trusthage\menus\buy\building\BuildP5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */