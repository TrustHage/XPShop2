package me.trusthage.menus.buy.decoration;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DecorP2 
{

	public void openDecorBuyP2(Player player){
		
		Inventory decorp2 = Bukkit.createInventory(null, 54, "Decoration Blocks         Page: 2");
		/*
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta();
		ItemStack  = new ItemStack(Material.);
		ItemMeta Meta = .getItemMeta(); */
		ItemStack back = new ItemStack(Material.BARRIER);
		ItemMeta backMeta = back.getItemMeta();
		ItemStack nextpage = new ItemStack(Material.ENDER_PEARL);
		ItemMeta nextpageMeta = nextpage.getItemMeta();
		ItemStack line = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
		ItemMeta lineMeta = line.getItemMeta();
		ItemStack previouspage = new ItemStack(Material.ENDER_PEARL);
		ItemMeta previouspageMeta = previouspage.getItemMeta();
/*
		Meta.setDisplayName("");	
		.setItemMeta(Meta);
		Meta.setDisplayName("");	
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);	
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta);
		Meta.setDisplayName("");
		.setItemMeta(Meta); */
		backMeta.setDisplayName(ChatColor.RED + "Back");
		back.setItemMeta(backMeta);
		nextpageMeta.setDisplayName("Next Page");
		nextpage.setItemMeta(nextpageMeta);
		lineMeta.setDisplayName("-");
		line.setItemMeta(lineMeta);
		previouspageMeta.setDisplayName("Previous Page");
		previouspage.setItemMeta(previouspageMeta);
/*
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, );
		decorp2.setItem(, ); */
		decorp2.setItem(36, line);
		decorp2.setItem(37, line);
		decorp2.setItem(38, line);
		decorp2.setItem(39, line);
		decorp2.setItem(40, line);
		decorp2.setItem(41, line);
		decorp2.setItem(42, line);
		decorp2.setItem(43, line);
		decorp2.setItem(44, line);
		decorp2.setItem(49, back);
		decorp2.setItem(53, nextpage);
		decorp2.setItem(45, previouspage);
		
		player.openInventory(decorp2);
	}
	
}