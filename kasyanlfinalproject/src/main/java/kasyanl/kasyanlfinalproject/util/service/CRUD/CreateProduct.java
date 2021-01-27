package kasyanl.kasyanlfinalproject.util.service.CRUD;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;

import java.util.*;


public class CreateProduct implements ProductInterface {

    private static long idCounter;

    public static void addProduct(List<Product> listProduct, Product product) {
        listProduct.add((int) product.getId(), product);
    }

    public static Product creatProduct(Category category, String name, double price, double discount, double actualPrice) {
        long id = idCounter;
        idCounter++;
        return new Product(id, category, name, price, discount, actualPrice);
    }

    public static Product createNewProduct(List<Product> listProduct) {
        long id = 0;
        if (listProduct.size() > 0) {
            int i = 0;
            for (Product product : listProduct) {
                if (product.getId() == i) i++;
                id = i;
            }
        } else id = ++idCounter;
        String selectCategory = ImputNumberService.readString("Введите одну из категорий:" +
                "\nFRUITS" +
                "\nBERRIES" +
                "\nVEGETABLES");
        selectCategory = selectCategory.toUpperCase();
        Category category = Category.valueOf(selectCategory);
        String name = ImputNumberService.readString("Введите название продукта: ");
        double price = ImputNumberService.readDouble("Введите цену продукта: ");
        double discount = ImputNumberService.readDouble("Введите скидку продукта: ");
        double actualPrice = (price - (price * discount / 100));


        return new Product(id, category, name, price, discount, actualPrice);
    }

}

