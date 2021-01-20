package week12d03;


import java.util.ArrayList;
import java.util.List;

public class AgeSorter {

    public int[] sortAges(int[] ages) {
        int[] sorted = new int[ages.length];
        List<Integer> agesList = new ArrayList<>();
        for (int age : ages) {
            agesList.add(age);
        }
        int index = 0;

        while (!agesList.isEmpty()){
            Integer minAge = Integer.MAX_VALUE;
            for (Integer age : agesList) {
                if (age < minAge){
                    minAge = age;
                }
            }
            sorted[index] = minAge;
            agesList.remove(minAge);
            index++;
        }
        return sorted;
    }
}
