package kasyanl.kasyanlfinalproject.util.service.menu;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.service.InputNumberService;
import kasyanl.kasyanlfinalproject.util.service.ProductService;
import kasyanl.kasyanlfinalproject.util.service.procces.SelectCategory;

public class ReadProduct {
    public static boolean categorySelect;

    public static String fineAllproduct() {
        String text = "";
        if (ProductDataBase.listProduct.size() == 0) {
            System.out.println("В базе отсутствуют элементы");
        } else {
            for (Product product : ProductDataBase.listProduct) {
               text+= ProductService.readProduct(product);
            }
        }
        return text;
    }

    public static void fineCategoryProguct(int category) {
        categorySelect = true;
        while (categorySelect) {
            StartMenu.menuCategory();
            SelectCategory.selectCategory(category);
        }
    }

    public static String finePersonalProduct(int id) {
        String text = "";
        System.out.println("Введите ID продукта");
         id = InputNumberService.readNumber();

        for (Product product : ProductDataBase.listProduct)
            if (product.getId() == id) {
               text =  ProductService.readProduct(product);
            }
        return text;
    }
}
