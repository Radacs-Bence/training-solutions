package week13d05;

import java.util.Optional;

public class SimpleRow implements RowWriter{

    @Override
    public String createLine(BillItem billItem) {
        return String.format("%d %s, darabja %d Ft", billItem.getNumber(), billItem.getName(), billItem.getUnitPrice());
    }

    @Override
    public Optional<String> createHeader() {
        return Optional.empty();
    }
}
