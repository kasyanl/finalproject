package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.StartMenu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateCategoryService {

    static final Logger log = LoggerFactory.getLogger(UpdateCategoryService.class);

    public static String updateCategory() {

        String message= ""+
                "\n___________________"+
                "\nВаш выбор - ";
        StartMenu.menuCategory();
        int categorySelect = ImputNumberService.readNumber("");

        if (categorySelect == 1) {
            log.info("{} FRUITS", message);
            return "FRUITS";
        }
        if (categorySelect == 2) {
            log.info("{} BERRIES", message);
            return "BERRIES";
        }
        if (categorySelect == 3) {
            log.info("{} VEGETABLES", message);
            return "VEGETABLES";
        }
        if (categorySelect == 4) {
            log.info("{} MILK_PRODUCT", message);
            return "MILK_PRODUCT";
        }
        if (categorySelect == 5) {
            log.info("{} MEAT", message);
            return "MEAT";
        }
        if (categorySelect == 6) {
            log.info("{} ALCOHOLIC_BEVERAGES", message);
            return "ALCOHOLIC_BEVERAGES";
        }
        else  return "Такого варианта выбора нет, повторите его";

    }
}






