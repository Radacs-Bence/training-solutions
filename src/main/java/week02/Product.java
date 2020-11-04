package week02;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product p){
        return getName().equals(p.getName());
    }

    public static void main(String[] args) {
        Product peach = new Product("Barack", "a12");
        Product pineapple = new Product("Ananász", "22e55");
        Product apricot = new Product("Barack", "a12b");

       boolean testPeachPineapple = peach.areTheyEqual(pineapple);
       boolean testPeachApricot = peach.areTheyEqual(apricot);
       System.out.println("Egyezés:\r\n1.termék és 2. termék: " + testPeachPineapple + "\r\n1.termék és 3. termék: " + testPeachApricot);
    }
}
