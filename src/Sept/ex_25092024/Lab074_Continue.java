package Sept.ex_25092024;

public class Lab074_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { //0 to 9
            System.out.println(i);
            if (i==5){
                continue; //Post continue it will go again to main condition
            }
            System.out.println("After");
            
        }
    }
}
