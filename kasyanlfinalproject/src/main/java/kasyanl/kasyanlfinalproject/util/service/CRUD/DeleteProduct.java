package kasyanl.kasyanlfinalproject.util.service.CRUD;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;

import java.util.Iterator;
import java.util.List;

public class DeleteProduct {

    public static void deleteProduct(List<Product> listProduct) {
        int id = ImputNumberService.readNumber("Введите ID продукта");
        Iterator<Product> productIterator = listProduct.iterator();
        while (productIterator.hasNext()) {
            Product nextProduct = productIterator.next();
            if (nextProduct.getId() == id) {
                productIterator.remove();
            }
        }
    }
}
