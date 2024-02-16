import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int no1, no2;

        System.out.println("Enter Number 1: ");
        no1 = scn.nextInt();
        System.out.println("Enter Number 2: ");
        no2 = scn.nextInt();

        int sum = no1 + no2;
        int avg = sum / 2;

        System.out.println("Sum is " + sum);
        System.out.println("Average is " + avg);

    }
}
