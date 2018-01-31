import java.io.Serializable;

public class geoplaces implements Serializable {

    public String city;
    public double lon;
    public double lat;
    public double time;

    public void cityInfo(String name,double ln,double lt, double tz){
        city = name;
        lon = ln;
        lat = lt;
        time = tz;
    }
}
