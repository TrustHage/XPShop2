/*    */ package me.trusthage.menus;
/*    */ 
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.Inventory;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ public class BuyMenu
/*    */ {
/*    */   public void openBuyMenu(Player player)
/*    */   {
/* 15 */     Inventory buymenu = Bukkit.createInventory(null, 36, "Buy Menu");
/*    */     
/* 17 */     ItemStack building = new ItemStack(Material.BRICK);
/* 18 */     ItemMeta buildingMeta = building.getItemMeta();
/* 19 */     ItemStack decoration = new ItemStack(Material.DOUBLE_PLANT, 1, (short)5);
/* 20 */     ItemMeta decorationMeta = decoration.getItemMeta();
/* 21 */     ItemStack redstone = new ItemStack(Material.REDSTONE);
/* 22 */     ItemMeta redstoneMeta = redstone.getItemMeta();
/* 23 */     ItemStack transport = new ItemStack(Material.POWERED_RAIL);
/* 24 */     ItemMeta transportMeta = transport.getItemMeta();
/* 25 */     ItemStack misc = new ItemStack(Material.LAVA_BUCKET);
/* 26 */     ItemMeta miscMeta = misc.getItemMeta();
/* 27 */     ItemStack food = new ItemStack(Material.APPLE);
/* 28 */     ItemMeta foodMeta = food.getItemMeta();
/* 29 */     ItemStack tools = new ItemStack(Material.IRON_AXE);
/* 30 */     ItemMeta toolsMeta = tools.getItemMeta();
/* 31 */     ItemStack combat = new ItemStack(Material.GOLD_SWORD);
/* 32 */     ItemMeta combatMeta = combat.getItemMeta();
/* 33 */     ItemStack brewing = new ItemStack(Material.POTION, 1, (short)0);
/* 34 */     ItemMeta brewingMeta = brewing.getItemMeta();
/* 35 */     ItemStack materials = new ItemStack(Material.STICK);
/* 36 */     ItemMeta materialsMeta = materials.getItemMeta();
/* 37 */     ItemStack back = new ItemStack(Material.BARRIER);
/* 38 */     ItemMeta backMeta = back.getItemMeta();
/*    */     
/* 40 */     buildingMeta.setDisplayName("Building Blocks");
/* 41 */     building.setItemMeta(buildingMeta);
/*    */     
/* 43 */     decorationMeta.setDisplayName("Decoration Blocks");
/* 44 */     decoration.setItemMeta(decorationMeta);
/*    */     
/* 46 */     redstoneMeta.setDisplayName("Redstone");
/* 47 */     redstone.setItemMeta(redstoneMeta);
/*    */     
/* 49 */     transportMeta.setDisplayName("Transportation");
/* 50 */     transport.setItemMeta(transportMeta);
/*    */     
/* 52 */     miscMeta.setDisplayName("Miscellaneous");
/* 53 */     misc.setItemMeta(miscMeta);
/*    */     
/* 55 */     foodMeta.setDisplayName("Foodstuffs");
/* 56 */     food.setItemMeta(foodMeta);
/*    */     
/* 58 */     toolsMeta.setDisplayName("Tools");
/* 59 */     tools.setItemMeta(toolsMeta);
/*    */     
/* 61 */     combatMeta.setDisplayName("Combat");
/* 62 */     combat.setItemMeta(combatMeta);
/*    */     
/* 64 */     brewingMeta.setDisplayName("Brewing");
/* 65 */     brewing.setItemMeta(brewingMeta);
/*    */     
/* 67 */     materialsMeta.setDisplayName("Materials");
/* 68 */     materials.setItemMeta(materialsMeta);
/*    */     
/* 70 */     backMeta.setDisplayName(ChatColor.RED + "Back");
/* 71 */     back.setItemMeta(backMeta);
/*    */     
/* 73 */     buymenu.setItem(31, back);
/*    */     
/* 75 */     buymenu.setItem(2, building);
/* 76 */     buymenu.setItem(3, decoration);
/* 77 */     buymenu.setItem(4, redstone);
/* 78 */     buymenu.setItem(5, transport);
/* 79 */     buymenu.setItem(6, misc);
/*    */     
/* 81 */     buymenu.setItem(11, food);
/* 82 */     buymenu.setItem(12, tools);
/* 83 */     buymenu.setItem(13, combat);
/* 84 */     buymenu.setItem(14, brewing);
/* 85 */     buymenu.setItem(15, materials);
/*    */     
/* 87 */     player.openInventory(buymenu);
/*    */   }
/*    */ }