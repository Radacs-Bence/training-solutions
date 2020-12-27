package week09d03;

import java.util.List;

public class SantaClaus {

    private List<Person> goodBoys;

    public SantaClaus(List<Person> goodBoys) {
        this.goodBoys = goodBoys;
    }

    public void getThroughChimneys(){
        for (Person person: goodBoys) {
            person.setPresent();
        }
    }
}
