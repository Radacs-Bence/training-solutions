package iostringwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {

    public void writeWithPrintWriter(Writer writer, List<String> words) {
        PrintWriter printWriter = new PrintWriter(writer);
        for (String word : words) {
            printWriter.println(word + " " + word.length());
        }

    }

    public String writeWithStringWriter(List<String> words){
        StringWriter writer = new StringWriter();
        try (writer) {
            writeWithPrintWriter(writer, words);
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not write", ioException);
        }
        return writer.toString();
    }
}
