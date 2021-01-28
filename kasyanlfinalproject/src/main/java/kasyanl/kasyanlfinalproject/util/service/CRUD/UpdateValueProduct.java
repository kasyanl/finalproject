package kasyanl.kasyanlfinalproject.util.service.CRUD;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.StartMenu;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.util.service.OutElementsService;
import kasyanl.kasyanlfinalproject.util.service.UpdateCategoryService;

import java.util.List;

public class UpdateValueProduct {

    public static void updateAnyProduct(List<Product> listProduct) {
        System.out.println("" +
                "\n---------------------");
        int id = ImputNumberService.readNumber("Введите ID продукта: ");
        boolean updateProduct = true;
        for (Product product : listProduct) {
            if (product.getId() == id) {
                System.out.println(product);
                while (updateProduct) {
                    StartMenu.menuUpdateProduct();
                    int select = ImputNumberService.readNumber("Ваш выбор: ");
                    switch (select) {
                        case 1:
                            String selectCategory = UpdateCategoryService.updateCategory();
                            Category category = Category.valueOf(selectCategory);
                            product.setCategory(category);
                            break;
                        case 2:
                            String newName = ImputNumberService.readString("Введите новое название: ");
                            product.setName(newName);
                            System.out.println(OutElementsService.outValueProduct(listProduct, product));
                            break;
                        case 3:
                            double newPrice = ImputNumberService.readDouble("Введите новую цену: ");
                            product.setPrice(newPrice);
                            System.out.println(OutElementsService.outValueProduct(listProduct, product));
                            break;
                        case 4:
                            double newDiscount = ImputNumberService.readDouble("Введите новую скидку: ");
                            product.setDiscount(newDiscount);
                            System.out.println(OutElementsService.outValueProduct(listProduct, product));
                            break;
                        case 5:
                            updateProduct = false;
                            break;
                        default:
                            System.out.println("Такого варианта выбора нет, повторите его: ");
                    }
                }
            }
        }
    }
}
