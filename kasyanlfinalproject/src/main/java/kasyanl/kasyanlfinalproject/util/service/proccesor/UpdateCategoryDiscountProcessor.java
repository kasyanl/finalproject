package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static kasyanl.kasyanlfinalproject.util.bean.Category.*;

public class UpdateCategoryDiscountProcessor {

    private UpdateCategoryDiscountProcessor() {
        throw new UnsupportedOperationException();
    }

    static final Logger log = LoggerFactory.getLogger(UpdateCategoryDiscountProcessor.class);
    public static final String MESSAGE = ""+
                                        "\nВведите новую скидку для категории (%):"+
                                        "\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _";

    public static List<Product> fineCategory(List<Product> listProduct, int category, InputNumber in) {

        switch (category) {
            case 1:
                log.info("" +
                        "\n{}: ", MESSAGE);
                double discount1 = in.readDouble();
                FineCategoryProcessor.fineCategoryForSelectDiscount(listProduct, FRUITS, discount1);
                break;
            case 2:
                log.info("" +
                        "\n{}: ", MESSAGE);
                double discount2 = in.readDouble();
                FineCategoryProcessor.fineCategoryForSelectDiscount(listProduct, BERRIES, discount2);
                break;
            case 3:
                log.info("" +
                        "\n{}: ", MESSAGE);
                double discount3 = in.readDouble();
                FineCategoryProcessor.fineCategoryForSelectDiscount(listProduct, VEGETABLES, discount3);
                break;
            case 4:
                log.info("" +
                        "\n{}: ", MESSAGE);
                double discount4 = in.readDouble();
                FineCategoryProcessor.fineCategoryForSelectDiscount(listProduct, MILK_PRODUCT, discount4);
                break;
            case 5:
                log.info("" +
                        "\n{}: ", MESSAGE);
                double discount5 = in.readDouble();
                FineCategoryProcessor.fineCategoryForSelectDiscount(listProduct, MEAT, discount5);
                break;
            case 6:
                log.info("" +
                        "\n{}: ", MESSAGE);
                double discount6 = in.readDouble();
                FineCategoryProcessor.fineCategoryForSelectDiscount(listProduct, ALCOHOLIC_BEVERAGES, discount6);
                break;
            default:
                log.info("" +
                        "\n{_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _" +
                        "\n!!!Такого пункта не существует. Попробуйте выбрать еще раз!!!" +
                        "\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        }
        return listProduct;
    }

}
