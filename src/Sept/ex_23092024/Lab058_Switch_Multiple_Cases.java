package Sept.ex_23092024;

public class Lab058_Switch_Multiple_Cases {
    public static void main(String[] args) {
        // JDK > 13
        int itemcode = 006;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of them are not valid");
                break;
            case 006,007,000:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
