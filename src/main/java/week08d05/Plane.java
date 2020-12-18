package week08d05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Plane {

    public static final int ZERO_CHAR_CODE = 48;

    public int longestOcean(String map) {
        int max = 0;
        try (FileInputStream fis = new FileInputStream(map)) {
            int input;
            int counter = 0;
            while ((input = fis.read()) != -1) {
                if (input == ZERO_CHAR_CODE){
                    counter++;
                }else{
                    if (counter > max){
                        max = counter;
                    }
                    counter = 0;
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            throw new IllegalStateException("Can not find file", fileNotFoundException);

        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read file", ioException);

        }
        return max;
    }

}
