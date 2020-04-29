package Leren.Linda;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int originalNumber = number;
        int sum = 0;
        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number > 0) {
            firstDigit = number % 10;
            number = number / 10;
        }

        sum = firstDigit+lastDigit;
        System.out.println("Sum of first and last digit of " + originalNumber + " = " + firstDigit + " + " + lastDigit + " = " + sum);
        return sum;

    }
}
