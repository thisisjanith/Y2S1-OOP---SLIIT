import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter a series of numbers (terminate with a negative number):");

        while (true) {
            int number = scanner.nextInt();

            if (number < 0) {
                break; // Terminate the loop when a negative number is entered
            }

            sum = sum + number;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of the entered numbers: " + average);
        } else {
            System.out.println("No valid numbers entered. Cannot calculate average.");
        }

    }
}
