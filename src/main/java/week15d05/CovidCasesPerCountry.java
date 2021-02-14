package week15d05;

public class CovidCasesPerCountry {

    private String country;
    private int population;
    private int cases;

    public CovidCasesPerCountry(String country, int population, int cases) {
        this.country = country;
        this.population = population;
        this.cases = cases;
    }


    public void addCases(int cases){
        this.cases += cases;
    }

    public double getRate(){
        if (population == 0){
            return 0;
        }
        return cases / (double) population;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public int getCases() {
        return cases;
    }

    @Override
    public String toString() {
        return "CovidCasesPerCountry{" +
                "country='" + country + '\'' +
                ", population=" + population +
                ", cases=" + cases +
                '}';
    }
}
