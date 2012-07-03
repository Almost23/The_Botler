package com.github.HanzVu.TheBotler;

import java.io.IOException;

import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.NickAlreadyInUseException;

public class Main {

	/**
	 * @param args
	 * @throws IrcException 
	 * @throws IOException 
	 * @throws NickAlreadyInUseException 
	 */
	public static void main(String[] args) throws NickAlreadyInUseException, IOException, IrcException {
		TheBotler bot = new TheBotler("The_Botler");
		bot.connect("irc.freenode.net");
		bot.joinChannel("#onehitgamer");
	}

}
