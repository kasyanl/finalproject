package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.StartMenu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateCategoryService {

    final static Logger log = LoggerFactory.getLogger(UpdateCategoryService.class);

    public static String updateCategory() {

        StartMenu.menuCategory();
        int categorySelect = ImputNumberService.readNumber("");

        if (categorySelect == 1) {
            log.info(""+
                    "\n___________________"+
                    "\nВаш выбор - FRUITS");
            return "FRUITS";
        }
        if (categorySelect == 2) {
            log.info(""+
                    "\n___________________"+
                    "\nВаш выбор - BERRIES");
            return "BERRIES";
        }
        if (categorySelect == 3) {
            log.info(""+
                    "\n___________________"+
                    "\nВаш выбор - VEGETABLES");
            return "VEGETABLES";
        }
        if (categorySelect == 4) {
            log.info(""+
                    "\n___________________"+
                    "\nВаш выбор - MILK_PRODUCT");
            return "MILK_PRODUCT";
        }
        if (categorySelect == 5) {
            log.info(""+
                    "\n___________________"+
                    "\nВаш выбор - MEAT");
            return "MEAT";
        }
        if (categorySelect == 6) {
            log.info(""+
                    "\n___________________"+
                    "\nВаш выбор - ALCOHOLIC_BEVERAGES");
            return "ALCOHOLIC_BEVERAGES";
        }
        else  return "Такого варианта выбора нет, повторите его";

    }
}






