package kasyanl.kasyanlfinalproject.util.service.menu.menuservise;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.proccesor.FinePersonalProductProcessor;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumber;
import kasyanl.kasyanlfinalproject.util.service.proccesor.update_value.FineID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UpdateValueProduct {

    static final Logger log = LoggerFactory.getLogger(UpdateValueProduct.class);

    public Product updateAnyProduct(InputNumber inputer, List<Product> listProduct) {
        log.info("" +
                "\n________________" +
                "\nВведите ID продукта");
        int id = inputer.readNumber();
        return FineID.fineProductByID(inputer, FinePersonalProductProcessor.personalProductProcessor(listProduct, id));

    }
}
