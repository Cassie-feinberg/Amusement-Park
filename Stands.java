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
}
