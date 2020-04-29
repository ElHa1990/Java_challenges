public class Main {

    public static void main(String[] args) {
        Wall wallNumberOne = new Wall();
        Wall wallNumberTwo = new Wall(3, 2.4);
        Wall wallNumberThree = new Wall(0.1, 2.4);
        wallNumberThree.setWidth(-1.25);

        System.out.println(wallNumberOne.getWidth());
        System.out.println(wallNumberTwo.getWidth());
        System.out.println(wallNumberTwo.getHeight());
        System.out.println(wallNumberTwo.getArea());
        System.out.println("------");
        System.out.println(wallNumberThree.getWidth());
        System.out.println(wallNumberThree.getHeight());
        System.out.println(wallNumberThree.getArea());


    }


}
