package kasyanl.kasyanlfinalproject.util.service.menu.menuservise;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.proccesor.ProductService;
import kasyanl.kasyanlfinalproject.util.service.menu.Menu;
import kasyanl.kasyanlfinalproject.util.service.proccesor.FinePersonalProductProcessor;
import kasyanl.kasyanlfinalproject.util.service.proccesor.FineProductOfCategoryProcessor;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ReadProduct implements ProductInterface {

    public ReadProduct() {
        throw new IllegalStateException("Класс для просмотра продуктов");
    }

    static final Logger log = LoggerFactory.getLogger(ReadProduct.class);
    public static final String iterator = "________________";

    public static List<Product> fineAllproduct(List<Product> listProduct) {
        if (listProduct.size() == 0) log.info("" +
                "\n{}" +
                "\nВ базе отсутствуют элементы!", iterator);
        for (Product product : listProduct) ProductService.readProduct(product);
        return listProduct;
    }

    public static List<Product> fineCategoryProguct(List<Product> listProduct, InputNumber input) {
        Menu.menuCategory();
        int categoryNumber = input.readNumber();
        return FineProductOfCategoryProcessor.selectCategoryByAllList(listProduct, categoryNumber);
    }

    public static Product finePersonalProduct(List<Product> listProduct, InputNumber input) {
        log.info("" +
                "\n{}" +
                "\nВведите ID продукта", iterator);
        int id = input.readNumber();
        return FinePersonalProductProcessor.personalProductProcessor(listProduct, id);
    }
}