package Sept.ex_18092024;

public class Lab33_Type_Casting {
    public static void main(String[] args) {
        //Type Casting
        //Widening
        byte b = 10;
        int a = b; // valid - Implicit casting - JVM
        int a1 = (int)b; // valid - Explicit Casting - JVM

        //Narrowing
        int value = 200;
        // byte b1 = val; //Invalid implicit casting - JVM
        //byte b2 = (byte) val; //Invalid Explicit Casting - Loss of data.
        //System.out.println(b2);
    }
}
