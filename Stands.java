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
        Stands Marians= new Stands("Pablos", true, "Mexican", 2.99, 23.55, "9:30 AM to 8 PM", false);
        System.out.println( Marians.toString());
    }
}
