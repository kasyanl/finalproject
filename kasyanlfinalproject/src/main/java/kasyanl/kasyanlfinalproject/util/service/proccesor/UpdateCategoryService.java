package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.service.menu.Menu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateCategoryService {

    static final Logger log = LoggerFactory.getLogger(UpdateCategoryService.class);

    public static String updateCategory() {
        String category = "Такой категории не существует!";
        Menu.menuCategory();
        log.info(""+
                "\n________________"+
                "\nВыберите категорию");
        int categorySelect = InputNumberService.readNumber();
            switch (categorySelect) {
                case 1:
                    category = "FRUITS";
                    break;
                case 2:
                    category = "BERRIES";
                    break;
                case 3:
                    category = "VEGETABLES";
                    break;
                case 4:
                    category = "MILK_PRODUCT";
                    break;
                case 5:
                    category = "MEAT";
                    break;
                case 6:
                    category = "ALCOHOLIC_BEVERAGES";
                    break;
                default:
                    log.info(""+
                            "\n________________"+
                            "\nТакого варианта выбора нет, повторите его: ");
            }

        return category;
    }
}






