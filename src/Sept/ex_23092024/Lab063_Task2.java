package Sept.ex_23092024;

public class Lab063_Task2 {
    public static void main(String[] args) {
        //Switch Condition
        //Months - 1 to 12 -> 1 Jan, 2 feb, 3 Mar, 4 Apr, 5 May, 6 Jun, 7 July.....12 Dec
        //After removing break
        int month = 13;
        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Octr");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
            default:
                System.out.println("No idea which month");
                break;

        }
    }}