
package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.proccesor.FindCategoryDiscount;
import kasyanl.kasyanlfinalproject.repository.ProductRepository;
import kasyanl.kasyanlfinalproject.menu.MainMenu;
import kasyanl.kasyanlfinalproject.proccesor.InputNumber;

import java.util.List;

public class UpdateCategoryDiscount implements ProductRepository {

    private UpdateCategoryDiscount() {
        throw new UnsupportedOperationException();
    }

    public static List<Product> discountCategory(List<Product> productList, InputNumber input, InputNumber in) {

        MainMenu.menuCategory();
        int categoryNumber = input.readNumber();

        return FindCategoryDiscount.fineCategory(productList, categoryNumber, in);
    }
}
