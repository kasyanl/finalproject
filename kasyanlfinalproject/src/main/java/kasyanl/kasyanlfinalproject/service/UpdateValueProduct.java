package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.proccesor.FinePersonalProduct;
import kasyanl.kasyanlfinalproject.proccesor.InputNumber;
import kasyanl.kasyanlfinalproject.proccesor.UpdateProductFromID;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static kasyanl.kasyanlfinalproject.enums.MessageFormat.EMPTY_STRING;
import static kasyanl.kasyanlfinalproject.enums.MessageFormat.LINE_STRING;

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