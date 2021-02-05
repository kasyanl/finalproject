package kasyanl.kasyanlfinalproject.util.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

import static kasyanl.kasyanlfinalproject.util.bean.Category.*;

public class FineProductOfCategory {

    private FineProductOfCategory() {
        throw new UnsupportedOperationException();
    }

    static final Logger log = LoggerFactory.getLogger(FineProductOfCategory.class);

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
                log.info("" +
                        "\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ " +
                        "\n!!!Такого пункта не существует. Попробуйте выбрать еще раз!!!" +
                        "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        }
        return listProduct;
    }

    public static List<Product> fineCategoryForRead(List<Product> listProduct, Category category) {
        List<Product> newListForRead = new ArrayList<>();
        for (Product product : listProduct) {
            if (product.getCategory().equals(category)) {
                CrudOperation.readProduct(product);
                newListForRead.add(product);
            }
        }
        return newListForRead;
    }
}
