package kasyanl.kasyanlfinalproject.menu;

import kasyanl.kasyanlfinalproject.proccesor.*;
import kasyanl.kasyanlfinalproject.repository.ProductRepository;
import kasyanl.kasyanlfinalproject.service.*;
import kasyanl.kasyanlfinalproject.service.ReadProduct;
import lombok.extern.slf4j.Slf4j;

import static kasyanl.kasyanlfinalproject.enums.MessageFormat.*;

@Slf4j
public final class MenuStartService implements ProductRepository {

    private MenuStartService() {
        throw new UnsupportedOperationException();
    }

    public static void headMenu(InputNumber inputNumber) {
        log.info("{}{} Здравствуйте! Вас приветствует Система учета продуктов.", EMPTY_STRING, EMPTY_STRING);
        boolean mainLoop = true;
        while (mainLoop) {
            MainMenu.headMenu();
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
                    AddProduct.addProduct(listProduct, CreateProduct.createNewProduct(inputNumber));
                    log.info("{}{} Продукт успешно добавлен в базу! {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
                    break;
                case 5:
                    DeleteProduct.deleteProductService(listProduct, inputNumber);
                    log.info("{}{} Продукт удален из базы. {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
                    break;
                case 6:
                    UpdateValueProduct.updateAnyProduct(inputNumber, listProduct);
                    log.info("{}{} Ваш продукт изменен! {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
                    break;
                case 7:
                    FindCategoryDiscount.fineCategory(listProduct, imputedMenu, inputNumber);
                    log.info("{}{} Скидка для категории установлена! {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
                    break;
                case 8:
                    MenuSort.sortProduct(listProduct, inputNumber);
                    break;
                case 9:
                    mainLoop = false;
                    log.info("{}{} До встречи!", EMPTY_STRING, LINE_STRING);
                    break;
                default:
                    log.info("{}", SELECT_NON_FOUND);
            }
        }
    }
}