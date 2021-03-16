package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.repository.ProductRepository;
import kasyanl.kasyanlfinalproject.proccesor.ProductService;
import kasyanl.kasyanlfinalproject.proccesor.InputNumber;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static kasyanl.kasyanlfinalproject.enums.MessageFormat.EMPTY_STRING;
import static kasyanl.kasyanlfinalproject.enums.MessageFormat.LINE_STRING;

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