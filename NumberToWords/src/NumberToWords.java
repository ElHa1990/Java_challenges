public class NumberToWords {
    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        }

        int lastDigit;
        String numberString;
        String totalString = "";

        int reversedNumber = reverse(number);
        int reveredNumberCount = reverse(number);

        while (reversedNumber > 0) {
            lastDigit = reversedNumber % 10;

            switch (lastDigit) {
                case 0:
                    numberString = "Zero";
                    break;
                case 1:
                    numberString = "One";
                    break;
                case 2:
                    numberString = ("Two");
                    break;
                case 3:
                    numberString = ("Three");
                    break;
                case 4:
                    numberString = ("Four");
                    break;
                case 5:
                    numberString = ("Five");
                    break;
                case 6:
                    numberString = ("Six");
                    break;
                case 7:
                    numberString = ("Seven");
                    break;
                case 8:
                    numberString = ("Eight");
                    break;
                default:
                    numberString = ("Nine");
                    break;
            }

            totalString = totalString + " " + numberString;
            reversedNumber = reversedNumber / 10;

        }

        int digitCountOriginal = getDigitCount(number);
        int digitCountReversed = getDigitCount(reveredNumberCount);
        int difference = digitCountOriginal - digitCountReversed;

        for (int i = 1; i <= difference; i++) {
            if (difference != 0) {
                totalString = totalString + " Zero";
            }
        }
        System.out.println(totalString);
    }

    public static int reverse(int number) {

        int lastDigit;
        int reverseNumber = 0;

        if (number < 0) {
            while (number < 0) {
                lastDigit = (number % 10);
                reverseNumber *= 10;
                reverseNumber += lastDigit;
                number /= 10;
            }
        } else {
            while (number > 0) {
                lastDigit = (number % 10);
                reverseNumber *= 10;
                reverseNumber += lastDigit;
                number /= 10;
            }
        }
        return reverseNumber;
    }


    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            number /= 10;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {

        numberToWords(2234);
        numberToWords(257);
        numberToWords(-12);
        numberToWords(100);
        numberToWords(0);


        System.out.println(reverse(-45));
        System.out.println(getDigitCount(0));


    }
}






//
