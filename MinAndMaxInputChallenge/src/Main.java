import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {

            System.out.println("Enter number: ");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();

                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("Minimal value entered: " + min + ". And maximal value entered: " + max + ".");
                break;
            }
            scanner.nextLine();
        }
        scanner.close();

    }
}
