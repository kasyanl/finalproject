package kasyanl.kasyanlfinalproject.util.service.proccesor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectCategoryProcessor {

    static final Logger log = LoggerFactory.getLogger(SelectCategoryProcessor.class);

    public static String selectNumberCategory(int number){
        String category = "Такого варианта выбора нет, повторите его:";
        switch (number) {
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
        }
        return category;
    }
}
