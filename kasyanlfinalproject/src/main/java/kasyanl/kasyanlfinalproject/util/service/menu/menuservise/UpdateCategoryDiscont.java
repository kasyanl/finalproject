package kasyanl.kasyanlfinalproject.util.service.menu.menuservise;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.menu.Menu;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumber;
import kasyanl.kasyanlfinalproject.util.service.proccesor.UpdateCategoryDiscountProcessor;

import java.util.List;

public class UpdateCategoryDiscont implements ProductInterface {

    public List<Product> discountCategory(List<Product> productList, InputNumber input, InputNumber in) {

        Menu.menuCategory();
        int categoryNumber = input.readNumber();

        return UpdateCategoryDiscountProcessor.fineCategory(productList, categoryNumber, in);
    }
}
