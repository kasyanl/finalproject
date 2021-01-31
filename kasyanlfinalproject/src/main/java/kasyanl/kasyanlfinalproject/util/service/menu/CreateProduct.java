package kasyanl.kasyanlfinalproject.util.service.menu;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumberService;
import kasyanl.kasyanlfinalproject.util.service.ProductService;
import kasyanl.kasyanlfinalproject.util.service.proccesor.UpdateCategoryService;

public class CreateProduct {


    public static Product createNewProduct() {

        String selectCategory = UpdateCategoryService.updateCategory();
        Category category = Category.valueOf(selectCategory);
        System.out.println("Введите название продукта: ");
        String name = InputNumberService.readString();
        System.out.println("Введите цену продукта (BYN): ");
        double price = InputNumberService.readDouble();
        System.out.println("Введите скидку продукта (%): ");
        double discount = InputNumberService.readDouble();

      return ProductService.creatProduct(category, name, price, discount);
    }

}

