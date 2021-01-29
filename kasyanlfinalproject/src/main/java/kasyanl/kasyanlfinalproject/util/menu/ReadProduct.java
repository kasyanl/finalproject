package kasyanl.kasyanlfinalproject.util.menu;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.procces.FineCategory;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.util.service.ProductService;
import java.util.List;

public class ReadProduct {

    public static void fineAllproduct(List<Product> listProduct) {
        if (listProduct.size() == 0) {
            System.out.println("В базе отсутствуют элементы");
        } else {
            for (Product product : listProduct) {
                ProductService.readProduct(product);
            }
        }
    }

    public static void fineCategoryProguct() {
        boolean categorySelect = true;
        while (categorySelect) {
            StartMenu.menuCategory();
            int category = ImputNumberService.readNumber("Выберите категорию");
            switch (category) {
                case 1:
                    Category fruits = Category.FRUITS;
                    FineCategory.fineCategoryForRead(fruits);
                    break;
                case 2:
                    Category berries = Category.BERRIES;
                    FineCategory.fineCategoryForRead(berries);
                    break;
                case 3:
                    Category vegetables = Category.VEGETABLES;
                    FineCategory.fineCategoryForRead(vegetables);
                    break;
                case 4:
                    Category milProduct = Category.MILK_PRODUCT;
                    FineCategory.fineCategoryForRead(milProduct);
                    break;
                case 5:
                    Category meat = Category.MEAT;
                    FineCategory.fineCategoryForRead(meat);
                    break;
                case 6:
                    Category alcoholicBeverages = Category.ALCOHOLIC_BEVERAGES;
                    FineCategory.fineCategoryForRead(alcoholicBeverages);
                    break;
                case 7:
                    categorySelect = false;
                    break;
                default:
                    System.out.println("" +
                            "\n__________" +
                            "\n!!!Такого пункта не существует. Попробуйте выбрать еще раз!!!" +
                            "\n__________");
            }
        }
    }

    public static void finePersonalProduct() {
        int id = ImputNumberService.readNumber("Введите ID продукта");

        for (Product product : ProductDataBase.listProduct)
            if (product.getId() == id) {
                ProductService.readProduct(product);
            }
    }
}
