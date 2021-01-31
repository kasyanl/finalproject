package kasyanl.kasyanlfinalproject.util.service.menu;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumberService;
import kasyanl.kasyanlfinalproject.util.service.ProductService;
import kasyanl.kasyanlfinalproject.util.service.proccesor.FineCategory;
import kasyanl.kasyanlfinalproject.util.service.proccesor.FinePersonalProductProcessor;

public class ReadProduct {

    public static void fineAllproduct() {

        if (ProductDataBase.listProduct.size() == 0) {
            System.out.println("В базе отсутствуют элементы");
        } else {
            for (Product product : ProductDataBase.listProduct) {
                ProductService.readProduct(product);
            }
        }
    }

    public static void fineCategoryProguct() {
        boolean categorySelect = true;
        while (categorySelect) {
            Menu.menuCategory();
            System.out.println("Выберите категорию");
            int categoryNumber = InputNumberService.readNumber();
            switch (categoryNumber) {
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

    public static Product finePersonalProduct() {
        Product product = new Product();
        System.out.println("Введите ID продукта");
        int id = InputNumberService.readNumber();
        FinePersonalProductProcessor.personalProductProcessor(id);

        return  product;
    }
}

