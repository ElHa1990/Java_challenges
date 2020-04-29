public class Main {

    public static void main(String[] args) {
        String result = SecondsAndMinutesChallenge.getDurationString(400, 34);
        System.out.println(result);

        result = SecondsAndMinutesChallenge.getDurationString(-4, 56);
        System.out.println(result);

        String secondResult = SecondsAndMinutesChallenge.getDurationString(65127);
        System.out.println(secondResult);

        secondResult = SecondsAndMinutesChallenge.getDurationString(-5210);
        System.out.println(secondResult);



    }
}
