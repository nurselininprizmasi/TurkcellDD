package com.training.turkcell.behavior.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorMain {
    public static void main(String[] args) {
        MyObjIterator myObjLoc = new MyObjIterator();
        myObjLoc.add("gunes");
        myObjLoc.add("nursen");
        myObjLoc.add("hamdi");

        Iterator<String> iterator = myObjLoc.iterator();

        while (iterator.hasNext()) {
            String nextLoc = iterator.next();
            System.out.println(nextLoc);
        }

        for (String stringLoc : myObjLoc) {
            System.out.println(stringLoc);
        }

        List<String> strListLoc = new CopyOnWriteArrayList<>();

    }

}
