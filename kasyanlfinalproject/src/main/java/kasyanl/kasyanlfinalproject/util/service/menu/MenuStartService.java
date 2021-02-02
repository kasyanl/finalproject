package kasyanl.kasyanlfinalproject.util.service.menu;

import kasyanl.kasyanlfinalproject.util.service.menu.menuservise.*;
import kasyanl.kasyanlfinalproject.util.service.proccesor.*;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MenuStartService implements ProductInterface {

    CreateProduct createProduct = new CreateProduct();
    UpdateValueProduct updateValueProduct = new UpdateValueProduct();
    DeleteProduct deleteProduct = new DeleteProduct();
    UpdateCategoryDiscont updateCategoryDiscont = new UpdateCategoryDiscont();
    InputNumber inputNumber = new InputNumber(System.in, System.out);
    final Logger log = LoggerFactory.getLogger(MenuStartService.class);
    public static final String iterator = "___________________________________";

    public void headMenu(InputNumber inputNumber) {

        boolean mainLoop = true;
        while (mainLoop) {
            Menu.firstMenu();
            int imputedMenu = inputNumber.readNumber();
            switch (imputedMenu) {
                case 1:
                    ReadProduct.fineAllproduct(listProduct);
                    break;
                case 2:
                    ReadProduct.fineCategoryProguct(listProduct, inputNumber);
                    break;
                case 3:
                    ReadProduct.finePersonalProduct(listProduct, inputNumber);
                    break;
                case 4:
                    AddProduct.addProduct(listProduct, createProduct.createNewProduct(inputNumber));
                    log.info("" +
                            "\n{}" +
                            "\n Продукт успешно добавлен в базу! " +
                            "\n{}", iterator, iterator);
                    break;
                case 5:
                    deleteProduct.deleteProductService(listProduct, inputNumber);
                    log.info("" +
                            "\n{}" +
                            "\n| Продукт удален из базы.|" +
                            "\n{}", iterator, iterator);
                    break;
                case 6:
                    updateValueProduct.updateAnyProduct(inputNumber, listProduct);
                    log.info("" +
                            "\n{}" +
                            "\n| Ваш продукт изменен! |" +
                            "\n{}", iterator, iterator);
                    break;
                case 7:
                    updateCategoryDiscont.discountCategory(listProduct, inputNumber, this.inputNumber);
                    log.info("" +
                            "\n{}" +
                            "\n| Скидка для категории установлена! |" +
                            "\n{}", iterator, iterator);
                    break;
                case 8:
                    mainLoop = false;
                    log.info("" +
                            "\n{}" +
                            "\nДо встречи!", iterator);
                    break;
                default:
                    log.info("" +
                            "\n{}" +
                            "\nТакого пункта не существует, повторите выбор:", iterator);
            }
        }
    }
}
