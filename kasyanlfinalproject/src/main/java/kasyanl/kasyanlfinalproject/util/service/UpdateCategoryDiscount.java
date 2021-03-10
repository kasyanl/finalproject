package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductRepository;
import kasyanl.kasyanlfinalproject.util.menu.MainMenu;
import kasyanl.kasyanlfinalproject.util.proccesor.InputNumber;

import java.util.List;

public class UpdateCategoryDiscount implements ProductRepository {

    private UpdateCategoryDiscount() {
        throw new UnsupportedOperationException();
    }

    public static List<Product> discountCategory(List<Product> productList, InputNumber input, InputNumber in) {

        MainMenu.menuCategory();
        int categoryNumber = input.readNumber();

        return kasyanl.kasyanlfinalproject.util.proccesor.UpdateCategoryDiscount.fineCategory(productList, categoryNumber, in);
    }
}