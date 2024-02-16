import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to count: ");
        char targetCharacter = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetCharacter) {
                count++;
            }
        }

        System.out.println("Number of occurrences of '" + targetCharacter + "': " + count);

    }
}
