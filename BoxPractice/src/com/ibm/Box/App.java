package com.ibm.Box;

public class App {
    public static void main(String[] args) throws Exception {
        Box b1;
        b1 = new Box(5,6,7);

        Box b2;
        b2 = new Box(10);

        Box b4;
        b4 = new Box(15, 0,31);

        b1.setLength(3);
        b1.setWidth(4);
        b1.setHeight(5);
        System.out.println(b1.getVolume());
        System.out.println(b1.getSurfaceArea());
        b1.printBox();
        b2.printBox();
        b4.printBox();
    }
}
