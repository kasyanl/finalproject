package kasyanl.kasyanlfinalproject.util.service.menu;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumberService;
import kasyanl.kasyanlfinalproject.util.service.ProductService;
import kasyanl.kasyanlfinalproject.util.service.proccesor.UpdateCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateValueProduct {

    static final Logger log = LoggerFactory.getLogger(ReadProduct.class);

    public static void updateAnyProduct() {
        log.info(""+
                "\n________________"+
                "\nВведите ID продукта");
        int id = InputNumberService.readNumber();
        boolean updateProduct = true;
        for (Product product : ProductInterface.listProduct) {
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
                            log.info(""+
                                    "\n________________"+
                                    "\nВведите новое название: ");
                            product.setName(InputNumberService.readString());
                            ProductService.readProduct(product);
                            break;
                        case 3:
                            log.info(""+
                                    "\n________________"+
                                    "\nВведите новую цену (BYN): ");
                            product.setPrice(InputNumberService.readDouble());
                            ProductService.readProduct(product);
                            break;
                        case 4:
                            log.info(""+
                                    "\n________________"+
                                    "\nВведите новую скидку (%): ");
                            product.setDiscount(InputNumberService.readDouble());
                            ProductService.readProduct(product);
                            break;
                        case 5:
                            updateProduct = false;
                            break;
                        default:
                            log.info(""+
                                    "\n________________"+
                                    "\nТакого варианта выбора нет, повторите его: ");
                    }
                }
            }
        }
    }
}
