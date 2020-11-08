package math.game;

public class Game {

    public static void main(String[] args) {

        Warrior blue = new Warrior("Urthark the Destroyer of Words", new Point(3,4));
        Warrior red = new Warrior("Steve", new Point(10,11));
        int round = 0;
        System.out.println("Start:\n"
                + blue.toString() + "\n"
                + red.toString());

        for (; blue.distance(red) >0;){
            round++;
            blue.move(red);
            red.move(blue);
            System.out.println("Round" + round + ":\n"
                    + blue.toString() + "\n"
                    + red.toString());
        }
        for (; blue.isAlive() && red.isAlive();){
            round++;
            red.attack(blue);
            blue.attack(red);
            System.out.println("Round" + round + ":\n"
                    + blue.toString() + "\n"
                    + red.toString());
        }
        String winner = blue.isAlive() ? blue.toString() : red.toString();
        System.out.println("Winner: " + winner);
    }

}
