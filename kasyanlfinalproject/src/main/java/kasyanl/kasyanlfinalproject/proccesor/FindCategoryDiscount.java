package kasyanl.kasyanlfinalproject.proccesor;

import kasyanl.kasyanlfinalproject.enums.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;

import static kasyanl.kasyanlfinalproject.enums.Category.*;
import static kasyanl.kasyanlfinalproject.enums.MessageFormat.*;

@Slf4j
public class FindCategoryDiscount {

    private FindCategoryDiscount() {
        throw new UnsupportedOperationException();
    }

    public static List<Product> fineCategory(List<Product> listProduct, int category, InputNumber in) {

        switch (category) {
            case 1:
                log.info("{}", DISCOUNT_MESSAGE);
                double discount1 = in.readDouble();
                fineCategoryForSelectDiscount(listProduct, FRUITS, discount1);
                break;
            case 2:
                log.info("{}", DISCOUNT_MESSAGE);
                double discount2 = in.readDouble();
                fineCategoryForSelectDiscount(listProduct, BERRIES, discount2);
                break;
            case 3:
                log.info("{}", DISCOUNT_MESSAGE);
                double discount3 = in.readDouble();
                fineCategoryForSelectDiscount(listProduct, VEGETABLES, discount3);
                break;
            case 4:
                log.info("{}", DISCOUNT_MESSAGE);
                double discount4 = in.readDouble();
                fineCategoryForSelectDiscount(listProduct, MILK_PRODUCT, discount4);
                break;
            case 5:
                log.info("{}", DISCOUNT_MESSAGE);
                double discount5 = in.readDouble();
                fineCategoryForSelectDiscount(listProduct, MEAT, discount5);
                break;
            case 6:
                log.info("{}", DISCOUNT_MESSAGE);
                double discount6 = in.readDouble();
                fineCategoryForSelectDiscount(listProduct, ALCOHOLIC_BEVERAGES, discount6);
                break;
            default:
                log.info("{}", SELECT_NON_FOUND);
        }
        return listProduct;
    }

    public static List<Product> fineCategoryForSelectDiscount(List<Product> listProduct, Category category, double discount) {
        List<Product> newListForSelectDiscount = new ArrayList<>();
        for (Product product : listProduct) {
            if (product.getCategory().equals(category)) {
                product.setDiscount(discount);
                ProductService.readProduct(product);
                newListForSelectDiscount.add(product);
            }
        }
        return newListForSelectDiscount;
    }
}