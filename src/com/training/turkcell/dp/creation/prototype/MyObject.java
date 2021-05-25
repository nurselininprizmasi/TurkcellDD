package com.training.turkcell.dp.creation.prototype;

public class MyObject {
    private String name;
    private String text;
    private String number;
    private int port;
    private EObjectType objectType;
    private String typeName;
    private String typeDesc;
    private String typeRule;
    private String typeScript;

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

    public EObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(EObjectType objectType) {
        this.objectType = objectType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getTypeRule() {
        return typeRule;
    }

    public void setTypeRule(String typeRule) {
        this.typeRule = typeRule;
    }

    public String getTypeScript() {
        return typeScript;
    }

    public void setTypeScript(String typeScript) {
        this.typeScript = typeScript;
    }

    public MyObject cloneMe() {
        MyObject myObject = new MyObject();
        myObject.typeName = this.typeName;
        myObject.typeDesc = this.typeDesc;
        myObject.typeRule = this.typeRule;
        myObject.typeScript = this.typeScript;
        return myObject;
    }
}
