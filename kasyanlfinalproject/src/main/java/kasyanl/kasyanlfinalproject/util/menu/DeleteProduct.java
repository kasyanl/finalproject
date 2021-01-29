package kasyanl.kasyanlfinalproject.util.menu;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.util.service.ProductService;

import java.util.Iterator;

public class DeleteProduct {

    public static void deleteProduct() {
        int id = ImputNumberService.readNumber("Введите ID продукта");
        Iterator<Product> productIterator = ProductDataBase.createBase().iterator();
        while (productIterator.hasNext()) {
            Product nextProduct = productIterator.next();
            if (nextProduct.getId() == id) {
                ProductService.deleteProduct(nextProduct);
            }
        }
    }
}
