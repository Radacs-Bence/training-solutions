package week06d01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SeparatedSum {

    public SumResult sum(String s){
        double positive = 0.0;
        double negative = 0.0;
        String eng = replaceHunToEng(s);
        Scanner scanner = new Scanner(eng).useDelimiter(";").useLocale(new Locale("en", "US"));
        List<Double> numbers = new ArrayList<>();
        while (scanner.hasNext()){
            numbers.add(scanner.nextDouble());
        }
        for (Double number:numbers) {
            if(number > 0){
                positive += number;
            } else{
                negative += number;
            }
        }
        return new SumResult(positive, negative);
    }

    private String replaceHunToEng(String s){
        return s.replace(',', '.');
    }


}
