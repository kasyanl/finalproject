package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.proccesor.CalculaterActualPrice;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;

import java.util.List;

public class ProductService extends Product{

    Product product;

    public ProductService(long id, Category category, String name, double price, double discount, double actualPrice, Product product) {
        super(id, category, name, price, discount, actualPrice);
        this.product = product;
    }

    private static long idCounter;

    public static Product creatProduct(Category category, String name, double price, double discount) {

        long id = idCounter;
        if (ProductInterface.listProduct.size() == 0) id = 0;
        else if (ProductInterface.listProduct.size()>0) {
            int i = 0;
            for (Product product : ProductInterface.listProduct) {
                if (product.getId() == i) i++;
                id = i;
            }
        } else id = ++idCounter;
        double actualPrice = CalculaterActualPrice.calcuiating(price, discount);
        Product product = new Product(id, category, name, price, discount, actualPrice);
        ProductService.readProduct(product);
        return product;
    }

    public static Product readProduct(Product product) {
        System.out.println(product);
        return product;
    }

    public static List<Product> deleteProduct(List<Product> listProduct, int id) {
               listProduct.removeIf(nextProduct -> nextProduct.getId() == id);
               return  listProduct;
    }
}

