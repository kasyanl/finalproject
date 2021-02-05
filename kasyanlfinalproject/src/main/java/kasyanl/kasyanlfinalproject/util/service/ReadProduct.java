package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.proccesor.CrudOperation;
import kasyanl.kasyanlfinalproject.util.menu.Menu;
import kasyanl.kasyanlfinalproject.util.proccesor.FinePersonalProduct;
import kasyanl.kasyanlfinalproject.util.proccesor.FineProductOfCategory;
import kasyanl.kasyanlfinalproject.util.proccesor.InputNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

public class ReadProduct implements ProductInterface {

    private ReadProduct() {
        throw new UnsupportedOperationException();
    }

    static final Logger log = LoggerFactory.getLogger(ReadProduct.class);
    public static final String ITERATOR = "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _";

    public static List<Product> fineAllProduct(List<Product> listProduct) {
        if (!listProduct.isEmpty()) {
            log.info("" +
                    "\n" +
                    "\nВ базе отсутствуют элементы!");
        }
        for (Product product : listProduct) CrudOperation.readProduct(product);
        return listProduct;
    }

    public static List<Product> fineCategoryProduct(List<Product> listProduct, InputNumber input) {
        Menu.menuCategory();
        int categoryNumber = input.readNumber();
        return FineProductOfCategory.selectCategoryByAllList(listProduct, categoryNumber);
    }

    public static Product finePersonalProduct(List<Product> listProduct, InputNumber input) {
        log.info("" +
                "\n{}" +
                "\nВведите ID продукта", ITERATOR);
        int id = input.readNumber();
        return FinePersonalProduct.personalProductProcessor(listProduct, id);
    }
}