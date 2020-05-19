public class Main {
    public static void main(String[] args) {
        Lights lights = new Lights(1,3, 1);
        Building building = new Building(4, true, 2, "hard wood", lights);
        Furniture furniture = new Furniture(4, 1, 2, "Pilea raindrop", "IKEA Bergshult");
        Room room = new Room(building, furniture);
        room.makeRoom();

    }
}
