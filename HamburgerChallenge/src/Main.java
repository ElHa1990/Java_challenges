public class Main {
    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger("Broodje Linda", "wit", "Angus beef");
//        hamburger.printAddition();

//        HealthyBurger healthyBurger = new HealthyBurger("vega");
//        healthyBurger.setAddition();
//        healthyBurger.printAddition();

        DeluxeBurger deluxeBurger = new DeluxeBurger("flat white", "Angus beef", "french fries", "cola");
        deluxeBurger.setAddition();
        deluxeBurger.printAddition();

    }
}
