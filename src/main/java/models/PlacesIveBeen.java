package models;
import java.util.ArrayList;

public class PlacesIveBeen {
    private String location;
    private String date;
    private String description;

    private static ArrayList<PlacesIveBeen> instances = new ArrayList<>();

    public PlacesIveBeen (String location, String date, String description){
        this.location = location;
        this.date = date;
        this.description = description;
        instances.add(this);
    }

    public String getLocation() {
        return location;
    }
    public String getDate() {
        return date;
    }
    public String getDescription() {
        return description;
    }

    public static ArrayList<PlacesIveBeen> getAll(){
        return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }



}