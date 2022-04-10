package com.ibm.Practice.Udemy.threadgroups;

public class CustomThread extends Thread {

    CustomThread(ThreadGroup g, String name)
    {
        super(g,name);
    }
    public void run()
    {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
