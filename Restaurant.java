public class Restaurant extends FoodSpots {
    private int numTables;
    private double waitTime;
    private boolean vipOnly;

    public Restaurant(String name, boolean hasTables, String cuisine, double cheapestItem, double mostExpensiveItem, String hours, int numTables, double waitTime, boolean vipOnly) {
        super(name, true, cuisine, cheapestItem, mostExpensiveItem, hours);
        this.numTables = numTables;
        this.waitTime = waitTime;
        this.vipOnly = vipOnly;
    }

    public int getNumTables() {
        return numTables;
    }

    public void setNumTables(int numTables) {
        this.numTables = numTables;
    }

    public double getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(double waitTime) {
        this.waitTime = waitTime;
    }

    public boolean isVipOnly() {
        return vipOnly;
    }

    public void setVipOnly(boolean vipOnly) {
        this.vipOnly = vipOnly;
    }

}
