package ioconvert.products;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

public class ProductWriter {

    public static final String SEPARATOR = ";";

    public void saveProduct(OutputStream outputStream, List<Product> products){
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream))) {
            for (Product product: products) {
                writer.write(product.getName() + SEPARATOR + product.getPrice());
                writer.newLine();
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not write file", ioException);
        }
    }

}
