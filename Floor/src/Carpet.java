public class Carpet {
    //field
    private double cost;

    //constructor
    public Carpet (double cost) {
        if(cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    // method
    public double getCost () {
        return cost;
    }


}
