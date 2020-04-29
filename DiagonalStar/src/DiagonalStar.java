public class DiagonalStar {

    public static void printSquareStar (int number) {
        String starFrame = "*";

        if (number >= 5) {
            for (int y = 0; y < number; y++) {

                for (int x = 0; x < number; x++) {

                    // kader
                    if (x == 0 || (x == number - 1) || y == 0 || (y == number - 1)) {
                        System.out.print(starFrame);
                        continue;
                    }

                    // Kruis
                    if (x == y || (((number -1) - x) == y)) {
                        System.out.print(starFrame);
                        continue;
                    }

                    // op plek waar geen ster komt
                    System.out.print(" ");
                }

                // naar volgende regel
                System.out.println(" ");
                //
            }
            System.out.println(" ");
        }

        else {
            System.out.println("Invalid value");
        }
    }

    public static void main(String[] args) {

        printSquareStar(150);

    }
}
