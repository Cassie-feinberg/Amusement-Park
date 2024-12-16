public class WaterRides extends Rides{

    private int splashScale;
    private boolean raincoat;

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
        return "The splash scale of " + getName() + "is "+ getSplashScale();
    }

    @Override
    public String makeNoise() {
        return "Splash!!!!";
    }
}
