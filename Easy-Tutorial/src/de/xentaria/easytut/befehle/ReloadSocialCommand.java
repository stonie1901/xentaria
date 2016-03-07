package de.xentaria.easytut.befehle;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.xentaria.easytut.Main;

public class ReloadSocialCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    Player p = (Player)sender;
    if (p.isOp())
    {
      Main.getInstance().reloadConfig();
      p.sendMessage("§6Config wurde erfolgreich neu geladen!");
    }
    return true;
  }
}
