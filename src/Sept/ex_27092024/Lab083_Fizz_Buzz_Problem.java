package Sept.ex_27092024;

import java.util.Scanner;

public class Lab083_Fizz_Buzz_Problem {
    public static void main(String[] args) {
        //Fizz Buzz Problem
        //Write a Program that prints numbers from 1 to (100)
        //However,for multiples of 3, print 'Fizz' instead of number
        //and for multiple of 5, print 'Buzz'
        //for numbers that are multiples of both 3 & 5,
        //Print 'FizzBuzz'.

        //Logic Building

        //Step-1
        //Input-> int-n-> n=100 - Scanner class
        //Output->String-> Fizz, Buzz & FizzBuzz - SOP

        //Step-2
        //Rough Logic
        //for-> int = 1 to i <= 100(n)
        //i-> multiple of 3 -> Modules - i%3 == 0 -> Fizz
        //i-> multiple of 5 -> Modules - i%5 == 0 -> Buzz
        //i-> multiple of 3,5 -> modules - i%3 && i%5 == 0 -> FizzBuzz

        //Step-3: Real Logic
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n = 100");
        int n = sc.nextInt();

        for (int i=1; i<=100; i++){
            if (i%3 ==0 && i%5 ==0){
                System.out.println("FizzBuzz");
            } else if (i%5 ==0){
                System.out.println("Buzz");
            } else if(i%3 ==0) {
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }

        }
    }}
