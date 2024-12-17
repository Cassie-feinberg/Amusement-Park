import java.util.ArrayList;

public class WaterRides extends Rides{

    private int splashScale; // on a scale of 1-10
    private boolean raincoat; // If they have any raincoats available or not

    public WaterRides(String name, int ageLimit, int heightLimit, int cost, boolean working, int waitTime, int splashScale, boolean raincoat) {
        super(name, ageLimit, heightLimit, cost, working, waitTime);
        this.splashScale = splashScale;
        this.raincoat = raincoat;
    }

    public boolean hasRaincoat() {
        return raincoat;
    }

    public int getSplashScale() {
        return splashScale;
    }

    @Override
    public String toString() {
        return "The splash scale of " + getName() + " is "+ getSplashScale();
    }

    @Override
    public String makeNoise() {
        return "Splash!!!!";
    }

    public static void main(String[] args){
        ArrayList<String> waterRides = new ArrayList<String>();
        WaterRides splashies = new WaterRides("Splashies", 4, 24, 1, true, 10, 1, false);
        waterRides.add("splashies");

        WaterRides splatoon = new WaterRides("Splatoon", 10, 54, 4, false, 15, 4, false);
        waterRides.add("splatoon");

        WaterRides splat = new WaterRides("Splat", 16, 60, 10, true, 30, 8, true);
        waterRides.add("splat");


        System.out.println(splatoon);
        System.out.println(waterRides);
        System.out.println(splashies.makeNoise());
    }
}
