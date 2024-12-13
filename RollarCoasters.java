public class RollarCoasters extends Rides{

    private final int heightOfRide;
    private int thrillScare;

    public RollarCoasters(String name, int ageLimit, int heightLimit, int cost, boolean working, int waitTime, int heightOfRide, int thrillScare) {
        super(name, ageLimit, heightLimit, cost, working, waitTime);
        this.heightOfRide = heightOfRide;
        this.thrillScare = thrillScare;
    }

    public int getThrillScare() {
        return thrillScare;
    }

    public void setThrillScare(int thrillScare) {
        this.thrillScare = thrillScare;
    }

    public int getHeightOfRide() {
        return heightOfRide;
    }

    public String makeNoise(){
        return "Ahhhhhhhh!";
    }
}
