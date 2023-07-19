import domain.enums.ProductType;
import domain.models.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Book1", ProductType.BOOKS, 120000.0);
        Product product2 = new Product(2, "Book2", ProductType.BOOKS, 100000.0);
        Product product3 = new Product(3, "Oven", ProductType.ELECTRONICS, 100000.0);

        List<Product> products = new ArrayList<Product>();

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.toString();
        System.out.println(listByPriceIf(products, 100000.0, ProductType.BOOKS));


    }


    public static List<Product> listByPriceIf(List<Product> products,Double priceif,ProductType type){
            return products.stream()
                    .filter(p -> p.getPrice()>100)
                    .filter(p -> p.getCategory().equals(type))
                    .toList();
    }
}