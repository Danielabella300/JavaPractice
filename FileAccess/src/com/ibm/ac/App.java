package com.ibm.ac;
import java.io.*;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {

            try
            {
                BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\1.txt"));
                bw.write("Hello world");

                bw.close();
            }

            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
