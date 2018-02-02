/*---------------------------------------------------------*|
|                Created by Tannre Overly - 2018            |
|-----------------------------------------------------------|
|   WARNING -   WARNING -   WARNING -   WARNING -   WARNING |
|-----------------------------------------------------------|
|   It is highly recommended that you attempt to solve your |
| problems before using work provided here in order to      |
| actually learn from your mistakes. Try to use this only to|
| review or compare your own work.                          |
|_______________________Good_Luck___________________________|*/


//!!!!!!!!!!!!!!! NOTE THIS EXERCISE IS INCOMPLETE !!!!!!!!!!!!!!!!!\\

//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//GeoLocation.java----------------------------------------------------
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//



/*
 * This class stores information about a location on Earth.  Locations are
 * specified using latitude and longitude.  The class includes a method for
 * computing the distance between two locations.
 *
 * This implementation is based off of the example from Stuart Reges at 
 * the University of Washington.
 */

public class GeoLocation 
{
    // Earth radius in miles
    public static final double RADIUS = 3963.1676;  

    private double latitude;
    private double longitude;
    
    private String name;

    /**
     * Constructs a geo location object with given latitude and longitude
     */
    public GeoLocation(String name, double theLatitude, double theLongitude) 
    {
        latitude = theLatitude;
        longitude = theLongitude;
    }
    
    public String getName()
    {
        return name;
    }

    /**
     * Returns the latitude of this geo location
     */
    public double getLatitude() 
    {
        return latitude;
    }

    /**
     * returns the longitude of this geo location
     */
    public double getLongitude() 
    {
        return longitude;
    }

    // returns a string representation of this geo location
    public String toString() 
    {
        return name+" (" + latitude + ", " + longitude+")";
    }

    // returns the distance in miles between this geo location and the given
    // other geo location
    public double distanceFrom(GeoLocation other) 
    {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);
        // apply the spherical law of cosines with a triangle composed of the
        // two locations and the north pole
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
    }
}



//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
//RoadTrip.java--------------------------------------------------------
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
import java.util.*;

public class RoadTrip
{
    private int stops = 0;
    private double distance = 0;
    private String name;
    private double latitude;
    private double longitude;
    
    // Create a GeoLocation and add it to the road trip
    public void addStop(String tname, double tlatitude, double tlongitude)
    {
        name = tname;
        latitude = tlatitude;
        longitude = tlongitude;
        stops += 1;
    }

    
    // Get the total number of stops in the tri
    public int getNumberOfStops()
    {
        return stops;
        
    }
    
    
    // Get the total miles of the trip
    public double getTripLength()
    {
        
    }
    
    
    // Return a formatted toString of the trip
    public String toString()
    {
        return stops + ". " + name + " ("+latitude+", "+longitude+")";
    }
    
}
