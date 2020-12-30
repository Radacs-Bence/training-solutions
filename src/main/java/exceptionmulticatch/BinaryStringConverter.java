package exceptionmulticatch;

import java.lang.reflect.Array;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String binaryString) {
        if (binaryString == null){
            throw new IllegalArgumentException("binaryString null");
        }
        boolean[] booleanArray = new boolean[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                booleanArray[i] = false;
            } else if (binaryString.charAt(i) == '1') {
                booleanArray[i] = true;
            } else {
                throw new IllegalArgumentException("binaryString not valid");
            }
        }
        return booleanArray;
    }

    public String booleanArrayToBinaryString(boolean[] booleanArray) {
        if (booleanArray == null){
            throw new IllegalArgumentException("Array is null");
        }
        if (booleanArray.length == 0) {
            throw new IllegalArgumentException("booleans size 0");
        }
        String binaryString = "";
        for (boolean answer: booleanArray) {
            if (!answer){
                binaryString += "0";
            }
            if (answer){
                binaryString += "1";
            }
        }
        return binaryString;
    }

}
