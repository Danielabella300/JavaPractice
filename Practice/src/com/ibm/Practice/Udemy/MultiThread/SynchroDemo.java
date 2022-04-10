package com.ibm.Practice.Udemy.MultiThread;

public class SynchroDemo {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();

        MyThread t1 = new MyThread(dm, "steve");
        MyThread t2 = new MyThread(dm, "mark");

        t1.start();
        t2.start();
    }
    
}
