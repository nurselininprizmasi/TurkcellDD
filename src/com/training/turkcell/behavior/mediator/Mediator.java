package com.training.turkcell.behavior.mediator;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Mediator {

    private Map<String, IMsgListener> map = new ConcurrentHashMap<>();

    public void sendMesssage(IMsgListener iMsgListener, String message) {
        Collection<IMsgListener> values = map.values();
        for (IMsgListener msgListener : values) {
            if (iMsgListener != null) {
                msgListener.messageReceived(message);
            }

        }
    }

    public void sendMesssage(String message) {
        Collection<IMsgListener> values = map.values();
        for (IMsgListener msgListener : values) {
            msgListener.messageReceived(message);

        }
    }

    public void register(IMsgListener iMsgListener) {
        this.map.put(iMsgListener.getName(), iMsgListener);
    }
}
