package kasyanl.kasyanlfinalproject.util.service.procces;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.service.ProductService;

public class FinePersonalProductProcessor {

    public static Product personalProductProcessor(int id) {
        Product product1 = new Product();
        for (Product product : ProductDataBase.listProduct) {
            if (product.getId() == id) {
                ProductService.readProduct(product);
            }
        }
        return product1;
    }
}
