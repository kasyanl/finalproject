package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.menu.Menu;
import kasyanl.kasyanlfinalproject.util.proccesor.InputNumber;

import java.util.List;

public class UpdateCategoryDiscount implements ProductInterface {

    public List<Product> discountCategory(List<Product> productList, InputNumber input, InputNumber in) {

        Menu.menuCategory();
        int categoryNumber = input.readNumber();

        return kasyanl.kasyanlfinalproject.util.proccesor.UpdateCategoryDiscount.fineCategory(productList, categoryNumber, in);
    }
}
