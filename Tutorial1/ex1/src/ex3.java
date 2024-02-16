import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.print("Enter the range: ");
        int range = scanner.nextInt();

        System.out.println("Multiplication Table for " + number + " up to " + range + ":");

        for (int i = 1; i <= range; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
