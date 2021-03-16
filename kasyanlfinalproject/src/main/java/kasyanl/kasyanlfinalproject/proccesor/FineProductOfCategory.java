package kasyanl.kasyanlfinalproject.proccesor;

import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.enums.Category;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

import static kasyanl.kasyanlfinalproject.enums.Category.*;
import static kasyanl.kasyanlfinalproject.enums.MessageFormat.EMPTY_STRING;
import static kasyanl.kasyanlfinalproject.enums.MessageFormat.LINE_STRING;

@Slf4j
public final class FineProductOfCategory {

    private FineProductOfCategory() {
        throw new UnsupportedOperationException();
    }

    public static List<Product> selectCategoryByAllList(List<Product> listProduct, int number) {

        switch (number) {
            case 1:
                fineCategoryForRead(listProduct, FRUITS);
                break;
            case 2:
                fineCategoryForRead(listProduct, BERRIES);
                break;
            case 3:
                fineCategoryForRead(listProduct, VEGETABLES);
                break;
            case 4:
                fineCategoryForRead(listProduct, MILK_PRODUCT);
                break;
            case 5:
                fineCategoryForRead(listProduct, MEAT);
                break;
            case 6:
                fineCategoryForRead(listProduct, ALCOHOLIC_BEVERAGES);
                break;
            default:
                log.info("{} {}!!!Такого пункта не существует. Попробуйте выбрать еще раз!!! {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
        }
        return listProduct;
    }

    public static List<Product> fineCategoryForRead(List<Product> listProduct, Category category) {
        List<Product> newListForRead = new ArrayList<>();
        for (Product product : listProduct) {
            if (product.getCategory().equals(category)) {
                ProductService.readProduct(product);
                newListForRead.add(product);
            }
        }
        return newListForRead;
    }
}