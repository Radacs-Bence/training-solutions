package week03;

import java.util.ArrayList;
import java.util.List;

public class Position {

    String name;
    int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Position: " + name + ", " +
                "Bonus: " + bonus;
    }

    public static void main(String[] args) {

        List<Position> company = new ArrayList<>();

        company.add(new Position("CEO", 100_000_000));
        company.add(new Position("Central Project Manager", 200_000));
        company.add(new Position("Assistant", 10_000));
        company.add(new Position("Secretary", 10_000));
        company.add(new Position("Janitor", 1_000));
        company.add(new Position("Intern", 0));

        for (Position position: company) {
            if (position.getBonus() > 150_000) {
                System.out.println(position.toString());
            }

        }




    }
}
