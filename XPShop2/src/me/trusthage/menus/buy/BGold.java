/*     */ package me.trusthage.menus.buy;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.inventory.Inventory;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ 
/*     */ public class BGold
/*     */ {
/*     */   public void openGoldBuyMenu(Player player)
/*     */   {
/*  17 */     ArrayList<String> glore = new ArrayList<String>();
/*  18 */     ArrayList<String> glore1 = new ArrayList<String>();
/*  19 */     ArrayList<String> glore2 = new ArrayList<String>();
/*  20 */     ArrayList<String> glore3 = new ArrayList<String>();
/*  21 */     ArrayList<String> glore4 = new ArrayList<String>();
/*  22 */     ArrayList<String> glore5 = new ArrayList<String>();
/*  23 */     ArrayList<String> glore6 = new ArrayList<String>();
/*  24 */     ArrayList<String> glore7 = new ArrayList<String>();
/*  25 */     ArrayList<String> glore8 = new ArrayList<String>();
/*  26 */     ArrayList<String> glore9 = new ArrayList<String>();
/*  27 */     ArrayList<String> glore10 = new ArrayList<String>();
/*  28 */     ArrayList<String> glore11 = new ArrayList<String>();
/*  29 */     ArrayList<String> glore12 = new ArrayList<String>();
/*  30 */     ArrayList<String> glore13 = new ArrayList<String>();
/*  31 */     ArrayList<String> glore14 = new ArrayList<String>();
/*  32 */     ArrayList<String> glore15 = new ArrayList<String>();
/*     */     
/*  34 */     Inventory buymenu = Bukkit.createInventory(null, 27, ChatColor.GOLD + "Gold Buy Menu");
/*     */     
/*  36 */     ItemStack gold4 = new ItemStack(Material.GOLD_INGOT, 4);
/*  37 */     ItemMeta gold4Meta = gold4.getItemMeta();
/*  38 */     glore.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  40 */     ItemStack gold8 = new ItemStack(Material.GOLD_INGOT, 8);
/*  41 */     ItemMeta gold8Meta = gold8.getItemMeta();
/*  42 */     glore1.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  44 */     ItemStack gold12 = new ItemStack(Material.GOLD_INGOT, 12);
/*  45 */     ItemMeta gold12Meta = gold12.getItemMeta();
/*  46 */     glore2.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  48 */     ItemStack gold16 = new ItemStack(Material.GOLD_INGOT, 16);
/*  49 */     ItemMeta gold16Meta = gold16.getItemMeta();
/*  50 */     glore3.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  52 */     ItemStack gold20 = new ItemStack(Material.GOLD_INGOT, 20);
/*  53 */     ItemMeta gold20Meta = gold20.getItemMeta();
/*  54 */     glore4.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  56 */     ItemStack gold24 = new ItemStack(Material.GOLD_INGOT, 24);
/*  57 */     ItemMeta gold24Meta = gold24.getItemMeta();
/*  58 */     glore5.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  60 */     ItemStack gold28 = new ItemStack(Material.GOLD_INGOT, 28);
/*  61 */     ItemMeta gold28Meta = gold28.getItemMeta();
/*  62 */     glore6.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  64 */     ItemStack gold32 = new ItemStack(Material.GOLD_INGOT, 32);
/*  65 */     ItemMeta gold32Meta = gold32.getItemMeta();
/*  66 */     glore7.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  68 */     ItemStack gold36 = new ItemStack(Material.GOLD_INGOT, 36);
/*  69 */     ItemMeta gold36Meta = gold36.getItemMeta();
/*  70 */     glore8.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  72 */     ItemStack gold40 = new ItemStack(Material.GOLD_INGOT, 40);
/*  73 */     ItemMeta gold40Meta = gold40.getItemMeta();
/*  74 */     glore9.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  76 */     ItemStack gold44 = new ItemStack(Material.GOLD_INGOT, 44);
/*  77 */     ItemMeta gold44Meta = gold44.getItemMeta();
/*  78 */     glore10.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  80 */     ItemStack gold48 = new ItemStack(Material.GOLD_INGOT, 48);
/*  81 */     ItemMeta gold48Meta = gold48.getItemMeta();
/*  82 */     glore11.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  84 */     ItemStack gold52 = new ItemStack(Material.GOLD_INGOT, 52);
/*  85 */     ItemMeta gold52Meta = gold52.getItemMeta();
/*  86 */     glore12.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  88 */     ItemStack gold56 = new ItemStack(Material.GOLD_INGOT, 56);
/*  89 */     ItemMeta gold56Meta = gold56.getItemMeta();
/*  90 */     glore13.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  92 */     ItemStack gold60 = new ItemStack(Material.GOLD_INGOT, 60);
/*  93 */     ItemMeta gold60Meta = gold60.getItemMeta();
/*  94 */     glore14.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  96 */     ItemStack gold64 = new ItemStack(Material.GOLD_INGOT, 64);
/*  97 */     ItemMeta gold64Meta = gold64.getItemMeta();
/*  98 */     glore15.add(ChatColor.RED + "Cost: XP");
/*     */     
/* 100 */     ItemStack back = new ItemStack(Material.LAVA_BUCKET, 1);
/* 101 */     ItemMeta backMeta = back.getItemMeta();
/*     */     
/* 103 */     gold4Meta.setLore(glore);
/* 104 */     gold8Meta.setLore(glore1);
/* 105 */     gold12Meta.setLore(glore2);
/* 106 */     gold16Meta.setLore(glore3);
/* 107 */     gold20Meta.setLore(glore4);
/* 108 */     gold24Meta.setLore(glore5);
/* 109 */     gold28Meta.setLore(glore6);
/* 110 */     gold32Meta.setLore(glore7);
/* 111 */     gold36Meta.setLore(glore8);
/* 112 */     gold40Meta.setLore(glore9);
/* 113 */     gold44Meta.setLore(glore10);
/* 114 */     gold48Meta.setLore(glore11);
/* 115 */     gold52Meta.setLore(glore12);
/* 116 */     gold56Meta.setLore(glore13);
/* 117 */     gold60Meta.setLore(glore14);
/* 118 */     gold64Meta.setLore(glore15);
/*     */     
/* 120 */     gold4Meta.setDisplayName(String.format("%sGold Ingot %sx4", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 121 */     gold4.setItemMeta(gold4Meta);
/*     */     
/* 123 */     gold8Meta.setDisplayName(String.format("%sGold Ingot %sx8", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 124 */     gold8.setItemMeta(gold8Meta);
/*     */     
/* 126 */     gold12Meta.setDisplayName(String.format("%sGold Ingot %sx12", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 127 */     gold12.setItemMeta(gold12Meta);
/*     */     
/* 129 */     gold16Meta.setDisplayName(String.format("%sGold Ingot %sx16", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 130 */     gold16.setItemMeta(gold16Meta);
/*     */     
/* 132 */     gold20Meta.setDisplayName(String.format("%sGold Ingot %sx20", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 133 */     gold20.setItemMeta(gold20Meta);
/*     */     
/* 135 */     gold24Meta.setDisplayName(String.format("%sGold Ingot %sx24", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 136 */     gold24.setItemMeta(gold24Meta);
/*     */     
/* 138 */     gold28Meta.setDisplayName(String.format("%sGold Ingot %sx28", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 139 */     gold28.setItemMeta(gold28Meta);
/*     */     
/* 141 */     gold32Meta.setDisplayName(String.format("%sGold Ingot %sx32", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 142 */     gold32.setItemMeta(gold32Meta);
/*     */     
/* 144 */     gold36Meta.setDisplayName(String.format("%sGold Ingot %sx36", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 145 */     gold36.setItemMeta(gold36Meta);
/*     */     
/* 147 */     gold40Meta.setDisplayName(String.format("%sGold Ingot %sx40", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 148 */     gold40.setItemMeta(gold40Meta);
/*     */     
/* 150 */     gold44Meta.setDisplayName(String.format("%sGold Ingot %sx44", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 151 */     gold44.setItemMeta(gold44Meta);
/*     */     
/* 153 */     gold48Meta.setDisplayName(String.format("%sGold Ingot %sx48", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 154 */     gold48.setItemMeta(gold48Meta);
/*     */     
/* 156 */     gold52Meta.setDisplayName(String.format("%sGold Ingot %sx52", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 157 */     gold52.setItemMeta(gold52Meta);
/*     */     
/* 159 */     gold56Meta.setDisplayName(String.format("%sGold Ingot %sx56", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 160 */     gold56.setItemMeta(gold56Meta);
/*     */     
/* 162 */     gold60Meta.setDisplayName(String.format("%sGold Ingot %sx60", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 163 */     gold60.setItemMeta(gold60Meta);
/*     */     
/* 165 */     gold64Meta.setDisplayName(String.format("%sGold Ingot %sx64", new Object[] { ChatColor.GOLD, ChatColor.DARK_RED }));
/* 166 */     gold64.setItemMeta(gold64Meta);
/*     */     
/* 168 */     backMeta.setDisplayName(ChatColor.RED + "Back");
/* 169 */     back.setItemMeta(backMeta);
/*     */     
/* 171 */     buymenu.setItem(0, gold4);
/* 172 */     buymenu.setItem(1, gold8);
/* 173 */     buymenu.setItem(2, gold12);
/* 174 */     buymenu.setItem(3, gold16);
/* 175 */     buymenu.setItem(4, gold20);
/* 176 */     buymenu.setItem(5, gold24);
/* 177 */     buymenu.setItem(6, gold28);
/* 178 */     buymenu.setItem(7, gold32);
/* 179 */     buymenu.setItem(8, gold36);
/* 180 */     buymenu.setItem(10, gold40);
/* 181 */     buymenu.setItem(11, gold44);
/* 182 */     buymenu.setItem(12, gold48);
/* 183 */     buymenu.setItem(13, gold52);
/* 184 */     buymenu.setItem(14, gold56);
/* 185 */     buymenu.setItem(15, gold60);
/* 186 */     buymenu.setItem(16, gold64);
/* 187 */     buymenu.setItem(22, back);
/*     */     
/* 189 */     player.openInventory(buymenu);
/*     */   }
/*     */ }


/* Location:              G:\Java Projects\XPShop.jar!\me\trusthage\menus\buy\BGold.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */