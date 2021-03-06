package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.proccesor.FinePersonalProduct;
import kasyanl.kasyanlfinalproject.util.proccesor.InputNumber;
import kasyanl.kasyanlfinalproject.util.proccesor.FineID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UpdateValueProduct {

    private UpdateValueProduct() {
        throw new UnsupportedOperationException();
    }

    static final Logger log = LoggerFactory.getLogger(UpdateValueProduct.class);

    public static Product updateAnyProduct(InputNumber inputer, List<Product> listProduct) {
        log.info("" +
                "\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _" +
                "\nВведите ID продукта");
        int id = inputer.readNumber();
        return FineID.fineProductByID(inputer, FinePersonalProduct.personalProductProcessor(listProduct, id));

    }
}
