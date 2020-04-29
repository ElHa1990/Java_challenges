public class LastDigitChecker {
    public static boolean isValid (int number) {
        return number >= 10 && number <= 1000;

    }
    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {

        if (isValid(numberOne) && isValid(numberTwo) && isValid(numberThree)) {
            int lastDigitOne = numberOne % 10;
            int lastDigitTwo = numberTwo % 10;
            int lastDigitThree = numberThree % 10;

            return (lastDigitOne == lastDigitTwo || lastDigitOne == lastDigitThree || lastDigitTwo == lastDigitThree);
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23,33,54));
        System.out.println(hasSameLastDigit(11,22,33));
        System.out.println(hasSameLastDigit(-14,14,41));
        System.out.println(hasSameLastDigit(3,74,333));
        System.out.println(hasSameLastDigit(230,450,990));
        System.out.println(hasSameLastDigit(477,37,80));
        System.out.println(hasSameLastDigit(230,450,990));

    }
}
