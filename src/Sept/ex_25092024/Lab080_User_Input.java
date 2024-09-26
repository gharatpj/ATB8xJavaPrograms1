package Sept.ex_25092024;

import java.util.Scanner;

public class Lab080_User_Input {
    public static void main(String[] args) {
        //How to take user input
        Scanner sc = new Scanner(System.in); //New object
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        System.out.println(num);
    }
}
