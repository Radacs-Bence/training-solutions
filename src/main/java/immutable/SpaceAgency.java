package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> satellites = new ArrayList<>();


    public void registerSatellite(Satellite satellite){
        if (satellite == null){
            throw new NullPointerException("Parameter must not be null!");
        }
        satellites.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent){
        Satellite found = null;
        for (Satellite satellite: satellites) {
            if (satellite.getRegId().equals(registerIdent)){
                found = satellite;
            }
        }
        if (found == null){
            throw new IllegalArgumentException("Satellite with the given registration cannot be found!" + registerIdent);
        }
        return found;
    }

    @Override
    public String toString() {
        return satellites.toString();
    }
}
