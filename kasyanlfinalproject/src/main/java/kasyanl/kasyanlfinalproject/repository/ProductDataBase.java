package kasyanl.kasyanlfinalproject.repository;

import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.proccesor.ProductService;

import java.util.List;

import static kasyanl.kasyanlfinalproject.enums.Category.*;

public class ProductDataBase implements ProductRepository {

    private ProductDataBase() {
        throw new UnsupportedOperationException();
    }

    public static List<Product> createList() {

        return listProduct;
    }

    static {
        listProduct.add(ProductService.creatProduct(FRUITS, "Яблоки", 10.0, 50.0));
        listProduct.add(ProductService.creatProduct(FRUITS, "Апельсины", 12.10, 10.0));
        listProduct.add(ProductService.creatProduct(FRUITS, "Бананы", 9.50, 20.0));
        listProduct.add(ProductService.creatProduct(BERRIES, "Вишня", 25.00, 5.0));
        listProduct.add(ProductService.creatProduct(BERRIES, "Клубника", 15.25, 60.0));
        listProduct.add(ProductService.creatProduct(BERRIES, "Арбуз", 50.20, 15.0));
        listProduct.add(ProductService.creatProduct(VEGETABLES, "Помидоры", 5.50, 30.0));
        listProduct.add(ProductService.creatProduct(VEGETABLES, "Огурцы", 3.20, 20.0));
        listProduct.add(ProductService.creatProduct(VEGETABLES, "Лук", 10.10, 40.0));
        listProduct.add(ProductService.creatProduct(MILK_PRODUCT, "Творог", 15.10, 10.0));
        listProduct.add(ProductService.creatProduct(MILK_PRODUCT, "Сметана", 25.00, 00.0));
        listProduct.add(ProductService.creatProduct(MILK_PRODUCT, "Йогурт", 20.50, 10.0));
        listProduct.add(ProductService.creatProduct(MEAT, "Свинина", 50.20, 30.0));
        listProduct.add(ProductService.creatProduct(MEAT, "Говядина", 66.15, 00.0));
        listProduct.add(ProductService.creatProduct(MEAT, "Баранина", 15.10, 00.0));
        listProduct.add(ProductService.creatProduct(ALCOHOLIC_BEVERAGES, "Пиво", 10.5, 00.0));
        listProduct.add(ProductService.creatProduct(ALCOHOLIC_BEVERAGES, "Виски", 100.00, 00.0));
        listProduct.add(ProductService.creatProduct(ALCOHOLIC_BEVERAGES, "Вино", 40.10, 00.0));
    }
}