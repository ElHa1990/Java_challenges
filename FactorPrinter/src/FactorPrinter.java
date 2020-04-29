public class FactorPrinter {

    public static void printFactors (int number) {

        int divisionNumber;
        int factor = 0;

        if (number >= 1) {

            for (int i = 1; i <= number; i++) {

                divisionNumber = number % i;

                if (divisionNumber == 0) {
                    factor = i;
                    System.out.println(factor);
                }
            }

        } else {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        printFactors(6);

    }

}
