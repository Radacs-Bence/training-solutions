package week13d05;

import java.util.Optional;

public class MathRow implements RowWriter{

    @Override
    public String createLine(BillItem billItem) {
        return String.format("%s %d * %d = %d", billItem.getName(), billItem.getNumber(), billItem.getUnitPrice(), billItem.getNumber() * billItem.getUnitPrice());
    }

    @Override
    public Optional<String> createHeader() {
        return Optional.empty();
    }
}
