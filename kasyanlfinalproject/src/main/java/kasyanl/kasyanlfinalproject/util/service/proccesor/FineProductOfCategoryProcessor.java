package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static kasyanl.kasyanlfinalproject.util.bean.Category.*;

public class FineProductOfCategoryProcessor {

    private FineProductOfCategoryProcessor() {
        throw new IllegalStateException("Класс для выбора категории");
    }

    static final Logger log = LoggerFactory.getLogger(FineProductOfCategoryProcessor.class);

    public static List<Product> selectCategoryByAllList(List<Product> listProduct, int number) {

        switch (number) {
            case 1:
                FineCategoryProcessor.fineCategoryForRead(listProduct, FRUITS);
                break;
            case 2:
                FineCategoryProcessor.fineCategoryForRead(listProduct, BERRIES);
                break;
            case 3:
                FineCategoryProcessor.fineCategoryForRead(listProduct, VEGETABLES);
                break;
            case 4:
                FineCategoryProcessor.fineCategoryForRead(listProduct, MILK_PRODUCT);
                break;
            case 5:
                FineCategoryProcessor.fineCategoryForRead(listProduct, MEAT);
                break;
            case 6:
                FineCategoryProcessor.fineCategoryForRead(listProduct, ALCOHOLIC_BEVERAGES);
                break;
            default:
                log.info("" +
                        "\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ " +
                        "\n!!!Такого пункта не существует. Попробуйте выбрать еще раз!!!" +
                        "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        }
        return listProduct;
    }
}
