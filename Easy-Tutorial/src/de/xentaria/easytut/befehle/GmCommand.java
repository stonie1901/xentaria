package de.xentaria.easytut.befehle;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.xentaria.easytut.Main;

public class GmCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args)
	{
	  Player p = (Player)cs;
	  if ((p.hasPermission("Xentaria.gm")) || (p.hasPermission("Xentaria.gamemode"))) {
	    if ((label.equalsIgnoreCase("survival")) || (label.equalsIgnoreCase("0"))){
	      if (p.getGameMode() == GameMode.SURVIVAL) {
	        cs.sendMessage(Main.pre + "§r §cDu hast schon Survivalmode!");
	        return true;
	      }
	      p.setGameMode(GameMode.SURVIVAL);
	      p.sendMessage(Main.pre + "§r §6Dein GM wurde auf " + p.getGameMode() + " geändert.");
	      return true;
	    }
	
	    if ((label.equalsIgnoreCase("creative")) || (label.equalsIgnoreCase("1"))) {
	      if (p.getGameMode() == GameMode.CREATIVE) {
	        cs.sendMessage(Main.pre + "§r §cDu hast schon Creativmode!");
	        return true;
	      }
	      p.setGameMode(GameMode.CREATIVE);
	      p.sendMessage(Main.pre + "§r §6Dein GM wurde auf " + p.getGameMode() + " geändert.");
	      return true;
	    }
	
	    if ((label.equalsIgnoreCase("adventure")) || (label.equalsIgnoreCase("2"))){
	      if (p.getGameMode() == GameMode.ADVENTURE) {
	        cs.sendMessage(Main.pre + "§r §cDu hast schon Adventuremode!");
	        return true;
	      }
	      p.setGameMode(GameMode.ADVENTURE);
	      p.sendMessage(Main.pre + "§r §6Dein GM wurde auf " + p.getGameMode() + " geändert.");
	      return true;
	    }
	    
	    if ((label.equalsIgnoreCase("spectator")) || (label.equalsIgnoreCase("3"))) {
		      if (p.getGameMode() == GameMode.SPECTATOR) {
		        cs.sendMessage(Main.pre + "§r §cDu hast schon Adventuremode!");
		        return true;
		      }
		      p.setGameMode(GameMode.SPECTATOR);
		      p.sendMessage(Main.pre + "§r §6Dein GM wurde auf " + p.getGameMode() + " geändert.");
		      return true;
		    }
	  }
	  
	  
	  
	  if (label.equalsIgnoreCase("0"))
	
	  p.sendMessage(Main.noperm);
	  return true;
	}
	
}