package week13d01;

public class City {

    private final String number;
    private final String name;
    private final String cityPart;


    public City(String number, String name, String cityPart) {
        this.number = number;
        this.name = name;
        this.cityPart = cityPart;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getCityPart() {
        return cityPart;
    }

    @Override
    public String toString() {
        return number + ';' + name + ';' + cityPart;
    }
}
