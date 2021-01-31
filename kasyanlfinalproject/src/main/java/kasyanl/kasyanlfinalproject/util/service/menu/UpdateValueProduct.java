package kasyanl.kasyanlfinalproject.util.service.menu;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumberService;
import kasyanl.kasyanlfinalproject.util.service.ProductService;
import kasyanl.kasyanlfinalproject.util.service.proccesor.UpdateCategoryService;

public class UpdateValueProduct {

    public static void updateAnyProduct() {
        System.out.println("" +
                "\n---------------------");
        System.out.println("Введите ID продукта");
        int id = InputNumberService.readNumber();
        boolean updateProduct = true;
        for (Product product : ProductDataBase.listProduct) {
            if (product.getId() == id) {
                ProductService.readProduct(product);
                while (updateProduct) {
                    Menu.menuUpdateProduct();
                   int select = InputNumberService.readNumber();
                    switch (select) {
                        case 1:
                            String selectCategory = UpdateCategoryService.updateCategory();
                            Category category = Category.valueOf(selectCategory);
                            product.setCategory(category);
                            ProductService.readProduct(product);
                            break;
                        case 2:
                            System.out.println("Введите новое название: ");
                            product.setName(InputNumberService.readString());
                            ProductService.readProduct(product);
                            break;
                        case 3:
                            System.out.println("Введите новую цену (BYN): ");
                            product.setPrice(InputNumberService.readDouble());
                            ProductService.readProduct(product);
                            break;
                        case 4:
                            System.out.println("Введите новую скидку (%): ");
                            product.setDiscount(InputNumberService.readDouble());
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
