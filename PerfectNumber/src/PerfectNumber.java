public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        int divisionNumber;
        int factor = 0;


        if (number < 1) {
            System.out.println("Invalid number");
            return false;
        } else {

            for (int i = 1; i < number; i++) {

                divisionNumber = number % i;

                if (divisionNumber == 0) {
                    factor = factor + i;
                }
            }

            if (factor == number) {
                System.out.println("Number " + number + " is a perfect number");
                return true;
            }
            System.out.println("number " + number + " is not a perfect number");
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(40));
    }


}
