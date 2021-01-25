package kasyanl.kasyanlfinalproject.database;

import kasyanl.kasyanlfinalproject.bean.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.service.ProductService;

import java.util.HashMap;
import java.util.Map;

public class ProductDataBase {

        public static Map<Long, Product> createBase() {

            ProductService productService = new ProductService();
            Product product = new Product();

            Map<Long, Product> productMap = new HashMap<>();

            productMap.put(product.getId(), productService.creatProduct(productMap, Category.FRUITS, "Apple",  6.00, 35.0));
            productMap.put(product.getId(), productService.creatProduct(productMap, Category.FRUITS, "Orange",  12.10, 10.0));
            productMap.put(product.getId(), productService.creatProduct(productMap, Category.FRUITS, "Banana",  9.50, 20.0));
            productMap.put(product.getId(), productService.creatProduct(productMap, Category.BERRIES, "Cherry",  25.00, 5.0));
            productMap.put(product.getId(), productService.creatProduct(productMap, Category.BERRIES, "Marshmallow",  15.25, 60.0));
            productMap.put(product.getId(), productService.creatProduct(productMap, Category.BERRIES, "Strawberry",  50.15, 15.0));
            productMap.put(product.getId(), productService.creatProduct(productMap, Category.VEGETABLES, "Tomato",  5.50, 35.0));
            productMap.put(product.getId(), productService.creatProduct(productMap, Category.VEGETABLES, "Cucumber",  3.20, 20.0));
            productMap.put(product.getId(), productService.creatProduct(productMap, Category.VEGETABLES, "Onion",  10.10, 45.0));
            return productMap;
        }
    }

