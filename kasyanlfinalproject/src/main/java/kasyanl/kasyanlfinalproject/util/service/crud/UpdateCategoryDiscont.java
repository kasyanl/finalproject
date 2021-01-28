package kasyanl.kasyanlfinalproject.util.service.crud;

import kasyanl.kasyanlfinalproject.util.StartMenu;
import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.util.service.OutElementsService;

import java.util.List;

public class UpdateCategoryDiscont {
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
                            System.out.println(OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 2:
                    double discont2 = ImputNumberService.readDouble(message);
                    Category berries = Category.BERRIES;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(berries)) {
                            product.setDiscount(discont2);
                            System.out.println(OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 3:
                    double discont3 = ImputNumberService.readDouble(message);
                    Category vegetables = Category.VEGETABLES;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(vegetables)) {
                            product.setDiscount(discont3);
                            System.out.println(OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 4:
                    double discont4 = ImputNumberService.readDouble(message);
                    Category milProduct = Category.MILK_PRODUCT;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(milProduct)) {
                            product.setDiscount(discont4);
                            System.out.println(OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 5:
                    double discont5 = ImputNumberService.readDouble(message);
                    Category meat = Category.MEAT;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(meat)) {
                            product.setDiscount(discont5);
                            System.out.println(OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 6:
                    double discont6 = ImputNumberService.readDouble(message);
                    Category alcoholicBeverages = Category.ALCOHOLIC_BEVERAGES;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(alcoholicBeverages)) {
                            product.setDiscount(discont6);
                            System.out.println(OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 7:
                    discontSelect = false;
                    break;
                default:
                    System.out.println("" +
                            "\n__________" +
                            "\n!!!Такого пункта не существует. Попробуйте выбрать еще раз!!!" +
                            "\n__________");
            }
        }
    }
}
