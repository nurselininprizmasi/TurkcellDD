package com.training.turkcell.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyObjIterator implements Iterable<String> {
    private final List<String> myList = new ArrayList<>();
    private String name;
    private final Object lockOject = new Object();

    public Iterator<String> getMyList() {
        return myList.iterator();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(final String str) {
        synchronized (this.lockOject) {
            this.myList.add(str);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator(this.myList, this.lockOject);
    }

    public static class MyIterator implements Iterator<String> {
        private final List<String> myList;
        private int current;
        private final Object lockOject;

        public MyIterator(List<String> myList, Object lockOject) {
            this.lockOject = lockOject;
            synchronized (this.lockOject) {
                this.myList = new ArrayList<>(myList);
            }
        }

        @Override
        public boolean hasNext() {
            return this.current < this.myList.size();
        }

        @Override
        public String next() {
            return this.myList.get(this.current++);
        }
    }
}
