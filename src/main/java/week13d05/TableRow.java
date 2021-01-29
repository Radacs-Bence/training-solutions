package week13d05;

import java.util.Optional;

public class TableRow implements RowWriter{

    @Override
    public String createLine(BillItem billItem) {
        return String.format("%-32s%13d%5d%6d", billItem.getName(), billItem.getUnitPrice(), billItem.getNumber(), billItem.getNumber() * billItem.getUnitPrice());
    }

    @Override
    public Optional<String> createHeader() {
        return Optional.of(String.format("%-32s%13s%5s%6s", "Megnevezés","Egységár (Ft)", "Darab", "Összeg"));
    }
}
