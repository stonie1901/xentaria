package de.xentaria.easytut.befehle;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.xentaria.easytut.Main;

public class FacebookCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    Player p = (Player)sender;
    
    p.sendMessage("§6-----------------------------------------------------");
    p.sendMessage("Folge und like uns auf Facebook!");
    p.sendMessage("");
    p.sendMessage("Facebooklink:");
    p.sendMessage("§c" + Main.getInstance().getConfig().getString("facebook"));
    p.sendMessage("§6-----------------------------------------------------");
    
    return true;
  }
}
