package exceptionmulticatch;

public class AnswerStat {

    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String binaryString) {
        boolean[] booleanArray = null;
        try {
            booleanArray = binaryStringConverter.binaryStringToBooleanArray(binaryString);
        } catch (NullPointerException | IllegalArgumentException exception) {
            throw new InvalidBinaryStringException(exception.getMessage(), exception);
        }
        return booleanArray;
    }

    public int answerTruePercent(String answers) {
        boolean[] booleanArray = convert(answers);
        int trues = 0;
        for (boolean answer : booleanArray) {
            if (answer){
                trues++;
            }
        }
        return (int)Math.round((double)trues / booleanArray.length * 100);
    }

}
