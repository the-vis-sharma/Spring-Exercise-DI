package in.stackroute;

public class Location {
    private String area;
    private String city;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "\tarea: " + area +
                "\tcity: " + city;
    }
}
