import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.random.RandomGenerator;
import java.util.Scanner;
public class Park {
    public static void main(String[] args){
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
        while (stay){
            System.out.println("1. Go get food\n2. Go on a ride\nEnter the number of where you would like to go: ");
            String place = user.nextLine();
            if (place.equals("1")){
                System.out.println("1. Go to a restaurant\n2. Go to a food stand\n Enter the number of the type of food place you would like to go to: ");
                String food = user.nextLine();
                if (food.equals("1")){

                }
                else if (food.equals("2")){

                }
            }
            else if (place.equals("2")){
                System.out.println("1. Go on a roller coaster\n2. Go on a water ride\n Enter the number of the ride type you would like to go on: ");
                String ride = user.nextLine();
                if (ride.equals("1")){

                    ArrayList<String> rollerCoasters = new ArrayList<String>();
                    RollarCoasters zoomingMountain = new RollarCoasters("Zooming Mountain", 12, 54, 5, true, 45, 200, 10);
                    rollerCoasters.add("Zooming Mountain");

                    RollarCoasters dash = new RollarCoasters("Dash", 4, 36, 4, true, 2, 8, 0);
                    rollerCoasters.add("Dash");

                    RollarCoasters kaboom = new RollarCoasters("Kaboom", 10, 48, 3, false, 30, 8, 7);
                    rollerCoasters.add("Kaboom");


//                    System.out.println(dash);
//                    System.out.println(rollerCoasters);
//                    System.out.println(zoomingMountain.makeNoise());
                    //change it later
                }
                else if (ride.equals("2")){

                    ArrayList<String> waterRides = new ArrayList<String>();
                    WaterRides splashies = new WaterRides("Splashies", 4, 24, 1, true, 10, 1, false);
                    waterRides.add("splashies");

                    WaterRides splatoon = new WaterRides("Splatoon", 10, 54, 4, false, 15, 4, false);
                    waterRides.add("splatoon");

                    WaterRides splat = new WaterRides("Splat", 16, 60, 10, true, 30, 8, true);
                    waterRides.add("splat");


//                    System.out.println(splatoon);
//                    System.out.println(waterRides);
//                    System.out.println(splashies.makeNoise());

                    // change later
                }
            }
            System.out.println("Enter 1 if you want to leave: ");
            String Stay = user.nextLine();
            if (Stay.equals("1")){
                stay = false;
            }
        }
        System.out.println("Goodbye! Have a good rest of your day! Come back soon!");
    }
}
