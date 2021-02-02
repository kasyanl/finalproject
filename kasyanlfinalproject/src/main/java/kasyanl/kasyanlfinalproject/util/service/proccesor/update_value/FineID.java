package kasyanl.kasyanlfinalproject.util.service.proccesor.update_value;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.menu.Menu;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FineID {
    private FineID() {
        throw new IllegalStateException("Класс обновления конкретного продукта");
    }

    static final Logger log = LoggerFactory.getLogger(FineID.class);

    public static Product fineProductByID(InputNumber inputer, Product newProduct) {
        Menu.menuUpdateProduct();
        int select = inputer.readNumber();
        switch (select) {
            case 1:
                UpdateValueProductProcessor.selectCategory(inputer, newProduct);
                break;
            case 2:
                UpdateValueProductProcessor.selectName(inputer, newProduct);
                break;
            case 3:
                UpdateValueProductProcessor.selectPrice(inputer, newProduct);
                break;
            case 4:
                UpdateValueProductProcessor.selectDiscount(inputer, newProduct);
                break;
            default:
                log.info("" +
                        "\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _" +
                        "\nТакого варианта выбора нет, повторите его: ");
        }
        return newProduct;
    }
}
