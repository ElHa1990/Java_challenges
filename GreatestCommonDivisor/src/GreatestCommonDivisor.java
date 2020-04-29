public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second) {

        if (first >= 10 && second >= 10) {

            int minvalue;

            if (first < second) {
                minvalue = first;
            } else {
                minvalue = second;
            }
            int biggestRemainder = 0;

            for (int i = 1; i <= minvalue; i++) {

                int divisionFirst = first % i;
                int divisionSecond = second % i;

                if (divisionFirst == 0 && divisionSecond == 0) {
                    biggestRemainder = i;
                }
            }
            return biggestRemainder;

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15, 25));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(258, 73));

    }
}
