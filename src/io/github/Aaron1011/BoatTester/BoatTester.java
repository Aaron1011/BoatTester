package io.github.Aaron1011.BoatTester;


import javax.xml.ws.Dispatch;

import net.minecraft.server.v1_7_R1.DataWatcher;
import net.minecraft.server.v1_7_R1.EntityBoat;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.Player;
import org.bukkit.entity.Vehicle;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;
import org.bukkit.util.BlockIterator;


public class BoatTester extends JavaPlugin {
    @Override
    public void onEnable(){
    	/*Team red = board.registerNewTeam("Red");
    	Team blue = board.registerNewTeam("Blue");
    	Objective kills = board.registerNewObjective("Kills", "dummy");
    	kills.setDisplaySlot(DisplaySlot.SIDEBAR);
    	red.setCanSeeFriendlyInvisibles(true);
    	blue.setCanSeeFriendlyInvisibles(true);
    	red.setAllowFriendlyFire(false);
    	blue.setAllowFriendlyFire(false);*/
    	getServer().getPluginManager().registerEvents(new VehicleDamageListener(), this);
    }

    
	/*public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if (cmd.getName().equalsIgnoreCase("testBoat")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("This command can only be run by a player.");
			}
			else {
				Player player = (Player) sender;
				BlockIterator iter = new BlockIterator(player);
				if (iter.hasNext()) {
					Entity[] entities = iter.next().getChunk().getEntities();
					for (Entity entity: entities) {
						sender.sendMessage("Entity: " + entity.toString());
						if (entity instanceof Boat) {
							Boat boat = (Boat) entity;
							sender.sendMessage("Damage: " + boat.getDamage());
						}
					}
				}
				return true;
			}
		}
		//If this has happened the function will return true. 
	        // If this hasn't happened the a value of false will be returned.
		return false; 
		
		
	}*/
				
}