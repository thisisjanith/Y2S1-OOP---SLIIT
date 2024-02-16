import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dayNum;
        String day;
        System.out.println("Enter the day: ");
        dayNum = scn.nextInt();
System.out.println("Value of the day: " + dayNum);
        switch (dayNum){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Monday";

                break;
            case 3:
                day = "Monday";
                break;
            case 4:
                day = "Monday";
                break;
            case 5:
                day = "Monday";
                break;
            case 6:
                day = "Monday";
                break;
            case 7:
                day = "Monday";
                break;
            default:
                day = "Invalid Day!!";


        }
        System.out.println("Day of the week: " + day);
        System.out.println("Good Bye!");

    }
}
