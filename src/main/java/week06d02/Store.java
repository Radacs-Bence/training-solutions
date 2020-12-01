package week06d02;

import java.util.List;

public class Store {

    private List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        List<Product> productsCopy = products;
        return productsCopy;
    }

    public CategoryCounter getProductsByCategory(){
        int frozenNumber = 0;
        int dairyNumber = 0;
        int bakedNumber = 0;
        int otherNumber = 0;

        for (Product product: products) {
            switch (product.getCategory()){
                case FROZEN:
                    frozenNumber++;
                    break;
                case DAIRY:
                    dairyNumber++;
                    break;
                case BAKEDGOODS:
                    bakedNumber++;
                    break;
                case OTHER:
                    otherNumber++;
                    break;
            }
        }
        return new  CategoryCounter(frozenNumber, dairyNumber, bakedNumber, otherNumber);
    }
}
