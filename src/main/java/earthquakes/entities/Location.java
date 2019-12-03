package earthquakes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String placeId;
    private String name;
    private double lat;
    private double lon;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getPlaceId() { return placeId; }
    public void setPlaceId(String placeId) { this.placeId = placeId; }
   
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getLat() { return lat; }
    public void setLat(double lat) { this.lat = lat; }

    public double getLon() { return lon; }
    public void setLon(double lon) { this.lon = lon; }
}