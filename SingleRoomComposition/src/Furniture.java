public class Furniture {
    private int chairs;
    private int table;
    private int paintings;
    private String plants;
    private String shelves;

    public Furniture(int chairs, int table, int paintings, String plants, String shelves) {
        this.chairs = chairs;
        this.table = table;
        this.paintings = paintings;
        this.plants = plants;
        this.shelves = shelves;
    }

    public void decorateRoom(){
        System.out.println("Room is now decorated with: " + table + " table and " + chairs + " chairs and " +
                "there are " + paintings + " paintings on the wall. As well as some " + shelves + " with " + plants +" plants.");
    }

}
