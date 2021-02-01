package kasyanl.kasyanlfinalproject.util.service.menu.menuservise;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.proccesor.ProductService;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

public class DeleteProduct implements ProductInterface {

    static final Logger log = LoggerFactory.getLogger(DeleteProduct.class);

    public static void deleteProductService(List<Product> listProduct){
       log.info(""+
               "\n__________________"+
               "\nВведите ID продукта");
        int id = InputNumberService.readNumber();
        ProductService.deleteProduct(listProduct, id);
    }
}
