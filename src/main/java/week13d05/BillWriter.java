package week13d05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class BillWriter {

    private List<BillItem> billItems;

    public BillWriter(List<BillItem> billItems) {
        this.billItems = billItems;
    }

    public String writeBills(List<BillItem> billItems, RowWriter rowWriter) {
        StringBuilder text = new StringBuilder();
        if (rowWriter.createHeader().isPresent()){
            text.append(rowWriter.createHeader().get());
            text.append("\n");
        }
        for (BillItem billItem : billItems) {
             text.append(rowWriter.createLine(billItem));
             text.append("\n");
        }

        return text.toString();
    }

    public String writeBillsWithFunction(List<BillItem> billItems, Function<BillItem, String> rowWriter){
        StringBuilder text = new StringBuilder();
        for (BillItem billItem : billItems) {
            text.append(rowWriter.apply(billItem));
            text.append("\n");
        }

        return text.toString();
    }

    public List<BillItem> getBillItems() {
        return new ArrayList<>(billItems);
    }

}
