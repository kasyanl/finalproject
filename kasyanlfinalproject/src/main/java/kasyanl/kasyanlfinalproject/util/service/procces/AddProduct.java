package kasyanl.kasyanlfinalproject.util.service.procces;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;

public class AddProduct {

    public static void addProduct( Product product) {
        ProductDataBase.listProduct.add((int) product.getId(), product);
    }
}
