package com.training.turkcell.structure.tests.flyweight;

import com.training.turkcell.dp.creation.prototype.EObjectType;

public class MyObjectType {
    private EObjectType objectType;
    private String typeName;
    private String typeDesc;
    private String typeRule;
    private String typeScript;

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
}
