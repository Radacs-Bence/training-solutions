package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

     List<String> colours = new ArrayList<>();

    public void addLast(String capsule){
        colours.add(capsule);
    }

    public void addFirst(String capsule){
        colours.add(0, capsule);
    }

    public void removeFirst(){
        String name = colours.get(0);
        colours.remove(name);
    }

    public void removeLast(){
        int last = colours.size();
        String name = colours.get(last-1);
        colours.remove(name);
    }

    public List<String> getColours() {
        return colours;
    }

    public static void main(String[] args) {

        Capsules capsules = new Capsules();

        capsules.addFirst("blue");
        capsules.addFirst("green");
        capsules.addFirst("red");

        System.out.println(capsules.getColours());

        capsules.addFirst("cyan");
        capsules.addLast("black");
        capsules.addLast("white");

        System.out.println(capsules.getColours());

        capsules.removeFirst();

        System.out.println(capsules.getColours());

        capsules.removeLast();

        System.out.println(capsules.getColours());


    }

}
