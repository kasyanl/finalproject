package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class FinePersonalProductProcessor {

    static final Logger log = LoggerFactory.getLogger(FinePersonalProductProcessor.class);

    public static Product personalProductProcessor(List<Product> listProduct, int id) {
        for (Product product : listProduct) {
            if (product.getId() == id) {
                ProductService.readProduct(product);
                return product;
            }
        }
        log.info(""+
                "\n________________"+
                "\nТакого продукта не существует");
        return new Product();
    }
}
