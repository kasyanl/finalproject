package kasyanl.kasyanlfinalproject.util.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static kasyanl.kasyanlfinalproject.util.enums.MessageFormat.EMPTY_STRING;
import static kasyanl.kasyanlfinalproject.util.enums.MessageFormat.LINE_STRING;

@Slf4j
public final class FinePersonalProduct {


    private FinePersonalProduct() {
        throw new UnsupportedOperationException();
    }

    public static Product personalProductProcessor(List<Product> listProduct, int id) {
        for (Product product : listProduct) {
            if (product.getId() == id) {
                ProductService.readProduct(product);
                return product;
            }
            log.info("{}{} Такого продукта не существует {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
        }
        return new Product();
    }
}