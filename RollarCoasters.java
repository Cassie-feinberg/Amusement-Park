import java.util.ArrayList;

public class RollarCoasters extends Rides{

    private final int heightOfRide;
    private int thrillScale;

    public RollarCoasters(String name, int ageLimit, int heightLimit, int cost, boolean working, int waitTime, int heightOfRide, int thrillScale) {
        super(name, ageLimit, heightLimit, cost, working, waitTime);
        this.heightOfRide = heightOfRide;
        this.thrillScale = thrillScale;
    }

    public int getThrillScare() {
        return thrillScale;
    }

    public void setThrillScare(int thrillScare) {
        this.thrillScale = thrillScale;
    }

    public int getHeightOfRide() {
        return heightOfRide;
    }

    public String makeNoise(){
        return "Ahhhhhhhh!";
    }

    public static void main(String[] args){
        RollarCoasters zoomingMountain = new RollarCoasters("Zooming Mountain", 12, 54, 5, true, 45, 200, 10);
    }
}
