
package io;
import java.util.Scanner;
/**
 *
 * @author meghan
 */
public class ReadfileFromWeb {
    public static void main(String[] args) {
        System.out.println("Enter a URL : ");
        String URLString = new Scanner(System.in).next();
        try
        {
            java.net.URL url = new java.net.URL(URLString);
            int count = 0 ; 
            String text = "";
            Scanner input = new Scanner(url.openStream());
            while(input.hasNext())
            {
                String line = input.nextLine();
                count += line.length();
                text+= line;
            }
        
        System.out.println("The file size is " + count + "characters");
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
