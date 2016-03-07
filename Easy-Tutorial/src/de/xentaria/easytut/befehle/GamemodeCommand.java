package de.xentaria.easytut.befehle;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.xentaria.easytut.Main;

public class GamemodeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		Player p = (Player) cs;
		
		if(!(p.hasPermission("xentaria.gm"))){
			p.sendMessage(Main.noperm);
			return true;
		}
		
		if(args.length == 0) {
			if(label == "0"){
				if (p.getGameMode() == GameMode.SURVIVAL) {
			        cs.sendMessage(Main.pre + "§r §cDu hast schon Survivalmode!");
			        return true;
			      }
			      p.setGameMode(GameMode.SURVIVAL);
			      p.sendMessage(Main.pre + "§r §6Dein GM wurde auf " + p.getGameMode() + " geändert.");
			      return true;
			} else if(label == "1"){
				if (p.getGameMode() == GameMode.CREATIVE) {
			        cs.sendMessage(Main.pre + "§r §cDu hast schon Creativodus!");
			        return true;
			      }
			      p.setGameMode(GameMode.CREATIVE);
			      p.sendMessage(Main.pre + "§r §6Dein GM wurde auf " + p.getGameMode() + " geändert.");
			      return true;
			} else if(label == "2"){
				if (p.getGameMode() == GameMode.ADVENTURE) {
			        cs.sendMessage(Main.pre + "§r §cDu bist schon im Adventuremodus!");
			        return true;
			      }
			      p.setGameMode(GameMode.ADVENTURE);
			      p.sendMessage(Main.pre + "§r §6Dein GM wurde auf " + p.getGameMode() + " geändert.");
			      return true;
			} else if(label == "3"){
				if (p.getGameMode() == GameMode.SPECTATOR) {
			        cs.sendMessage(Main.pre + "§r §cDu bist schon im Spectatormodus!");
			        return true;
			      }
			      p.setGameMode(GameMode.SURVIVAL);
			      p.sendMessage(Main.pre + "§r §6Dein GM wurde auf " + p.getGameMode() + " geändert.");
			      return true;
			}
		} else if(args.length == 1){
			if(!(p.hasPermission("xentaria.gm.others"))) {
				p.sendMessage(Main.noperm);
				return true;
			}
			try {
				Player spieler2 = Bukkit.getPlayer(args[0]);
				
				
				if(label == "0"){
					if (spieler2.getGameMode() == GameMode.SURVIVAL) {
						p.sendMessage(Main.pre + "§r §cDiser Spieler ist bereits im Survivalmode!");
				        return true;
				      }
					  	spieler2.setGameMode(GameMode.SURVIVAL);
					  	spieler2.sendMessage(Main.pre + "§r §6Dein GM wurde von " + p.getName() + " auf " + spieler2.getGameMode() + " geändert.");
					  	p.sendMessage(Main.pre + "Gamemode erfolgreich verändert");
					  	return true;
				} else if(label == "1"){
					if (spieler2.getGameMode() == GameMode.CREATIVE) {
				        p.sendMessage(Main.pre + "§r §cDieser Spieler ist bereits im Creativodus!");
				        return true;
				      }
						spieler2.setGameMode(GameMode.CREATIVE);
						spieler2.sendMessage(Main.pre + "§r §6Dein GM wurde von " + p.getName() + " auf " + spieler2.getGameMode() + " geändert.");
						p.sendMessage(Main.pre + "Gamemode erfolgreich verändert");
						return true;
				} else if(label == "2"){
					if (spieler2.getGameMode() == GameMode.ADVENTURE) {
				        p.sendMessage(Main.pre + "§r §cDieser Spieler ist bereits im Adventuremodus!");
				        return true;
				      }
						spieler2.setGameMode(GameMode.ADVENTURE);
						spieler2.sendMessage(Main.pre + "§r §6Dein GM wurde von " + p.getName() + " auf " + spieler2.getGameMode() + " geändert.");
						p.sendMessage(Main.pre + "Gamemode erfolgreich verändert");
						return true;
				} else if(label == "3"){
					if (p.getGameMode() == GameMode.SPECTATOR) {
				        p.sendMessage(Main.pre + "§r §cDieser Spieler ist bereits im Spectatormodus!");
				        return true;
				      }
						spieler2.setGameMode(GameMode.SURVIVAL);
						spieler2.sendMessage(Main.pre + "§r §6Dein GM wurde von " + p.getName() + " auf " + spieler2.getGameMode() + " geändert.");
				      	p.sendMessage(Main.pre + "Gamemode erfolgreich verändert");
				      	return true;
				}
				
			} catch (NullPointerException e){
				p.sendMessage(Main.pre + "Der angegebene Spieler ist offline: §7" + args[0]);
			
			}
		}else {
			p.sendMessage(Main.pre + "Bitte benutze /gm <Zahl> [Spieler]");
		}
		
		return true;
	}

}
