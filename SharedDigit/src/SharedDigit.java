public class SharedDigit {

    public static boolean hasSharedDigit (int firstNumber, int secondNumber) {
        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            System.out.println("Invalid number, not in range");
            return false;
        }

        // first number
        int firstDigitFirstNumber = firstNumber / 10;
        int lastDigitFirstNumber = firstNumber % 10;

        // second number
        int firstDigitSecondNumber = secondNumber / 10;
        int lastDigitSecondNumber = secondNumber % 10;

        if (firstDigitFirstNumber == firstDigitSecondNumber) {
            System.out.println(firstNumber + " & " + secondNumber + " have a digit in common." );
            return true;
        } else if (firstDigitFirstNumber == lastDigitSecondNumber) {
            System.out.println(firstNumber + " & " + secondNumber + " have a digit in common." );
            return true;
        } else if (lastDigitFirstNumber == firstDigitSecondNumber) {
            System.out.println(firstNumber + " & " + secondNumber + " have a digit in common." );
            return true;
        } else if (lastDigitFirstNumber == lastDigitSecondNumber) {
            System.out.println(firstNumber + " & " + secondNumber + " have a digit in common." );
            return true;
        } else {
            System.out.println(firstNumber + " & " + secondNumber + " have no digit in common." );
            return false;

        }
    }

    public static void main(String[] args) {
        hasSharedDigit(34, 46);
        hasSharedDigit(6, 46);
        hasSharedDigit(84, 65);
        hasSharedDigit(71, 10);
        hasSharedDigit(22, 72);
    }
}
