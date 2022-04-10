package com.ibm.Practice.Udemy;

public class udemy {
    public static void main(String[] args) {
        byte x = 100;

        String s = Byte.toString(x);
        byte y  = Byte.parseByte(s);

        System.out.println(s);
        System.out.println(y);
    }
    
}
