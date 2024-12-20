public class Stands extends FoodSpots {
    boolean snacksOnly;

    public Stands(String name, boolean hasTables, String cuisine, double cheapestItem, double mostExpensiveItem, String hours, boolean snacksOnly) {
        super(name, hasTables, cuisine, cheapestItem, mostExpensiveItem, hours);
        this.snacksOnly = snacksOnly;
    }
    // getters and setters for each variable
    public boolean isSnacksOnly() {
        return snacksOnly;
    }

    public void setSnacksOnly(boolean snacksOnly) {
        this.snacksOnly = snacksOnly;
    }

    // polymorphic method
    public String welcome(){
        return ("Welcome to the Food Stand");
    }

    @Override
    public String toString() {
        return ("Food Stand " + name + " serves " + cuisine + " food, the price ranges from $" + cheapestItem + " to $" + mostExpensiveItem + ". It is open from " + hours + ".");
    }

    // test code
    public static void main(String[] args){
        Stands Gyros = new Stands("Gyros", true, "Greek", 4.75, 32.55, "10:30 AM - 6PM", false);
        System.out.println(Gyros);
        System.out.println(Gyros.welcome());
    }
}
