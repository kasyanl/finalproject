package kasyanl.kasyanlfinalproject.util.service.crud;

import kasyanl.kasyanlfinalproject.util.StartMenu;
import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.util.service.OutElementsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UpdateCategoryDiscount {

    static final Logger log = LoggerFactory.getLogger(UpdateCategoryDiscount.class);

    public static void discontCategory(List<Product> listProduct) {

        String message = "Введите новую скидку для категории (%):";

        boolean discontSelect = true;
        while (discontSelect) {
            StartMenu.menuCategory();
            int category = ImputNumberService.readNumber("Выберите категорию");
            switch (category) {
                case 1:
                    double discont1 = ImputNumberService.readDouble(message);
                    Category fruits = Category.FRUITS;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(fruits)) {
                            product.setDiscount(discont1);
                            log.info("{}",OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 2:
                    double discont2 = ImputNumberService.readDouble(message);
                    Category berries = Category.BERRIES;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(berries)) {
                            product.setDiscount(discont2);
                            log.info("{}",OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 3:
                    double discont3 = ImputNumberService.readDouble(message);
                    Category vegetables = Category.VEGETABLES;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(vegetables)) {
                            product.setDiscount(discont3);
                            log.info("{}",OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 4:
                    double discont4 = ImputNumberService.readDouble(message);
                    Category milProduct = Category.MILK_PRODUCT;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(milProduct)) {
                            product.setDiscount(discont4);
                            log.info("{}",OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 5:
                    double discont5 = ImputNumberService.readDouble(message);
                    Category meat = Category.MEAT;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(meat)) {
                            product.setDiscount(discont5);
                            log.info("{}",OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 6:
                    double discont6 = ImputNumberService.readDouble(message);
                    Category alcoholicBeverages = Category.ALCOHOLIC_BEVERAGES;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(alcoholicBeverages)) {
                            product.setDiscount(discont6);
                            log.info("{}",OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 7:
                    discontSelect = false;
                    break;
                default:
                    log.info("" +
                            "\n__________" +
                            "\n!!!Такого пункта не существует. Попробуйте выбрать еще раз!!!" +
                            "\n__________");
            }
        }
    }
}
