package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.enums.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.proccesor.ProductService;
import kasyanl.kasyanlfinalproject.proccesor.InputNumber;
import kasyanl.kasyanlfinalproject.proccesor.UpdateCategoryService;
import lombok.extern.slf4j.Slf4j;

import static kasyanl.kasyanlfinalproject.enums.MessageFormat.EMPTY_STRING;
import static kasyanl.kasyanlfinalproject.enums.MessageFormat.LINE_STRING;

@Slf4j
public final class CreateProduct {

    private CreateProduct() {
        throw new UnsupportedOperationException();
    }

    public static Product createNewProduct(InputNumber inputNumber) {

        String selectCategory = UpdateCategoryService.updateCategory(inputNumber);
        Category category = Category.valueOf(selectCategory);
        log.info("{}{} Введите название продукта: {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
        String name = inputNumber.readString();
        log.info("{}{} Введите цену продукта (BYN): {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
        double price = inputNumber.readDouble();
        log.info("{}{} Введите скидку продукта (%): {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
        double discount = inputNumber.readDouble();

        return ProductService.creatProduct(category, name, price, discount);
    }
}