package Sept.ex_30092024;

public class Lab090 {
    public static void main(String[] args) {
        //Print the first 5 Even numbers - With Modulus
        int count = 0;
        int number = 2;
        while (count<5){
            if(number%2 ==0){
                System.out.println(number);
                count++;

        }
            number++;
        }
    }
}
