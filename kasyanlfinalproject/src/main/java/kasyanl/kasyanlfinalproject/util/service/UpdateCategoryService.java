package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.StartMenu;

public class UpdateCategoryService {

    public static String updateCategory() {

        StartMenu.menuCategory();
        int categorySelect = ImputNumberService.readNumber("");

        if (categorySelect == 1) {
            System.out.println("Ваш выбор - FRUITS");
            return "FRUITS";
        }
        if (categorySelect == 2) {
            System.out.println("Ваш выбор - BERRIES");
            return "BERRIES";
        }
        if (categorySelect == 3) {
            System.out.println("Ваш выбор - VEGETABLES");
            return "VEGETABLES";
        }
        if (categorySelect == 4) {
            System.out.println("Ваш выбор - MILK_PRODUCT");
            return "MILK_PRODUCT";
        }
        if (categorySelect == 5) {
            System.out.println("Ваш выбор - MEAT");
            return "MEAT";
        }
        if (categorySelect == 6) {
            System.out.println("Ваш выбор - ALCOHOLIC_BEVERAGES");
            return "ALCOHOLIC_BEVERAGES";
        }
        else  return "Такого варианта выбора нет, повторите его";

    }
}






