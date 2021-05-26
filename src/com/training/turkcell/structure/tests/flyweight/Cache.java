package com.training.turkcell.structure.tests.flyweight;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
    private Map<String, MyObject> objectMap = new ConcurrentHashMap<>(120000000,0.9F,10000);// n thread kullanacağı için tercih edildi,performans ve concurance açısındna üst düzeydedir
    private EnumMap<EObjectType, MyObjectType> objectTypeEnumMap = new EnumMap<>(EObjectType.class);

    public void addObject(final MyObject myObject, final EObjectType type) {
        MyObjectType myObjectType = objectTypeEnumMap.get(type);
        if (myObjectType == null) {
            //get from DB
            objectTypeEnumMap.put(type,myObjectType);//dbden çektiğimizi varsayalım
        }
        myObject.setMyObjectType(myObjectType);
        this.objectMap.put(myObject.getName(), myObject);

    }
}
