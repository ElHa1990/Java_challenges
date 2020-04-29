public class Main {

    public static void main(String[] args) {
//        System.out.println("10.000 at 2% interest = " + calculateInterest(10000, 2.0));
//
//        for (int i = 2; i < 9; i++) {
//            System.out.println(calculateInterest(10000, i));
//        }
//
//        for (int i = 8; i >= 2; i--) {
//            System.out.println(calculateInterest(10000, i));
//        }

        int count = 0;
        int sumPrime = 0;

        for (int i = 1; i < 30; i++) {

            if(isPrime(i) == true) {
                count ++;
                sumPrime = i + sumPrime;
                System.out.println("Number " + i + " is a prime number");
                System.out.println("Sum of the prime numbers is: " + sumPrime);

                if (count == 10) {
                    System.out.println("Existing for loop");
                    break;
                }
            }

        }


    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }















//    public static double calculateInterest (double amount, double interestRate) {
//        return (amount * (interestRate/100));
//    }
}
