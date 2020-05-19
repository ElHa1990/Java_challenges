public class Lights {
    private int hangingLights;
    private int wallLights;
    private int standingLights;

    public Lights(int hangingLights, int wallLights, int standingLights) {
        this.hangingLights = hangingLights;
        this.wallLights = wallLights;
        this.standingLights = standingLights;
    }

    public int getHangingLights() {
        return hangingLights;
    }

    public int getWallLights() {
        return wallLights;
    }

    public int getStandingLights() {
        return standingLights;
    }

    public void letThereBeLight(){
        System.out.println("Lights are on!");
    }
}
