package kasyanl.kasyanlfinalproject.util.service.menu;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumberService;
import kasyanl.kasyanlfinalproject.util.service.ProductService;
import kasyanl.kasyanlfinalproject.util.service.proccesor.FineCategory;
import kasyanl.kasyanlfinalproject.util.service.proccesor.FinePersonalProductProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ReadProduct implements ProductInterface {

    static final Logger log = LoggerFactory.getLogger(ReadProduct.class);

    public static List<Product> fineAllproduct(List<Product> listProduct) {
        if (listProduct.size() == 0) {
            log.info(""+
                    "\n________________"+
                    "\nВ базе отсутствуют элементы");
        } for (Product product : listProduct){
            ProductService.readProduct(product);

        }
        return listProduct;
    }


    public static void fineCategoryProguct(List<Product> listProduct) {
        boolean categorySelect = true;
        while (categorySelect) {
            Menu.menuCategory();
            log.info(""+
                    "\n________________"+
                    "\nВыберите категорию");
           int categoryNumber = InputNumberService.readNumber();
            switch (categoryNumber) {
                case 1:
                    Category fruits = Category.FRUITS;
                    FineCategory.fineCategoryForRead(listProduct, fruits);
                    break;
                case 2:
                    Category berries = Category.BERRIES;
                    FineCategory.fineCategoryForRead(listProduct, berries);
                    break;
                case 3:
                    Category vegetables = Category.VEGETABLES;
                    FineCategory.fineCategoryForRead(listProduct, vegetables);
                    break;
                case 4:
                    Category milProduct = Category.MILK_PRODUCT;
                    FineCategory.fineCategoryForRead(listProduct, milProduct);
                    break;
                case 5:
                    Category meat = Category.MEAT;
                    FineCategory.fineCategoryForRead(listProduct, meat);
                    break;
                case 6:
                    Category alcoholicBeverages = Category.ALCOHOLIC_BEVERAGES;
                    FineCategory.fineCategoryForRead(listProduct, alcoholicBeverages);
                    break;
                case 7:
                    categorySelect = false;
                    break;
                default:
                    log.info(""+
                            "\n________________"+
                            "\n!!!Такого пункта не существует. Попробуйте выбрать еще раз!!!" +
                            "\n__________");
            }
        }
    }

    public static void finePersonalProduct() {
        log.info(""+
                "\n________________"+
                "\nВведите ID продукта");
        int id = InputNumberService.readNumber();
        FinePersonalProductProcessor.personalProductProcessor(listProduct, id);

    }
}

