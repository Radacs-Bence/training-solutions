package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Track {

    public static final String COORDINATE_LINE = "<trkpt";
    public static final String COORDINATE_SEPARATOR = "\"";
    public static final int LAT_INDEX = 1;
    public static final int LON_INDEX = 3;
    public static final String ELEVATION_LINE = "<ele>";
    public static final String ELEVATION_START = ">";
    public static final String ELEVATION_END = "<";
    private Coordinate tempCoordinate;


    private List<TrackPoint> trackPoints = new ArrayList<>();



    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMaximumCoordinate() {
        double maxLatitude = trackPoints.get(0).getCoordinate().getLatitude();
        double maxLongitude = trackPoints.get(0).getCoordinate().getLongitude();

        for (TrackPoint trackPoint : trackPoints) {
            if (maxLatitude < trackPoint.getCoordinate().getLatitude()){
                maxLatitude = trackPoint.getCoordinate().getLatitude();
            }
            if (maxLongitude < trackPoint.getCoordinate().getLongitude()){
                maxLongitude = trackPoint.getCoordinate().getLongitude();
            }
        }

        return new Coordinate(maxLatitude, maxLongitude);
    }

    public Coordinate findMinimumCoordinate() {
        double minLatitude = trackPoints.get(0).getCoordinate().getLatitude();
        double minLongitude = trackPoints.get(0).getCoordinate().getLongitude();

        for (TrackPoint trackPoint : trackPoints) {
            if (minLatitude > trackPoint.getCoordinate().getLatitude()){
                minLatitude = trackPoint.getCoordinate().getLatitude();
            }
            if (minLongitude > trackPoint.getCoordinate().getLongitude()){
                minLongitude = trackPoint.getCoordinate().getLongitude();
            }
        }

        return new Coordinate(minLatitude, minLongitude);
    }

    public double getDistance() {
        double distance = 0.0;

        for (int i = 1; i < trackPoints.size(); i++){
            distance += trackPoints.get(i - 1).getDistanceFrom(trackPoints.get(i));
        }

        return distance;
    }

    public double getFullDecrease(){
        double decrease = 0.0;

        for (int i = 1; i < trackPoints.size(); i++){
            if (trackPoints.get(i - 1).getElevation() > trackPoints.get(i).getElevation()){
                decrease += trackPoints.get(i - 1).getElevation() - trackPoints.get(i).getElevation();
            }
        }

        return decrease;
    }

    public double getFullElevation(){
        double elevation = 0.0;

        for (int i = 1; i < trackPoints.size(); i++){
            if (trackPoints.get(i - 1).getElevation() < trackPoints.get(i).getElevation()){
                elevation += trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation();
            }
        }

        return elevation;
    }

    public double getRectangleArea(){
        double longitude = findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude();
        double latitude = findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude();

        return longitude * latitude;

    }


    public void loadFromGpx(InputStream inputStream){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null){
                lineProcessor(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }

    private void lineProcessor(String line){
        line = line.trim();
        if (line.startsWith(COORDINATE_LINE)){
            String [] parts = line.split(COORDINATE_SEPARATOR);
            double tempLat = Double.parseDouble(parts[LAT_INDEX]);
            double tempLon = Double.parseDouble(parts[LON_INDEX]);
            tempCoordinate = new Coordinate(tempLat, tempLon);
        }
        if (line.startsWith(ELEVATION_LINE)){
            String part = line.substring(line.indexOf(ELEVATION_START) + 1, line.lastIndexOf(ELEVATION_END));
            double tempEle = Double.parseDouble(part);
            trackPoints.add(new TrackPoint(tempCoordinate, tempEle));
        }
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }
}
