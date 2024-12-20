import java.util.ArrayList;

public class RollarCoasters extends Rides{

    private final int heightOfRide; // in feet
    private int thrillScale; //on a scale of 1-10

    public RollarCoasters(String name, int ageLimit, int heightLimit, int cost, boolean working, int waitTime, int heightOfRide, int thrillScale) {
        super(name, ageLimit, heightLimit, cost, working, waitTime);
        this.heightOfRide = heightOfRide;
        this.thrillScale = thrillScale;
    }
    // getters and setters for each variable
    public int getThrillScare() {
        return thrillScale;
    }

    public void setThrillScare(int thrillScare) {
        this.thrillScale = thrillScale;
    }

    public int getHeightOfRide() {
        return heightOfRide;
    }

    // polymorphic method
    public String makeNoise(){
        return "Ahhhhhhhh!";
    }

    // test code
    public static void main(String[] args){
        RollarCoasters dash = new RollarCoasters("Dash", 4, 36, 4, true, 2, 8, 0);
        System.out.println(dash);
        System.out.println(dash.makeNoise());
    }
}
