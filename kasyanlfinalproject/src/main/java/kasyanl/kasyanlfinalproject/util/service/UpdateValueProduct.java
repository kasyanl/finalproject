package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.proccesor.FinePersonalProduct;
import kasyanl.kasyanlfinalproject.util.proccesor.InputNumber;
import kasyanl.kasyanlfinalproject.util.proccesor.UpdateProductFromID;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static kasyanl.kasyanlfinalproject.util.enums.MessageFormat.EMPTY_STRING;
import static kasyanl.kasyanlfinalproject.util.enums.MessageFormat.LINE_STRING;

@Slf4j
public final class UpdateValueProduct {

    private UpdateValueProduct() {
        throw new UnsupportedOperationException();
    }

    public static Product updateAnyProduct(InputNumber input, List<Product> listProduct) {
        log.info("{}{} Введите ID продукта {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
        int id = input.readNumber();
        return UpdateProductFromID.fineProductByID(input, FinePersonalProduct.personalProductProcessor(listProduct, id));
    }
}