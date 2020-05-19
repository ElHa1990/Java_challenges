public class Printer {

    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int fillToner(int toner) {

        if (toner > 0 && toner <=100) {
            if(this.tonerLevel + toner > 100) {
                System.out.println("Toner amount out of range");
                return -1;
            }
            this.tonerLevel += toner;
            System.out.println("Refilled to: " + this.tonerLevel);
            return this.tonerLevel;

        } else {
            return -1;
        }
    }

    public void printPage(int pages) {

        if (this.duplexPrinter) {
            pages = ((pages / 2) + pages % 2);
            System.out.println("Number of pages printed: " + pages);
            return;
        }
        System.out.println("Number of pages printed: " + pages);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
