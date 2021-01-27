package kasyanl.kasyanlfinalproject.util.service.CRUD;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.StartMenu;
import kasyanl.kasyanlfinalproject.util.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.util.service.OutElementsService;
import java.util.List;

public class ReadProduct {

    public static void showBase(List<Product> listProduct) {
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    public static void showPersonalProduct(List<Product> listProduct) {
        int id = ImputNumberService.readNumber("Введите ID продукта");

            for (Product product : listProduct)
                if (product.getId() == id) {
                    System.out.println(OutElementsService.outValueProduct(listProduct, product));
                }
        }

    public static void showProductByCreated(List<Product> listProduct) {
        for (Product product : listProduct) {
            if (product.getId() == CreateProduct.listProduct.indexOf(product)) {
                System.out.println(OutElementsService.outValueProduct(listProduct, product));
            }
        }
    }

    public static void baseCategory(List<Product> listProduct) {
        boolean categorySelect = true;
        while (categorySelect) {
            StartMenu.menuCategory();
            int category = ImputNumberService.readNumber("Выберите категорию");
            switch (category) {
                case 1:
                    Category fruits = Category.FRUITS;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(fruits)) {
                            System.out.println(OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 2:
                    Category berries = Category.BERRIES;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(berries)) {
                            System.out.println(OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 3:
                    Category vegetables = Category.VEGETABLES;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(vegetables)) {
                            System.out.println(OutElementsService.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 4:
                    categorySelect = false;
                    break;
                default:
                    System.out.println(""+
                            "\n__________"+
                            "\n!!!Такого пункта не существует. Попробуйте выбрать еще раз!!!"+
                            "\n__________");
            }
        }
    }
}
