public class DeluxeBurger extends Hamburger{

    private String fries;
    private String drinks;

    public DeluxeBurger(String breadType, String meat, String fries, String drinks) {
        super("Deluxe Burger", breadType, meat);

        this.fries = fries;
        this.drinks = drinks;
        this.basePrice = 6.50;
    }

    @Override
    protected void setAddition() {

        this.wantAdditions = false;

        while(additions.size() < 6 && this.wantAdditions) {
            System.out.println("You can add max " + (this.maxAdditions - additions.size()) + ". additions to your burger." + "\n"
                    + "You can choose from: lettuce, tomato, cucumber, carrot, cheese, bacon, onion, sauce or nothing." + "\n"
                    + "Please type in your choice: ");
            String resultScanner = scanner.next();
            this.addAddition(resultScanner);
        }
        super.setAddition();
    }

    @Override
    public void printAddition() {
        additions.add(this.fries);
        additions.add(this.drinks);

        super.printAddition();


    }
}
