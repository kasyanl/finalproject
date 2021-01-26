package kasyanl.kasyanlfinalproject.database;

import kasyanl.kasyanlfinalproject.bean.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.service.ProductService;

import java.util.HashMap;
import java.util.Map;

public class ProductDataBase implements ProductInterface {

        public static Map<Long, Product> createBase() {


            ProductService productService = new ProductService();

            productMap.put(1L, productService.creatProduct(1L, Category.FRUITS, "Apple", 10.0, 50.0));
            productMap.put(2L, productService.creatProduct(2L, Category.FRUITS, "Orange",  12.10, 10.0));
            productMap.put(3L, productService.creatProduct(3L, Category.FRUITS, "Banana",  9.50, 20.0));
            productMap.put(4L, productService.creatProduct(4L, Category.BERRIES, "Cherry",  25.00, 5.0));
            productMap.put(5L, productService.creatProduct(5L, Category.BERRIES, "Marshmallow",  15.25, 60.0));
            productMap.put(6L, productService.creatProduct(6L, Category.BERRIES, "Strawberry",  50.15, 15.0));
            productMap.put(7L, productService.creatProduct(7L, Category.VEGETABLES, "Tomato",  5.50, 35.0));
            productMap.put(8L, productService.creatProduct(8L, Category.VEGETABLES, "Cucumber",  3.20, 20.0));
            productMap.put(9L, productService.creatProduct(9L, Category.VEGETABLES, "Onion",  10.10, 45.0));
            return productMap;
        }
    }

