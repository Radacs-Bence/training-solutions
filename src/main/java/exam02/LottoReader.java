package exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LottoReader {

    private static final String SEPARATOR = ";";
    public static final int LOTTO_NUMS_END = 16;
    public static final int LOTTO_NUMS_START = 11;

    private final int[] numbersAmount = new int[90];

    public LottoReader(InputStream inputStream) {
        List<Integer> lottoNumbers = readNumbers(inputStream);
        countNumbers(lottoNumbers);
    }

    private List<Integer> readNumbers(InputStream inputStream) {
        List<Integer> lottoNumbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(SEPARATOR);
                for (int i = LOTTO_NUMS_START; i < LOTTO_NUMS_END; i++) {
                    lottoNumbers.add(Integer.parseInt(parts[i]));
                }
            }

        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read File", ioException);
        }
        return lottoNumbers;
    }

    private void countNumbers(List<Integer> lottoNumbers) {
        for (int number : lottoNumbers) {
            numbersAmount[number - 1] ++;
        }
    }

    public int getNumber(int number){
        return numbersAmount[number - 1];
    }


}
