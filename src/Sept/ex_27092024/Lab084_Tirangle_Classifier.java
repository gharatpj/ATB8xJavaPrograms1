package Sept.ex_27092024;

import java.util.Scanner;

public class Lab084_Tirangle_Classifier {
    public static void main(String[] args) {

// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->

        //Step 1-
        //sides - double
        //o/p - string

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of side1:");
        double side1 =  sc.nextDouble();

        System.out.println("Enter the length of side2:");
        double side2 =  sc.nextDouble();

        System.out.println("Enter the length of side3:");
        double side3 =  sc.nextDouble();

        if (side1 == side2 && side1 == side3 && side2 == side3){
            System.out.println("EQ");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("ISO");
        } else {
            System.out.println("scalene");
        }
    }
}
