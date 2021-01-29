package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.menu.*;
import kasyanl.kasyanlfinalproject.util.procces.UpdateCategoryDiscont;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;

import java.util.ArrayList;
import java.util.List;

public class MenuStartService implements ProductInterface {

   List<Product> listProduct = new ArrayList<>();

    public void headMenu() {

        boolean mainLoop = true;

        while (mainLoop) {
            StartMenu.firstMenu();
            int imputedMenu  = ImputNumberService.readNumber("__________");
            switch (imputedMenu) {
                case 1:
                    ReadProduct.fineAllproduct(listProduct);
                    break;
                case 2:
                    ReadProduct.fineCategoryProguct();
                    break;
                case 3:
                    ReadProduct.finePersonalProduct();
                    break;
                case 4:
                    CreateProduct.createNewProduct();
                    ReadProduct.finePersonalProduct();
                    System.out.println("___________________________________" +
                                    "\n| Продукт успешно добавлен в базу! |"+
                                    "\n -----------------------------------");
                    break;
                case 5:
                    DeleteProduct.deleteProduct();
                    System.out.println("_________________________" +
                                    "\n| Продукт удален из базы.|" +
                                     "\n------------------------");
                    break;
                case 6:
                    UpdateValueProduct.updateAnyProduct();
                    System.out.println("________________________________" +
                                    "\n| Спасибо, Ваш продукт изменен! |"+
                                    "\n --------------------------------");
                    break;
                case 7:
                    UpdateCategoryDiscont.discontCategory();
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
