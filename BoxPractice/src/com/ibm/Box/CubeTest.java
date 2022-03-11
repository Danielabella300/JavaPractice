package com.ibm.Box;

public class CubeTest {
    public static void main(String[] args) {
        Cube testCube = new Cube(5);
        Cube testCube2 = new Cube(8);

        testCube.setLength(20);

        testCube.printBox();

        testCube2.setSide(40);

        testCube2.printBox();

        testCube.setWidth(-3);

        testCube.printBox();
     
    }
    
}
