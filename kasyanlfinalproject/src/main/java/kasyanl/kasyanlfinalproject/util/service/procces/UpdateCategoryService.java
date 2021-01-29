package kasyanl.kasyanlfinalproject.util.service.procces;

import kasyanl.kasyanlfinalproject.util.service.menu.StartMenu;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;

public class UpdateCategoryService {

    public static String updateCategory() {
        String category = "";
        StartMenu.menuCategory();
        int categorySelect = ImputNumberService.readNumber("Выберите категорию");
            switch (categorySelect) {
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
                default:
                    System.out.println("Такого варианта выбора нет, повторите его: ");
            }

        return category;
    }
}






