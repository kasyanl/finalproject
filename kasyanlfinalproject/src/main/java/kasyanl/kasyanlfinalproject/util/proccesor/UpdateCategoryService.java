package kasyanl.kasyanlfinalproject.util.proccesor;

import kasyanl.kasyanlfinalproject.util.menu.MainMenu;

public class UpdateCategoryService {

    private UpdateCategoryService() {
        throw new UnsupportedOperationException();
    }

    public static String updateCategory(InputNumber input) {
        MainMenu.menuCategory();
        int categorySelect = input.readNumber();
        switch (categorySelect) {
            case 1:
                return "FRUITS";
            case 2:
                return "BERRIES";
            case 3:
                return "VEGETABLES";
            case 4:
                return "MILK_PRODUCT";
            case 5:
                return "MEAT";
            case 6:
                return "ALCOHOLIC_BEVERAGES";
            default:
                return "Такого варианта выбора нет, повторите его:";
        }
    }
}