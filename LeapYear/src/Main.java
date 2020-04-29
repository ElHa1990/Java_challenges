public class Main {

    public static void main(String[] args) {
        boolean showLeapYear = LeapYear.isLeapYear(2000);
        System.out.println(showLeapYear);

        showLeapYear = LeapYear.isLeapYear(1741);
        System.out.println(showLeapYear);

        showLeapYear = LeapYear.isLeapYear(2020);
        System.out.println(showLeapYear);

        showLeapYear = LeapYear.isLeapYear(-522);
        System.out.println(showLeapYear);

        showLeapYear = LeapYear.isLeapYear(1700);
        System.out.println(showLeapYear);

        showLeapYear = LeapYear.isLeapYear(2400);
        System.out.println(showLeapYear);

        showLeapYear = LeapYear.isLeapYear(1960);
        System.out.println(showLeapYear);
    }

}
