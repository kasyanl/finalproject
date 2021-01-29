package kasyanl.kasyanlfinalproject.util.menu;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.util.service.ProductService;
import kasyanl.kasyanlfinalproject.util.procces.UpdateCategoryService;


public class UpdateValueProduct {

    public static void updateAnyProduct() {
        System.out.println("" +
                "\n---------------------");
        int id = ImputNumberService.readNumber("Введите ID продукта: ");
        boolean updateProduct = true;
        for (Product product : ProductDataBase.createBase()) {
            if (product.getId() == id) {
                ProductService.readProduct(product);
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
                            product.setName(ImputNumberService.readString("Введите новое название: "));
                            ProductService.readProduct(product);
                            break;
                        case 3:
                            product.setPrice(ImputNumberService.readDouble("Введите новую цену (BYN): "));
                            ProductService.readProduct(product);
                            break;
                        case 4:
                            product.setDiscount(ImputNumberService.readDouble("Введите новую скидку (%): "));
                            ProductService.readProduct(product);
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
