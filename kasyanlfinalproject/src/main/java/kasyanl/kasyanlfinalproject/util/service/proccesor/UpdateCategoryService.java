package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.service.menu.Menu;

public class UpdateCategoryService {

    public static String updateCategory() {
        String category = "";
        Menu.menuCategory();
        System.out.println("Выберите категорию");
        int categorySelect = InputNumberService.readNumber();
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






