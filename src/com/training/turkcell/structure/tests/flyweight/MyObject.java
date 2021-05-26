package com.training.turkcell.structure.tests.flyweight;

public class MyObject {
    private String name;
    private String text;
    private String number;
    private int port;
    private MyObjectType myObjectType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public MyObjectType getMyObjectType() {
        return myObjectType;
    }

    public void setMyObjectType(MyObjectType myObjectType) {
        this.myObjectType = myObjectType;
    }

    public MyObject cloneMe() {
        MyObject myObject = new MyObject();
        return myObject;
    }
}
