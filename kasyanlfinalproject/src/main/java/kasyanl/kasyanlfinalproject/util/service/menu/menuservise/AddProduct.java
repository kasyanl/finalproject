package kasyanl.kasyanlfinalproject.util.service.menu.menuservise;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import java.util.List;

public class AddProduct {

    private AddProduct() {
        throw new UnsupportedOperationException();
    }

    public static List<Product> addProduct(List<Product> listProduct, Product product) {
        listProduct.add((int) product.getId(), product);
        return listProduct;
    }


}
