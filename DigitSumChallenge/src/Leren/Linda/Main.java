package Leren.Linda;

public class Main {

    public static void main(String[] args) {

        int number = 0;

        while (number <=150) {
            sumDigits(number);
            number ++;
        }
    }



    public static int sumDigits (int number) {

        if (number < 10) {
            System.out.println(number + ": Invalid number");
            return -1;

        } else {
            int firstDigit = 0;
            int secondDigit = 0;


            if (number < 100) {
                firstDigit = number / 10;
                secondDigit = number % 10;
                int sumOfDigits = firstDigit + secondDigit;

                System.out.println(number + ": sum of digits is = " + sumOfDigits);
                return firstDigit + secondDigit;
            } else {
                int thirdDigit = 0;

                firstDigit = number / 100;
                secondDigit = (number % 100) / 10;
                thirdDigit = number % 10;

                int sumOfDigits = firstDigit + secondDigit + thirdDigit;
                System.out.println(number + ": sum of digits is = " + sumOfDigits);
                return firstDigit + secondDigit + thirdDigit;
            }
        }

    }
}
