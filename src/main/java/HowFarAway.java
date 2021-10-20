package main.java;
import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the latitude of the starting location: ");
        double startLat = scan.nextDouble();
        System.out.println("Enter the longitude of the starting location: ");
        double startLong = scan.nextDouble();
        System.out.println("Enter the latitude of the ending location:");
        double endLat = scan.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        double endLong = scan.nextDouble();

        GeoLocation first = new GeoLocation(startLat, startLong);
        GeoLocation second = new GeoLocation(endLat, endLong);

        double distance = first.distanceFrom(second);
        System.out.println("The distance is " + distance + " miles.");



    }
}