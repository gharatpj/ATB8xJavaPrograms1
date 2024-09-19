package Sept.ex_18092024;

public class Lab039_Increment_Decrement_5 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // Part A -> a++ , Exp1 = 10, a=11
        // Part B -> ++a , Exp2 = 12, a=12
        // Total Exp = 22
        // Final value a=12
    }
}
