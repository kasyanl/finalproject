package kasyanl.kasyanlfinalproject.util.service.menu;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.InputNumberService;
import kasyanl.kasyanlfinalproject.util.service.ProductService;

import java.util.List;

public class DeleteProduct implements ProductInterface {

    public static List<Product> deleteProductService(List<Product> listProduct){
        System.out.println("Введите ID продукта");
        int id = InputNumberService.readNumber();
        ProductService.deleteProduct(listProduct, id);
        return  listProduct;
    }
}
