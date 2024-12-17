import java.util.ArrayList;

public class RollarCoasters extends Rides{

    private final int heightOfRide; // in feet
    private int thrillScale; //on a scale of 1-10

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
        ArrayList<String> rollerCoasters = new ArrayList<String>();
        RollarCoasters zoomingMountain = new RollarCoasters("Zooming Mountain", 12, 54, 5, true, 45, 200, 10);
        rollerCoasters.add("Zooming Mountain");

        RollarCoasters dash = new RollarCoasters("Dash", 4, 36, 4, true, 2, 8, 0);
        rollerCoasters.add("Dash");

        RollarCoasters kaboom = new RollarCoasters("Kaboom", 10, 48, 3, false, 30, 8, 7);
        rollerCoasters.add("Kaboom");


        System.out.println(dash);
        System.out.println(rollerCoasters);
        System.out.println(zoomingMountain.makeNoise());

    }
}
