package week02;

import java.util.Arrays;
import java.util.List;

public class Languages {


    public static void main(String[] args) {

        String[]  lang = {"Java", "Python", "Javascript"};
        List<String> languages = Arrays.asList(lang);

        for (String item : languages) {
            if (item.length() >= 5) {
                System.out.println(item);
            }
        }
    }

}
