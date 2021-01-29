package week13d05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BillWriterTest {

    @Test
    void writeBillsSimpleRoWTest() {
        List<BillItem> billItems = new ArrayList<>();
        billItems.add(new BillItem("kenyér", 3, 10));
        billItems.add(new BillItem("tej", 5, 20));
        BillWriter billWriter =  new BillWriter(billItems);

        String result = billWriter.writeBills(billWriter.getBillItems(), new SimpleRow());
        String correct = """
                3 kenyér, darabja 10 Ft
                5 tej, darabja 20 Ft
                """;
        assertEquals(correct, result);
    }

    @Test
    void writeBillsMathRoWTest() {
        List<BillItem> billItems = new ArrayList<>();
        billItems.add(new BillItem("kenyér", 3, 10));
        billItems.add(new BillItem("tej", 5, 20));
        BillWriter billWriter =  new BillWriter(billItems);

        String result = billWriter.writeBills(billWriter.getBillItems(), new MathRow());
        String correct = """
                kenyér 3 * 10 = 30
                tej 5 * 20 = 100
                """;
        assertEquals(correct, result);
    }

    @Test
    void writeBillsTableRoWTest() {
        List<BillItem> billItems = new ArrayList<>();
        billItems.add(new BillItem("kenyér", 3, 10));
        billItems.add(new BillItem("tej", 5, 20));
        BillWriter billWriter =  new BillWriter(billItems);

        String result = billWriter.writeBills(billWriter.getBillItems(), new TableRow());
        String correct = """
                Megnevezés                      Egységár (Ft)DarabÖsszeg
                kenyér                                     10    3    30
                tej                                        20    5   100
                """;
        assertEquals(correct, result);
    }

    @Test
    void writeBillsWithNewTest() {
        List<BillItem> billItems = new ArrayList<>();
        billItems.add(new BillItem("kenyér", 3, 10));
        billItems.add(new BillItem("tej", 5, 20));
        BillWriter billWriter =  new BillWriter(billItems);
        String result = billWriter.writeBills(billWriter.getBillItems(), new RowWriter() {
            @Override
            public String createLine(BillItem billItem) {
                return billItem.getName();
            }

            @Override
            public Optional<String> createHeader() {
                return Optional.empty();
            }
        });
        String correct = """
                kenyér
                tej
                """;
    }

    @Test
    void writeBillsWithFunctionTest() {
        List<BillItem> billItems = new ArrayList<>();
        billItems.add(new BillItem("kenyér", 3, 10));
        billItems.add(new BillItem("tej", 5, 20));
        BillWriter billWriter =  new BillWriter(billItems);
        String result = billWriter.writeBillsWithFunction(billWriter.getBillItems(), item -> item.getName());
        String correct = """
                kenyér
                tej
                """;
    }
}