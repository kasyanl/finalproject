package kasyanl.kasyanlfinalproject.util.service.proccesor.sort;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.menu.Menu;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MenuSort {
    private MenuSort(){
        throw new UnsupportedOperationException();
    }

    static final Logger log = LoggerFactory.getLogger(MenuSort.class);
    public static final String ITERATOR = "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _";
    public static List<Product> sortProduct(List<Product> listProduct, InputNumber inputer) {
        Menu.menuSortDataBase();
        int selectSort = inputer.readNumber();
        switch (selectSort) {
            case 1:
                SortDataBase.sortByName(listProduct);
                log.info("" +
                        "\n{}" +
                        "\n База данных успешно отсортирована по названию продуктов!" +
                        "\n{}", ITERATOR, ITERATOR);
                break;
            case 2:
                SortDataBase.sortByCategory(listProduct);
                log.info("" +
                        "\n{}" +
                        "\n База данных успешно отсортирована по категории продуктов!" +
                        "\n{}", ITERATOR, ITERATOR);
                break;
            case 3:
                SortDataBase.sortByPrice(listProduct);
                log.info("" +
                        "\n{}" +
                        "\n База данных успешно отсортирована по первоначальной цене!" +
                        "\n{}", ITERATOR, ITERATOR);
                break;
            case 4:
                SortDataBase.sortByActualPrice(listProduct);
                log.info("" +
                        "\n{}" +
                        "\n База данных успешно отсортирована по цене с учетом скидки!" +
                        "\n{}", ITERATOR, ITERATOR);
                break;
            case 5:
                SortDataBase.sortById(listProduct);
                break;
            default:
                log.info("" +
                        "\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _" +
                        "\nТакого варианта выбора нет, повторите его: ");
        }
        return listProduct;
    }
}
