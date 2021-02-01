package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.menu.Menu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateCategoryDiscont implements ProductInterface {

    static final Logger log = LoggerFactory.getLogger(UpdateCategoryDiscont.class);

    public static void discontCategory() {

        String message = "Введите новую скидку для категории (%):";

        boolean discontSelect = true;
        while (discontSelect) {
            Menu.menuCategory();
            int category = InputNumberService.readNumber();
            switch (category) {
                case 1:
                    System.out.println(message);
                    double discount1 = InputNumberService.readDouble();
                    Category fruits = Category.FRUITS;
                    FineCategory.fineCategoryForSelectDiscount(listProduct, fruits, discount1);
                    break;
                case 2:
                    System.out.println(message);
                    double discount2 = InputNumberService.readDouble();
                    Category berries = Category.BERRIES;
                    FineCategory.fineCategoryForSelectDiscount(listProduct, berries, discount2);
                    break;
                case 3:
                    System.out.println(message);
                    double discount3 = InputNumberService.readDouble();
                    Category vegetables = Category.VEGETABLES;
                    FineCategory.fineCategoryForSelectDiscount(listProduct, vegetables, discount3);
                    break;
                case 4:
                    System.out.println(message);
                    double discount4 = InputNumberService.readDouble();
                    Category milProduct = Category.MILK_PRODUCT;
                    FineCategory.fineCategoryForSelectDiscount(listProduct, milProduct, discount4);
                    break;
                case 5:
                    System.out.println(message);
                    double discount5 = InputNumberService.readDouble();
                    Category meat = Category.MEAT;
                    FineCategory.fineCategoryForSelectDiscount(listProduct, meat, discount5);
                    break;
                case 6:
                    System.out.println(message);
                    double discount6 = InputNumberService.readDouble();
                    Category alcoholicBeverages = Category.ALCOHOLIC_BEVERAGES;
                    FineCategory.fineCategoryForSelectDiscount(listProduct, alcoholicBeverages, discount6);
                    break;
                case 7:
                    discontSelect = false;
                    break;
                default:
                    log.info(""+
                            "\n________________"+
                            "\n!!!Такого пункта не существует. Попробуйте выбрать еще раз!!!" +
                            "\n________________");
            }
        }
    }
}
