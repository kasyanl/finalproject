package kasyanl.kasyanlfinalproject.util.service.crud;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.StartMenu;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.util.service.OutElementsService;
import kasyanl.kasyanlfinalproject.util.service.UpdateCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UpdateValueProduct {

    static final Logger log = LoggerFactory.getLogger(UpdateValueProduct.class);

    public static void updateAnyProduct(List<Product> listProduct) {
        log.info("" +
                "\n---------------------");
        int id = ImputNumberService.readNumber("Введите ID продукта: ");
        boolean updateProduct = true;
        for (Product product : listProduct) {
            if (product.getId() == id) {
                log.info("{}",product);
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
                            log.info("{}",OutElementsService.outValueProduct(listProduct, product));
                            break;
                        case 3:
                            double newPrice = ImputNumberService.readDouble("Введите новую цену: ");
                            product.setPrice(newPrice);
                            log.info("{}",OutElementsService.outValueProduct(listProduct, product));
                            break;
                        case 4:
                            double newDiscount = ImputNumberService.readDouble("Введите новую скидку: ");
                            product.setDiscount(newDiscount);
                            log.info("{}",OutElementsService.outValueProduct(listProduct, product));
                            break;
                        case 5:
                            updateProduct = false;
                            break;
                        default:
                            log.info("Такого варианта выбора нет, повторите его: ");
                    }
                }
            }
        }
    }
}
