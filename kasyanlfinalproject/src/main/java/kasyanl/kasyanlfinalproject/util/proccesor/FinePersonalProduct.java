package kasyanl.kasyanlfinalproject.util.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

public class FinePersonalProduct {

    private FinePersonalProduct() {
        throw new UnsupportedOperationException();
    }

    static final Logger log = LoggerFactory.getLogger(FinePersonalProduct.class);

    public static Product personalProductProcessor(List<Product> listProduct, int id) {
        for (Product product : listProduct) {
            if (product.getId() == id) {
                CrudOperation.readProduct(product);
                return product;
            }
        }
        log.info("" +
                "\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ " +
                "\nТакого продукта не существует");
        return new Product();
    }
}
