public class HealthyBurger extends Hamburger {

    public HealthyBurger(String meat) {
        super("Healthy burger", "brown rye", meat);

    }

    @Override
    protected void setAddition() {
        this.maxAdditions = 6;

        while(additions.size() < 6 && super.wantAdditions) {
            System.out.println("You can add max " + (this.maxAdditions - additions.size()) + ". additions to your burger." + "\n"
                    + "You can choose from: lettuce, tomato, cucumber, carrot, cheese, bacon, onion, sauce or nothing." + "\n"
                    + "Please type in your choice: ");
            String resultScanner = scanner.next();
            this.addAddition(resultScanner);
        }
        super.setAddition();
    }

    @Override
    public void addAddition(String resultScanner) {
        super.addAddition(resultScanner);
    }

    @Override
    public void printAddition() {
        super.printAddition();
    }
}
