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
/*    */ public class BuildP3
/*    */ {
/*    */   public void openBuildBuyP3(Player player)
/*    */   {
/* 16 */     Inventory buildp3 = Bukkit.createInventory(null, 54, "Building Blocks             Page: 3");
/*    */     
/* 18 */     ItemStack back = new ItemStack(Material.BARRIER);
/* 19 */     ItemMeta backMeta = back.getItemMeta();
/* 20 */     ItemStack nextpage = new ItemStack(Material.ENDER_PEARL);
/* 21 */     ItemMeta nextpageMeta = nextpage.getItemMeta();
/* 22 */     ItemStack previouspage = new ItemStack(Material.ENDER_PEARL);
/* 23 */     ItemMeta previouspageMeta = previouspage.getItemMeta();
/*    */     
/* 25 */     backMeta.setDisplayName(ChatColor.RED + "Back");
/* 26 */     back.setItemMeta(backMeta);
/* 27 */     nextpageMeta.setDisplayName("Next Page");
/* 28 */     nextpage.setItemMeta(nextpageMeta);
/* 29 */     previouspageMeta.setDisplayName("Previous Page");
/* 30 */     previouspage.setItemMeta(previouspageMeta);
/*    */     
/* 32 */     buildp3.setItem(45, previouspage);
/* 33 */     buildp3.setItem(49, back);
/* 34 */     buildp3.setItem(53, nextpage);
/*    */     
/* 36 */     ItemStack line = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
/* 37 */     ItemMeta lineMeta = line.getItemMeta();
/* 38 */     lineMeta.setDisplayName("-");
/* 39 */     line.setItemMeta(lineMeta);buildp3.setItem(36, line);
/* 40 */     buildp3.setItem(37, line);
/* 41 */     buildp3.setItem(38, line);
/* 42 */     buildp3.setItem(39, line);
/* 43 */     buildp3.setItem(40, line);
/* 44 */     buildp3.setItem(41, line);
/* 45 */     buildp3.setItem(42, line);
/* 46 */     buildp3.setItem(43, line);
/* 47 */     buildp3.setItem(44, line);
/*    */     
/* 49 */     player.openInventory(buildp3);
/*    */   }
/*    */ }


/* Location:              G:\Java Projects\XPShop.jar!\me\trusthage\menus\buy\building\BuildP3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */