package Sept.ex_23092024;

public class Lab055_Switch_Condition_2 {
    public static void main(String[] args) {
        //Switch Condition
        //Days - 1 to 7 -> 1 mon, 2 tue, 3 wed, 4 thur, 5 Fri, 6 Sat, 7 Sun
        //After removing break
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thu");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("No idea what day it is");
                break;

        }
        System.out.println("End of the loop");
    }
}

