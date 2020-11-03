package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(13.5,false);
        System.out.println("Távolság: " + distance.getDistanceKm() + ", pontos?: " + distance.isExact());
        int distanceInteger = (int) distance.getDistanceKm();
        System.out.println(distanceInteger);
    }
}
