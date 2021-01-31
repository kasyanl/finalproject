package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.service.ProductService;

public class FineCategory {

    public static void fineCategoryForRead(Category category) {
        for (Product product : ProductDataBase.listProduct) {
            if (product.getCategory().equals(category)) {
               ProductService.readProduct(product);
            }
        }
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