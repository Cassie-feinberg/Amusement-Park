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

    // getters and setters for each variable
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

    // polymorphic method
    public String makeNoise(){
        return "Weeeeeee!";
    }

    // test code
    public static void main(String[] args){
        Rides teacup = new Rides("Teacup Spin Time", 2, 31, 2, true, 20);
        System.out.println(teacup);
        System.out.println(teacup.makeNoise());
    }
}
