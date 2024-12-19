public class Stands extends FoodSpots {
    boolean snacksOnly;

    public Stands(String name, boolean hasTables, String cuisine, double cheapestItem, double mostExpensiveItem, String hours, boolean snacksOnly) {
        super(name, hasTables, cuisine, cheapestItem, mostExpensiveItem, hours);
        this.snacksOnly = snacksOnly;
    }

    public boolean isSnacksOnly() {
        return snacksOnly;
    }

    public void setSnacksOnly(boolean snacksOnly) {
        this.snacksOnly = snacksOnly;
    }

    @Override
    public String toString() {
        return ("Food Stand " + name + " serves " + cuisine + " food, the price ranges from $" + cheapestItem + " to $" + mostExpensiveItem + ". It is open from " + hours + ".");
    }

    public static void main(String[] args){
        Stands Pablos = new Stands("Pablos", false, "Mexican", 2.99, 23.55, "9:30 AM - 8PM", false);
        Stands Gyros = new Stands("Gyros", true, "Greek", 4.75, 32.55, "10:30 AM - 6PM", false);
        Stands Mikes = new Stands("Mikes", true, "Burger", 1.50, 25.75, "8AM to 8PM", true);
        Stands[] stands = new Stands[]{Pablos, Gyros, Mikes};
    }
}
