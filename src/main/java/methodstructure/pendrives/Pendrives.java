package methodstructure.pendrives;

import java.util.List;

public class Pendrives {


    public Pendrive best(List<Pendrive> pendrives){
        Pendrive cheapest = new Pendrive("Ha ezt kapod akkor hiba van!", 1, Integer.MAX_VALUE);
        for (Pendrive pendrive: pendrives) {
            if (pendrive.comparePricePerCapacity(cheapest) == -1){
                cheapest = pendrive;
            }
        }
        return cheapest;
    }

    public Pendrive cheapest(List<Pendrive> pendrives){
        Pendrive cheapest = new Pendrive("Ha ezt kapod akkor hiba van!", 1, Integer.MAX_VALUE);
        for (Pendrive pendrive: pendrives) {
            if (pendrive.cheaperThan(cheapest)){
                cheapest = pendrive;
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity){
        for (Pendrive pendrive: pendrives) {
            if (capacity == pendrive.getCapacity()){
                pendrive.risePrice(percent);
            }
        }
    }

}
