package week12d03;


import java.util.LinkedList;
import java.util.List;

public class AgeSorter {

    public int[] sortAges(int[] ages) {
        int[] sorted = new int[ages.length];
        List<Integer> agesList = intArrayToIntegerList(ages);

        int index = 0;

        while (!agesList.isEmpty()){
            Integer minAge = findMin(agesList);
            sorted[index] = minAge;
            agesList.remove(minAge);
            index++;
        }
        return sorted;
    }

    private List<Integer> intArrayToIntegerList(int[] ages){
        List<Integer> agesList = new LinkedList<>();
        for (int age : ages) {
            agesList.add(age);
        }
        return agesList;
    }

    private Integer findMin(List<Integer> agesList){
        Integer minAge = Integer.MAX_VALUE;
        for (Integer age : agesList) {
            if (age < minAge){
                minAge = age;
            }
        }
        return minAge;
    }

}