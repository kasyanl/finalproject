package kasyanl.kasyanlfinalproject.util.procces;

import kasyanl.kasyanlfinalproject.util.menu.StartMenu;
import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;

public class UpdateCategoryDiscont {
    public static void discontCategory() {

        String message = "Введите новую скидку для категории (%):";

        boolean discontSelect = true;
        while (discontSelect) {
            StartMenu.menuCategory();
            int category = ImputNumberService.readNumber("Выберите категорию");
            switch (category) {
                case 1:
                    double discount1 = ImputNumberService.readDouble(message);
                    Category fruits = Category.FRUITS;
                    FineCategory.fineCategoryForSelectDiscount(fruits, discount1);
                    break;
                case 2:
                    double discount2 = ImputNumberService.readDouble(message);
                    Category berries = Category.BERRIES;
                    FineCategory.fineCategoryForSelectDiscount(berries, discount2);
                    break;
                case 3:
                    double discount3 = ImputNumberService.readDouble(message);
                    Category vegetables = Category.VEGETABLES;
                    FineCategory.fineCategoryForSelectDiscount(vegetables, discount3);
                    break;
                case 4:
                    double discount4 = ImputNumberService.readDouble(message);
                    Category milProduct = Category.MILK_PRODUCT;
                    FineCategory.fineCategoryForSelectDiscount(milProduct, discount4);
                    break;
                case 5:
                    double discount5 = ImputNumberService.readDouble(message);
                    Category meat = Category.MEAT;
                    FineCategory.fineCategoryForSelectDiscount(meat, discount5);
                    break;
                case 6:
                    double discount6 = ImputNumberService.readDouble(message);
                    Category alcoholicBeverages = Category.ALCOHOLIC_BEVERAGES;
                    FineCategory.fineCategoryForSelectDiscount(alcoholicBeverages, discount6);
                    break;
                case 7:
                    discontSelect = false;
                    break;
                default:
                    System.out.println("" +
                            "\n__________" +
                            "\n!!!Такого пункта не существует. Попробуйте выбрать еще раз!!!" +
                            "\n__________");
            }
        }
    }
}
