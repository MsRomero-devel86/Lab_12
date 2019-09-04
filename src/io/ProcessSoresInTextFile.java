package io;

import java.io.*;
import java.util.*;

/**
 *
 * @author meghan
 */
public class ProcessSoresInTextFile {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file of scores: ");
        File file = new File(input.nextLine());

        if (!file.exists()) {
            System.out.println("File " + file + " does not exist");
            System.exit(1);
        }

        int count = 0;// Counts scores 
        double total = 0;

        try (Scanner inputFile = new Scanner(file);) {
            while(inputFile.hasNext())
            {
                total += inputFile.nextInt();
                count++;
            }
        }

        System.out.println("File name is : " + file + "\n"+
        "Total scores: " + total + "/n" + (total / count));
    }
}

