package Sept.ex_23092024;

public class Lab059_No_Break_Req {
    public static void main(String[] args) {
        // JDK > 13
        // -> can be use instead of 'Break'

        int itemcode = 001;

        switch (itemcode){
            case 001 -> System.out.println("its a Laptop");
            case 002 -> System.out.println("its a Desktop");
            case 003 -> System.out.println("its a Mobile");
            default -> System.out.println("its NOTHING");
        }
    }
}
