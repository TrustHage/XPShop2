/*     */ package me.trusthage.menus.buy.building;
/*     */ 
/*     */ import net.md_5.bungee.api.ChatColor;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.inventory.Inventory;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ 
/*     */ public class BuildP1
/*     */ {
/*     */   public void openBuildBuyP1(Player player)
/*     */   {
/*  16 */     Inventory buildp1 = Bukkit.createInventory(null, 54, "Building Blocks             Page: 1");

/*  27 */     ItemStack stone = new ItemStack(Material.STONE);
/*  28 */     ItemMeta stoneMeta = stone.getItemMeta();
/*  29 */     ItemStack granite = new ItemStack(Material.STONE, 1, (short)1);
/*  30 */     ItemMeta graniteMeta = granite.getItemMeta();
/*  31 */     ItemStack polishedgranite = new ItemStack(Material.STONE, 1, (short)2);
/*  32 */     ItemMeta polishedgraniteMeta = polishedgranite.getItemMeta();
/*  33 */     ItemStack diorite = new ItemStack(Material.STONE, 1, (short)3);
/*  34 */     ItemMeta dioriteMeta = diorite.getItemMeta();
/*  35 */     ItemStack polisheddiorite = new ItemStack(Material.STONE, 1, (short)4);
/*  36 */     ItemMeta polisheddioriteMeta = polisheddiorite.getItemMeta();
/*  37 */     ItemStack andesite = new ItemStack(Material.STONE, 1, (short)5);
/*  38 */     ItemMeta andesiteMeta = andesite.getItemMeta();
/*  39 */     ItemStack polishedandesite = new ItemStack(Material.STONE, 1, (short)6);
/*  40 */     ItemMeta polishedandesiteMeta = polishedandesite.getItemMeta();
/*  41 */     ItemStack grass = new ItemStack(Material.GRASS);
/*  42 */     ItemMeta grassMeta = grass.getItemMeta();
/*  43 */     ItemStack dirt = new ItemStack(Material.DIRT);
/*  44 */     ItemMeta dirtMeta = dirt.getItemMeta();
/*  45 */     ItemStack cobblestone = new ItemStack(Material.COBBLESTONE);
/*  46 */     ItemMeta cobblestoneMeta = cobblestone.getItemMeta();
/*  47 */     ItemStack planks = new ItemStack(Material.WOOD);
/*  48 */     ItemMeta planksMeta = planks.getItemMeta();
/*  49 */     ItemStack smoothsandstone = new ItemStack(Material.SANDSTONE, 1, (short)2);
/*  50 */     ItemMeta smoothsandstoneMeta = smoothsandstone.getItemMeta();
/*  51 */     ItemStack sand = new ItemStack(Material.SAND);
/*  52 */     ItemMeta sandMeta = sand.getItemMeta();
/*  53 */     ItemStack gravel = new ItemStack(Material.GRAVEL);
/*  54 */     ItemMeta gravelMeta = gravel.getItemMeta();
/*  55 */     ItemStack goldore = new ItemStack(Material.GOLD_ORE);
/*  56 */     ItemMeta goldoreMeta = goldore.getItemMeta();
/*  57 */     ItemStack ironore = new ItemStack(Material.IRON_ORE);
/*  58 */     ItemMeta ironoreMeta = ironore.getItemMeta();
/*  59 */     ItemStack coalore = new ItemStack(Material.COAL_ORE);
/*  60 */     ItemMeta coaloreMeta = coalore.getItemMeta();
/*  61 */     ItemStack log = new ItemStack(Material.LOG);
/*  62 */     ItemMeta logMeta = log.getItemMeta();
/*  63 */     ItemStack sponge = new ItemStack(Material.SPONGE);
/*  64 */     ItemMeta spongeMeta = sponge.getItemMeta();
/*  65 */     ItemStack glass = new ItemStack(Material.GLASS);
/*  66 */     ItemMeta glassMeta = glass.getItemMeta();
/*  67 */     ItemStack lapisore = new ItemStack(Material.LAPIS_ORE);
/*  68 */     ItemMeta lapisoreMeta = lapisore.getItemMeta();
/*  69 */     ItemStack lapisblock = new ItemStack(Material.LAPIS_BLOCK);
/*  70 */     ItemMeta lapisblockMeta = lapisblock.getItemMeta();
/*  71 */     ItemStack sandstone = new ItemStack(Material.SANDSTONE);
/*  72 */     ItemMeta sandstoneMeta = sandstone.getItemMeta();
/*  73 */     ItemStack coarsedirt = new ItemStack(Material.DIRT, 1, (short)1);
/*  74 */     ItemMeta coarsedirtMeta = coarsedirt.getItemMeta();
/*  75 */     ItemStack podzol = new ItemStack(Material.DIRT, 1, (short)2);
/*  76 */     ItemMeta podzolMeta = podzol.getItemMeta();
/*  77 */     ItemStack spruceplanks = new ItemStack(Material.WOOD, 1, (short)1);
/*  78 */     ItemMeta spruceplanksMeta = spruceplanks.getItemMeta();
/*  79 */     ItemStack birchplanks = new ItemStack(Material.WOOD, 1, (short)2);
/*  80 */     ItemMeta birchplanksMeta = birchplanks.getItemMeta();
/*  81 */     ItemStack jungleplanks = new ItemStack(Material.WOOD, 1, (short)3);
/*  82 */     ItemMeta jungleplanksMeta = jungleplanks.getItemMeta();
/*  83 */     ItemStack acaciaplanks = new ItemStack(Material.WOOD, 1, (short)4);
/*  84 */     ItemMeta acaciaplanksMeta = acaciaplanks.getItemMeta();
/*  85 */     ItemStack darkoakplanks = new ItemStack(Material.WOOD, 1, (short)5);
/*  86 */     ItemMeta darkoakplanksMeta = darkoakplanks.getItemMeta();
/*  87 */     ItemStack redsand = new ItemStack(Material.SAND, 1, (short)1);
/*  88 */     ItemMeta redsandMeta = redsand.getItemMeta();
/*  89 */     ItemStack sprucelog = new ItemStack(Material.LOG, 1, (short)1);
/*  90 */     ItemMeta sprucelogMeta = sprucelog.getItemMeta();
/*  91 */     ItemStack birchlog = new ItemStack(Material.LOG, 1, (short)2);
/*  92 */     ItemMeta birchlogMeta = birchlog.getItemMeta();
/*  93 */     ItemStack junglelog = new ItemStack(Material.LOG, 1, (short)3);
/*  94 */     ItemMeta junglelogMeta = junglelog.getItemMeta();
/*  95 */     ItemStack wetsponge = new ItemStack(Material.SPONGE, 1, (short)1);
/*  96 */     ItemMeta wetspongeMeta = wetsponge.getItemMeta();
/*  97 */     ItemStack chiseledsandstone = new ItemStack(Material.SANDSTONE, 1, (short)1);
/*  98 */     ItemMeta chiseledsandstoneMeta = chiseledsandstone.getItemMeta();
/*  99 */     ItemStack back = new ItemStack(Material.BARRIER);
/* 100 */     ItemMeta backMeta = back.getItemMeta();
/* 101 */     ItemStack nextpage = new ItemStack(Material.ENDER_PEARL);
/* 102 */     ItemMeta nextpageMeta = nextpage.getItemMeta();
/* 103 */     ItemStack line = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
/* 104 */     ItemMeta lineMeta = line.getItemMeta();
/*     */     
/* 106 */     stoneMeta.setDisplayName("Stone 16x::");
/* 107 */     stone.setItemMeta(stoneMeta);
/* 108 */     graniteMeta.setDisplayName("Granite 16x::");
/* 109 */     granite.setItemMeta(graniteMeta);
/* 110 */     polishedgraniteMeta.setDisplayName("Polished Granite x16");
/* 111 */     polishedgranite.setItemMeta(polishedgraniteMeta);
/* 112 */     dioriteMeta.setDisplayName("Diorite 16x:");
/* 113 */     diorite.setItemMeta(dioriteMeta);
/* 114 */     polisheddioriteMeta.setDisplayName("Polished Diorite 16x:");
/* 115 */     polisheddiorite.setItemMeta(polisheddioriteMeta);
/* 116 */     andesiteMeta.setDisplayName("Andesite 16x:");
/* 117 */     andesite.setItemMeta(andesiteMeta);
/* 118 */     polishedandesiteMeta.setDisplayName("Polished Andesite 16x:");
/* 119 */     polishedandesite.setItemMeta(polishedandesiteMeta);
/* 120 */     grassMeta.setDisplayName("Grass 16x:");
/* 121 */     grass.setItemMeta(grassMeta);
/* 122 */     dirtMeta.setDisplayName("Dirt 16x:");
/* 123 */     dirt.setItemMeta(dirtMeta);
/* 124 */     coarsedirtMeta.setDisplayName("Coarse Dirt 16x:");
/* 125 */     coarsedirt.setItemMeta(coarsedirtMeta);
/* 126 */     podzolMeta.setDisplayName("Polzol 16x:");
/* 127 */     podzol.setItemMeta(podzolMeta);
/* 128 */     cobblestoneMeta.setDisplayName("Cobblestone 16x:");
/* 129 */     cobblestone.setItemMeta(cobblestoneMeta);
/* 130 */     planksMeta.setDisplayName("Oak Wood Planks 16x:");
/* 131 */     planks.setItemMeta(planksMeta);
/* 132 */     spruceplanksMeta.setDisplayName("Spruce Wood Planks 16x:");
/* 133 */     spruceplanks.setItemMeta(spruceplanksMeta);
/* 134 */     birchplanksMeta.setDisplayName("Birch Wood Planks 16x:");
/* 135 */     birchplanks.setItemMeta(birchplanksMeta);
/* 136 */     jungleplanksMeta.setDisplayName("Jungle Wood Planks 16x:");
/* 137 */     jungleplanks.setItemMeta(jungleplanksMeta);
/* 138 */     acaciaplanksMeta.setDisplayName("Acacia Wood Planks 16x:");
/* 139 */     acaciaplanks.setItemMeta(acaciaplanksMeta);
/* 140 */     darkoakplanksMeta.setDisplayName("Dark Oak Wood Planks 16x:");
/* 141 */     darkoakplanks.setItemMeta(darkoakplanksMeta);
/* 142 */     sandMeta.setDisplayName("Sand 16x:");
/* 143 */     sand.setItemMeta(sandMeta);
/* 144 */     redsandMeta.setDisplayName("Red Sand 16x:");
/* 145 */     redsand.setItemMeta(redsandMeta);
/* 146 */     gravelMeta.setDisplayName("Gravel 16x:");
/* 147 */     gravel.setItemMeta(gravelMeta);
/* 148 */     goldoreMeta.setDisplayName("Gold Ore 16x:");
/* 149 */     goldore.setItemMeta(goldoreMeta);
/* 150 */     ironoreMeta.setDisplayName("Iron Ore 16x:");
/* 151 */     ironore.setItemMeta(ironoreMeta);
/* 152 */     coaloreMeta.setDisplayName("Coal Ore 16x:");
/* 153 */     coalore.setItemMeta(coaloreMeta);
/* 154 */     logMeta.setDisplayName("Oak Wood 16x:");
/* 155 */     log.setItemMeta(logMeta);
/* 156 */     sprucelogMeta.setDisplayName("Spruce Wood 16x:");
/* 157 */     sprucelog.setItemMeta(sprucelogMeta);
/* 158 */     birchlogMeta.setDisplayName("Birch Wood 16x:");
/* 159 */     birchlog.setItemMeta(birchlogMeta);
/* 160 */     junglelogMeta.setDisplayName("Jungle Wood 16x:");
/* 161 */     junglelog.setItemMeta(junglelogMeta);
/* 162 */     spongeMeta.setDisplayName("Sponge 16x:");
/* 163 */     sponge.setItemMeta(spongeMeta);
/* 164 */     wetspongeMeta.setDisplayName("Wet Sponge 16x:");
/* 165 */     wetsponge.setItemMeta(wetspongeMeta);
/* 166 */     glassMeta.setDisplayName("Glass 16x:");
/* 167 */     glass.setItemMeta(glassMeta);
/* 168 */     lapisoreMeta.setDisplayName("Lapis Lazuli Ore 16x:");
/* 169 */     lapisore.setItemMeta(lapisoreMeta);
/* 170 */     lapisblockMeta.setDisplayName("Lapis Lazuli Block 16x:");
/* 171 */     lapisblock.setItemMeta(lapisblockMeta);
/* 172 */     sandstoneMeta.setDisplayName("Sandstone 16x:");
/* 173 */     sandstone.setItemMeta(sandstoneMeta);
/* 174 */     chiseledsandstoneMeta.setDisplayName("Chiseled Sandstone 16x:");
/* 175 */     chiseledsandstone.setItemMeta(chiseledsandstoneMeta);
/* 176 */     smoothsandstoneMeta.setDisplayName("Smooth Sandstone 16x:");
/* 177 */     smoothsandstone.setItemMeta(smoothsandstoneMeta);
/* 178 */     backMeta.setDisplayName(ChatColor.RED + "Back");
/* 179 */     back.setItemMeta(backMeta);
/* 180 */     nextpageMeta.setDisplayName("Next Page");
/* 181 */     nextpage.setItemMeta(nextpageMeta);
/* 182 */     lineMeta.setDisplayName("-");
/* 183 */     line.setItemMeta(lineMeta);
/*     */     
/* 185 */     buildp1.setItem(0, stone);
/* 186 */     buildp1.setItem(1, granite);
/* 187 */     buildp1.setItem(2, polishedgranite);
/* 188 */     buildp1.setItem(3, diorite);
/* 189 */     buildp1.setItem(4, polisheddiorite);
/* 190 */     buildp1.setItem(5, andesite);
/* 191 */     buildp1.setItem(6, polishedandesite);
/* 192 */     buildp1.setItem(7, grass);
/* 193 */     buildp1.setItem(8, dirt);
/* 194 */     buildp1.setItem(9, coarsedirt);
/* 195 */     buildp1.setItem(10, podzol);
/* 196 */     buildp1.setItem(11, cobblestone);
/* 197 */     buildp1.setItem(12, planks);
/* 198 */     buildp1.setItem(13, spruceplanks);
/* 199 */     buildp1.setItem(14, birchplanks);
/* 200 */     buildp1.setItem(15, jungleplanks);
/* 201 */     buildp1.setItem(16, acaciaplanks);
/* 202 */     buildp1.setItem(17, darkoakplanks);
/* 203 */     buildp1.setItem(18, sand);
/* 204 */     buildp1.setItem(19, redsand);
/* 205 */     buildp1.setItem(20, gravel);
/* 206 */     buildp1.setItem(21, goldore);
/* 207 */     buildp1.setItem(22, ironore);
/* 208 */     buildp1.setItem(23, coalore);
/* 209 */     buildp1.setItem(24, log);
/* 210 */     buildp1.setItem(25, sprucelog);
/* 211 */     buildp1.setItem(26, birchlog);
/* 212 */     buildp1.setItem(27, junglelog);
/* 213 */     buildp1.setItem(28, sponge);
/* 214 */     buildp1.setItem(29, wetsponge);
/* 215 */     buildp1.setItem(30, glass);
/* 216 */     buildp1.setItem(31, lapisore);
/* 217 */     buildp1.setItem(32, lapisblock);
/* 218 */     buildp1.setItem(33, sandstone);
/* 219 */     buildp1.setItem(34, chiseledsandstone);
/* 220 */     buildp1.setItem(35, smoothsandstone);
/* 221 */     buildp1.setItem(36, line);
/* 222 */     buildp1.setItem(37, line);
/* 223 */     buildp1.setItem(38, line);
/* 224 */     buildp1.setItem(39, line);
/* 225 */     buildp1.setItem(40, line);
/* 226 */     buildp1.setItem(41, line);
/* 227 */     buildp1.setItem(42, line);
/* 228 */     buildp1.setItem(43, line);
/* 229 */     buildp1.setItem(44, line);
/* 230 */     buildp1.setItem(49, back);
/* 231 */     buildp1.setItem(53, nextpage);
/*     */     
/* 233 */     player.openInventory(buildp1);
/*     */   }
/*     */ }