public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(5, true);

        printer.fillToner(100);
        printer.printPage(61);

        System.out.println("------");

        Printer printerGekkie = new Printer(95, false);
        printerGekkie.fillToner(100);
        printerGekkie.printPage(61);



    }
}
