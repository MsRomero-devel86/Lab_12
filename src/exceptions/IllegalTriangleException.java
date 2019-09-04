/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author meghan
 */
public class IllegalTriangleException {

    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    public IllegalTriangleException(double side1, double side2, double side3) throws IllegalArgumentException {
        if (side1 + side2 > side3) {
            throw new IllegalArgumentException("Invalid, one side too large for other two sides");
        }
        if (side1 + side3 > side2) 
            throw new IllegalArgumentException("Invalid, one side too large for other two sides");
         else if (side3 + side2 > side1) {
            throw new IllegalArgumentException("Invalid, one side too large for other two sides");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;

    }

    @Override
    public String toString() {
        return "Triangle: side1  =" + side1 + "side2" + side2
                + "side3" + side3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        IllegalTriangleException triangle1 = new IllegalTriangleException(side1, side2, side3);
        System.out.println("The Area is:" + triangle1.getArea());
        System.out.println("The perimeter is " + triangle1.getPerimeter());
        System.out.println(triangle1);
    }
}
