package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.StartMenu;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.crud.*;

import java.util.ArrayList;
import java.util.List;

public class MenuStartService implements ProductInterface {

    List<Product> listProduct = new ArrayList<>();

    public void headMenu() {

        boolean mainLoop = true;
        listProduct = ProductDataBase.createBase();
        while (mainLoop) {
            StartMenu.firstMenu();
            int imputedMenu  = ImputNumberService.readNumber("__________");
            switch (imputedMenu) {
                case 1:
                    ReadProduct.showBase(listProduct);
                    break;
                case 2:
                    ReadProduct.baseCategory(listProduct);
                    break;
                case 3:
                    ReadProduct.showPersonalProduct(listProduct);
                    break;
                case 4:
                    CreateProduct.addProduct(listProduct, CreateProduct.createNewProduct(listProduct));
                    System.out.println("___________________________________" +
                                    "\n| Продукт успешно добавлен в базу! |"+
                                    "\n -----------------------------------");
                    break;
                case 5:
                    DeleteProduct.deleteProduct(listProduct);
                    System.out.println("_________________________" +
                                    "\n| Продукт удален из базы.|" +
                                     "\n------------------------");
                    break;
                case 6:
                    UpdateValueProduct.updateAnyProduct(listProduct);
                    System.out.println("________________________________" +
                                    "\n| Спасибо, Ваш продукт изменен! |"+
                                    "\n --------------------------------");
                    break;
                case 7:
                    UpdateCategoryDiscont.discontCategory(listProduct);
                    System.out.println("________________________________" +
                            "\n| Спасибо, Ваш продукт изменен! |"+
                            "\n --------------------------------");
                    break;
                case 8:
                    mainLoop = false;
                    System.out.println(""+
                           "\n"+
                           "\nДо встречи!");
                    break;
                default:
                    System.out.println(""+
                            "\n"+
                            "\nТакого пункта не существует, повторите выбор: ");
            }
        }
    }
}
