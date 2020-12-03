package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper){
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target){
        findTrooperByName(name).changePosition(target);
    }

    public void moveClosestTrooper(Position target){
        findClosestTrooper(target).changePosition(target);
    }

    private Trooper findTrooperByName(String name){
        Trooper named = null;
        for (Trooper trooper: troopers) {
            if (trooper.getName().equals(name)){
                named = trooper;
            }
        }
        return named;
    }

    private Trooper findClosestTrooper(Position target){
        Trooper closest = troopers.get(0);
        for (Trooper trooper: troopers) {
            if (trooper.distanceFrom(target) < closest.distanceFrom(target)){
                closest = trooper;
            }
        }
        return closest;
    }

}
