public class Restaurant extends FoodSpots {
    private int numTables;
    private int waitTime;
    private boolean vipOnly;

    public Restaurant(String name, boolean hasTables, String cuisine, double cheapestItem, double mostExpensiveItem, String hours, int numTables, int waitTime, boolean vipOnly) {
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

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public boolean isVipOnly() {
        return vipOnly;
    }

    public void setVipOnly(boolean vipOnly) {
        this.vipOnly = vipOnly;
    }

    @Override
    public String toString() {
        return ("Restaurant " + name + " serves " + cuisine + " food, the price ranges from $" + cheapestItem + " to $" + mostExpensiveItem + ". It is open from " + hours + ". It has a wait time of " +waitTime+" minutes. The restaurant has " + numTables + " tables and the tables are open? "+hasTables+". And the restaurant is VIP only? "+vipOnly);
    }

}
