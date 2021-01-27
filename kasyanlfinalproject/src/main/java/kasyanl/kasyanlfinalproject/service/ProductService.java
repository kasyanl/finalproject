package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.bean.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.repository.ProductInterface;
import java.util.*;


public class ProductService implements ProductInterface {

    private static long idCounter;

    public Product creatProduct(long id, Category category, String name, double price, double discount, double actualPrice) {
        id = idCounter;
        idCounter++;
        return new Product(id, category, name, price, discount, actualPrice);
    }


    public Product createNewProduct(List<Product> listProduct) {
        ImputNumberService imputNumberService = new ImputNumberService();

        long id = 0;

        if (listProduct.size() > 0) {
            int i = 0;
            for (Product product : listProduct) {
               if (product.getId() == i) i++;
               id = i;
           }
        }else id = ++idCounter;
            String selectCategory = imputNumberService.readString("Введите одну из категорий:" +
                    "\nFRUITS" +
                    "\nBERRIES" +
                    "\nVEGETABLES");
            selectCategory = selectCategory.toUpperCase();
            Category category = Category.valueOf(selectCategory);
            String name = imputNumberService.readString("Введите название продукта: ");
            double price = imputNumberService.readDouble("Введите цену продукта: ");
            double discount = imputNumberService.readDouble("Введите скидку продукта: ");
            double actualPrice = (price - (price * discount / 100));


            return new Product(id, category, name, price, discount, actualPrice);
        }

    }

