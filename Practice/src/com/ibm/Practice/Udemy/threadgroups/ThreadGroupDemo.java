package com.ibm.Practice.Udemy.threadgroups;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup parent = new ThreadGroup("Parent");
        System.out.println(parent.getName());
        ThreadGroup child = new ThreadGroup(parent, "Child");
        System.out.println(child.getName());
        System.out.println(child.getParent().getName());

        Thread thread1 = new Thread(child, "thread 1");
        Thread thread2 = new Thread(child, "Thread 2");

        System.out.println(thread1.getThreadGroup().getName());
        System.out.println(thread1.getPriority());
        child.setMaxPriority(4);
        Thread thread3 = new Thread(child, "Thread 2");
        System.out.println(thread3.getPriority());
    }
}
 