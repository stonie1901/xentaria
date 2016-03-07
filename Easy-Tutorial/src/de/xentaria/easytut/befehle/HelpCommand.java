package de.xentaria.easytut.befehle;

import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import net.minecraft.server.v1_8_R3.PlayerConnection;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class HelpCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    Player p = (Player)sender;
    
    p.sendMessage("§6-----------------------------------------------------");
    p.sendMessage("§2Xentaria-Hilfeseiten:");
    p.sendMessage("");
    p.sendMessage("§2Dies sind die Hilfeseiten. Wähle hier aus, worüber du dich informieren willst.");
    p.sendMessage("§Du brauchst die Punkte nur anklicken.");
    p.sendMessage("");
    
    IChatBaseComponent comp = 
      IChatBaseComponent.ChatSerializer.a("{\"text\":\"§cGrundlegendes\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/grundlegendes\"}}");
    PacketPlayOutChat packet = new PacketPlayOutChat(comp);
    ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);
    

    IChatBaseComponent compTwitter = 
      IChatBaseComponent.ChatSerializer.a("{\"text\":\"§cTwitter\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/twitter\"}}");
    PacketPlayOutChat packetTwitter = new PacketPlayOutChat(compTwitter);
    ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packetTwitter);
    

    IChatBaseComponent compTs = 
      IChatBaseComponent.ChatSerializer.a("{\"text\":\"§cTeamspeak\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/teamspeak\"}}");
    PacketPlayOutChat packetTs = new PacketPlayOutChat(compTs);
    ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packetTs);
    

    IChatBaseComponent compRegeln = 
      IChatBaseComponent.ChatSerializer.a("{\"text\":\"§cRegeln\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/regeln\"}}");
    PacketPlayOutChat packetRegeln = new PacketPlayOutChat(compRegeln);
    ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packetRegeln);
    

    IChatBaseComponent compForum = 
      IChatBaseComponent.ChatSerializer.a("{\"text\":\"§cForum\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/forum\"}}");
    PacketPlayOutChat packetForum = new PacketPlayOutChat(compForum);
    ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packetForum);
    

    IChatBaseComponent compHp = 
      IChatBaseComponent.ChatSerializer.a("{\"text\":\"§cWebseite\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/webseite\"}}");
    PacketPlayOutChat packetHp = new PacketPlayOutChat(compHp);
    ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packetHp);
    p.sendMessage("§6-----------------------------------------------------");
    
    return true;
  }
}
