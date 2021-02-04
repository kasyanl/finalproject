package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ProductService{

    Product product;

    public ProductService(Product product) {
        this.product = product;
    }

    private static long idCounter ;
    static final Logger log = LoggerFactory.getLogger(ProductService.class);

    public static Product creatProduct(Category category, String name, double price, double discount) {
        long id = idCounter;
        if (ProductInterface.listProduct.isEmpty()) id = 0;
        else if (!ProductInterface.listProduct.isEmpty()) {
            long i = 1;
            for (Product product : ProductInterface.listProduct) {
                if (product.getId() == i) i++;
                id = i;
            }
        } else id = ++idCounter;
        double actualPrice = CalculaterActualPrice.calculating(price, discount);
        Product product = new Product(id, category, name, price, discount, actualPrice);
        ProductService.readProduct(product);
        return product;
    }

    public static void readProduct(Product product) {
        log.info("{}", product);
    }

    public static void deleteProduct(List<Product> listProduct, long id) {
        listProduct.removeIf(nextProduct -> nextProduct.getId() == id);

    }
}

