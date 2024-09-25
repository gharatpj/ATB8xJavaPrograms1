package Sept.ex_20092024;

public class Lab053_Task1 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int c = 45;
//        int max=(a>b)?(a>c?a:c):(b>c?b:c);
//        System.out.println(max);

        int a = 10;
        int b = 20;
        int c = 45;
        int max = ( a>b)? b : (b<c)?c:a;
        System.out.println(max);

    }
}
