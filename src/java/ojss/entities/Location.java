package ojss.entities;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hunter
 */
public class Location {
    private int locationID;
    private String suburb;
    private String city;
    private String country;
    private int postcode;
    private ArrayList<Location> locations;
    
    public Location(int id, String sub, String c, String coun, int post)
    {
        locationID = id;
        suburb = sub;
        city = c;
        country = coun;
        postcode = post;
    }
    
    public void setLocationID(int id)
    {
        locationID = id;
    }
    public void setSuburb(String sub)
    {
        suburb = sub;
    }
    public void setCity(String c)
    {
        city = c;
    }
    public void setCountry(String coun)
    {
        country = coun;
    }
    public void setPostcode(int post)
    {
        postcode = post;
    }
    public int getLocationID()
    {
        return locationID;
    }
    public String getSuburb()
    {
        return suburb;
    }
    public String getCity()
    {
        return city;
    }
    public String getCountry()
    {
        return country;
    }
    public int getPostcode()
    {
        return postcode;
    }
    public ArrayList<Location> getAllLocations()
    {
        return locations;
    }
}
