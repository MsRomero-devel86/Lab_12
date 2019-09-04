/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author meghan
 */
public class ReadfileFromWeb2 {
    public static void main(String[] args)throws IOException {

        System.out.println("Enter a URL : ");
        String URLString = new Scanner(System.in).next();
        try
        {
            java.net.URL url = new java.net.URL(URLString);
            int div = 0;
            int p = 0;
            String text = "";
            Scanner input = new Scanner(url.openStream());
            while(input.hasNext())
            {
                String line = input.nextLine();
                if(line.contains("<div>"))
                    div++;
                if(line.contains("<p>"))
                    p++;
               
            }
        
        System.out.println("The amount of <div> are :  " + div );
        System.out.println("The amount of <p> :" + p);
        System.out.println ( text );
    }
    catch(java.net.MalformedURLException ex)
    {
            System.out.println("Invalid URL");
    }
    catch(java.io.IOException ex)
    {
            System.out.println("IO Error thrown");
}
    }
    }




    



