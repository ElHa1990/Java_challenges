public class SecondsAndMinutesChallenge {

    public static String getDurationString(int minutes, int seconds)  {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid value";
        }

        int hours = minutes / 60;
        int minutesRemaining = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = minutesRemaining + "m";
        if (minutesRemaining < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString  = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return (hoursString + " " + minutesString + " " + secondsString);
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int secondsRemaining =  seconds % 60;

        return getDurationString(minutes, secondsRemaining);
    }

    public static void main(String[] args) {
        String result = SecondsAndMinutesChallenge.getDurationString(400, 34);
        System.out.println(result);

        result = SecondsAndMinutesChallenge.getDurationString(61, 0);
        System.out.println(result);

        String secondResult = SecondsAndMinutesChallenge.getDurationString(65127);
        System.out.println(secondResult);

        secondResult = SecondsAndMinutesChallenge.getDurationString(-5210);
        System.out.println(secondResult);
    }
}
