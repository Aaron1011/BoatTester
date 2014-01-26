package io.github.Aaron1011.BoatTester;

import org.bukkit.Bukkit;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Player;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleDamageEvent;

public class VehicleDamageListener implements Listener {
	@EventHandler
	public void onVehicleDamage(VehicleDamageEvent event) {
		for (Player player: Bukkit.getOnlinePlayers()) {
			Vehicle vehicle = event.getVehicle();
			if (vehicle instanceof Boat) {
				Boat boat = (Boat) vehicle;
				player.sendMessage("Boat damage: " + boat.getDamage());
			}

		}

	}
}
