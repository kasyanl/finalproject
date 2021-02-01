package kasyanl.kasyanlfinalproject.util.service.menu.menuservise;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.proccesor.ProductService;
import kasyanl.kasyanlfinalproject.util.service.menu.Menu;
import kasyanl.kasyanlfinalproject.util.service.proccesor.FinePersonalProductProcessor;
import kasyanl.kasyanlfinalproject.util.service.proccesor.FineProductOfCategoryProcessor;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ReadProduct implements ProductInterface {

    static final Logger log = LoggerFactory.getLogger(ReadProduct.class);

    public static List<Product> fineAllproduct(List<Product> listProduct) {
        if (listProduct.size() == 0)  log.info(""+
                                                "\n________________"+
                                                 "\nВ базе отсутствуют элементы");
        for (Product product : listProduct) ProductService.readProduct(product);
        return listProduct;
    }

    public static void fineCategoryProguct(List<Product> listProduct) {
            Menu.menuCategory();
           int categoryNumber = InputNumberService.readNumber();
        FineProductOfCategoryProcessor.selectCategoryByAllList(listProduct, categoryNumber);
    }

    public static void finePersonalProduct() {
        log.info(""+
                "\n________________"+
                "\nВведите ID продукта");
        int id = InputNumberService.readNumber();
        FinePersonalProductProcessor.personalProductProcessor(listProduct, id);
    }
}