package com.Cursor.java;

public class ObjectsCounter {


    public static void main(String[] args) {
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
        System.out.println("Count of objects: " + Count.counter);

    }
}

class Count {
    public static int counter;


    public Count() {
        counter++;

    }


}