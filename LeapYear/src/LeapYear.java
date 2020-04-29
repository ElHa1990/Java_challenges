public class LeapYear {

    public static boolean isLeapYear(int year) {

        // Stap 1
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
}
