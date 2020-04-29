public class Main {

    public static void main(String[] args) {
        Floor floor = new Floor(2.75, 4.0);
        Carpet carpet = new Carpet(3.5);
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println(floor.getArea());
        System.out.println(carpet.getCost());
        System.out.println(calculator.getTotalCost());

        //System.out.println("total= " + calculator.getTotalCost());


//
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
    }
}
