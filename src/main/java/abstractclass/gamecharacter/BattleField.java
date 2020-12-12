package abstractclass.gamecharacter;

public class BattleField {

    private int round = 0;

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender){
        if (attacker.isAlive() && defender.isAlive()){
            attacker.primaryAttack(defender);
            attacker.secondaryAttack(defender);
        }
        return attacker.isAlive() && defender.isAlive();
    }

    public Character fight(Character one, Character other){
        Character victor = null;
        while (one.isAlive() && other.isAlive()){
            round++;
            oneHit(one, other);
            oneHit(other, one);
        }
        if(one.isAlive()){
            victor = one;
        }
        if(other.isAlive()){
            victor = other;
        }
        return victor;
    }

}
