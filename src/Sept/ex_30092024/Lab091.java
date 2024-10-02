package Sept.ex_30092024;

public class Lab091 {
    public static void main(String[] args) {
        //Print the first 5 Even numbers - With Do While
        int count = 0;//To keep track of how many even numbers we have printed
        int number = 2;//Start from the first even number

        do {
            if (number % 2 == 0) { //check if the number is even
                System.out.println(number); //Print the current even number
                count++; // Increment the count of even numbers printed

            }
            number++; //Move to the next number
        } while (count < 5) ; //Continue until we have printed 5 even numbers

    }

}
