package week08d02;

public class Country {

    private String countryName;
    private int population;
    private int flagColours;
    private int neighbouringCountries;

    public Country(String countryName, int population, int flagColours, int neighbouringCountries) {
        this.countryName = countryName;
        this.population = population;
        this.flagColours = flagColours;
        this.neighbouringCountries = neighbouringCountries;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getPopulation() {
        return population;
    }

    public int getFlagColours() {
        return flagColours;
    }

    public int getNeighbouringCountries() {
        return neighbouringCountries;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", population=" + population +
                ", flagColours=" + flagColours +
                ", neighbouringCountries=" + neighbouringCountries +
                '}';
    }
}
