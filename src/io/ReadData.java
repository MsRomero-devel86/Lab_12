/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;
import java.util.Scanner;
/**
 *
 * @author meghan
 */
public class ReadData {
    public static void main(String[] args)throws Exception {
    
         java.io.File file = new java.io.File("scores.txt");
        Scanner input = new Scanner(file);
                
            while(input.hasNext())
            { 
                String firstName = input.next();
                String middle = input.next();
                String lastName = input.next();
                int score = input.nextInt();
                System.out.println(firstName +  " " + middle + " " + lastName + " "+ score);
            }
        }
        
    }
    

