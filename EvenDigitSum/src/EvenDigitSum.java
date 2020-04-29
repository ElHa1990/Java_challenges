public class EvenDigitSum {

    public static int getEvenDigitSum (int number) {

        if (number < 0) {
            return -1;
        }


        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            number /= 10;

            if (lastDigit % 2 == 0) {
                sum = sum + lastDigit;
            }
        }
        System.out.println("Sum is: " + sum);
        return sum;

    }

    public static void main(String[] args) {
        getEvenDigitSum(2345678);
        getEvenDigitSum(222);
        getEvenDigitSum(3578);
        getEvenDigitSum(11111);
        getEvenDigitSum(-25478);
    }


}
