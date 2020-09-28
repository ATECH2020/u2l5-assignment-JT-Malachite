import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double startingLatitude;
        double startingLongitude;
        double endingLatitude;
        double endingLongitude;
        double distance;

        System.out.println("Enter the latitude of the starting location: " + startingLatitude);
        startingLatitude = in.nextDouble();
        System.out.println("Enter the longitude of the starting location: " + startingLongitude);
        startingLongitude = in.nextDouble();
        System.out.println("Enter the latitude of the ending location: " + endingLatitude);
        endingLatitude = in.nextDouble();
        System.out.println("Enter the longitude of the ending location: " + endingLongitude);
        endingLongitude = in.nextDouble();

        GeoLocation position = new GeoLocation(theLatitude, theLongitude);

        distance = position.distanceFrom(other);
        System.out.println("The distance is " + distance + " miles.");

    }
}