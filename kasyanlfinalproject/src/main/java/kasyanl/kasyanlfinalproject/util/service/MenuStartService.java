package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.service.menu.*;
import kasyanl.kasyanlfinalproject.util.service.procces.AddProduct;
import kasyanl.kasyanlfinalproject.util.service.procces.UpdateCategoryDiscont;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;

public class MenuStartService implements ProductInterface {

    public void headMenu() {

        boolean mainLoop = true;
        while (mainLoop) {
            StartMenu.firstMenu();
            int imputedMenu  = InputNumberService.readNumber();
            switch (imputedMenu) {
                case 1:
                    ReadProduct.fineAllproduct();
                    break;
                case 2:
                    ReadProduct.fineCategoryProguct();
                    break;
                case 3:

                    ReadProduct.finePersonalProduct();
                    break;
                case 4:
                    AddProduct.addProduct(CreateProduct.createNewProduct());
                    System.out.println("___________________________________" +
                                    "\n| Продукт успешно добавлен в базу! |"+
                                    "\n -----------------------------------");
                    break;
                case 5:
                    ProductService.deleteProduct();
                    System.out.println("_________________________" +
                                    "\n| Продукт удален из базы.|" +
                                     "\n------------------------");
                    break;
                case 6:
                    UpdateValueProduct.updateAnyProduct();
                    System.out.println("_______________________" +
                                    "\n| Dаш продукт изменен! |"+
                                    "\n -----------------------");
                    break;
                case 7:
                    UpdateCategoryDiscont.discontCategory();
                    System.out.println("___________________________________" +
                                    "\n| Скидка для категории установлена! |"+
                                    "\n -----------------------------------");
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
