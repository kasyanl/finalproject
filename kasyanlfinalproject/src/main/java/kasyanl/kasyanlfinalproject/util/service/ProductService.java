package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.procces.CalculaterActualPrice;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;

import java.util.List;

public class ProductService {

    private static long idCounter;

    public static Product creatProduct(Category category, String name, double price, double discount) {
        long id = idCounter;
        idCounter++;
        double actualPrice = CalculaterActualPrice.calcuiating();
       return new Product(id, category, name, price, discount, actualPrice);
    }

    public static void deleteProduct(Product product) {
        ProductDataBase.listProduct.remove(product);
    }

    public static void updateProduct(Product product) {
       product.setCategory(product.getCategory());
       product.setName(product.getName());
       product.setPrice(product.getPrice());
       product.setDiscount(product.getDiscount());

    }

    public static void readProduct(Product product) {
        System.out.println(product);
    }

}
