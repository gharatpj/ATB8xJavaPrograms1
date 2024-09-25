package Sept.ex_23092024;

public class Lab062_Task1 {
    public static void main(String[] args) {
        // Create a simple calculator that performs
        // addition, subtraction, multiplication, and division,
        // Modus based on user input using switch statements.
        //  Inputs :   num 1, num 2, +
        //  Output :  num1+num2 → print information.

        int num1 = 5;
        int num2 = 2;
        char op = '&';
        switch (op){
            case '+':
                System.out.println("5+2");
                break;
            case '-':
                System.out.println("5-2");
                break;
            case '*':
                System.out.println("5*2");
                break;
            case '/':
                System.out.println("5/2");
            case '%':
                System.out.println("5%2");
                break;
            default:
                System.out.println("This is Not Valid");
                break;

        }



    }
}
