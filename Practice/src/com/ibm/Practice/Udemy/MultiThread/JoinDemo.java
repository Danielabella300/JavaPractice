package com.ibm.Practice.Udemy.MultiThread;

import java.util.Scanner;

public class JoinDemo extends Thread {
    static int n, sum = 0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sum of first N numbers");
        System.out.println("Enter a value: ");

        Scanner scanner = new Scanner(System.in);
        JoinDemo.n = scanner.nextInt();
        JoinDemo jd = new JoinDemo();
        jd.start();
        jd.join();

        System.out.println("Sum of first " + JoinDemo.n + " Numbers is " + JoinDemo.sum);
    }

    public void run() {
        for (int i = 1; i <= JoinDemo.n; i++) {
            JoinDemo.sum += i;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
