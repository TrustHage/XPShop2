/*     */ package me.trusthage.menus.buy;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import net.md_5.bungee.api.ChatColor;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.inventory.Inventory;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BDiamond
/*     */ {
/*     */   public void openDiamondBuyMenu(Player player)
/*     */   {
/*  18 */     ArrayList<String> dlore = new ArrayList<String>();
/*  19 */     ArrayList<String> dlore1 = new ArrayList<String>();
/*  20 */     ArrayList<String> dlore2 = new ArrayList<String>();
/*  21 */     ArrayList<String> dlore3 = new ArrayList<String>();
/*  22 */     ArrayList<String> dlore4 = new ArrayList<String>();
/*  23 */     ArrayList<String> dlore5 = new ArrayList<String>();
/*  24 */     ArrayList<String> dlore6 = new ArrayList<String>();
/*  25 */     ArrayList<String> dlore7 = new ArrayList<String>();
/*  26 */     ArrayList<String> dlore8 = new ArrayList<String>();
/*  27 */     ArrayList<String> dlore9 = new ArrayList<String>();
/*  28 */     ArrayList<String> dlore10 = new ArrayList<String>();
/*  29 */     ArrayList<String> dlore11 = new ArrayList<String>();
/*  30 */     ArrayList<String> dlore12 = new ArrayList<String>();
/*  31 */     ArrayList<String> dlore13 = new ArrayList<String>();
/*  32 */     ArrayList<String> dlore14 = new ArrayList<String>();
/*  33 */     ArrayList<String> dlore15 = new ArrayList<String>();
/*     */     
/*  35 */     Inventory buymenu = Bukkit.createInventory(null, 27, ChatColor.AQUA + "Diamond Buy Menu");
/*     */     
/*  37 */     ItemStack diamond4 = new ItemStack(Material.DIAMOND, 4);
/*  38 */     ItemMeta diamond4Meta = diamond4.getItemMeta();
/*  39 */     dlore.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  41 */     ItemStack diamond8 = new ItemStack(Material.DIAMOND, 8);
/*  42 */     ItemMeta diamond8Meta = diamond8.getItemMeta();
/*  43 */     dlore1.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  45 */     ItemStack diamond12 = new ItemStack(Material.DIAMOND, 12);
/*  46 */     ItemMeta diamond12Meta = diamond12.getItemMeta();
/*  47 */     dlore2.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  49 */     ItemStack diamond16 = new ItemStack(Material.DIAMOND, 16);
/*  50 */     ItemMeta diamond16Meta = diamond16.getItemMeta();
/*  51 */     dlore3.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  53 */     ItemStack diamond20 = new ItemStack(Material.DIAMOND, 20);
/*  54 */     ItemMeta diamond20Meta = diamond20.getItemMeta();
/*  55 */     dlore4.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  57 */     ItemStack diamond24 = new ItemStack(Material.DIAMOND, 24);
/*  58 */     ItemMeta diamond24Meta = diamond24.getItemMeta();
/*  59 */     dlore5.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  61 */     ItemStack diamond28 = new ItemStack(Material.DIAMOND, 28);
/*  62 */     ItemMeta diamond28Meta = diamond28.getItemMeta();
/*  63 */     dlore6.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  65 */     ItemStack diamond32 = new ItemStack(Material.DIAMOND, 32);
/*  66 */     ItemMeta diamond32Meta = diamond32.getItemMeta();
/*  67 */     dlore7.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  69 */     ItemStack diamond36 = new ItemStack(Material.DIAMOND, 36);
/*  70 */     ItemMeta diamond36Meta = diamond36.getItemMeta();
/*  71 */     dlore8.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  73 */     ItemStack diamond40 = new ItemStack(Material.DIAMOND, 40);
/*  74 */     ItemMeta diamond40Meta = diamond40.getItemMeta();
/*  75 */     dlore9.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  77 */     ItemStack diamond44 = new ItemStack(Material.DIAMOND, 44);
/*  78 */     ItemMeta diamond44Meta = diamond44.getItemMeta();
/*  79 */     dlore10.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  81 */     ItemStack diamond48 = new ItemStack(Material.DIAMOND, 48);
/*  82 */     ItemMeta diamond48Meta = diamond48.getItemMeta();
/*  83 */     dlore11.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  85 */     ItemStack diamond52 = new ItemStack(Material.DIAMOND, 52);
/*  86 */     ItemMeta diamond52Meta = diamond52.getItemMeta();
/*  87 */     dlore12.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  89 */     ItemStack diamond56 = new ItemStack(Material.DIAMOND, 56);
/*  90 */     ItemMeta diamond56Meta = diamond56.getItemMeta();
/*  91 */     dlore13.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  93 */     ItemStack diamond60 = new ItemStack(Material.DIAMOND, 60);
/*  94 */     ItemMeta diamond60Meta = diamond60.getItemMeta();
/*  95 */     dlore14.add(ChatColor.RED + "Cost: XP");
/*     */     
/*  97 */     ItemStack diamond64 = new ItemStack(Material.DIAMOND, 64);
/*  98 */     ItemMeta diamond64Meta = diamond64.getItemMeta();
/*  99 */     dlore15.add(ChatColor.RED + "Cost: XP");
/*     */     
/* 101 */     diamond4Meta.setLore(dlore);
/* 102 */     diamond8Meta.setLore(dlore1);
/* 103 */     diamond12Meta.setLore(dlore2);
/* 104 */     diamond16Meta.setLore(dlore3);
/* 105 */     diamond20Meta.setLore(dlore4);
/* 106 */     diamond24Meta.setLore(dlore5);
/* 107 */     diamond28Meta.setLore(dlore6);
/* 108 */     diamond32Meta.setLore(dlore7);
/* 109 */     diamond36Meta.setLore(dlore8);
/* 110 */     diamond40Meta.setLore(dlore9);
/* 111 */     diamond44Meta.setLore(dlore10);
/* 112 */     diamond48Meta.setLore(dlore11);
/* 113 */     diamond52Meta.setLore(dlore12);
/* 114 */     diamond56Meta.setLore(dlore13);
/* 115 */     diamond60Meta.setLore(dlore14);
/* 116 */     diamond64Meta.setLore(dlore15);
/*     */     
/* 118 */     ItemStack back = new ItemStack(Material.LAVA_BUCKET, 1);
/* 119 */     ItemMeta backMeta = back.getItemMeta();
/*     */     
/* 121 */     diamond4Meta.setDisplayName(String.format("%sDiamond %sx4", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 122 */     diamond4.setItemMeta(diamond4Meta);
/*     */     
/* 124 */     diamond8Meta.setDisplayName(String.format("%sDiamond %sx8", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 125 */     diamond8.setItemMeta(diamond8Meta);
/*     */     
/* 127 */     diamond12Meta.setDisplayName(String.format("%sDiamond %sx12", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 128 */     diamond12.setItemMeta(diamond12Meta);
/*     */     
/* 130 */     diamond16Meta.setDisplayName(String.format("%sDiamond %sx16", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 131 */     diamond16.setItemMeta(diamond16Meta);
/*     */     
/* 133 */     diamond20Meta.setDisplayName(String.format("%sDiamond %sx20", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 134 */     diamond20.setItemMeta(diamond20Meta);
/*     */     
/* 136 */     diamond24Meta.setDisplayName(String.format("%sDiamond %sx24", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 137 */     diamond24.setItemMeta(diamond24Meta);
/*     */     
/* 139 */     diamond28Meta.setDisplayName(String.format("%sDiamond %sx28", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 140 */     diamond28.setItemMeta(diamond28Meta);
/*     */     
/* 142 */     diamond32Meta.setDisplayName(String.format("%sDiamond %sx32", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 143 */     diamond32.setItemMeta(diamond32Meta);
/*     */     
/* 145 */     diamond36Meta.setDisplayName(String.format("%sDiamond %sx36", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 146 */     diamond36.setItemMeta(diamond36Meta);
/*     */     
/* 148 */     diamond40Meta.setDisplayName(String.format("%sDiamond %sx40", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 149 */     diamond40.setItemMeta(diamond40Meta);
/*     */     
/* 151 */     diamond44Meta.setDisplayName(String.format("%sDiamond %sx44", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 152 */     diamond44.setItemMeta(diamond44Meta);
/*     */     
/* 154 */     diamond48Meta.setDisplayName(String.format("%sDiamond %sx48", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 155 */     diamond48.setItemMeta(diamond48Meta);
/*     */     
/* 157 */     diamond52Meta.setDisplayName(String.format("%sDiamond %sx52", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 158 */     diamond52.setItemMeta(diamond52Meta);
/*     */     
/* 160 */     diamond56Meta.setDisplayName(String.format("%sDiamond %sx56", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 161 */     diamond56.setItemMeta(diamond56Meta);
/*     */     
/* 163 */     diamond60Meta.setDisplayName(String.format("%sDiamond %sx60", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 164 */     diamond60.setItemMeta(diamond60Meta);
/*     */     
/* 166 */     diamond64Meta.setDisplayName(String.format("%sDiamond %sx64", new Object[] { ChatColor.AQUA, ChatColor.DARK_RED }));
/* 167 */     diamond64.setItemMeta(diamond64Meta);
/*     */     
/* 169 */     backMeta.setDisplayName(ChatColor.RED + "Back");
/* 170 */     back.setItemMeta(backMeta);
/*     */     
/* 172 */     buymenu.setItem(0, diamond4);
/* 173 */     buymenu.setItem(1, diamond8);
/* 174 */     buymenu.setItem(2, diamond12);
/* 175 */     buymenu.setItem(3, diamond16);
/* 176 */     buymenu.setItem(4, diamond20);
/* 177 */     buymenu.setItem(5, diamond24);
/* 178 */     buymenu.setItem(6, diamond28);
/* 179 */     buymenu.setItem(7, diamond32);
/* 180 */     buymenu.setItem(8, diamond36);
/* 181 */     buymenu.setItem(10, diamond40);
/* 182 */     buymenu.setItem(11, diamond44);
/* 183 */     buymenu.setItem(12, diamond48);
/* 184 */     buymenu.setItem(13, diamond52);
/* 185 */     buymenu.setItem(14, diamond56);
/* 186 */     buymenu.setItem(15, diamond60);
/* 187 */     buymenu.setItem(16, diamond64);
/* 188 */     buymenu.setItem(22, back);
/*     */     
/* 190 */     player.openInventory(buymenu);
/*     */   }
/*     */ }


/* Location:              G:\Java Projects\XPShop.jar!\me\trusthage\menus\buy\BDiamond.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */