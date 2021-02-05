package kasyanl.kasyanlfinalproject.util.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static kasyanl.kasyanlfinalproject.util.bean.Category.*;

public class UpdateCategoryDiscount {

    private UpdateCategoryDiscount() {
        throw new UnsupportedOperationException();
    }

    static final Logger log = LoggerFactory.getLogger(UpdateCategoryDiscount.class);
    public static final String MESSAGE = "" +
            "\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _" +
            "\nВведите новую скидку для категории (%):" +
            "\n- - - - - - - - - - - - - - - - - - - - - - ";

    public static List<Product> fineCategory(List<Product> listProduct, int category, InputNumber in) {

        switch (category) {
            case 1:
                log.info("{}: ", MESSAGE);
                double discount1 = in.readDouble();
                fineCategoryForSelectDiscount(listProduct, FRUITS, discount1);
                break;
            case 2:
                log.info("{}: ", MESSAGE);
                double discount2 = in.readDouble();
                fineCategoryForSelectDiscount(listProduct, BERRIES, discount2);
                break;
            case 3:
                log.info("{}: ", MESSAGE);
                double discount3 = in.readDouble();
                fineCategoryForSelectDiscount(listProduct, VEGETABLES, discount3);
                break;
            case 4:
                log.info("{}: ", MESSAGE);
                double discount4 = in.readDouble();
                fineCategoryForSelectDiscount(listProduct, MILK_PRODUCT, discount4);
                break;
            case 5:
                log.info("{}: ", MESSAGE);
                double discount5 = in.readDouble();
                fineCategoryForSelectDiscount(listProduct, MEAT, discount5);
                break;
            case 6:
                log.info("{}: ", MESSAGE);
                double discount6 = in.readDouble();
                fineCategoryForSelectDiscount(listProduct, ALCOHOLIC_BEVERAGES, discount6);
                break;
            default:
                log.info("" +
                        "\n{_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _" +
                        "\n!!!Такого пункта не существует. Попробуйте выбрать еще раз!!!" +
                        "\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        }
        return listProduct;
    }


    public static List<Product> fineCategoryForSelectDiscount(List<Product> listProduct, Category category, double discont) {
        List<Product> newListForSelectDiscount = new ArrayList<>();
        for (Product product : listProduct) {
            if (product.getCategory().equals(category)) {
                product.setDiscount(discont);
                CrudOperation.readProduct(product);
                newListForSelectDiscount.add(product);
            }
        }
        return newListForSelectDiscount;
    }

}
