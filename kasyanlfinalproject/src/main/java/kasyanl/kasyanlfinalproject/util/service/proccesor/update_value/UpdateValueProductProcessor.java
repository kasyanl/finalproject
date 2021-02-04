package kasyanl.kasyanlfinalproject.util.service.proccesor.update_value;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumber;
import kasyanl.kasyanlfinalproject.util.service.proccesor.ProductService;
import kasyanl.kasyanlfinalproject.util.service.proccesor.UpdateCategoryServiceProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateValueProductProcessor {

    private UpdateValueProductProcessor() {
        throw new UnsupportedOperationException();
    }

    static final Logger log = LoggerFactory.getLogger(UpdateValueProductProcessor.class);

    public static void selectCategory(InputNumber input, Product product) {

        UpdateCategoryServiceProcessor updateCategoryServiceProcessor = new UpdateCategoryServiceProcessor();

        String selectCategory = updateCategoryServiceProcessor.updateCategory(input);
        Category category = Category.valueOf(selectCategory);
        product.setCategory(category);
        ProductService.readProduct(product);

    }

    public static final String ITERATOR = "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _";
    public static final String MESSAGE = "Введите новое название: ";

    public static void selectName(InputNumber input, Product product) {
        log.info("" +
                "\n{}" +
                "\n{}", ITERATOR, MESSAGE);
        product.setName(input.readString());
        ProductService.readProduct(product);
    }

    public static void selectPrice(InputNumber input, Product product) {
        log.info("" +
                "\n{}" +
                "\n{}", ITERATOR, MESSAGE);
        product.setPrice(input.readDouble());
        ProductService.readProduct(product);
    }

    public static void selectDiscount(InputNumber input, Product product) {
        log.info("" +
                "\n{}" +
                "\n{}", ITERATOR, MESSAGE);
        product.setDiscount(input.readDouble());
        ProductService.readProduct(product);
    }
}

