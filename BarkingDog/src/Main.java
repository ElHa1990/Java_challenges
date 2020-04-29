public class Main {

    public static void main(String[] args) {
        boolean showResultWakingUp = BarkingDog.shouldWakeUp(true, 7);
        System.out.println(showResultWakingUp);

        showResultWakingUp = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(showResultWakingUp);

        showResultWakingUp = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(showResultWakingUp);

        showResultWakingUp = BarkingDog.shouldWakeUp(true, -5);
        System.out.println(showResultWakingUp);

    }
}
