package kasyanl.kasyanlfinalproject.util.service.menu;

import kasyanl.kasyanlfinalproject.util.service.menu.menuservise.*;
import kasyanl.kasyanlfinalproject.util.service.proccesor.*;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MenuStartService implements ProductInterface {

    static final Logger log = LoggerFactory.getLogger(MenuStartService.class);

    public void headMenu() {

        boolean mainLoop = true;
        while (mainLoop) {
            Menu.firstMenu();
            int imputedMenu  = InputNumberService.readNumber();
            switch (imputedMenu) {
                case 1:
                    ReadProduct.fineAllproduct(listProduct);
                    break;
                case 2:
                    ReadProduct.fineCategoryProguct(listProduct);
                    break;
                case 3:
                    ReadProduct.finePersonalProduct();
                    break;
                case 4:
                    AddProduct.addProduct(listProduct, CreateProduct.createNewProduct());
                    log.info(""+
                            "\n___________________________________" +
                            "\n| Продукт успешно добавлен в базу! |"+
                            "\n -----------------------------------");
                    break;
                case 5:
                    DeleteProduct.deleteProductService(listProduct);
                    log.info(""+
                            "\n_________________________" +
                            "\n| Продукт удален из базы.|" +
                            "\n------------------------");
                    break;
                case 6:
                    UpdateValueProduct.updateAnyProduct();
                    log.info(""+
                            "\n_______________________" +
                            "\n| Ваш продукт изменен! |"+
                            "\n -----------------------");
                    break;
                case 7:
                    UpdateCategoryDiscont.discontCategory();
                    log.info(""+
                            "\n___________________________________" +
                            "\n| Скидка для категории установлена! |"+
                            "\n -----------------------------------");
                    break;
                case 8:
                    mainLoop = false;
                    log.info(""+
                            "\n____________" +
                            "\nДо встречи!");
                    break;
                default:
                    log.info(""+
                            "\n____________" +
                            "\nТакого пункта не существует, повторите выбор: ");
            }
        }
    }
}
