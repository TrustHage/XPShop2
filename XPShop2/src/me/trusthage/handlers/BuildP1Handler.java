/*     */ package me.trusthage.handlers;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.inventory.InventoryClickEvent;
/*     */ import org.bukkit.inventory.ItemStack;

/*     */ 
/*     */ import me.trusthage.menus.BuyMenu;
/*     */ import me.trusthage.menus.buy.building.BuildP2;
/*     */ import me.trusthage.other.Main;
/*     */ 
/*     */ public class BuildP1Handler implements org.bukkit.event.Listener
/*     */ {
/*  17 */   BuyMenu buymenu = new BuyMenu();
/*  18 */   BuildP2 buildp2 = new BuildP2();
/*     */   
/*     */   @org.bukkit.event.EventHandler
/*     */   public void onBuildP1Click(InventoryClickEvent e)
/*     */   {
/*  23 */     if (!ChatColor.stripColor(e.getInventory().getName()).equalsIgnoreCase("Building Blocks             Page: 1")) { return;
/*     */     }
/*  25 */     Player player = (Player)e.getWhoClicked();
/*  26 */     e.setCancelled(true);
/*     */     
/*  28 */     if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == Material.AIR) || (!e.getCurrentItem().hasItemMeta()) || (e.getCurrentItem().getItemMeta().getDisplayName().equals("-"))) return;
/*  29 */     Integer cfg = Integer.valueOf(Main.plugin.getConfig().getInt(e.getCurrentItem().getData().toString()));
/*  30 */     Integer lvl = Integer.valueOf(player.getLevel());
/*     */     
/*  32 */     if (player.getLevel() >= cfg.intValue())
/*  33 */       switch (e.getCurrentItem().getType()) {
/*     */       case STONE: 
/*  35 */         if (e.getCurrentItem().getData().toString().equals("STONE(1)")) {
/*  36 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  37 */           player.getInventory().addItem(new ItemStack(Material.STONE, 16, (short)(short)1));
/*  38 */         } else if (e.getCurrentItem().getData().toString().equals("STONE(2)")) {
/*  39 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  40 */           player.getInventory().addItem(new ItemStack(Material.STONE, 16, (short)(short)2));
/*  41 */         } else if (e.getCurrentItem().getData().toString().equals("STONE(3)")) {
/*  42 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  43 */           player.getInventory().addItem(new ItemStack(Material.STONE, 16, (short)3));
/*  44 */         } else if (e.getCurrentItem().getData().toString().equals("STONE(4)")) {
/*  45 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  46 */           player.getInventory().addItem(new ItemStack(Material.STONE, 16, (short)4));
/*  47 */         } else if (e.getCurrentItem().getData().toString().equals("STONE(5)")) {
/*  48 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  49 */           player.getInventory().addItem(new ItemStack(Material.STONE, 16, (short)5));
/*  50 */         } else if (e.getCurrentItem().getData().toString().equals("STONE(6)")) {
/*  51 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  52 */           player.getInventory().addItem(new ItemStack(Material.STONE, 16, (short)6));
/*     */         } else {
/*  54 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  55 */           player.getInventory().addItem(new ItemStack(Material.STONE, 16));
/*     */         }
/*  57 */         break;
/*     */       case GRASS: 
/*  59 */         player.setLevel(lvl.intValue() - cfg.intValue());
/*  60 */         player.getInventory().addItem(new ItemStack(Material.GRASS, 16));
/*  61 */         break;
/*     */       case DIRT: 
/*  63 */         if (e.getCurrentItem().getData().toString().equals("DIRT(1)")) {
/*  64 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  65 */           player.getInventory().addItem(new ItemStack(Material.DIRT, 16, (short)1));
/*  66 */         } else if (e.getCurrentItem().getData().toString().equals("DIRT(2)")) {
/*  67 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  68 */           player.getInventory().addItem(new ItemStack(Material.DIRT, 16, (short)2));
/*     */         } else {
/*  70 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  71 */           player.getInventory().addItem(new ItemStack(Material.DIRT, 16));
/*     */         }
/*  73 */         break;
/*     */       case COBBLESTONE: 
/*  75 */         player.setLevel(lvl.intValue() - cfg.intValue());
/*  76 */         player.getInventory().addItem(new ItemStack(Material.COBBLESTONE, 16));
/*  77 */         break;
/*     */       case WOOD: 
/*  79 */         if (e.getCurrentItem().getData().toString().equals("REDWOOD WOOD(1)")) {
/*  80 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  81 */           player.getInventory().addItem(new ItemStack(Material.WOOD, 16, (short)1));
/*  82 */         } else if (e.getCurrentItem().getData().toString().equals("BIRCH WOOD(2)")) {
/*  83 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  84 */           player.getInventory().addItem(new ItemStack(Material.WOOD, 16, (short)2));
/*  85 */         } else if (e.getCurrentItem().getData().toString().equals("JUNGLE WOOD(3)")) {
/*  86 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  87 */           player.getInventory().addItem(new ItemStack(Material.WOOD, 16, (short)3));
/*  88 */         } else if (e.getCurrentItem().getData().toString().equals("ACACIA WOOD(4)")) {
/*  89 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  90 */           player.getInventory().addItem(new ItemStack(Material.WOOD, 16, (short)4));
/*  91 */         } else if (e.getCurrentItem().getData().toString().equals("DARK_OAK WOOD(5)")) {
/*  92 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  93 */           player.getInventory().addItem(new ItemStack(Material.WOOD, 16, (short)5));
/*     */         } else {
/*  95 */           player.setLevel(lvl.intValue() - cfg.intValue());
/*  96 */           player.getInventory().addItem(new ItemStack(Material.WOOD, 16));
/*     */         }
/*  98 */         break;
/*     */       case SAND: 
/* 100 */         if (e.getCurrentItem().getData().toString().equals("SAND(1)")) {
/* 101 */           player.setLevel(lvl.intValue() - cfg.intValue());
/* 102 */           player.getInventory().addItem(new ItemStack(Material.SAND, 16, (short)1));
/* 103 */         } else if (e.getCurrentItem().getData().toString().equals("SAND(2)")) {
/* 104 */           player.setLevel(lvl.intValue() - cfg.intValue());
/* 105 */           player.getInventory().addItem(new ItemStack(Material.SAND, 16, (short)2));
/*     */         } else {
/* 107 */           player.setLevel(lvl.intValue() - cfg.intValue());
/* 108 */           player.getInventory().addItem(new ItemStack(Material.SAND, 16));
/*     */         }
/* 110 */         break;
/*     */       case GRAVEL: 
/* 112 */         player.setLevel(lvl.intValue() - cfg.intValue());
/* 113 */         player.getInventory().addItem(new ItemStack(Material.GRAVEL, 16));
/* 114 */         break;
/*     */       case GOLD_ORE: 
/* 116 */         player.setLevel(lvl.intValue() - cfg.intValue());
/* 117 */         player.getInventory().addItem(new ItemStack(Material.GOLD_ORE, 16));
/* 118 */         break;
/*     */       case IRON_ORE: 
/* 120 */         player.setLevel(lvl.intValue() - cfg.intValue());
/* 121 */         player.getInventory().addItem(new ItemStack(Material.IRON_ORE, 16));
/* 122 */         break;
/*     */       case COAL_ORE: 
/* 124 */         player.setLevel(lvl.intValue() - cfg.intValue());
/* 125 */         player.getInventory().addItem(new ItemStack(Material.COAL_ORE, 16));
/* 126 */         break;
/*     */       case LOG: 
/* 128 */         if (e.getCurrentItem().getData().toString().equals("REDWOOD UP REDWOOD LOG(1)")) {
/* 129 */           player.setLevel(lvl.intValue() - cfg.intValue());
/* 130 */           player.getInventory().addItem(new ItemStack(Material.LOG, 16, (short)1));
/* 131 */         } else if (e.getCurrentItem().getData().toString().equals("BIRCH UP BIRCH LOG(2)")) {
/* 132 */           player.setLevel(lvl.intValue() - cfg.intValue());
/* 133 */           player.getInventory().addItem(new ItemStack(Material.LOG, 16, (short)2));
/* 134 */         } else if (e.getCurrentItem().getData().toString().equals("JUNGLE UP JUNGLE LOG(3)")) {
/* 135 */           player.setLevel(lvl.intValue() - cfg.intValue());
/* 136 */           player.getInventory().addItem(new ItemStack(Material.LOG, 16, (short)3));
/*     */         } else {
/* 138 */           player.setLevel(lvl.intValue() - cfg.intValue());
/* 139 */           player.getInventory().addItem(new ItemStack(Material.LOG, 16));
/*     */         }
/* 141 */         break;
/*     */       case SPONGE: 
/* 143 */         if (e.getCurrentItem().getData().toString().equals("SPONGE(1)")) {
/* 144 */           player.setLevel(lvl.intValue() - cfg.intValue());
/* 145 */           player.getInventory().addItem(new ItemStack(Material.SPONGE, 16, (short)1));
/*     */         } else {
/* 147 */           player.setLevel(lvl.intValue() - cfg.intValue());
/* 148 */           player.getInventory().addItem(new ItemStack(Material.SPONGE, 16));
/*     */         }
/* 150 */         break;
/*     */       case GLASS: 
/* 152 */         player.setLevel(lvl.intValue() - cfg.intValue());
/* 153 */         player.getInventory().addItem(new ItemStack(Material.GLASS, 16));
/* 154 */         break;
/*     */       case LAPIS_ORE: 
/* 156 */         player.setLevel(lvl.intValue() - cfg.intValue());
/* 157 */         player.getInventory().addItem(new ItemStack(Material.LAPIS_ORE, 16));
/* 158 */         break;
/*     */       case LAPIS_BLOCK: 
/* 160 */         player.setLevel(lvl.intValue() - cfg.intValue());
/* 161 */         player.getInventory().addItem(new ItemStack(Material.LAPIS_BLOCK, 16));
/* 162 */         break;
/*     */       case SANDSTONE: 
/* 164 */         if (e.getCurrentItem().getData().toString().equals("SANDSTONE(1)")) {
/* 165 */           player.setLevel(lvl.intValue() - cfg.intValue());
/* 166 */           player.getInventory().addItem(new ItemStack(Material.SANDSTONE, 16, (short)1));
/* 167 */         } else if (e.getCurrentItem().getData().toString().equals("SANDSTONE(2)")) {
/* 168 */           player.setLevel(lvl.intValue() - cfg.intValue());
/* 169 */           player.getInventory().addItem(new ItemStack(Material.SANDSTONE, 16, (short)2));
/*     */         } else {
/* 171 */           player.setLevel(lvl.intValue() - cfg.intValue());
/* 172 */           player.getInventory().addItem(new ItemStack(Material.SANDSTONE, 16));
/*     */         }
/* 174 */         break;
/*     */       case ENDER_PEARL: 
/* 176 */         buildp2.openBuildBuyP2(player.getPlayer());
/* 177 */         break;
/*     */       case BARRIER: 
/* 179 */         buymenu.openBuyMenu(player.getPlayer());
/* 180 */         break;
/*     */       default: 
/* 182 */         player.closeInventory();
/* 185 */         break; 
				} else {
/* 186 */       player.sendMessage(ChatColor.RED + "You don't have enough XP to buy that.");
/*     */     }
/*     */   }
/*     */ }