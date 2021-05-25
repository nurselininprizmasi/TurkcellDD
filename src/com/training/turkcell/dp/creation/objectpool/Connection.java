package com.training.turkcell.dp.creation.objectpool;

import java.io.Closeable;
import java.util.UUID;

public class Connection implements Closeable {
    private String ip;
    private String port;
    private ConnectionManager connectionManager;
    private final String uuid = UUID.randomUUID().toString();
    ;


    public Connection(ConnectionManager connectionManager) {
        super();
        this.connectionManager = connectionManager;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void connect() {
        System.out.println("connection açılıyor");
    }

    @Override
    public void close() {
        System.out.println("Connection kapandı");
        this.connectionManager.returnToQueue(this);
    }

    public String getId() {
        return this.uuid;
    }
}
