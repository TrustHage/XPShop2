package me.trusthage.handlers;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.trusthage.menus.BuyMenu;
import me.trusthage.menus.buy.decoration.DecorP2;
import me.trusthage.other.Main;

public class DecorP1Handler implements Listener{
	
	BuyMenu buymenu = new BuyMenu();
	DecorP2 decorp2 = new DecorP2();
	
	@EventHandler
	public void onDecorP1Click(InventoryClickEvent e){
		
		if (!(e.getInventory().getName()).equalsIgnoreCase("Decoration Blocks         Page: 1")) return;
		
		Player player = (Player)e.getWhoClicked();
		e.setCancelled(true);
		
		if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == Material.AIR) || (!e.getCurrentItem().hasItemMeta()) || (e.getCurrentItem().getItemMeta().getDisplayName().equals("-"))) return;
		Integer cfg = Integer.valueOf(Main.plugin.getConfig().getInt(e.getCurrentItem().getData().toString()));
		Integer lvl = Integer.valueOf(player.getLevel());
		
		if (lvl >= cfg.intValue()){
			switch (e.getCurrentItem().getType()) {
			case BARRIER:
				buymenu.openBuyMenu(player.getPlayer());
				break;
			case ENDER_PEARL:
				decorp2.openDecorBuyP2(player.getPlayer());
				break;
			default:
				player.closeInventory();
				break;
			}
		}
	}
}
