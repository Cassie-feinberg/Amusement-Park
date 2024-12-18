import java.util.ArrayList;

public class Rides {
    protected String name;
    protected final int ageLimit;
    private final int heightLimit;// in inches
    private int cost;
    private boolean working;
    private int waitTime;

    public Rides(String name, int ageLimit, int heightLimit, int cost, boolean working, int waitTime){
        this.name = name;
        this.ageLimit = ageLimit;
        this.heightLimit = heightLimit;
        this.cost = cost;
        this.working = working;
        this.waitTime = waitTime;
    }

    public String getName(){
        return name;
    }

    public int getAgeLimit(){
        return ageLimit;
    }

    public int getHeightLimit() {
        return heightLimit;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public String getWaitTime() {
        return "This wait time for this ride is "+ waitTime + "minutes";
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public String toString(){
        return getName() + " has a height limit of "+ getHeightLimit() + " inches, and an age limit of "+ getAgeLimit();
    }

    public String makeNoise(){
        return "Weeeeeee!";
    }

    public static void main(String[] args){
        ArrayList<String> rides = new ArrayList<String>();

        Rides teacup = new Rides("Teacup Spin Time", 2, 31, 2, true, 20);
        rides.add("Teacup Spin Time");
        Rides carousel = new Rides("Whirligig", 2, 31, 2, false, 0);
        rides.add("Whirligig");
        Rides ferrisWheel = new Rides("Big Zero", 0, 0, 10, true, 40);
        rides.add("Big Zero");


        System.out.println(teacup);
        System.out.println(rides);
        System.out.println(ferrisWheel.makeNoise());
    }
}
