import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;


        do {
            System.out.println("Enter a number: ");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                scanner.nextLine(); // handle next line character (enter key)

                count++;
                sum = sum + number;

                System.out.println("Entered number #" + number);
                System.out.println("Count is: " + count + ". Sum of the numbers is: " + sum);
            } else {
                System.out.println("Invalid number");
                scanner.nextLine(); // handle next line character (enter key)
            }
        } while (count < 10);


        scanner.close();
    }


}
