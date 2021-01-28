package kasyanl.kasyanlfinalproject.util.repository;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.crud.CreateProduct;

import java.util.List;

import static kasyanl.kasyanlfinalproject.util.bean.Category.*;

public class ProductDataBase implements ProductInterface {

    private ProductDataBase() {
    }

    public static List<Product> createBase() {

            listProduct.add( CreateProduct.creatProduct(FRUITS, "Apple", 10.0, 50.0));
            listProduct.add( CreateProduct.creatProduct(FRUITS, "Orange",  12.10, 10.0));
            listProduct.add( CreateProduct.creatProduct(FRUITS, "Banana",  9.50, 20.0));
            listProduct.add( CreateProduct.creatProduct(BERRIES, "Cherry",  25.00, 5.0));
            listProduct.add( CreateProduct.creatProduct(BERRIES, "Marshmallow",  15.25, 60.0));
            listProduct.add( CreateProduct.creatProduct(BERRIES, "Strawberry",  50.20, 15.0));
            listProduct.add( CreateProduct.creatProduct(VEGETABLES, "Tomato",  5.50, 30.0));
            listProduct.add( CreateProduct.creatProduct(VEGETABLES, "Cucumber",  3.20, 20.0));
            listProduct.add( CreateProduct.creatProduct(VEGETABLES, "Onion",  10.10, 40.0));
            listProduct.add( CreateProduct.creatProduct(MILK_PRODUCT, "Sour cream",  15.10, 10.0));
            listProduct.add( CreateProduct.creatProduct(MILK_PRODUCT, "Curd",  25.00, 00.0));
            listProduct.add( CreateProduct.creatProduct(MILK_PRODUCT, "Yogurt",  20.50, 10.0));
            listProduct.add( CreateProduct.creatProduct(MEAT, "Pork",  50.20, 30.0));
            listProduct.add( CreateProduct.creatProduct(MEAT, "Beef",  66.15, 00.0));
            listProduct.add( CreateProduct.creatProduct(MEAT, "Chicken meat",  15.10, 00.0));
            listProduct.add( CreateProduct.creatProduct(ALCOHOLIC_BEVERAGES, "Beer",  10.5, 00.0));
            listProduct.add( CreateProduct.creatProduct(ALCOHOLIC_BEVERAGES, "Whisky",  100.00, 00.0));
            listProduct.add( CreateProduct.creatProduct(ALCOHOLIC_BEVERAGES, "Wine",  40.10, 00.0));
            return listProduct;
        }
    }

