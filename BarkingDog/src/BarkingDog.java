public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hoursOfDay) {
        // wake up if dog is barking before 8 or after 22hours --> true
        // All other cases --> false

        if (barking && (hoursOfDay < 0 || hoursOfDay >= 24)) {
            return false;
        } else return barking && (hoursOfDay < 8 || hoursOfDay > 22);
    }
}

