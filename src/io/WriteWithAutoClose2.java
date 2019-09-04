/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.IOException;

/**
 *
 * @author meghan
 */
public class WriteWithAutoClose2 {

    public static void main(String[] args)
            throws IOException{
        java.io.File file = new java.io.File("scores.txt");
      if(!file.exists()){
        try (java.io.PrintWriter output = new java.io.PrintWriter(file);) {
            output.print("John t smith");
            output.println(90);
            output.print("Eric k Jones");
            output.println(85);
        }
      
        catch(Exception x)
            {
             System.err.println("An Exception occured:" + x.getMessage());
        }
          if (file.exists()) {
            System.out.println("File already Exist");
            System.exit(0);
        }
      }
    }
}

