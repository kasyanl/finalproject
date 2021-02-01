package kasyanl.kasyanlfinalproject.util.service.menu;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumberService;
import kasyanl.kasyanlfinalproject.util.service.ProductService;
import kasyanl.kasyanlfinalproject.util.service.proccesor.UpdateCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateProduct {

    static final Logger log = LoggerFactory.getLogger(CreateProduct.class);

    public static Product createNewProduct() {

        String selectCategory = UpdateCategoryService.updateCategory();
        Category category = Category.valueOf(selectCategory);
        log.info(""+
                "\n_________________"+
                "\nВведите название продукта:");
        String name = InputNumberService.readString();
        log.info(""+
                "\n_________________"+
                "\nВведите цену продукта (BYN): ");
        double price = InputNumberService.readDouble();
        log.info(""+
                "\n_________________"+
                "\nВведите скидку продукта (%): ");
        double discount = InputNumberService.readDouble();

      return ProductService.creatProduct(category, name, price, discount);
    }

}

