package week13d05;

import java.util.Optional;

public interface RowWriter {

    String createLine(BillItem billItem);
    Optional<String> createHeader();

}
