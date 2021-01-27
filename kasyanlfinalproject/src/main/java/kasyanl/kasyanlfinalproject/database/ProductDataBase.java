package kasyanl.kasyanlfinalproject.database;

import kasyanl.kasyanlfinalproject.bean.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.service.OutElements;
import kasyanl.kasyanlfinalproject.service.ProductService;

import java.util.List;

import static kasyanl.kasyanlfinalproject.bean.Category.*;

public class ProductDataBase implements ProductInterface {

        public static List<Product> createBase() {

            ProductService productService = new ProductService();

            listProduct.add( productService.creatProduct(1, FRUITS, "Apple", 10.0, 50.0, 5.0));
            listProduct.add( productService.creatProduct(2, FRUITS, "Orange",  12.10, 10.0, 10.89));
            listProduct.add( productService.creatProduct(3, FRUITS, "Banana",  9.50, 20.0, 7.6));
            listProduct.add( productService.creatProduct(4, BERRIES, "Cherry",  25.00, 5.0, 23.75));
            listProduct.add( productService.creatProduct(5, BERRIES, "Marshmallow",  15.25, 60.0, 6.1));
            listProduct.add( productService.creatProduct(6, BERRIES, "Strawberry",  50.20, 15.0, 42.67));
            listProduct.add( productService.creatProduct(7, VEGETABLES, "Tomato",  5.50, 30.0, 3.85));
            listProduct.add( productService.creatProduct(8, VEGETABLES, "Cucumber",  3.20, 20.0, 2.56));
            listProduct.add( productService.creatProduct(9, VEGETABLES, "Onion",  10.10, 40.0, 6.06));
            return listProduct;
        }
    }

