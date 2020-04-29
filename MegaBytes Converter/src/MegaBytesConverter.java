public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        /*
         If kilobytes < 0 print text: invalid value
         Calculate megabytes and remaining kilobytes from kilobytes parameter.
         Print message
        */

        if(kiloBytes < 0 ) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " +
                    megabytes + " MB and " +
                    remainingKilobytes + " KB");
        }
    }
}
