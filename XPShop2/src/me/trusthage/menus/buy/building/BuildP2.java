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
/*     */ public class BuildP2
/*     */ {
/*     */   public void openBuildBuyP2(Player player)
/*     */   {
/*  16 */     Inventory buildp2 = Bukkit.createInventory(null, 54, "Building Blocks             Page: 2");
/*     */     
/*  35 */     ItemStack wool = new ItemStack(Material.WOOL);
/*  36 */     ItemMeta woolMeta = wool.getItemMeta();
/*  37 */     ItemStack orangewool = new ItemStack(Material.WOOL, 1, (short)1);
/*  38 */     ItemMeta orangewoolMeta = orangewool.getItemMeta();
/*  39 */     ItemStack magentawool = new ItemStack(Material.WOOL, 1, (short)2);
/*  40 */     ItemMeta magentawoolMeta = magentawool.getItemMeta();
/*  41 */     ItemStack lightbluewool = new ItemStack(Material.WOOL, 1, (short)3);
/*  42 */     ItemMeta lightbluewoolMeta = lightbluewool.getItemMeta();
/*  43 */     ItemStack yellowwool = new ItemStack(Material.WOOL, 1, (short)4);
/*  44 */     ItemMeta yellowwoolMeta = yellowwool.getItemMeta();
/*  45 */     ItemStack limewool = new ItemStack(Material.WOOL, 1, (short)5);
/*  46 */     ItemMeta limewoolMeta = limewool.getItemMeta();
/*  47 */     ItemStack pinkwool = new ItemStack(Material.WOOL, 1, (short)6);
/*  48 */     ItemMeta pinkwoolMeta = pinkwool.getItemMeta();
/*  49 */     ItemStack graywool = new ItemStack(Material.WOOL, 1, (short)7);
/*  50 */     ItemMeta graywoolMeta = graywool.getItemMeta();
/*  51 */     ItemStack lightgraywool = new ItemStack(Material.WOOL, 1, (short)8);
/*  52 */     ItemMeta lightgraywoolMeta = lightgraywool.getItemMeta();
/*  53 */     ItemStack cyanwool = new ItemStack(Material.WOOL, 1, (short)9);
/*  54 */     ItemMeta cyanwoolMeta = cyanwool.getItemMeta();
/*  55 */     ItemStack purplewool = new ItemStack(Material.WOOL, 1, (short)10);
/*  56 */     ItemMeta purplewoolMeta = purplewool.getItemMeta();
/*  57 */     ItemStack bluewool = new ItemStack(Material.WOOL, 1, (short)11);
/*  58 */     ItemMeta bluewoolMeta = bluewool.getItemMeta();
/*  59 */     ItemStack brownwool = new ItemStack(Material.WOOL, 1, (short)12);
/*  60 */     ItemMeta brownwoolMeta = brownwool.getItemMeta();
/*  61 */     ItemStack greenwool = new ItemStack(Material.WOOL, 1, (short)13);
/*  62 */     ItemMeta greenwoolMeta = greenwool.getItemMeta();
/*  63 */     ItemStack redwool = new ItemStack(Material.WOOL, 1, (short)14);
/*  64 */     ItemMeta redwoolMeta = redwool.getItemMeta();
/*  65 */     ItemStack blackwool = new ItemStack(Material.WOOL, 1, (short)15);
/*  66 */     ItemMeta blackwoolMeta = blackwool.getItemMeta();
/*  67 */     ItemStack goldblock = new ItemStack(Material.GOLD_BLOCK);
/*  68 */     ItemMeta goldblockMeta = goldblock.getItemMeta();
/*  69 */     ItemStack ironblock = new ItemStack(Material.IRON_BLOCK);
/*  70 */     ItemMeta ironblockMeta = ironblock.getItemMeta();
/*  71 */     ItemStack slab = new ItemStack(Material.STEP);
/*  72 */     ItemMeta slabMeta = slab.getItemMeta();
/*  73 */     ItemStack sandstoneslab = new ItemStack(Material.STEP, 1, (short)1);
/*  74 */     ItemMeta sandstoneslabMeta = sandstoneslab.getItemMeta();
/*  75 */     ItemStack cobblestoneslab = new ItemStack(Material.STEP, 1, (short)3);
/*  76 */     ItemMeta cobblestoneslabMeta = cobblestoneslab.getItemMeta();
/*  77 */     ItemStack bricksslab = new ItemStack(Material.STEP, 1, (short)4);
/*  78 */     ItemMeta bricksslabMeta = bricksslab.getItemMeta();
/*  79 */     ItemStack stonebrickslab = new ItemStack(Material.STEP, 1, (short)5);
/*  80 */     ItemMeta stonebrickslabMeta = stonebrickslab.getItemMeta();
/*  81 */     ItemStack netherbrickslab = new ItemStack(Material.STEP, 1, (short)6);
/*  82 */     ItemMeta netherbrickslabMeta = netherbrickslab.getItemMeta();
/*  83 */     ItemStack quartzslab = new ItemStack(Material.STEP, 1, (short)7);
/*  84 */     ItemMeta quartzslabMeta = quartzslab.getItemMeta();
/*  85 */     ItemStack bricks = new ItemStack(Material.BRICK);
/*  86 */     ItemMeta bricksMeta = bricks.getItemMeta();
/*  87 */     ItemStack bookshelf = new ItemStack(Material.BOOKSHELF);
/*  88 */     ItemMeta bookshelfMeta = bookshelf.getItemMeta();
/*  89 */     ItemStack mossstone = new ItemStack(Material.MOSSY_COBBLESTONE);
/*  90 */     ItemMeta mossstoneMeta = mossstone.getItemMeta();
/*  91 */     ItemStack obsidian = new ItemStack(Material.OBSIDIAN);
/*  92 */     ItemMeta obsidianMeta = obsidian.getItemMeta();
/*  93 */     ItemStack woodstairs = new ItemStack(Material.WOOD_STAIRS);
/*  94 */     ItemMeta woodstairsMeta = woodstairs.getItemMeta();
/*  95 */     ItemStack diamondore = new ItemStack(Material.DIAMOND_ORE);
/*  96 */     ItemMeta diamondoreMeta = diamondore.getItemMeta();
/*  97 */     ItemStack diamondblock = new ItemStack(Material.DIAMOND_BLOCK);
/*  98 */     ItemMeta diamondblockMeta = diamondblock.getItemMeta();
/*  99 */     ItemStack cobblestonestairs = new ItemStack(Material.COBBLESTONE_STAIRS);
/* 100 */     ItemMeta cobblestonestairsMeta = cobblestonestairs.getItemMeta();
/* 101 */     ItemStack redstoneore = new ItemStack(Material.REDSTONE_ORE);
/* 102 */     ItemMeta redstoneoreMeta = redstoneore.getItemMeta();
/* 103 */     ItemStack ice = new ItemStack(Material.ICE);
/* 104 */     ItemMeta iceMeta = ice.getItemMeta();
/* 105 */     ItemStack snow = new ItemStack(Material.SNOW_BLOCK);
/* 106 */     ItemMeta snowMeta = snow.getItemMeta();
/* 107 */     ItemStack back = new ItemStack(Material.BARRIER);
/* 108 */     ItemMeta backMeta = back.getItemMeta();
/* 109 */     ItemStack nextpage = new ItemStack(Material.ENDER_PEARL);
/* 110 */     ItemMeta nextpageMeta = nextpage.getItemMeta();
/* 111 */     ItemStack previouspage = new ItemStack(Material.ENDER_PEARL);
/* 112 */     ItemMeta previouspageMeta = previouspage.getItemMeta();
/*     */     
/* 114 */     woolMeta.setDisplayName("Wool 16x:");
/* 115 */     wool.setItemMeta(woolMeta);
/* 116 */     orangewoolMeta.setDisplayName("Orange Wool 16x:");
/* 117 */     orangewool.setItemMeta(orangewoolMeta);
/* 118 */     magentawoolMeta.setDisplayName("Magenta Wool 16x:");
/* 119 */     magentawool.setItemMeta(magentawoolMeta);
/* 120 */     lightbluewoolMeta.setDisplayName("Light Blue Wool 16x:");
/* 121 */     lightbluewool.setItemMeta(lightbluewoolMeta);
/* 122 */     yellowwoolMeta.setDisplayName("Yellow Wool 16x:");
/* 123 */     yellowwool.setItemMeta(yellowwoolMeta);
/* 124 */     limewoolMeta.setDisplayName("Lime Wool 16x:");
/* 125 */     limewool.setItemMeta(limewoolMeta);
/* 126 */     pinkwoolMeta.setDisplayName("Pink Wool 16x:");
/* 127 */     pinkwool.setItemMeta(pinkwoolMeta);
/* 128 */     graywoolMeta.setDisplayName("Gray Wool 16x:");
/* 129 */     graywool.setItemMeta(graywoolMeta);
/* 130 */     lightgraywoolMeta.setDisplayName("Light Gray Wool 16x:");
/* 131 */     lightgraywool.setItemMeta(lightgraywoolMeta);
/* 132 */     cyanwoolMeta.setDisplayName("Cyan Wool 16x:");
/* 133 */     cyanwool.setItemMeta(cyanwoolMeta);
/* 134 */     purplewoolMeta.setDisplayName("Purple Wool 16x:");
/* 135 */     purplewool.setItemMeta(purplewoolMeta);
/* 136 */     bluewoolMeta.setDisplayName("Blue Wool 16x:");
/* 137 */     bluewool.setItemMeta(bluewoolMeta);
/* 138 */     brownwoolMeta.setDisplayName("Brown Wool 16x:");
/* 139 */     brownwool.setItemMeta(brownwoolMeta);
/* 140 */     greenwoolMeta.setDisplayName("Green Wool 16x:");
/* 141 */     greenwool.setItemMeta(greenwoolMeta);
/* 142 */     redwoolMeta.setDisplayName("Red Wool 16x:");
/* 143 */     redwool.setItemMeta(redwoolMeta);
/* 144 */     blackwoolMeta.setDisplayName("Black Wool 16x:");
/* 145 */     blackwool.setItemMeta(blackwoolMeta);
/* 146 */     goldblockMeta.setDisplayName("Gold Block 16x:");
/* 147 */     goldblock.setItemMeta(goldblockMeta);
/* 148 */     ironblockMeta.setDisplayName("Iron Block 16x:");
/* 149 */     ironblock.setItemMeta(ironblockMeta);
/* 150 */     slabMeta.setDisplayName("Stone Slab 16x:");
/* 151 */     slab.setItemMeta(slabMeta);
/* 152 */     sandstoneslabMeta.setDisplayName("Sandstone Slab 16x:");
/* 153 */     sandstoneslab.setItemMeta(sandstoneslabMeta);
/* 154 */     cobblestoneslabMeta.setDisplayName("Cobblestone Slab 16x:");
/* 155 */     cobblestoneslab.setItemMeta(cobblestoneslabMeta);
/* 156 */     bricksslabMeta.setDisplayName("Bricks Slab 16x:");
/* 157 */     bricksslab.setItemMeta(bricksslabMeta);
/* 158 */     stonebrickslabMeta.setDisplayName("Stone Bricks Slab 16x:");
/* 159 */     stonebrickslab.setItemMeta(stonebrickslabMeta);
/* 160 */     netherbrickslabMeta.setDisplayName("Nether Brick Slab 16x:");
/* 161 */     netherbrickslab.setItemMeta(netherbrickslabMeta);
/* 162 */     quartzslabMeta.setDisplayName("Quartz Slab 16x:");
/* 163 */     quartzslab.setItemMeta(quartzslabMeta);
/* 164 */     bricksMeta.setDisplayName("Bricks 16x:");
/* 165 */     bricks.setItemMeta(bricksMeta);
/* 166 */     bookshelfMeta.setDisplayName("Bookshelf 16x:");
/* 167 */     bookshelf.setItemMeta(bookshelfMeta);
/* 168 */     mossstoneMeta.setDisplayName("Moss Stone 16x:");
/* 169 */     mossstone.setItemMeta(mossstoneMeta);
/* 170 */     obsidianMeta.setDisplayName("Obsidian 16x:");
/* 171 */     obsidian.setItemMeta(obsidianMeta);
/* 172 */     woodstairsMeta.setDisplayName("Oak Wood Stairs 16x:");
/* 173 */     woodstairs.setItemMeta(woodstairsMeta);
/* 174 */     diamondoreMeta.setDisplayName("Diamond Ore 16x:");
/* 175 */     diamondore.setItemMeta(diamondoreMeta);
/* 176 */     diamondblockMeta.setDisplayName("Diamond Block 16x:");
/* 177 */     diamondblock.setItemMeta(diamondblockMeta);
/* 178 */     cobblestonestairsMeta.setDisplayName("Cobblestone Stairs 16x:");
/* 179 */     cobblestonestairs.setItemMeta(cobblestonestairsMeta);
/* 180 */     redstoneoreMeta.setDisplayName("Redstone Ore 16x:");
/* 181 */     redstoneore.setItemMeta(redstoneoreMeta);
/* 182 */     iceMeta.setDisplayName("Ice 16x:");
/* 183 */     ice.setItemMeta(iceMeta);
/* 184 */     snowMeta.setDisplayName("Snow 16x:");
/* 185 */     snow.setItemMeta(snowMeta);
/* 186 */     backMeta.setDisplayName(ChatColor.RED + "Back");
/* 187 */     back.setItemMeta(backMeta);
/* 188 */     nextpageMeta.setDisplayName("Next Page");
/* 189 */     nextpage.setItemMeta(nextpageMeta);
/* 190 */     previouspageMeta.setDisplayName("Previous Pags");
/* 191 */     previouspage.setItemMeta(previouspageMeta);
/*     */     
/* 193 */     buildp2.setItem(0, wool);
/* 194 */     buildp2.setItem(1, orangewool);
/* 195 */     buildp2.setItem(2, magentawool);
/* 196 */     buildp2.setItem(3, lightbluewool);
/* 197 */     buildp2.setItem(4, yellowwool);
/* 198 */     buildp2.setItem(5, limewool);
/* 199 */     buildp2.setItem(6, pinkwool);
/* 200 */     buildp2.setItem(7, graywool);
/* 201 */     buildp2.setItem(8, lightgraywool);
/* 202 */     buildp2.setItem(9, cyanwool);
/* 203 */     buildp2.setItem(10, purplewool);
/* 204 */     buildp2.setItem(11, bluewool);
/* 205 */     buildp2.setItem(12, brownwool);
/* 206 */     buildp2.setItem(13, greenwool);
/* 207 */     buildp2.setItem(14, redwool);
/* 208 */     buildp2.setItem(15, blackwool);
/* 209 */     buildp2.setItem(16, goldblock);
/* 210 */     buildp2.setItem(17, ironblock);
/* 211 */     buildp2.setItem(18, slab);
/* 212 */     buildp2.setItem(19, sandstoneslab);
/* 213 */     buildp2.setItem(20, cobblestoneslab);
/* 214 */     buildp2.setItem(21, bricksslab);
/* 215 */     buildp2.setItem(22, stonebrickslab);
/* 216 */     buildp2.setItem(23, netherbrickslab);
/* 217 */     buildp2.setItem(24, quartzslab);
/* 218 */     buildp2.setItem(25, bricks);
/* 219 */     buildp2.setItem(26, bookshelf);
/* 220 */     buildp2.setItem(27, mossstone);
/* 221 */     buildp2.setItem(28, obsidian);
/* 222 */     buildp2.setItem(29, woodstairs);
/* 223 */     buildp2.setItem(30, diamondore);
/* 224 */     buildp2.setItem(31, diamondblock);
/* 225 */     buildp2.setItem(32, cobblestonestairs);
/* 226 */     buildp2.setItem(33, redstoneore);
/* 227 */     buildp2.setItem(34, ice);
/* 228 */     buildp2.setItem(35, snow);
/* 229 */     buildp2.setItem(45, previouspage);
/* 230 */     buildp2.setItem(49, back);
/* 231 */     buildp2.setItem(53, nextpage);
/*     */     
/* 233 */     ItemStack line = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
/* 234 */     ItemMeta lineMeta = line.getItemMeta();
/* 235 */     lineMeta.setDisplayName("-");
/* 236 */     line.setItemMeta(lineMeta);buildp2.setItem(36, line);
/* 237 */     buildp2.setItem(37, line);
/* 238 */     buildp2.setItem(38, line);
/* 239 */     buildp2.setItem(39, line);
/* 240 */     buildp2.setItem(40, line);
/* 241 */     buildp2.setItem(41, line);
/* 242 */     buildp2.setItem(42, line);
/* 243 */     buildp2.setItem(43, line);
/* 244 */     buildp2.setItem(44, line);
/*     */     
/* 246 */     player.openInventory(buildp2);
/*     */   }
/*     */ }