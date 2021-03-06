package me.trusthage.menus.buy.decoration;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DecorP1 
{
	
	public void openDecorBuyP1(Player player){
		
		Inventory decorp1 = Bukkit.createInventory(null, 54, "Decoration Blocks         Page: 1");
		
		ItemStack oaksapling = new ItemStack(Material.SAPLING);
		ItemMeta oaksaplingMeta = oaksapling.getItemMeta();
		ItemStack sprucesapling = new ItemStack(Material.SAPLING, 1, (short)1);
		ItemMeta sprucesaplingMeta = sprucesapling.getItemMeta();
		ItemStack birchsapling = new ItemStack(Material.SAPLING, 1, (short)2);
		ItemMeta birchsaplingMeta = birchsapling.getItemMeta();
		ItemStack junglesapling = new ItemStack(Material.SAPLING, 1, (short)3);
		ItemMeta junglesaplingMeta = junglesapling.getItemMeta();
		ItemStack acaciasapling = new ItemStack(Material.SAPLING, 1, (short)4);
		ItemMeta acaciasaplingMeta = acaciasapling.getItemMeta();
		ItemStack doaksapling = new ItemStack(Material.SAPLING, 1, (short)5);
		ItemMeta doaksaplingMeta = doaksapling.getItemMeta();
		ItemStack oakleaves = new ItemStack(Material.LEAVES);
		ItemMeta oakleavesMeta = oakleaves.getItemMeta();
		ItemStack spruceleaves = new ItemStack(Material.LEAVES, 1, (short)1);
		ItemMeta spruceleavesMeta = spruceleaves.getItemMeta();
		ItemStack birchleaves = new ItemStack(Material.LEAVES, 1, (short)2);
		ItemMeta birchleavesMeta = birchleaves.getItemMeta();
		ItemStack jungleleaves = new ItemStack(Material.LEAVES, 1, (short)3);
		ItemMeta jungleleavesMeta = jungleleaves.getItemMeta();
		ItemStack cobweb = new ItemStack(Material.WEB);
		ItemMeta cobwebMeta = cobweb.getItemMeta();
		ItemStack grass = new ItemStack(Material.LONG_GRASS, 1, (short)1);
		ItemMeta grassMeta = grass.getItemMeta();
		ItemStack fern = new ItemStack(Material.LONG_GRASS, 1, (short)2);
		ItemMeta fernMeta = fern.getItemMeta();
		ItemStack deadbush = new ItemStack(Material.DEAD_BUSH);
		ItemMeta deadbushMeta = deadbush.getItemMeta();
		ItemStack dandelion = new ItemStack(Material.YELLOW_FLOWER);
		ItemMeta dandelionMeta = dandelion.getItemMeta();
		ItemStack poppy = new ItemStack(Material.RED_ROSE);
		ItemMeta poppyMeta = poppy.getItemMeta();
		ItemStack blueorchid = new ItemStack(Material.RED_ROSE, 1, (short)1);
		ItemMeta blueorchidMeta = blueorchid.getItemMeta();
		ItemStack allium = new ItemStack(Material.RED_ROSE, 1, (short)2);
		ItemMeta alliumMeta = allium.getItemMeta();
		ItemStack azure = new ItemStack(Material.RED_ROSE, 1, (short)3);
		ItemMeta azureMeta = azure.getItemMeta();
		ItemStack redtulip = new ItemStack(Material.RED_ROSE, 1, (short)4);
		ItemMeta redtulipMeta = redtulip.getItemMeta();
		ItemStack orangetulip = new ItemStack(Material.RED_ROSE, 1, (short)5);
		ItemMeta orangetulipMeta = orangetulip.getItemMeta();
		ItemStack whitetulip = new ItemStack(Material.RED_ROSE, 1, (short)6);
		ItemMeta whitetulipMeta = whitetulip.getItemMeta();
		ItemStack pinktulip = new ItemStack(Material.RED_ROSE, 1, (short)7);
		ItemMeta pinktulipMeta = pinktulip.getItemMeta();
		ItemStack oxeye = new ItemStack(Material.RED_ROSE, 1, (short)8);
		ItemMeta oxeyeMeta = oxeye.getItemMeta();
		ItemStack bmushroom = new ItemStack(Material.BROWN_MUSHROOM);
		ItemMeta bmushroomMeta = bmushroom.getItemMeta();
		ItemStack rmushroom = new ItemStack(Material.RED_MUSHROOM);
		ItemMeta rmushroomMeta = rmushroom.getItemMeta();
		ItemStack torch = new ItemStack(Material.TORCH);
		ItemMeta torchMeta = torch.getItemMeta();
		ItemStack chest = new ItemStack(Material.CHEST);
		ItemMeta chestMeta = chest.getItemMeta();
		ItemStack craftingtable = new ItemStack(Material.WORKBENCH);
		ItemMeta craftingtableMeta = craftingtable.getItemMeta();
		ItemStack furnace = new ItemStack(Material.FURNACE);
		ItemMeta furnaceMeta = furnace.getItemMeta();
		ItemStack ladder = new ItemStack(Material.LADDER);
		ItemMeta ladderMeta = ladder.getItemMeta();
		ItemStack snow = new ItemStack(Material.SNOW);
		ItemMeta snowMeta = snow.getItemMeta();
		ItemStack cactus = new ItemStack(Material.CACTUS);
		ItemMeta cactusMeta = cactus.getItemMeta();
		ItemStack jukebox = new ItemStack(Material.JUKEBOX);
		ItemMeta jukeboxMeta = jukebox.getItemMeta();
		ItemStack fence = new ItemStack(Material.FENCE);
		ItemMeta fenceMeta = fence.getItemMeta();
		ItemStack ironbars = new ItemStack(Material.IRON_FENCE);
		ItemMeta ironbarsMeta = ironbars.getItemMeta();
		ItemStack back = new ItemStack(Material.BARRIER);
		ItemMeta backMeta = back.getItemMeta();
		ItemStack nextpage = new ItemStack(Material.ENDER_PEARL);
		ItemMeta nextpageMeta = nextpage.getItemMeta();
		ItemStack line = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
		ItemMeta lineMeta = line.getItemMeta();

		oaksaplingMeta.setDisplayName("Oak Sapling 16x:");	
		oaksapling.setItemMeta(oaksaplingMeta);
		sprucesaplingMeta.setDisplayName("Spruce Sapling 16x:");	
		sprucesapling.setItemMeta(sprucesaplingMeta);
		birchsaplingMeta.setDisplayName("Birch Sapling 16x:");
		birchsapling.setItemMeta(birchsaplingMeta);	
		junglesaplingMeta.setDisplayName("Jungle Sapling 16x:");
		junglesapling.setItemMeta(junglesaplingMeta);
		acaciasaplingMeta.setDisplayName("Acacia Sapling 16x:");
		acaciasapling.setItemMeta(acaciasaplingMeta);
		doaksaplingMeta.setDisplayName("Dark Oak Sapling 16x:");
		doaksapling.setItemMeta(doaksaplingMeta);
		oakleavesMeta.setDisplayName("Oak Leaves 16x:");
		oakleaves.setItemMeta(oakleavesMeta);
		spruceleavesMeta.setDisplayName("Spruce Leaves 16x:");
		spruceleaves.setItemMeta(spruceleavesMeta);
		birchleavesMeta.setDisplayName("Birch Leaves 16x:");
		birchleaves.setItemMeta(birchleavesMeta);
		jungleleavesMeta.setDisplayName("Jungle Leaves 16x:");
		jungleleaves.setItemMeta(jungleleavesMeta);
		cobwebMeta.setDisplayName("Cobweb 16x:");
		cobweb.setItemMeta(cobwebMeta);
		grassMeta.setDisplayName("Grass 16x:");
		grass.setItemMeta(grassMeta);
		fernMeta.setDisplayName("Fern 16x:");
		fern.setItemMeta(fernMeta);
		deadbushMeta.setDisplayName("Dead Bush 16x:");
		deadbush.setItemMeta(deadbushMeta);
		dandelionMeta.setDisplayName("Dandelion 16x:");
		dandelion.setItemMeta(dandelionMeta);
		poppyMeta.setDisplayName("Poppy 16x:");
		poppy.setItemMeta(poppyMeta);
		blueorchidMeta.setDisplayName("Blue Orchid 16x:");
		blueorchid.setItemMeta(blueorchidMeta);
		alliumMeta.setDisplayName("Allium 16x:");
		allium.setItemMeta(alliumMeta);
		azureMeta.setDisplayName("Azure Bluet 16x:");
		azure.setItemMeta(azureMeta);
		redtulipMeta.setDisplayName("Red Tulip 16x:");
		redtulip.setItemMeta(redtulipMeta);
		orangetulipMeta.setDisplayName("Orange Tulip 16x:");
		orangetulip.setItemMeta(orangetulipMeta);
		whitetulipMeta.setDisplayName("White Tulip 16x:");
		whitetulip.setItemMeta(whitetulipMeta);
		pinktulipMeta.setDisplayName("Pink Tulip 16x:");
		pinktulip.setItemMeta(pinktulipMeta);
		oxeyeMeta.setDisplayName("Oxeye Daisy 16x:");
		oxeye.setItemMeta(oxeyeMeta);
		bmushroomMeta.setDisplayName("Mushroom 16x:");
		bmushroom.setItemMeta(bmushroomMeta);
		rmushroomMeta.setDisplayName("Mushroom 16x:");
		rmushroom.setItemMeta(rmushroomMeta);
		torchMeta.setDisplayName("Torch 16x:");
		torch.setItemMeta(torchMeta);
		chestMeta.setDisplayName("Chest 16x:");
		chest.setItemMeta(chestMeta);
		craftingtableMeta.setDisplayName("Crafting Table 1x:");
		craftingtable.setItemMeta(craftingtableMeta);
		furnaceMeta.setDisplayName("Furnace 1x:");
		furnace.setItemMeta(furnaceMeta);
		ladderMeta.setDisplayName("Ladder 16x:");
		ladder.setItemMeta(ladderMeta);
		snowMeta.setDisplayName("Snow 16x:");
		snow.setItemMeta(snowMeta);
		cactusMeta.setDisplayName("Cactus 16x:");
		cactus.setItemMeta(cactusMeta);
		jukeboxMeta.setDisplayName("Jukebox 16x:");
		jukebox.setItemMeta(jukeboxMeta);
		fenceMeta.setDisplayName("Oak Fence 16x:");
		fence.setItemMeta(fenceMeta);
		ironbarsMeta.setDisplayName("Iron Bars 16x:");
		ironbars.setItemMeta(ironbarsMeta);
		backMeta.setDisplayName(ChatColor.RED + "Back");
		back.setItemMeta(backMeta);
		nextpageMeta.setDisplayName("Next Page");
		nextpage.setItemMeta(nextpageMeta);
		lineMeta.setDisplayName("-");
		line.setItemMeta(lineMeta);
		
		decorp1.setItem(0, oaksapling);
		decorp1.setItem(1, sprucesapling);
		decorp1.setItem(2, birchsapling);
		decorp1.setItem(3, junglesapling);
		decorp1.setItem(4, acaciasapling);
		decorp1.setItem(5, doaksapling);
		decorp1.setItem(6, oakleaves);
		decorp1.setItem(7, spruceleaves);
		decorp1.setItem(8, birchleaves);
		decorp1.setItem(9, jungleleaves);
		decorp1.setItem(10, cobweb);
		decorp1.setItem(11, grass);
		decorp1.setItem(12, fern);
		decorp1.setItem(13, deadbush);
		decorp1.setItem(14, dandelion);
		decorp1.setItem(15, poppy);
		decorp1.setItem(16, blueorchid);
		decorp1.setItem(17, allium);
		decorp1.setItem(18, azure);
		decorp1.setItem(19, redtulip);
		decorp1.setItem(20, orangetulip);
		decorp1.setItem(21, whitetulip);
		decorp1.setItem(22, pinktulip);
		decorp1.setItem(23, oxeye);
		decorp1.setItem(24, bmushroom);
		decorp1.setItem(25, rmushroom);
		decorp1.setItem(26, torch);
		decorp1.setItem(27, chest);
		decorp1.setItem(28, craftingtable);
		decorp1.setItem(29, furnace);
		decorp1.setItem(30, ladder);
		decorp1.setItem(31, snow);
		decorp1.setItem(32, cactus);
		decorp1.setItem(33, jukebox);
		decorp1.setItem(34, fence);
		decorp1.setItem(35, ironbars);
		decorp1.setItem(36, line);
		decorp1.setItem(37, line);
		decorp1.setItem(38, line);
		decorp1.setItem(39, line);
		decorp1.setItem(40, line);
		decorp1.setItem(41, line);
		decorp1.setItem(42, line);
		decorp1.setItem(43, line);
		decorp1.setItem(44, line);
		decorp1.setItem(49, back);
		decorp1.setItem(53, nextpage);
		
		player.openInventory(decorp1);
	}

}
