public class FoodSpots {

    protected boolean hasTables;
    protected String cuisine;
    protected double cheapestItem;
    protected double mostExpensiveItem;
    protected String hours;
    protected String name;

    public FoodSpots(String name, boolean hasTables, String cuisine, double cheapestItem, double mostExpensiveItem, String hours) {
        this.hasTables = hasTables;
        this.cuisine = cuisine;
        this.cheapestItem = cheapestItem;
        this.mostExpensiveItem = mostExpensiveItem;
        this.hours = hours;
        this.name = name;
    }

    public FoodSpots() {
    }

    public boolean isHasTables() {
        return hasTables;
    }

    public void setHasTables(boolean hasTables) {
        this.hasTables = hasTables;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public double getCheapestItem() {
        return cheapestItem;
    }

    public void setCheapestItem(double cheapestItem) {
        this.cheapestItem = cheapestItem;
    }

    public double getMostExpensiveItem() {
        return mostExpensiveItem;
    }

    public void setMostExpensiveItem(double mostExpensiveItem) {
        this.mostExpensiveItem = mostExpensiveItem;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public void out(String item){
        System.out.println("We are out of " + item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return (name + " serves " + cuisine + " food, the price ranges from $" + cheapestItem + " to $" + mostExpensiveItem + ". It is open from " + hours + ". It has tables? " + hasTables);
    }

    public int cost(String item){
        return (item.length());
    }

    public static void main(String[] args){
        FoodSpots snackStand = new FoodSpots("Snackles", false, "snacks", 0.50, 5, "12AM - 12AM");
        FoodSpots bar = new FoodSpots("Twenty One", true, "bar", 3, 30, "9PM - 4AM");
        FoodSpots dessert = new FoodSpots("Sprinkles", true, "desserts", 5, 16, "12PM - 5PM");
        FoodSpots[] foodspots = new FoodSpots[]{snackStand, bar, dessert};

        System.out.println(snackStand);

    }
}
