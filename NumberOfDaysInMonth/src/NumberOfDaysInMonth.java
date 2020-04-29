public class NumberOfDaysInMonth {

    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {

            // Stap 2
            if (year % 100 == 0) {

                // Stap 3
                if (year % 400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            } else { // Stap 4
                return true;
            }
        }
        // Stap 5
        return false;
    }

    public static int getDaysInMonth (int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        if ((month == 2) && (isLeapYear(year))) {
            return 29;
        } else if ((month == 2) && (!isLeapYear(year))) {
            return 28;
        } else if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            return 31;
        } else {
            return 30;
        }
    }


    public static void main(String[] args) {
        isLeapYear(1600);
        isLeapYear(2020);
        isLeapYear(1995);
        isLeapYear(1785);
        isLeapYear(1936);


        System.out.println(getDaysInMonth( 1, 1600));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2001));
        System.out.println(getDaysInMonth(-1 , 1995));
        System.out.println(getDaysInMonth(7,1785));
        System.out.println(getDaysInMonth(11, 1936));



    }



}
