package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import java.util.ArrayList;
import java.util.List;

public class FineCategoryProcessor implements ProductInterface {

    public static List<Product> fineCategoryForRead(List<Product> listProduct, Category category) {
        List <Product> newList = new ArrayList<>();
        for (Product product : listProduct) {
            if (product.getCategory().equals(category)) {
               ProductService.readProduct(product);
               newList.add(product);
            }
        }
        return newList;
    }

    public static List<Product> fineCategoryForSelectDiscount(List<Product> listProduct, Category category, double discont) {
        List <Product> newList = new ArrayList<>();
        for (Product product : listProduct) {
            if (product.getCategory().equals(category)) {
                product.setDiscount(discont);
                ProductService.readProduct(product);
                newList.add(product);
            }
        }
        return newList;
    }
}