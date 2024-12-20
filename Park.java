import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Park {
    public static void main(String[] args){

        // creating 3 variable arrays for each class and subclass
        Restaurant Marians= new Restaurant("Marians", true, "Italian", 6.57, 37.45, "9 AM to 10 PM", 17,15,false);
        Restaurant chinese= new Restaurant("Yummies", true, "Chinese", 4.22, 40, "7 AM to 10 PM", 30,30,false);
        Restaurant french = new Restaurant("Francois et Bruno", false, "French", 20, 110.45, "5PM to 1 AM", 5,40,true);
        Restaurant[] restaurants = new Restaurant[]{Marians, chinese, french};

        Stands Pablos = new Stands("Pablos", false, "Mexican", 2.99, 23.55, "9:30 AM - 8PM", false);
        Stands Gyros = new Stands("Gyros", true, "Greek", 4.75, 32.55, "10:30 AM - 6PM", false);
        Stands Mikes = new Stands("Mikes", true, "Burger", 1.50, 25.75, "8AM to 8PM", true);
        Stands[] stands = new Stands[]{Pablos, Gyros, Mikes};

        FoodSpots snackStand = new FoodSpots("Snackles", false, "snacks", 0.50, 5, "12AM - 12AM");
        FoodSpots bar = new FoodSpots("Twenty One", true, "bar", 3, 30, "9PM - 4AM");
        FoodSpots dessert = new FoodSpots("Sprinkles", true, "desserts", 5, 16, "12PM - 5PM");
        FoodSpots[] foodspots = new FoodSpots[]{snackStand, bar, dessert};

        RollarCoasters zoomingMountain = new RollarCoasters("Zooming Mountain", 12, 54, 5, true, 45, 200, 10);
        RollarCoasters dash = new RollarCoasters("Dash", 4, 36, 4, true, 2, 8, 0);
        RollarCoasters kaboom = new RollarCoasters("Kaboom", 10, 48, 3, false, 30, 8, 7);
        RollarCoasters[] rollerCoasters = new RollarCoasters[]{zoomingMountain, dash, kaboom};

        WaterRides splashies = new WaterRides("Splashies", 4, 24, 1, true, 10, 1, false);
        WaterRides splatoon = new WaterRides("Splatoon", 10, 54, 4, false, 15, 4, false);
        WaterRides splat = new WaterRides("Splat", 16, 60, 10, true, 30, 8, true);
        WaterRides[] waterRides = new WaterRides[]{splashies, splatoon, splat};

        Rides teacup = new Rides("Teacup Spin Time", 2, 31, 2, true, 20);
        Rides carousel = new Rides("Whirligig", 2, 31, 2, false, 0);
        Rides ferrisWheel = new Rides("Big Zero", 0, 0, 10, true, 40);
        Rides[] rides = new Rides[]{teacup, carousel, ferrisWheel};

        // create scanner and get info from use
        Scanner user = new Scanner(System.in);
        System.out.println("Welcome to the amusement park, what is your name? ");
        String name = user.nextLine();
        System.out.println("Hello " + name + "!\nEnter your age: ");
        String Age = user.nextLine();
        int age = Integer.parseInt(Age);
        System.out.println("Enter your height in inches: ");
        String Height = user.nextLine();
        int height = Integer.parseInt(Height);
        boolean stay = true;

        // main code with a while loop that runs while you stay in the park
        while (stay){
            // asks user what they want to do
            System.out.println("1. Go get food\n2. Go on a ride\nEnter the number of where you would like to go: ");
            String place = user.nextLine();
            Random generator = new Random();
            int randomIndex = generator.nextInt(3);

            // based on the type of place the user wants to go asks for more specifics and takes them to a random place of that type
            if (place.equals("1")){
                System.out.println("1. Go to a restaurant\n2. Go to a food stand\n Enter the number of the type of food place you would like to go to: ");
                String food = user.nextLine();
                if (food.equals("1")){
                    System.out.println("We are going to " + restaurants[randomIndex].getName());
                    System.out.println(restaurants[randomIndex]);
                }
                else if (food.equals("2")){
                    System.out.println("We are going to " + stands[randomIndex].getName());
                    System.out.println(stands[randomIndex]);
                }
                else {
                    System.out.println("We are going to " + foodspots[randomIndex].getName());
                    System.out.println(foodspots[randomIndex]);
                }
            }
            else if (place.equals("2")){
                System.out.println("1. Go on a roller coaster\n2. Go on a water ride\n Enter the number of the ride type you would like to go on: ");
                String ride = user.nextLine();
                if (ride.equals("1")){
                    System.out.println("We are going to go ride " + rollerCoasters[randomIndex].getName());
                    System.out.println(rollerCoasters[randomIndex]);
                    // checks if user is old enough and tall enough for the ride
                    if (rollerCoasters[randomIndex].getHeightLimit() > height){
                        System.out.println("You are not tall enough to ride this, Sorry!");
                    }
                    if (rollerCoasters[randomIndex].getAgeLimit() > age){
                        System.out.println("You are not old enough to ride this, Sorry!");
                    }
                    else {
                        System.out.println(rollerCoasters[randomIndex].makeNoise());
                    }
                }
                else if (ride.equals("2")){
                    System.out.println("We are going to go ride " + waterRides[randomIndex].getName());
                    System.out.println(waterRides[randomIndex]);
                    // checks if user is old enough and tall enough for the ride
                    if (waterRides[randomIndex].getHeightLimit() > height){
                        System.out.println("You are not tall enough to ride this, Sorry!");
                    }
                    if (waterRides[randomIndex].getAgeLimit() > age){
                        System.out.println("You are not old enough to ride this, Sorry!");
                    }
                    else {
                        System.out.println(waterRides[randomIndex].makeNoise());
                    }
                }
                else {
                    System.out.println("We are going to go ride " + rides[randomIndex].getName());
                    System.out.println(rides[randomIndex]);
                    // checks if user is old enough and tall enough for the ride
                    if (rides[randomIndex].getHeightLimit() > height){
                        System.out.println("You are not tall enough to ride this, Sorry!");
                    }
                    if (rides[randomIndex].getAgeLimit() > age){
                        System.out.println("You are not old enough to ride this, Sorry!");
                    }
                    else {
                        System.out.println(rides[randomIndex].makeNoise());
                    }
                }
            }
            // checks if user wants to leave the park
            System.out.println("Enter 1 if you want to leave and any other number if you want to stay: ");
            String Stay = user.nextLine();
            if (Stay.equals("1")){
                stay = false;
            }
        }
        System.out.println("Goodbye! Have a good rest of your day! Come back soon!");
    }
}
