package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.procces.CalculaterActualPrice;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductService extends Product{

    Product product;

    public ProductService(long id, Category category, String name, double price, double discount, double actualPrice, Product product) {
        super(id, category, name, price, discount, actualPrice);
        this.product = product;
    }

    static final Logger log = LoggerFactory.getLogger(ProductService.class);
    private static long idCounter;

    public static Product creatProduct(Category category, String name, double price, double discount) {

        long id = idCounter;
        if (ProductDataBase.listProduct.size() == 0) id = 0;
        else if (ProductDataBase.listProduct.size()>0) {
            int i = 0;
            for (Product product : ProductDataBase.listProduct) {
                if (product.getId() == i) i++;
                id = i;
            }
        } else id = ++idCounter;
        double actualPrice = CalculaterActualPrice.calcuiating(price, discount);
        Product product = new Product(id, category, name, price, discount, actualPrice);
        ProductService.readProduct(product);
        return product;
    }

    public static void readProduct(Product product) {
        System.out.println(product);;
    }

    public static void deleteProduct() {
        System.out.println("Введите ID продукта");
        int id = InputNumberService.readNumber();
        ProductDataBase.listProduct.removeIf(nextProduct -> nextProduct.getId() == id);
    }
}

