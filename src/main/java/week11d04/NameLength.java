package week11d04;

import java.util.*;

public class NameLength {


    public static final String INITIAL = "J";

    public List<Integer> getLengths(List<String> names) {
        Set<Integer> counter = new HashSet<>();
        if (names != null || !names.isEmpty()) {
            for (String name : names) {
                if (name.startsWith(INITIAL)) {
                    counter.add(name.length());
                }
            }
        }
        return new ArrayList<>(counter);
    }


}
