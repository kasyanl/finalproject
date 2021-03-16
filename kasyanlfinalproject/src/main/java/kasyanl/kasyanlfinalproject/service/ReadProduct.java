package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.repository.ProductRepository;
import kasyanl.kasyanlfinalproject.proccesor.ProductService;
import kasyanl.kasyanlfinalproject.menu.MainMenu;
import kasyanl.kasyanlfinalproject.proccesor.FinePersonalProduct;
import kasyanl.kasyanlfinalproject.proccesor.FineProductOfCategory;
import kasyanl.kasyanlfinalproject.proccesor.InputNumber;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static kasyanl.kasyanlfinalproject.enums.MessageFormat.EMPTY_STRING;
import static kasyanl.kasyanlfinalproject.enums.MessageFormat.LINE_STRING;

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