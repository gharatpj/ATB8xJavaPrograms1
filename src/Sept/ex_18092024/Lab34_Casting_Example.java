package Sept.ex_18092024;

public class Lab34_Casting_Example {
    public static void main(String[] args) {
        long phone_no = 9892871127l;
        //short s = phone_no; //Narrowing - Implicit - JVM //Invalid
        //short s1 = (short) phone_no; // Narrowing - Explilcit - Loss //Invalid

        // GST = 18.45;
        int course = 100;
        float GST = 18.45f;
        //int total_price = course + GST; // Narrowing - Implicit - JVM - Invalid
        //float total_price = course + GST;
        int total_price = course+(int)GST;
        System.out.println(total_price);
    }
}
