package com.tarunthecse.java.listener;

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.types.GenericMessageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MessageListener extends ListenerAdapter {
    String botName;
    private  static final Logger logger = LoggerFactory.getLogger(MessageListener.class);
    public MessageListener(String botName) {
        this.botName = botName;
    }

    @Override
    public void onGenericMessage(GenericMessageEvent event) throws Exception {
        logger.info("Message Received : "+event.getMessage());
        super.onGenericMessage(event);
    }
}
