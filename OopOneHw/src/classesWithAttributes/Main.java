package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        //attribute or field,
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(7580);
        product.setStockAmount(7);

        ProductManeger productManeger = new ProductManeger();
        productManeger.Add(product);


    }


}
