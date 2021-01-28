package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.StartMenu;

public class UpdateCategoryService {

    public static String updateCategory() {

        String category = "";
        String message = "" +
                "\n___________________" +
                "\nВаш выбор - ";
        StartMenu.menuCategory();
        int categorySelect = ImputNumberService.readNumber("");

        switch (categorySelect) {
            case 1:
                System.out.println(message + " FRUITS");
                category = "FRUITS";
                break;
            case 2:
                System.out.println(message + "BERRIES");
                category = "BERRIES";
                break;
            case 3:
                System.out.println(message + "VEGETABLES");
                category = "VEGETABLES";
                break;
            case 4:
                System.out.println(message + "MILK_PRODUCT");
                category = "MILK_PRODUCT";
                break;
            case 5:
                System.out.println(message + "MEAT");
                category = "MEAT";
                break;
            case 6:
                System.out.println(message + "ALCOHOLIC_BEVERAGES");
                category = "ALCOHOLIC_BEVERAGES";
                break;
        }
        return category;
    }
}






