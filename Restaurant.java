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

    @Override
    public String toString() {
        return ("Restaurant " + name + " serves " + cuisine + " food, the price ranges from $" + cheapestItem + " to $" + mostExpensiveItem + ". It is open from " + hours + ". It has a wait time of " +waitTime+" minutes. The restaurant has " + numTables + " tables and the tables are open? "+hasTables+". And the restaurant is VIP only? "+vipOnly);
    }

    public static void main(String[] args){
        Restaurant Marians= new Restaurant("Marians", true, "Italian", 6.57, 37.45, "9 AM to 10 PM", 17,15,false);
        System.out.println( Marians.toString());
    }

}
