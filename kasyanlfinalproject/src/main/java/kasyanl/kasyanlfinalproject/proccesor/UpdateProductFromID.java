package kasyanl.kasyanlfinalproject.proccesor;

import kasyanl.kasyanlfinalproject.enums.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.menu.MainMenu;
import lombok.extern.slf4j.Slf4j;

import static kasyanl.kasyanlfinalproject.enums.MessageFormat.*;

@Slf4j
public final class UpdateProductFromID {

    private UpdateProductFromID() {
        throw new UnsupportedOperationException();
    }

    public static Product fineProductByID(InputNumber input, Product newProduct) {
        MainMenu.menuUpdateProduct();
        int select = input.readNumber();
        switch (select) {
            case 1:
                selectCategory(input, newProduct);
                break;
            case 2:
                selectName(input, newProduct);
                break;
            case 3:
                selectPrice(input, newProduct);
                break;
            case 4:
                selectDiscount(input, newProduct);
                break;
            default:
                log.info("{}", SELECT_NON_FOUND);
        }
        return newProduct;
    }

    public static void selectCategory(InputNumber input, Product product) {

        String selectCategory = UpdateCategoryService.updateCategory(input);
        Category category = Category.valueOf(selectCategory);
        product.setCategory(category);
        ProductService.readProduct(product);
    }

    public static void selectName(InputNumber input, Product product) {
        log.info("{}{} Введите новое название продукта: {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
        product.setName(input.readString());
        ProductService.readProduct(product);
    }

    public static void selectPrice(InputNumber input, Product product) {
        log.info("{}{} Введите новую цену продукта: {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
        product.setPrice(input.readDouble());
        ProductService.readProduct(product);
    }

    public static void selectDiscount(InputNumber input, Product product) {
        log.info("{}{} Введите новую скидку продукта: {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
        product.setDiscount(input.readDouble());
        ProductService.readProduct(product);
    }
}