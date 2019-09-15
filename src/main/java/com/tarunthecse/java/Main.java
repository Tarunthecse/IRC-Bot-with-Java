package com.tarunthecse.java;

import com.tarunthecse.java.listener.MessageListener;
import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.exception.IrcException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final String BOT_NAME = "TestBotTarun";
    private static final String SERVER = "chat.freenode.net";
    private static final String CHANNEL = "#testChannelTarun";
    public static void main(String[] args) throws IOException, IrcException {
        logger.info("Inside Main Method");
        Configuration configuration = new Configuration.Builder()
                .setName(BOT_NAME)
                .setRealName(BOT_NAME)
                .setLogin(BOT_NAME)
                .addServer(SERVER)
                .addAutoJoinChannel(CHANNEL)
                .addListener(new MessageListener(BOT_NAME))
                .buildConfiguration();
        PircBotX botX = new PircBotX(configuration);
        botX.startBot();
    }
}
