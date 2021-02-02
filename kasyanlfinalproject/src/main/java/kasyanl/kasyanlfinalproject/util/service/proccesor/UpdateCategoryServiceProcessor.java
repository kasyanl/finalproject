package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.service.menu.Menu;

public class UpdateCategoryServiceProcessor {

    SelectCategoryProcessor selectCategoryProcessor = new SelectCategoryProcessor();

    public String updateCategory(InputNumber inputer) {
        Menu.menuCategory();
        int categorySelect = inputer.readNumber();
       return selectCategoryProcessor.selectNumberCategory(categorySelect);

    }
}






