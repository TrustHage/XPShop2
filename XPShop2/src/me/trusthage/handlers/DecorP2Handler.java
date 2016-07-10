package me.trusthage.handlers;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.trusthage.menus.BuyMenu;
import me.trusthage.menus.buy.decoration.DecorP1;
import me.trusthage.menus.buy.decoration.DecorP3;
import me.trusthage.other.Main;

public class DecorP2Handler implements Listener{

	BuyMenu buymenu = new BuyMenu();
	DecorP1 decorp1 = new DecorP1();
	DecorP3 decorp3 = new DecorP3();
	
	@EventHandler
	public void onDecorP2Click(InventoryClickEvent e){
		
		if (!(e.getInventory().getName()).equalsIgnoreCase("Decoration Blocks         Page: 2")) return;
		
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
				if(e.getCurrentItem().getItemMeta().getDisplayName().equals("Next Page")){
					decorp3.openDecorBuyP3(player.getPlayer());
				}else{
					decorp1.openDecorBuyP1(player.getPlayer());
				}		
				break;
			default:
				player.closeInventory();
				break;
			}
		}
	}
	
}
