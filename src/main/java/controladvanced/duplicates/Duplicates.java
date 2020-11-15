package controladvanced.duplicates;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public List<Integer> findDuplicates(List<Integer> integerList){
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            for (int k = 0; k < i; k++) {
                if (integerList.get(i).equals(integerList.get(k))) {
                    duplicates.add(integerList.get(i));
                    break;
                }
            }
        }
        return duplicates;
    }

}
