package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductRepository;
import kasyanl.kasyanlfinalproject.util.proccesor.ProductService;
import kasyanl.kasyanlfinalproject.util.menu.MainMenu;
import kasyanl.kasyanlfinalproject.util.proccesor.FinePersonalProduct;
import kasyanl.kasyanlfinalproject.util.proccesor.FineProductOfCategory;
import kasyanl.kasyanlfinalproject.util.proccesor.InputNumber;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static kasyanl.kasyanlfinalproject.util.enums.MessageFormat.EMPTY_STRING;
import static kasyanl.kasyanlfinalproject.util.enums.MessageFormat.LINE_STRING;

@Slf4j
public final class ReadProduct implements ProductRepository {

    private ReadProduct() {
        throw new UnsupportedOperationException();
    }

    public static List<Product> fineAllProduct(List<Product> listProduct) {
        if (listProduct.isEmpty()) {
            log.info("{}{} В базе отсутствуют элементы!{}", EMPTY_STRING, LINE_STRING, LINE_STRING);
        }
        for (Product product : listProduct) ProductService.readProduct(product);
        return listProduct;
    }

    public static List<Product> fineCategoryProduct(List<Product> listProduct, InputNumber input) {
        MainMenu.menuCategory();
        int categoryNumber = input.readNumber();
        return FineProductOfCategory.selectCategoryByAllList(listProduct, categoryNumber);
    }

    public static Product finePersonalProduct(List<Product> listProduct, InputNumber input) {
        log.info("{}{} Введите ID продукта {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
        int id = input.readNumber();
        return FinePersonalProduct.personalProductProcessor(listProduct, id);
    }
}