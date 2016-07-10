package me.trusthage.menus.buy.building;
 
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
 
public class BuildP5
{
	public void openBuildBuyP5(Player player)
	{
		Inventory buildp5 = Bukkit.createInventory(null, 54, "Building Blocks             Page: 5");
    
		ItemStack back = new ItemStack(Material.BARRIER);
		ItemMeta backMeta = back.getItemMeta();
		ItemStack previouspage = new ItemStack(Material.ENDER_PEARL);
		ItemMeta previouspageMeta = previouspage.getItemMeta();
		ItemStack line = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
		ItemMeta lineMeta = line.getItemMeta();
		ItemStack prismarine = new ItemStack(Material.PRISMARINE);
		ItemMeta prismarineMeta = prismarine.getItemMeta();
		ItemStack prismarinebricks = new ItemStack(Material.PRISMARINE, 1, (short)1);
		ItemMeta prismarinebricksMeta = prismarinebricks.getItemMeta();
		ItemStack darkprismarine = new ItemStack(Material.PRISMARINE, 1, (short)2);
		ItemMeta darkprismarineMeta = darkprismarine.getItemMeta();
		ItemStack sealantern = new ItemStack(Material.SEA_LANTERN);
		ItemMeta sealanternMeta = sealantern.getItemMeta();
		ItemStack haybale = new ItemStack(Material.HAY_BLOCK);
		ItemMeta haybaleMeta = haybale.getItemMeta();
		ItemStack hardenedclay = new ItemStack(Material.HARD_CLAY);
		ItemMeta hardenedclayMeta = hardenedclay.getItemMeta();
		ItemStack coalblock = new ItemStack(Material.COAL_BLOCK);
		ItemMeta coalblockMeta = coalblock.getItemMeta();
		ItemStack packedice = new ItemStack(Material.PACKED_ICE);
		ItemMeta packediceMeta = packedice.getItemMeta();
		ItemStack rsandstone = new ItemStack(Material.RED_SANDSTONE);
		ItemMeta rsandstoneMeta = rsandstone.getItemMeta();
		ItemStack crsandstone = new ItemStack(Material.RED_SANDSTONE, 1, (short)1);
		ItemMeta crsandstoneMeta = crsandstone.getItemMeta();
		ItemStack srsandstone = new ItemStack(Material.RED_SANDSTONE, 1, (short)2);
		ItemMeta srsandstoneMeta = srsandstone.getItemMeta();
		ItemStack rsandstonestairs = new ItemStack(Material.RED_SANDSTONE_STAIRS);
		ItemMeta rsandstonestairsMeta = rsandstonestairs.getItemMeta();
		ItemStack rsandstoneslab = new ItemStack(Material.STONE_SLAB2);
		ItemMeta rsandstoneslabMeta = rsandstoneslab.getItemMeta();
		ItemStack purpurblock = new ItemStack(Material.PURPUR_BLOCK);
		ItemMeta purpurblockMeta = purpurblock.getItemMeta();
		ItemStack purpurpillar = new ItemStack(Material.PURPUR_PILLAR);
		ItemMeta purpurpillarMeta = purpurpillar.getItemMeta();
		ItemStack purpurstairs = new ItemStack(Material.PURPUR_STAIRS);
		ItemMeta purpurstairsMeta = purpurstairs.getItemMeta();
		ItemStack purpurslab = new ItemStack(Material.PURPUR_SLAB);
		ItemMeta purpurslabMeta = purpurslab.getItemMeta();
		ItemStack endstonebricks = new ItemStack(Material.END_BRICKS);
		ItemMeta endstonebricksMeta = endstonebricks.getItemMeta();

		backMeta.setDisplayName(ChatColor.RED + "Back");
		back.setItemMeta(backMeta);
		previouspageMeta.setDisplayName("Previous Page");
		previouspage.setItemMeta(previouspageMeta);
		lineMeta.setDisplayName("-");
		line.setItemMeta(lineMeta);
		prismarineMeta.setDisplayName("Prismarine 16x:");
		prismarine.setItemMeta(prismarineMeta);
		prismarinebricksMeta.setDisplayName("Prismarine Bricks 16x:");
		prismarinebricks.setItemMeta(prismarinebricksMeta);
		darkprismarineMeta.setDisplayName("Dark Prismarine 16x:");
		darkprismarine.setItemMeta(darkprismarineMeta);
		sealanternMeta.setDisplayName("Sea Lantern 16x:");
		sealantern.setItemMeta(sealanternMeta);
		haybaleMeta.setDisplayName("Hay Bale 16x:");
		haybale.setItemMeta(haybaleMeta);
		hardenedclayMeta.setDisplayName("Hardened Clay 16x:");
		hardenedclay.setItemMeta(hardenedclayMeta);
		coalblockMeta.setDisplayName("Block of Coal 16x:");
		coalblock.setItemMeta(coalblockMeta);
		packediceMeta.setDisplayName("Packed Ice 16x:");
		packedice.setItemMeta(packediceMeta);
		rsandstoneMeta.setDisplayName("Red Sandstone 16x:");
		rsandstone.setItemMeta(rsandstoneMeta);
		crsandstoneMeta.setDisplayName("Chiseled Red Sandstone 16x:");
		crsandstone.setItemMeta(crsandstoneMeta);
		srsandstoneMeta.setDisplayName("Smooth Red Sandstone 16x:");
		srsandstone.setItemMeta(srsandstoneMeta);
		rsandstonestairsMeta.setDisplayName("Red Sandstone Stairs 16x:");
		rsandstonestairs.setItemMeta(rsandstonestairsMeta);
		rsandstoneslabMeta.setDisplayName("Red Sandstone Slab 16x:");
		rsandstoneslab.setItemMeta(rsandstoneslabMeta);
		purpurblockMeta.setDisplayName("Purpur Block 16x:");
		purpurblock.setItemMeta(purpurblockMeta);
		purpurpillarMeta.setDisplayName("Purpur Pillar 16x:");
		purpurpillar.setItemMeta(purpurpillarMeta);
		purpurstairsMeta.setDisplayName("Purpur Stairs 16x:");
		purpurstairs.setItemMeta(purpurstairsMeta);
		purpurslabMeta.setDisplayName("Purpur Slab 16x:");
		purpurslab.setItemMeta(purpurslabMeta);
		endstonebricksMeta.setDisplayName("End Stone Bricks 16x:");
		endstonebricks.setItemMeta(endstonebricksMeta);
		
		buildp5.setItem(36, line);
		buildp5.setItem(45, previouspage);
		buildp5.setItem(49, back);
		buildp5.setItem(37, line);
		buildp5.setItem(38, line);
		buildp5.setItem(39, line);
		buildp5.setItem(40, line);
		buildp5.setItem(41, line);
		buildp5.setItem(42, line);
		buildp5.setItem(43, line);
		buildp5.setItem(44, line);
		buildp5.setItem(0, prismarine);
		buildp5.setItem(1, prismarinebricks);
		buildp5.setItem(2, darkprismarine);
		buildp5.setItem(3, sealantern);
		buildp5.setItem(4, haybale);
		buildp5.setItem(5, hardenedclay);
		buildp5.setItem(6, coalblock);
		buildp5.setItem(7, packedice);
		buildp5.setItem(8, rsandstone);
		buildp5.setItem(9, crsandstone);
		buildp5.setItem(10, srsandstone);
		buildp5.setItem(11, rsandstonestairs);
		buildp5.setItem(12, rsandstoneslab);
		buildp5.setItem(13, purpurblock);
		buildp5.setItem(14, purpurpillar);
		buildp5.setItem(15, purpurstairs);
		buildp5.setItem(16, purpurslab);
		buildp5.setItem(17, endstonebricks);
    
		player.openInventory(buildp5);
	}
}


