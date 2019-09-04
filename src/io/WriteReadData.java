package io;

import java.io.*;

public class WriteReadData {

    public static void main(String[] args) throws IOException {
        try (java.io.PrintWriter output = new java.io.PrintWriter("rx.txt")) {
            for (int i = 0; i < 100; i++) {
                output.println((int) (Math.random() * 100000) + " ");
            }
        }
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\meghan\\Documents\\NetBeansProjects\\Lab_12\\rx.txt"));
        String s;
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }
        System.out.println("done");
    }
}
