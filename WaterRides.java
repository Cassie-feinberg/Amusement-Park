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

}
