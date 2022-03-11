package com.ibm.main;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println( sum(10));
    }

    public static int factorial(int n)
        {
            if (n == 1)
            {
                return 1;
            }
            else
            {
                return n * factorial(n-1);
            }

            
        }
    
    public static int sum(int k)
    {
        if (k > 0)
        {
            return k + sum (k - 1);
        }
        else
        {
            return 0;
        }
    }
}
