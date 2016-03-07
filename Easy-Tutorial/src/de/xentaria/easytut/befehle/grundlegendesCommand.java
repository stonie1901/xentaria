package de.xentaria.easytut.befehle;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.xentaria.easytut.Main;

public class grundlegendesCommand implements CommandExecutor {

	  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
	  {
	    Player p = (Player)sender;
	    
	    p.sendMessage("§6-----------------------------------------------------");
	    p.sendMessage("§c" + Main.getInstance().getConfig().getString("Info1:"));
	    p.sendMessage("§6-----------------------------------------------------");
	    
	    return true;
	  }
	}