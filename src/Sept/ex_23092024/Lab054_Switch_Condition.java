package Sept.ex_23092024;

public class Lab054_Switch_Condition {
    public static void main(String[] args) {
        //Switch Condition
        //Days - 1 to 7 -> 1 mon, 2 tue, 3 wed, 4 thur, 5 Fri, 6 Sat, 7 Sun
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea what day it is");
                break;

        }
        System.out.println("End of the loop");
        }
    }

