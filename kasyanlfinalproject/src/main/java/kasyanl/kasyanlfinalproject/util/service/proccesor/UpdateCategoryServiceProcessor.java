package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.service.menu.Menu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateCategoryServiceProcessor {

    static final Logger log = LoggerFactory.getLogger(UpdateCategoryServiceProcessor.class);

    public static String updateCategory() {
        Menu.menuCategory();
        log.info(""+
                "\n________________"+
                "\nВыберите категорию");
        int categorySelect = InputNumberService.readNumber();
       return SelectCategoryProcessor.selectNumberCategory(categorySelect);

    }
}






