package stringscanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString){
        if (isEmpty(intString) || !intString.contains(" ")){
            throw new IllegalArgumentException("Incorrect parameter string!");
        }

        int sum = 0;
        Scanner numbers = new Scanner(intString);
        while (numbers.hasNext()){
            try {
                sum += numbers.nextInt();
            }catch (InputMismatchException abc){
                throw new IllegalArgumentException("Incorrect parameter string!");
            }
        }
        return sum;
    }

    public int readAndSumValues(String intString, String delimiter){
        if (isEmpty(intString)){
            throw new IllegalArgumentException("Incorrect parameter string!");
        }

        int sum = 0;

        if (isEmpty(delimiter)){
            sum = readAndSumValues(intString);
        } else {
            Scanner numbers = new Scanner(intString).useDelimiter(delimiter);
            while (numbers.hasNext()) {
                try {
                    sum += numbers.nextInt();
                } catch (InputMismatchException abc) {
                    throw new IllegalArgumentException("Incorrect parameter string!");
                }
            }
        }
        return sum;

    }


    public String filterLinesWithWordOccurrences(String text, String word){
        if (isEmpty(text) || word == null || word.isEmpty()){
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        Scanner lines = new Scanner(text);
        String occurrences = "";
        while (lines.hasNext()){
            String line = lines.nextLine();
            if(line.contains(word)){
                occurrences += line + "\n";
            }
        }


        return occurrences.trim();
    }


    private boolean isEmpty(String string) {
        return string == null || string.isBlank();
    }

}
