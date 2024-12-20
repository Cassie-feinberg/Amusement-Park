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
    // getters and setters for each variable
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

    // polymorphic method
    public String welcome(){
        return ("Welcome to the restaurant!");
    }

    // test code
    public static void main(String[] args){
        Restaurant chinese= new Restaurant("Yummies", true, "Chinese", 4.22, 40, "7 AM to 10 PM", 30,30,false);
        System.out.println(chinese.getWaitTime());
        System.out.println(chinese.getNumTables());
        System.out.println(chinese.isVipOnly());
        chinese.setWaitTime(5);
        chinese.setNumTables(10);
        chinese.setVipOnly(true);
        System.out.println(chinese.getWaitTime());
        System.out.println(chinese.getNumTables());
        System.out.println(chinese.isVipOnly());
        System.out.println(chinese.welcome());
        System.out.println(chinese);
    }
}
