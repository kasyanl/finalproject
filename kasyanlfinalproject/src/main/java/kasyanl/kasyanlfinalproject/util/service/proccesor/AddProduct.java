package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import java.util.List;

public class AddProduct {

    public static List<Product> addProduct(List<Product> listProduct, Product product) {
        listProduct.add((int) product.getId(), product);
        return listProduct;
    }
}
