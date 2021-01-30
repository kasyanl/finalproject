package kasyanl.kasyanlfinalproject.util.service.procces;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.service.ProductService;

public class FineCategory {

    public static String fineCategoryForRead(Category category) {
        String text = "";
        for (Product product : ProductDataBase.listProduct) {
            if (product.getCategory().equals(category)) {
                text +=ProductService.readProduct(product);
            }
        }
        return text;
    }

    public static void fineCategoryForSelectDiscount(Category category, double discont) {
        for (Product product : ProductDataBase.listProduct) {
            if (product.getCategory().equals(category)) {
                product.setDiscount(discont);
                ProductService.readProduct(product);
            }
        }
    }
}