package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductRepository;
import kasyanl.kasyanlfinalproject.util.proccesor.ProductService;
import kasyanl.kasyanlfinalproject.util.proccesor.InputNumber;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static kasyanl.kasyanlfinalproject.util.enums.MessageFormat.EMPTY_STRING;
import static kasyanl.kasyanlfinalproject.util.enums.MessageFormat.LINE_STRING;

@Slf4j
public class DeleteProduct implements ProductRepository {

    private DeleteProduct() {
        throw new UnsupportedOperationException();
    }

    public static List<Product> deleteProductService(List<Product> listProduct, InputNumber inputNumber) {
        log.info("{}{} Введите ID продукта {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
        int id = inputNumber.readNumber();
        ProductService.deleteProduct(listProduct, id);
        return listProduct;
    }
}