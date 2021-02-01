package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

public class FineProductOfCategoryProcessor {

    static final Logger log = LoggerFactory.getLogger(FineProductOfCategoryProcessor.class);

    public static List<Product> selectCategoryByAllList(List<Product> listProduct, int number) {

            switch (number) {
                case 1:
                    Category fruits = Category.FRUITS;
                    FineCategoryProcessor.fineCategoryForRead(listProduct, fruits);
                    break;
                case 2:
                    Category berries = Category.BERRIES;
                    FineCategoryProcessor.fineCategoryForRead(listProduct, berries);
                    break;
                case 3:
                    Category vegetables = Category.VEGETABLES;
                    FineCategoryProcessor.fineCategoryForRead(listProduct, vegetables);
                    break;
                case 4:
                    Category milProduct = Category.MILK_PRODUCT;
                    FineCategoryProcessor.fineCategoryForRead(listProduct, milProduct);
                    break;
                case 5:
                    Category meat = Category.MEAT;
                    FineCategoryProcessor.fineCategoryForRead(listProduct, meat);
                    break;
                case 6:
                    Category alcoholicBeverages = Category.ALCOHOLIC_BEVERAGES;
                    FineCategoryProcessor.fineCategoryForRead(listProduct, alcoholicBeverages);
                    break;
                default:
                    log.info("" +
                            "\n________________" +
                            "\n!!!Такого пункта не существует. Попробуйте выбрать еще раз!!!" +
                            "\n__________");
            }
        return listProduct;
    }
}
