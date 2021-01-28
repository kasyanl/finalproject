package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.StartMenu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateCategoryService {

    static final Logger log = LoggerFactory.getLogger(UpdateCategoryService.class);

    public static String updateCategory() {

        String category = "";
        String message = "" +
                "\n___________________" +
                "\nВаш выбор - ";
        StartMenu.menuCategory();
        int categorySelect = ImputNumberService.readNumber("");

        switch (categorySelect) {
            case 1:
                log.info("{} FRUITS", message);
                category = "FRUITS";
                break;
            case 2:
                log.info("{} BERRIES", message);
                category = "BERRIES";
                break;
            case 3:
                log.info("{} VEGETABLES", message);
                category = "VEGETABLES";
                break;
            case 4:
                log.info("{} MILK_PRODUCT", message);
                category = "MILK_PRODUCT";
                break;
            case 5:
                log.info("{} MEAT", message);
                category = "MEAT";
                break;
            case 6:
                log.info("{} ALCOHOLIC_BEVERAGES", message);
                category = "ALCOHOLIC_BEVERAGES";
                break;
        }
        return category;
    }
}