public class Main {

    public static void main(String[] args) {
        boolean result = TeenNumberChecker.hasTeen(9,99,19);
        System.out.println(result + " reeks");

        result = TeenNumberChecker.hasTeen(23,15,42);
        System.out.println(result  + " reeks");

        result = TeenNumberChecker.hasTeen(22,23,34);
        System.out.println(result  + " reeks");

        boolean resultTwo = TeenNumberChecker.isTeen(18);
        System.out.println(result);

        resultTwo = TeenNumberChecker.isTeen(20);
        System.out.println(result);

        resultTwo = TeenNumberChecker.isTeen(11);
        System.out.println(result);

        resultTwo = TeenNumberChecker.isTeen(14);
        System.out.println(result);

        resultTwo = TeenNumberChecker.isTeen(13);
        System.out.println(result);



    }
}
