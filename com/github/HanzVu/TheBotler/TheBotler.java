package com.github.HanzVu.TheBotler;

import org.jibble.pircbot.*;

public class TheBotler extends PircBot {
	public TheBotler(String name){
		this.setName(name);
	}
	
	public void onJoin(String channel, String sender, String logon, String hostname){
		if (!sender.equals(this.getName()))
			this.sendMessage(channel, "Welcome, Master " + sender + " .");
	}
	
	public void onMessage(String channel, String sender,
            String login, String hostname, String message){
		if (message.equalsIgnoreCase("!The_Botler"))
			sendMessage(channel,"Why, hello, Master " + sender + "!");
		if (message.equalsIgnoreCase("!quit")){
			sendMessage(channel, "Good bye, gentlemen");
			this.partChannel("#onehitgamer", "Disconnecting");
			this.quitServer();
		}
	}
	
	
}
