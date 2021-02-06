package lambdaintro;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class OfficeDocumentReader {

    public static final String REGEXP = ".*\\.(docx|xlsx|pptx)$";

    public List<File> listOfficeDocuments(File path){
        List<File> result = Arrays.asList(path.listFiles(f -> f.isFile() && f.getName().toLowerCase().matches(REGEXP)));
        result.sort(Comparator.comparing(File::getName));
        return result;
    }

}
