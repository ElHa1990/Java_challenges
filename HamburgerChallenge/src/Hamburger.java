import java.util.ArrayList;
import java.util.Scanner;

public class Hamburger {
    Scanner scanner = new Scanner(System.in);

    private String name;
    private String breadType;
    private String meat;
    protected ArrayList<String> additions = new ArrayList<String>();
    protected double basePrice = 3.00;
    private double additionalPrice = 0;
    protected int maxAdditions = 4;

    protected boolean wantAdditions = true;

    public Hamburger(String name, String breadType, String meat) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;

        this.setAddition();
    }

    protected void setAddition() {
        while(additions.size() < 4 && wantAdditions) {
            System.out.println("You can add max " + (maxAdditions - additions.size()) + ". additions to your burger." + "\n"
                    + "You can choose from: lettuce, tomato, cucumber, carrot, cheese, bacon, onion, sauce or nothing." + "\n"
                    + "Please type in your choice: ");
            String resultScanner = scanner.next();
            this.addAddition(resultScanner);
        }
    }

    public void addAddition(String resultScanner) {
        // check what is entered, add to burger and calculate additional price.
        switch (resultScanner) {
            case "lettuce":
            case "carrot":
            case "tomato":
            case "cucumber":
            case "onion":
                additions.add(resultScanner);
                System.out.println(additions + " added to your burger");
                additionalPrice = additionalPrice + 0.20;
                break;
            case "cheese":
                additions.add(resultScanner);
                System.out.println(additions + " added to your burger");
                additionalPrice = additionalPrice + 0.40;
                break;
            case "bacon":
                additions.add(resultScanner);
                System.out.println(additions + " added to your burger");
                additionalPrice = additionalPrice + 0.60;
                break;
            case "sauce":
                additions.add(resultScanner);
                System.out.println(additions + " added to your burger");
                additionalPrice = additionalPrice + 1.00;
                break;
            case "nothing":
                //stop the loop
                wantAdditions = false;
                break;
            default:
                System.out.println("Addition not found, try again.");
                break;
        }
    }

    public void printAddition() {
        double finalPrice;

        String allAdditions = (additions + " were added to your burger.");
        System.out.println(this.name + " is made of: " + this.breadType + " bread, with a " + this.meat + " burger. " + allAdditions);

        // add additional price to the base price of the burger
        finalPrice = basePrice + additionalPrice;
        System.out.println("Final price of the burger is: € " + finalPrice);
    }
}

