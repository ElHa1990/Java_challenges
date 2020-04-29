public class SumOddRange {
    public static boolean isOdd (int number) {
        if (number <= 0) {
            return false;
        }

        return number % 2 != 0;
    }

    public static int sumOdd (int start, int end) {
        int sum = 0;

        if ((end < start) || start <= 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {

            if (isOdd(i) == true) {
                sum = sum + i;
                //System.out.println(sum);
            }
        }

        return sum;
    }
}
