package kasyanl.kasyanlfinalproject.util.menu;


import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;

public class DeleteProduct {

    public static void deleteProduct() {
        int id = ImputNumberService.readNumber("Введите ID продукта");
        ProductDataBase.listProduct.removeIf(nextProduct -> nextProduct.getId() == id);
    }
}
