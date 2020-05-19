public class Room {
    private Building building;
    private Furniture furniture;


    public Room(Building building, Furniture furniture) {
        this.building = building;
        this.furniture = furniture;
    }

    public void makeRoom(){
        building.buildRoom();
        furniture.decorateRoom();
        building.getLights().letThereBeLight();
        System.out.println("Room is build and decorated.");
    }
}
