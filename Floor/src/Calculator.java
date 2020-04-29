public class Calculator {

    // field
    private Floor floor;
    private Carpet carpet;

    // constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // method
    public double getTotalCost () {
        return this.floor.getArea() * this.carpet.getCost();
    }
}
