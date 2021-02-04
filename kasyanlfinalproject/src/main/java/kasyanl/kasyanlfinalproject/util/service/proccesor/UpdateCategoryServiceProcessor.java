package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.service.menu.Menu;

public class UpdateCategoryServiceProcessor {

    public String updateCategory(InputNumber inputer) {
        Menu.menuCategory();
        int categorySelect = inputer.readNumber();
       return SelectCategoryProcessor.selectNumberCategory(categorySelect);

    }
}






