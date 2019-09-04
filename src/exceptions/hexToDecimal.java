
package exceptions;


import java.util.Scanner;

/**
 *
 * @author meghan
 */
public class hexToDecimal {

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else 
        {
            return ch - '0';
        }
    }

    /**
     *
     * @param bin
     * @return
     */
    public static int binToDec(String bin) throws NumberFormatException {
        int decimalValue = 0;
        for(int i = 0; i < bin.length(); i++){
            char binChar = bin.charAt(i);
            decimalValue = Integer.parseInt(bin, 2);
            
            
        }
        return decimalValue;

    }

    public static void main(String[] args) throws NumberFormatException {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: or Q/q to Exit ");
        String hex = input.nextLine();
        while ("q".equals(hex.toLowerCase()) == false) {
            {
                System.out.println("The decimal value for hex number "
                        + hex + " is " + hexToDecimal(hex.toUpperCase()));
                System.out.println("Enter a Hex Number: ");
                hex = input.nextLine();
            }
            System.out.print("Enter a binary number: or Q/q to Exit ");
            String bin = input.nextLine();
            while ("q".equals(bin.toLowerCase()) == false) {
            
                        System.out.println("The Binary value for : "
                                + bin + " is " + binToDec(bin.toUpperCase()));
                        System.out.println("Enter a Binary Number: ");
                        bin = input.nextLine();

                    }
                }
            }
        }
    
