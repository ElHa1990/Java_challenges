public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {

        int value1 = (int) (numberOne * 1000);
        int value2 = (int) (numberTwo * 1000);
        return value1 == value2;

    }
}


