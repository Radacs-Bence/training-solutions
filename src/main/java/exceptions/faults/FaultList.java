package exceptions.faults;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FaultList {

    public List<String> processLines(List<String> lines) {
        if (lines == null) {
            throw new IllegalArgumentException("lines is null");
        }
        List<String> errors = new ArrayList<>();
        for (String line : lines) {
            String error = errorText(line);
            if (!error.isBlank()){
                errors.add(error);
            }
        }
        return errors;
    }

    private String errorText(String line) {
        int errorCode = 0;
        String[] data = line.split(",");
        if (isValidLine(data)){
            if (isComment(data[0])) {
                errorCode = 1;
            } else {
                if (incorrectValue(data[1])) {
                    errorCode += 4;
                }
                if (incorrectDate(data[2])){
                    errorCode += 8;
                }
            }
        } else {
            errorCode = 2;
        }
        ProcessingResult processingResult = getResultByNumber(errorCode);
        String text = "";
        if (errorCode > 1){
            text = errorLine(data[0], processingResult);
        }
        return text;
    }

    private boolean isValidLine(String[] data) {
        boolean comment = true;
        if (data.length != 3) {
            comment = false;
        }
        return comment;
    }

    private boolean isComment(String index) {
        boolean comment = false;
        try {
            Integer.parseInt(index);
        } catch (NumberFormatException ex) {
            comment = true;
        }
        return comment;
    }

    private boolean incorrectValue(String value) {
        boolean comment = false;
        try {
            Double.parseDouble(value);
        } catch (NumberFormatException ex) {
            comment = true;
        }
        return comment;
    }

    private boolean incorrectDate(String date) {
        boolean comment = false;
        try {
            DateFormat df = new SimpleDateFormat("yyyy.MM.dd.");
            df.parse(date);
        } catch (ParseException ex) {
            comment = true;
        }
        return comment;
    }

    private ProcessingResult getResultByNumber(int number){
        ProcessingResult processingResult = null;
        for (ProcessingResult result: ProcessingResult.values()) {
            if (result.getCode() == number){
                processingResult = result;
            }
        }
        return processingResult;
    }

    private String errorLine(String index, ProcessingResult processingResult){
        return String.format("%s,%d", index, processingResult.getCode());
    }

}

