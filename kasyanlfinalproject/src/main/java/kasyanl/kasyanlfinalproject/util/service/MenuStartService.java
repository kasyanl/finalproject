package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.StartMenu;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.CRUD.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class MenuStartService implements ProductInterface {

    final static Logger log = LoggerFactory.getLogger(MenuStartService.class);

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
                    log.info(""+
                            "\n___________________________________" +
                            "\n| Продукт успешно добавлен в базу! |"+
                            "\n -----------------------------------");
                    break;
                case 5:
                    DeleteProduct.deleteProduct(listProduct);
                    log.info(""+
                            "\n_________________________" +
                            "\n| Продукт удален из базы.|" +
                             "\n------------------------");
                    break;
                case 6:
                    UpdateValueProduct.updateAnyProduct(listProduct);
                    log.info(""+
                            "\n________________________________" +
                            "\n| Спасибо, Ваш продукт изменен! |"+
                            "\n --------------------------------");
                    break;
                case 7:
                    UpdateCategoryDiscount.discontCategory(listProduct);
                    log.info(""+
                            "\n________________________________" +
                            "\n| Спасибо, Ваш продукт изменен! |"+
                            "\n --------------------------------");
                    break;
                case 8:
                    mainLoop = false;
                    log.info(""+
                           "\n"+
                           "\nДо встречи!");
                    break;
                default:
                    log.info(""+
                            "\n"+
                            "\nТакого пункта не существует, повторите выбор: ");
            }
        }
    }
}
