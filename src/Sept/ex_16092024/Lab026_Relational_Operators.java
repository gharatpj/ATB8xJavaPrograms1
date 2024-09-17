package Sept.ex_16092024;

public class Lab026_Relational_Operators {
    public static void main(String[] args) {
        //Relational Operators = boolean
        //> < ,>= <= ,!= , ! -> true or false

        int a = 10;
        int b = 30;
        boolean c = a > b;
        System.out.println(c);

        int age_parag = 45;
        int age_tushar = 45;
        //boolean result = age_tushar > age_parag;
        boolean result = age_tushar >= age_parag;
        System.out.println(result);
    }
}
