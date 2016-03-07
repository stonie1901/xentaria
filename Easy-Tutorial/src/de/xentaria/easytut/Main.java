package de.xentaria.easytut;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.xentaria.easytut.befehle.CleanerCommand;
import de.xentaria.easytut.befehle.FacebookCommand;
import de.xentaria.easytut.befehle.ForumCommand;
import de.xentaria.easytut.befehle.HelpCommand;
import de.xentaria.easytut.befehle.ReloadSocialCommand;
import de.xentaria.easytut.befehle.RulesCommand;
import de.xentaria.easytut.befehle.Social;
import de.xentaria.easytut.befehle.TeamSpeakCommand;
import de.xentaria.easytut.befehle.TwitterCommand;
import de.xentaria.easytut.befehle.WebsiteCommand;
import de.xentaria.easytut.befehle.grundlegendesCommand;
import de.xentaria.easytut.events.ReloadNachricht;

public class Main extends JavaPlugin{
	
	private static Main instance;
	
	public static String pre = "§7[§5Xentaria.de§7] §b";
	public static String noperm = pre + "§4Keine Rechte!";	
	
	@Override
	public void onDisable(){
		getLogger().info("[Xentaria.de] Das Tutorialplugin wurde beendet!");
	}
	
	@Override
	public void onEnable(){
		

		
		instance = this;
		
		getLogger().info("[Xentaria.de] Das Tutorialplugin wurde gestartet");
		
		/*getCommand("help").setExecutor(new HelpCommand());
		getCommand("hilfe").setExecutor(new HelpCommand());
	    getCommand("grundlegendes").setExecutor(new grundlegendesCommand());
	    getCommand("test1").setExecutor(new TwitterCommand());
	    getCommand("test2").setExecutor(new TeamSpeakCommand());
	    getCommand("test3").setExecutor(new RulesCommand());
	    getCommand("test4").setExecutor(new ForumCommand());
	    getCommand("test5").setExecutor(new WebsiteCommand());
	    getCommand("test6").setExecutor(new ReloadSocialCommand()); */
	    
	    
	    // Dieser Bereich ist der soziale Bereich
	    getCommand("social").setExecutor(new Social());
	    getCommand("facebook").setExecutor(new FacebookCommand());
	    getCommand("twitter").setExecutor(new TwitterCommand());
	    getCommand("teamspeak").setExecutor(new TeamSpeakCommand());
	    getCommand("regeln").setExecutor(new RulesCommand());
	    getCommand("forum").setExecutor(new ForumCommand());
	    getCommand("webseite").setExecutor(new WebsiteCommand());
	    getCommand("reloadsocial").setExecutor(new ReloadSocialCommand());
	    
	    // sonstige Commands
	    getCommand("cc").setExecutor(new CleanerCommand());
	    
	    
	    // Pluginmanager
	    PluginManager pm = Bukkit.getPluginManager();
	    pm.registerEvents(new ReloadNachricht(), this);
	}
	
	public static Main getInstance(){
		return instance;
	}
	
}
