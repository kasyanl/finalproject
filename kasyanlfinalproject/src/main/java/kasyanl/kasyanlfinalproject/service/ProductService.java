package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.bean.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.repository.ProductInterface;

import java.util.Map;

public class ProductService implements ProductInterface {




    private static long idCounter = 0;

    public Product creatProduct(long id, Category category, String name, double price, double discount) {
        id = 0;
        if (productMap.size() == 0) {
            idCounter = 1;
        } else {
            idCounter++;
        }
        id = idCounter;
        return new Product(id, category, name, price, discount);
    }


    public Product createNewProduct(Map<Long, Product> productMap, Product product) {
        ImputNumberService imputNumberService = new ImputNumberService();
        if (productMap.size() == 0) {
           idCounter = 1;
        } else {
            idCounter = productMap.size()+1;
        }


        String selectCategory = imputNumberService.readString("Введите одну из категорий:"+
                "\n1. FRUITS" +
                "\n2. BERRIES" +
                "\n3. VEGETABLES");
        selectCategory = selectCategory.toUpperCase();
         Category category = Category.valueOf(selectCategory);
         String name = imputNumberService.readString("Введите название продукта: ");
         double price = imputNumberService.readDouble("Введите цену продукта: ");
         double discount = imputNumberService.readDouble("Введите скидку продукта: ");


        return new Product(idCounter, category, name, price, discount);
    }

}
