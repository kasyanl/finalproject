package kasyanl.kasyanlfinalproject.util.menu;

import kasyanl.kasyanlfinalproject.util.proccesor.*;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.*;
import kasyanl.kasyanlfinalproject.util.service.UpdateCategoryDiscount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MenuStartService implements ProductInterface {

    CreateProduct createProduct = new CreateProduct();
    UpdateValueProduct updateValueProduct = new UpdateValueProduct();
    DeleteProduct deleteProduct = new DeleteProduct();
    kasyanl.kasyanlfinalproject.util.service.UpdateCategoryDiscount updateCategoryDiscont = new UpdateCategoryDiscount();
    final Logger log = LoggerFactory.getLogger(MenuStartService.class);
    public static final String ITERATOR = "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _";

    public void headMenu(InputNumber inputNumber) {
        log.info("" +
                "\n" +
                "\nЗдравствуйте! Вас приветствует Система учета продуктов.");
        boolean mainLoop = true;
        while (mainLoop) {
            Menu.firstMenu();
            int imputedMenu = inputNumber.readNumber();
            switch (imputedMenu) {
                case 1:
                    ReadProduct.fineAllProduct(listProduct);
                    break;
                case 2:
                    ReadProduct.fineCategoryProduct(listProduct, inputNumber);
                    break;
                case 3:
                    ReadProduct.finePersonalProduct(listProduct, inputNumber);
                    break;
                case 4:
                    AddProduct.addProduct(listProduct, createProduct.createNewProduct(inputNumber));
                    log.info("" +
                            "\n{}" +
                            "\n Продукт успешно добавлен в базу! " +
                            "\n{}", ITERATOR, ITERATOR);
                    break;
                case 5:
                    deleteProduct.deleteProductService(listProduct, inputNumber);
                    log.info("" +
                            "\n{}" +
                            "\n| Продукт удален из базы.|" +
                            "\n{}", ITERATOR, ITERATOR);
                    break;
                case 6:
                    updateValueProduct.updateAnyProduct(inputNumber, listProduct);
                    log.info("" +
                            "\n{}" +
                            "\n| Ваш продукт изменен! |" +
                            "\n{}", ITERATOR, ITERATOR);
                    break;
                case 7:
                    updateCategoryDiscont.discountCategory(listProduct, inputNumber, inputNumber);
                    log.info("" +
                            "\n{}" +
                            "\n| Скидка для категории установлена! |" +
                            "\n{}", ITERATOR, ITERATOR);
                    break;
                case 8:
                    MenuSort.sortProduct(listProduct, inputNumber);
                    break;
                case 9:
                    mainLoop = false;
                    log.info("" +
                            "\n{}" +
                            "\nДо встречи!", ITERATOR);
                    break;
                default:
                    log.info("" +
                            "\n{}" +
                            "\nТакого пункта не существует, повторите выбор:", ITERATOR);
            }
        }
    }
}
