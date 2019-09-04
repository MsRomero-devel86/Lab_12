/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

/**
 *
 * @author meghan
 */
public class writeData {
    public static void main(String[] args) 
        throws java.io.IOException{
        java.io.File file = new java.io.File("scores.txt");
        if(file.exists()){
            System.out.println("File already exists. Exiting....");
            System.exit(0);
        }
    // new file
    java.io.PrintWriter output = new java.io.PrintWriter(file);
   output.print("John T Smith");
   output.println(90);
   output.print("Eric k Jones");
   output.println(85);
    
        output.close();
}
}
