package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.proccesor.CrudOperation;
import kasyanl.kasyanlfinalproject.util.proccesor.InputNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class DeleteProduct implements ProductInterface {

    static final Logger log = LoggerFactory.getLogger(DeleteProduct.class);

    public List<Product> deleteProductService(List<Product> listProduct, InputNumber inputNumber) {
        log.info("" +
                "\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _" +
                "\nВведите ID продукта");
        int id = inputNumber.readNumber();
        CrudOperation.deleteProduct(listProduct, id);
        return listProduct;
    }
}
