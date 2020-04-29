public class NumberPalindrome {

    public static boolean isPalindrome (int number){
        int initialNumber = number;
        int reverse = 0;
        int lastDigit = 0;
        if (number < 0){
            number *= -1;
            initialNumber = number;
        }
        while (number > 0) {
            lastDigit = (number % 10);
            System.out.println("last digit: "+ lastDigit);

            reverse *= 10;
            System.out.println("reverse: " + reverse);

            reverse += lastDigit;
            System.out.println("reverse: " + reverse);

            number /= 10;
            System.out.println("number: " + number);
        }
        if (initialNumber > 0){
            return (initialNumber == reverse);

        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));

//        int number = 0;

//        while (number < 400) {
//            System.out.println(isPalindrome(number));
//            number++;
//        }
    }
}