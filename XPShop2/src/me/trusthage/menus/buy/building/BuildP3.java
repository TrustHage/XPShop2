package me.trusthage.menus.buy.building;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
 
public class BuildP3
{
	public void openBuildBuyP3(Player player)
	{
		Inventory buildp3 = Bukkit.createInventory(null, 54, "Building Blocks             Page: 3");

		/*
		ItemStack  = new ItemStack(Material.);
     	ItemMeta Meta = .getItemMeta();
     	ItemStack  = new ItemStack(Material., 1, (short));
		ItemMeta Meta = .getItemMeta();
		
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		
		buildp.setItem(, );
		*/

		ItemStack back = new ItemStack(Material.BARRIER);
		ItemMeta backMeta = back.getItemMeta();
		ItemStack nextpage = new ItemStack(Material.ENDER_PEARL);
		ItemMeta nextpageMeta = nextpage.getItemMeta();
		ItemStack previouspage = new ItemStack(Material.ENDER_PEARL);
		ItemMeta previouspageMeta = previouspage.getItemMeta();
		ItemStack line = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
		ItemMeta lineMeta = line.getItemMeta();
		ItemStack clay = new ItemStack(Material.CLAY);
     	ItemMeta clayMeta = clay.getItemMeta();
     	ItemStack pumpkin = new ItemStack(Material.PUMPKIN);
     	ItemMeta pumpkinMeta = pumpkin.getItemMeta();
     	ItemStack netherrack = new ItemStack(Material.NETHERRACK);
     	ItemMeta netherrackMeta = netherrack.getItemMeta();
     	ItemStack soulsand = new ItemStack(Material.SOUL_SAND);
     	ItemMeta soulsandMeta = soulsand.getItemMeta();
     	ItemStack glowstone = new ItemStack(Material.GLOWSTONE);
     	ItemMeta glowstoneMeta = glowstone.getItemMeta();
     	ItemStack jack = new ItemStack(Material.JACK_O_LANTERN);
     	ItemMeta jackMeta = jack.getItemMeta();
     	ItemStack wglass = new ItemStack(Material.STAINED_GLASS);
     	ItemMeta wglassMeta = wglass.getItemMeta();
     	ItemStack oglass = new ItemStack(Material.STAINED_GLASS, 1, (short)1);
		ItemMeta oglassMeta = oglass.getItemMeta();
		ItemStack mglass = new ItemStack(Material.STAINED_GLASS, 1, (short)2);
		ItemMeta mglassMeta = mglass.getItemMeta();
		ItemStack lbglass = new ItemStack(Material.STAINED_GLASS, 1, (short)3);
		ItemMeta lbglassMeta = lbglass.getItemMeta();
		ItemStack yglass = new ItemStack(Material.STAINED_GLASS, 1, (short)4);
		ItemMeta yglassMeta = yglass.getItemMeta();
		ItemStack lglass = new ItemStack(Material.STAINED_GLASS, 1, (short)5);
		ItemMeta lglassMeta = lglass.getItemMeta();
		ItemStack piglass = new ItemStack(Material.STAINED_GLASS, 1, (short)6);
		ItemMeta piglassMeta = piglass.getItemMeta();
		ItemStack grayglass = new ItemStack(Material.STAINED_GLASS, 1, (short)7);
		ItemMeta grayglassMeta = grayglass.getItemMeta();
		ItemStack lgglass = new ItemStack(Material.STAINED_GLASS, 1, (short)8);
		ItemMeta lgglassMeta = lgglass.getItemMeta();
		ItemStack cglass = new ItemStack(Material.STAINED_GLASS, 1, (short)9);
		ItemMeta cglassMeta = cglass.getItemMeta();
		ItemStack puglass = new ItemStack(Material.STAINED_GLASS, 1, (short)10);
		ItemMeta puglassMeta = puglass.getItemMeta();
		ItemStack blueglass = new ItemStack(Material.STAINED_GLASS, 1, (short)11);
		ItemMeta blueglassMeta = blueglass.getItemMeta();
		ItemStack brglass = new ItemStack(Material.STAINED_GLASS, 1, (short)12);
		ItemMeta brglassMeta = brglass.getItemMeta();
		ItemStack greenglass = new ItemStack(Material.STAINED_GLASS, 1, (short)13);
		ItemMeta greenglassMeta = greenglass.getItemMeta();
		ItemStack rglass = new ItemStack(Material.STAINED_GLASS, 1, (short)14);
		ItemMeta rglassMeta = rglass.getItemMeta();
		ItemStack blackglass = new ItemStack(Material.STAINED_GLASS, 1, (short)15);
		ItemMeta blackglassMeta = blackglass.getItemMeta();
     	ItemStack stonebricks = new ItemStack(Material.SMOOTH_BRICK);
     	ItemMeta stonebricksMeta = stonebricks.getItemMeta();
     	ItemStack mstonebricks = new ItemStack(Material.SMOOTH_BRICK, 1, (short)1);
		ItemMeta mstonebricksMeta = mstonebricks.getItemMeta();
		ItemStack crstonebricks = new ItemStack(Material.SMOOTH_BRICK, 1, (short)2);
		ItemMeta crstonebricksMeta = crstonebricks.getItemMeta();
		ItemStack chstonebricks = new ItemStack(Material.SMOOTH_BRICK, 1, (short)3);
		ItemMeta chstonebricksMeta = chstonebricks.getItemMeta();
		ItemStack melon = new ItemStack(Material.MELON_BLOCK);
     	ItemMeta melonMeta = melon.getItemMeta();
     	ItemStack brickstairs = new ItemStack(Material.BRICK_STAIRS);
     	ItemMeta brickstairsMeta = brickstairs.getItemMeta();
     	ItemStack stonebrickstairs = new ItemStack(Material.SMOOTH_STAIRS);
     	ItemMeta stonebrickstairsMeta = stonebrickstairs.getItemMeta();
     	ItemStack mycelium = new ItemStack(Material.MYCEL);
     	ItemMeta myceliumMeta = mycelium.getItemMeta();
     	ItemStack netherbrick = new ItemStack(Material.NETHER_BRICK);
     	ItemMeta netherbrickMeta = netherbrick.getItemMeta();
     	ItemStack netherbrickstairs = new ItemStack(Material.NETHER_BRICK_STAIRS);
     	ItemMeta netherbrickstairsMeta = netherbrickstairs.getItemMeta();
     	ItemStack endstone = new ItemStack(Material.ENDER_STONE);
     	ItemMeta endstoneMeta = endstone.getItemMeta();
		ItemStack oakslab = new ItemStack(Material.WOOD_STEP);
		ItemMeta oakslabMeta = oakslab.getItemMeta();
		ItemStack spruceslab = new ItemStack(Material.WOOD_STEP, 1, (short)1);
		ItemMeta spruceslabMeta = spruceslab.getItemMeta();
		ItemStack birchslab = new ItemStack(Material.WOOD_STEP, 1, (short)2);
		ItemMeta birchslabMeta = birchslab.getItemMeta();
 
		backMeta.setDisplayName(ChatColor.RED + "Back");
		back.setItemMeta(backMeta);
		nextpageMeta.setDisplayName("Next Page");
		nextpage.setItemMeta(nextpageMeta);
		previouspageMeta.setDisplayName("Previous Page");
		previouspage.setItemMeta(previouspageMeta);
		lineMeta.setDisplayName("-");
		line.setItemMeta(lineMeta);buildp3.setItem(36, line);
		clayMeta.setDisplayName("Clay 16x");
		clay.setItemMeta(clayMeta);
		pumpkinMeta.setDisplayName("Pumpkin 16x");
		pumpkin.setItemMeta(pumpkinMeta);
		netherrackMeta.setDisplayName("Netherrack 16x");
		netherrack.setItemMeta(netherrackMeta);
		soulsandMeta.setDisplayName("Soul Sand 16x");
		soulsand.setItemMeta(soulsandMeta);
		glowstoneMeta.setDisplayName("Glowstone 16x");
		glowstone.setItemMeta(glowstoneMeta);
		jackMeta.setDisplayName("Jack o'Lantern 16x");
		jack.setItemMeta(jackMeta);
		wglassMeta.setDisplayName("White Stained Glass 16x");
		wglass.setItemMeta(wglassMeta);
		oglassMeta.setDisplayName("Orange Stained Glass 16x");
		oglass.setItemMeta(oglassMeta);
		mglassMeta.setDisplayName("Magenta Stained Glass 16x");
		mglass.setItemMeta(mglassMeta);
		lbglassMeta.setDisplayName("Light Blue Stained Glass 16x");
		lbglass.setItemMeta(lbglassMeta);
		yglassMeta.setDisplayName("Yellow Stained Glass 16x");
		yglass.setItemMeta(yglassMeta);
		lglassMeta.setDisplayName("Lime Stained Glass 16x");
		lglass.setItemMeta(lglassMeta);
		piglassMeta.setDisplayName("Pink Stained Glass 16x");
		piglass.setItemMeta(piglassMeta);
		grayglassMeta.setDisplayName("Gray Stained Glass 16x");
		grayglass.setItemMeta(grayglassMeta);
		lgglassMeta.setDisplayName("Light Gray Stained Glass 16x");
		lgglass.setItemMeta(lgglassMeta);
		cglassMeta.setDisplayName("Cyan Stained Glass 16x");
		cglass.setItemMeta(cglassMeta);
		puglassMeta.setDisplayName("Purple Stained Glass 16x");
		puglass.setItemMeta(puglassMeta);
		blueglassMeta.setDisplayName("Blue Stained Glass 16x");
		blueglass.setItemMeta(blueglassMeta);
		brglassMeta.setDisplayName("Brown Stained Glass 16x");
		brglass.setItemMeta(brglassMeta);
		greenglassMeta.setDisplayName("Green Stained Glass 16x");
		greenglass.setItemMeta(greenglassMeta);
		rglassMeta.setDisplayName("Red Stained Glass 16x");
		rglass.setItemMeta(rglassMeta);
		blackglassMeta.setDisplayName("Black Stained Glass 16x");
		blackglass.setItemMeta(blackglassMeta);
		stonebricksMeta.setDisplayName("Stone Bricks 16x");
		stonebricks.setItemMeta(stonebricksMeta);
		mstonebricksMeta.setDisplayName("Mossy Stone Bricks 16x");
		mstonebricks.setItemMeta(mstonebricksMeta);
		crstonebricksMeta.setDisplayName("Cracked Stone Bricks 16x");
		crstonebricks.setItemMeta(crstonebricksMeta);
		chstonebricksMeta.setDisplayName("Chiseled Stone Bricks 16x");
		chstonebricks.setItemMeta(chstonebricksMeta);
		melonMeta.setDisplayName("Melon 16x");
		melon.setItemMeta(melonMeta);
		brickstairsMeta.setDisplayName("Brick Stairs 16x");
		brickstairs.setItemMeta(brickstairsMeta);
		stonebrickstairsMeta.setDisplayName("Stone Brick Stairs 16x");
		stonebrickstairs.setItemMeta(stonebrickstairsMeta);
		myceliumMeta.setDisplayName("Mycelium 16x");
		mycelium.setItemMeta(myceliumMeta);
		netherbrickMeta.setDisplayName("Nether Brick 16x");
		netherbrick.setItemMeta(netherbrickMeta);
		netherbrickstairsMeta.setDisplayName("Nether Brick Stairs 16x");
		netherbrickstairs.setItemMeta(netherbrickstairsMeta);
		endstoneMeta.setDisplayName("End Stone 16x");
		endstone.setItemMeta(endstoneMeta);
		oakslabMeta.setDisplayName("Oak Wood Slab 16x");
		oakslab.setItemMeta(oakslabMeta);
		spruceslabMeta.setDisplayName("Spruce Wood Slab 16x");
		spruceslab.setItemMeta(spruceslabMeta);
		birchslabMeta.setDisplayName("Birch Wood Slab 16x");
		birchslab.setItemMeta(birchslabMeta);
   
		buildp3.setItem(45, previouspage);
		buildp3.setItem(49, back);
		buildp3.setItem(53, nextpage);
		buildp3.setItem(37, line);
		buildp3.setItem(38, line);
		buildp3.setItem(39, line);
		buildp3.setItem(40, line);
		buildp3.setItem(41, line);
		buildp3.setItem(42, line);
		buildp3.setItem(43, line);
		buildp3.setItem(44, line);
		buildp3.setItem(0, clay);
		buildp3.setItem(1, pumpkin);
		buildp3.setItem(2, netherrack);
		buildp3.setItem(3, soulsand);
		buildp3.setItem(4, glowstone);
		buildp3.setItem(5, jack);
		buildp3.setItem(6, wglass);
		buildp3.setItem(7, oglass);
		buildp3.setItem(8, mglass);
		buildp3.setItem(9, lbglass);
		buildp3.setItem(10, yglass);
		buildp3.setItem(11, lglass);
		buildp3.setItem(12, piglass);
		buildp3.setItem(13, grayglass);
		buildp3.setItem(14, lgglass);
		buildp3.setItem(15, cglass);
		buildp3.setItem(16, puglass);
		buildp3.setItem(17, blueglass);
		buildp3.setItem(18, brglass);
		buildp3.setItem(19, greenglass);
		buildp3.setItem(20, rglass);
		buildp3.setItem(21, blackglass);
		buildp3.setItem(22, stonebricks);
		buildp3.setItem(23, mstonebricks);
		buildp3.setItem(24, crstonebricks);
		buildp3.setItem(25, chstonebricks);
		buildp3.setItem(26, melon);
		buildp3.setItem(27, brickstairs);
		buildp3.setItem(28, stonebrickstairs);
		buildp3.setItem(29, mycelium);
		buildp3.setItem(30, netherbrick);
		buildp3.setItem(31, netherbrickstairs);
		buildp3.setItem(32, endstone);
		buildp3.setItem(33, oakslab);
		buildp3.setItem(34, spruceslab);
		buildp3.setItem(35, birchslab);
  
		player.openInventory(buildp3);
	}
}
