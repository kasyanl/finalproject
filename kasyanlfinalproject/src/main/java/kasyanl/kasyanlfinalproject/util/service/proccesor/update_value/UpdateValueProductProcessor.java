package kasyanl.kasyanlfinalproject.util.service.proccesor.update_value;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumber;
import kasyanl.kasyanlfinalproject.util.service.proccesor.ProductService;
import kasyanl.kasyanlfinalproject.util.service.proccesor.UpdateCategoryServiceProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateValueProductProcessor {

    public UpdateValueProductProcessor() {
        throw new IllegalStateException("Класс для обновления параметров продукта");
    }

    static final Logger log = LoggerFactory.getLogger(UpdateValueProductProcessor.class);

    public static Product selectCategory(InputNumber input, Product product) {

        UpdateCategoryServiceProcessor updateCategoryServiceProcessor = new UpdateCategoryServiceProcessor();

        String selectCategory = updateCategoryServiceProcessor.updateCategory(input);
        Category category = Category.valueOf(selectCategory);
        product.setCategory(category);
        ProductService.readProduct(product);

        return product;
    }

    public static final String iterator = "________________";
    public static final String message = "Введите новое название: ";
    public static Product selectName(InputNumber input, Product product) {
        log.info("" +
                "\n{}" +
                "\n{}", iterator, message);
        product.setName(input.readString());
        ProductService.readProduct(product);
        return product;
    }

    public static Product selectPrice(InputNumber input, Product product) {
        log.info("" +
                "\n{}" +
                "\n{}", iterator, message);
        product.setPrice(input.readDouble());
        ProductService.readProduct(product);
        return product;
    }

    public static Product selectDiscount(InputNumber input, Product product) {
        log.info("" +
                "\n{}" +
                "\n{}", iterator, message);
        product.setDiscount(input.readDouble());
        ProductService.readProduct(product);
        return product;
    }
}

