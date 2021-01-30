package kasyanl.kasyanlfinalproject.util.service.procces;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.service.InputNumberService;
import kasyanl.kasyanlfinalproject.util.service.menu.ReadProduct;

public class SelectCategory extends ReadProduct {

    public static String selectCategory(int category) {
        String text = "";
        category = InputNumberService.readNumber();
        switch (category) {
            case 1:
                Category fruits = Category.FRUITS;
                text = FineCategory.fineCategoryForRead(fruits);
                break;
            case 2:
                Category berries = Category.BERRIES;
                text = FineCategory.fineCategoryForRead(berries);
                break;
            case 3:
                Category vegetables = Category.VEGETABLES;
                text = FineCategory.fineCategoryForRead(vegetables);
                break;
            case 4:
                Category milProduct = Category.MILK_PRODUCT;
                text = FineCategory.fineCategoryForRead(milProduct);
                break;
            case 5:
                Category meat = Category.MEAT;
                text = FineCategory.fineCategoryForRead(meat);
                break;
            case 6:
                Category alcoholicBeverages = Category.ALCOHOLIC_BEVERAGES;
                text = FineCategory.fineCategoryForRead(alcoholicBeverages);
                break;
            case 7:
                ReadProduct.categorySelect = false;
            default:
                System.out.println("" +
                        "\n__________" +
                        "\n!!!Такого пункта не существует. Попробуйте выбрать еще раз!!!" +
                        "\n__________");
        }
        return text;
    }
}
