package com.training.turkcell.dp.creation.prototype;

import java.util.EnumMap;

public class ObjCreationManager {
    private final EnumMap<EObjectType, MyObject> prototypeMap = new EnumMap<>(EObjectType.class);

//    public MyObject clone(final MyObject myObjectParam) {
//        MyObject myObject = prototypeMap.get(myObjectParam.getObjectType());
//        if (myObject == null) {
//            prototypeMap.put(myObjectParam.getObjectType(), myObjectParam);
//        }
//        return myObject.cloneMe();
//    }

    public MyObject clone(final EObjectType typeParam) {
        MyObject myObject = this.prototypeMap.get(typeParam);
        if (myObject == null) {
            MyObject object = new MyObject();
            //initialize from db
            object.setObjectType(typeParam);
            myObject = object;
            this.prototypeMap.put(typeParam, object);
        }
        return myObject.cloneMe();
    }

}
