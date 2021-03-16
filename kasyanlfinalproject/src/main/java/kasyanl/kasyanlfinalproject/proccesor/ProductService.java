package kasyanl.kasyanlfinalproject.proccesor;

import kasyanl.kasyanlfinalproject.enums.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public final class ProductService {

    private ProductService() {
        throw new UnsupportedOperationException();
    }

    private static long idCounter;

    public static Product creatProduct(Category category, String name, double price, double discount) {
        long id = idCounter;
        if (ProductRepository.listProduct.isEmpty()) id = 0;
        else if (!ProductRepository.listProduct.isEmpty()) {
            long i = 1;
            for (Product product : ProductRepository.listProduct) {
                if (product.getId() == i) i++;
                id = i;
            }
        } else id = ++idCounter;
        double actualPrice = calculating(price, discount);
        return new Product(id, category, name, price, discount, actualPrice);
    }

    public static void readProduct(Product product) {
        log.info("{}", product);
    }

    public static void deleteProduct(List<Product> listProduct, long id) {
        listProduct.removeIf(nextProduct -> nextProduct.getId() == id);
    }

    public static double calculating(double price, double discount) {
        return (price - (price * discount / 100));
    }
}