package kasyanl.kasyanlfinalproject.util.service.menu;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.util.service.ProductService;
import kasyanl.kasyanlfinalproject.util.service.procces.UpdateCategoryService;

public class CreateProduct implements ProductInterface {


    public static Product createNewProduct() {

        String selectCategory = UpdateCategoryService.updateCategory();
        Category category = Category.valueOf(selectCategory);
        String name = ImputNumberService.readString("Введите название продукта: ");
        double price = ImputNumberService.readDouble("Введите цену продукта (BYN): ");
        double discount = ImputNumberService.readDouble("Введите скидку продукта (%): ");

      return ProductService.creatProduct(category, name, price, discount);
    }

}

