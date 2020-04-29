public class Main {

    public static void main(String[] args) {

        double numberOne = 1.4456;
        double numberTwo = 1.4457;

        boolean result = DecimalComparator.areEqualByThreeDecimalPlaces(numberOne, numberTwo);

        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(result);


    }
}
