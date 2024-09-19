package Sept.ex_18092024;

public class Lab043_Increment_Decrement_Task2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a + a++ + a--);
        System.out.println(a);
        // Part A -> --a , Exp1 = 9, a=9
        // Part B -> a++ , Exp2 = 9, a=10
        // Part C -> a-- , Exp3 = 10, a=9
        // Total Exp = 28
        // Final value a=9

    }
}
