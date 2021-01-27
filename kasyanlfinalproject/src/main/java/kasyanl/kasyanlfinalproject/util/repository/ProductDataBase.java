package kasyanl.kasyanlfinalproject.util.repository;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.CRUD.CreateProduct;

import java.util.List;

import static kasyanl.kasyanlfinalproject.util.bean.Category.*;

public class ProductDataBase implements ProductInterface {

        public static List<Product> createBase() {

            CreateProduct createProduct = new CreateProduct();

            listProduct.add( createProduct.creatProduct(FRUITS, "Apple", 10.0, 50.0, 5.0));
            listProduct.add( createProduct.creatProduct(FRUITS, "Orange",  12.10, 10.0, 10.89));
            listProduct.add( createProduct.creatProduct(FRUITS, "Banana",  9.50, 20.0, 7.6));
            listProduct.add( createProduct.creatProduct(BERRIES, "Cherry",  25.00, 5.0, 23.75));
            listProduct.add( createProduct.creatProduct(BERRIES, "Marshmallow",  15.25, 60.0, 6.1));
            listProduct.add( createProduct.creatProduct(BERRIES, "Strawberry",  50.20, 15.0, 42.67));
            listProduct.add( createProduct.creatProduct(VEGETABLES, "Tomato",  5.50, 30.0, 3.85));
            listProduct.add( createProduct.creatProduct(VEGETABLES, "Cucumber",  3.20, 20.0, 2.56));
            listProduct.add( createProduct.creatProduct(VEGETABLES, "Onion",  10.10, 40.0, 6.06));
            return listProduct;
        }
    }

