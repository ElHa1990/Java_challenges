public class Main {

    public static void main(String[] args) {

        boolean result = PlayingCat.isCatPlaying(true, 10);
        System.out.println(result);
        result = PlayingCat.isCatPlaying(false, 37);
        System.out.println(result);
        result = PlayingCat.isCatPlaying(true, 35);
        System.out.println(result);
        result = PlayingCat.isCatPlaying(false, 27);
        System.out.println(result);

    }
}
