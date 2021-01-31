package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.service.ProductService;

public class FinePersonalProductProcessor {

    public static String personalProductProcessor(int id) {
        String text = "Продукта под таким ID не существует";
        for (Product product : ProductDataBase.listProduct) {
            if (product.getId() == id) {
                ProductService.readProduct(product);
            }
        }
        return text;
    }
}
