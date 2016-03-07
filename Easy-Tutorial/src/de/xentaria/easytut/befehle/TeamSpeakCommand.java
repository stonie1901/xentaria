package de.xentaria.easytut.befehle;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import de.xentaria.easytut.Main;

public class TeamSpeakCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    Player p = (Player)sender;
    
    p.sendMessage("§6-----------------------------------------------------");
    p.sendMessage("Besuche uns auf Teamspeak!");
    p.sendMessage("");
    p.sendMessage("Teamspeak Ip:");
    p.sendMessage("§c" + Main.getInstance().getConfig().getString("teamspeak"));
    p.sendMessage("§6-----------------------------------------------------");
    
    return true;
  }
}
