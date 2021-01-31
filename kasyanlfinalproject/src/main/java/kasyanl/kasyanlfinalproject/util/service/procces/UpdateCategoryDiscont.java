package kasyanl.kasyanlfinalproject.util.service.procces;

import kasyanl.kasyanlfinalproject.util.service.menu.StartMenu;
import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.service.InputNumberService;

public class UpdateCategoryDiscont {
    public static void discontCategory() {

        String message = "Введите новую скидку для категории (%):";

        boolean discontSelect = true;
        while (discontSelect) {
            StartMenu.menuCategory();
            int category = InputNumberService.readNumber();
            switch (category) {
                case 1:
                    System.out.println(message);
                    double discount1 = InputNumberService.readDouble();
                    Category fruits = Category.FRUITS;
                    FineCategory.fineCategoryForSelectDiscount(fruits, discount1);
                    break;
                case 2:
                    System.out.println(message);
                    double discount2 = InputNumberService.readDouble();
                    Category berries = Category.BERRIES;
                    FineCategory.fineCategoryForSelectDiscount(berries, discount2);
                    break;
                case 3:
                    System.out.println(message);
                    double discount3 = InputNumberService.readDouble();
                    Category vegetables = Category.VEGETABLES;
                    FineCategory.fineCategoryForSelectDiscount(vegetables, discount3);
                    break;
                case 4:
                    System.out.println(message);
                    double discount4 = InputNumberService.readDouble();
                    Category milProduct = Category.MILK_PRODUCT;
                    FineCategory.fineCategoryForSelectDiscount(milProduct, discount4);
                    break;
                case 5:
                    System.out.println(message);
                    double discount5 = InputNumberService.readDouble();
                    Category meat = Category.MEAT;
                    FineCategory.fineCategoryForSelectDiscount(meat, discount5);
                    break;
                case 6:
                    System.out.println(message);
                    double discount6 = InputNumberService.readDouble();
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
