package kasyanl.kasyanlfinalproject.util.service.menu.menuservise;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.proccesor.ProductService;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumber;
import kasyanl.kasyanlfinalproject.util.service.proccesor.UpdateCategoryServiceProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateProduct {

    UpdateCategoryServiceProcessor updateCategoryServiceProcessor = new UpdateCategoryServiceProcessor();
    static final Logger log = LoggerFactory.getLogger(CreateProduct.class);
    public static final String ITERATOR = "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _";

    public Product createNewProduct( InputNumber inputNumber) {

        String selectCategory = updateCategoryServiceProcessor.updateCategory(inputNumber);
        Category category = Category.valueOf(selectCategory);
        log.info(""+
                "\n{}"+
                "\nВведите название продукта:", ITERATOR);
        String name = inputNumber.readString();
        log.info(""+
                "\n{}"+
                "\nВведите цену продукта (BYN):", ITERATOR);
        double price = inputNumber.readDouble();
        log.info(""+
                "\n{}"+
                "\nВведите скидку продукта (%):", ITERATOR);
        double discount = inputNumber.readDouble();

      return ProductService.creatProduct(category, name, price, discount);
    }
}