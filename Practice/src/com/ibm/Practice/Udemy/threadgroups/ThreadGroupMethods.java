package com.ibm.Practice.Udemy.threadgroups;

public class ThreadGroupMethods {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mtg = new ThreadGroup("MyThreadGroup");

        CustomThread thread1 = new CustomThread(mtg, "Thread1");
        CustomThread thread2 = new CustomThread(mtg, "thread2");
        CustomThread thread3 = new CustomThread(mtg, "thread3");
        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(mtg.activeCount());

        mtg.list();

        Thread.sleep(5000);
        System.out.println(mtg.activeCount());

        mtg.list();
    }

}
