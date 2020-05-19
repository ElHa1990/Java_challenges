public class Building {
    private int walls;
    private boolean roof;
    private int windows;
    private String typeOfFloor;
    private Lights lights;

    public Building(int walls, boolean roof, int windows, String typeOfFloor, Lights lights) {
        this.walls = walls;
        this.roof = roof;
        this.windows = windows;
        this.typeOfFloor = typeOfFloor;
        this.lights = lights;
    }

    public void buildRoom() {
        if (roof) {
            System.out.println("Building single room with " + walls + " walls, " + windows + " windows. A roof was put on." +
                    " And there is a beautiful " + typeOfFloor + " floor.");
        }
    }

    public int getWalls() {
        return walls;
    }

    public boolean isRoof() {
        return roof;
    }

    public int getWindows() {
        return windows;
    }

    public String getTypeOfFloor() {
        return typeOfFloor;
    }

    public Lights getLights() {
        return lights;
    }
}


