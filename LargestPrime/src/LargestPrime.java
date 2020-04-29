public class LargestPrime {

    public static int getLargestPrime (int number) {

        int dividerModulo;
        int dividerNumber = 0;
        int prime = 0;

        if (number <= 0) {
            return -1;
        }

        for (int i = 2; i < number; i++) {

            dividerModulo = number % i;

            if (dividerModulo == 0) {
                dividerNumber = i;

                if (isPrime(dividerNumber)) {
                    prime = dividerNumber;
                }
            }
        }
        return prime;
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

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(0));


//
//        System.out.println(isPrime(7));
//        System.out.println(isPrime(21));
//        System.out.println(isPrime(5));
//        System.out.println(isPrime(1));

    }
}
