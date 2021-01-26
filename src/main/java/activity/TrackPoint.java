package activity;

public class TrackPoint {

    private final Coordinate coordinate;
    private final double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    public double getDistanceFrom(TrackPoint otherPoint){
        // copied from: https://stackoverflow.com/questions/3694380/calculating-distance-between-two-points-using-latitude-longitude
        final int R = 6371; // Radius of the earth

        double latitudeOther = otherPoint.getCoordinate().getLatitude();
        double latitudeCurrent = this.getCoordinate().getLatitude();
        double longitudeOther = otherPoint.getCoordinate().getLongitude();
        double longitudeCurrent = this.getCoordinate().getLongitude();

        double latDistance = Math.toRadians(latitudeOther - latitudeCurrent);
        double lonDistance = Math.toRadians(longitudeOther - longitudeCurrent);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(latitudeCurrent)) * Math.cos(Math.toRadians(latitudeOther))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        double height = this.elevation - otherPoint.elevation;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }
}
