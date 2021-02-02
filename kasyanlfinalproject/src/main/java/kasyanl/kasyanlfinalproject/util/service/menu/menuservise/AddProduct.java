package kasyanl.kasyanlfinalproject.util.service.menu.menuservise;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import java.util.List;

public class AddProduct {

    public AddProduct() {
        throw new IllegalStateException("Класс для добавления продукта");
    }

    public static List<Product> addProduct(List<Product> listProduct, Product product) {
        listProduct.add((int) product.getId(), product);
        return listProduct;
    }
}
