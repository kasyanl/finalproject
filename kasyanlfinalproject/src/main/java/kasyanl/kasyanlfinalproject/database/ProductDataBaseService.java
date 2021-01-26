package kasyanl.kasyanlfinalproject.database;

import kasyanl.kasyanlfinalproject.bean.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.menu.StartMenu;
import kasyanl.kasyanlfinalproject.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.service.OutElements;
import kasyanl.kasyanlfinalproject.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.Map;

public class ProductDataBaseService {
    final Logger log = LoggerFactory.getLogger(ProductDataBaseService.class);

    Product product = new Product();
    ImputNumberService imputNumberService = new ImputNumberService();
    StartMenu startMenu = new StartMenu();
    OutElements outElements = new OutElements();

    public void deleteProduct(Map<Long, Product> productMap) {
        int id = imputNumberService.readNumber("");
        for(Iterator<Map.Entry<Long, Product>> mapRemove = productMap.entrySet().iterator(); mapRemove.hasNext(); ) {
            Map.Entry<Long, Product> entry = mapRemove.next();
            if(entry.getKey().equals(id)) {
                mapRemove.remove();
            }
        }
    }

    public void addProduct(Map<Long, Product> productMap, Product product) {
        ProductService.
        productMap.put(product.getId(), product);
    }

    public void updateAnyProduct(Map<Long, Product> productMap) {
        System.out.println("---------------------");
        int id = imputNumberService.readNumber("Введите ID продукта: ");
        boolean updateLoop = true;
        for (Map.Entry<Long, Product> mapList: productMap.entrySet()){
            if (mapList.getKey() ==0) {
                System.out.println(mapList);
                while (updateLoop) {
                    StartMenu.menuUpdateProduct();
                    int select = imputNumberService.readNumber("Ваш выбор: ");
                    switch (select) {
                        case 1:
                            String categorySelect = imputNumberService.readString("Введите одну из категорий 'ФРУКТЫ, ОВОЩИ, ЯГОДЫ': ");
                            categorySelect = categorySelect.toUpperCase();
                            Category category = Category.valueOf(categorySelect);
                           product.setCategory(category);
                            break;
                        case 2:
                            String newName = imputNumberService.readString("Введите новое название: ");
                            product.setName(newName);
                            System.out.println(product);
                            break;
                        case 3:
                            double newPrice = imputNumberService.readDouble("Введите новую цену: ");
                            product.setPrice(newPrice);
                            System.out.println(product);
                            break;
                        case 4:
                            double newDiscount = imputNumberService.readDouble("Введите новую скидку: ");
                            product.setDiscount(newDiscount);
                            System.out.println(product);
                            break;
                        case 5:
                            updateLoop = false;
                            break;
                        default:
                            System.out.println("Такого варианта выбора нет, повторите его: ");
                    }
                }
            }
        }
    }

    public void updateFromId(Map<Long, Product> productMap) {
        System.out.println("---------------------");
        int id =  imputNumberService.readNumber("Введите номер продукта: ");
        for (Map.Entry<Long, Product> mapList: productMap.entrySet()){
            if (product.getId()==id) {
                String categorySelect = imputNumberService.readString("Введите одну из категорий 'ФРУКТЫ, ОВОЩИ, ЯГОДЫ': ");
                categorySelect = categorySelect.toUpperCase();
                Category category = Category.valueOf(categorySelect);
                product.setCategory(category);
                String newName = imputNumberService.readString("Введите новое название: ");
                product.setName(newName);
                double newPrice = imputNumberService.readDouble("Введите новую цену: ");
                product.setPrice(newPrice);
            }
        }
        System.out.println("Изменения успешно внесены и сохранены.");
    }

    public void showBase(Map<Long, Product> productMap) {

        for (Map.Entry<Long, Product> mapList: productMap.entrySet()){
            log.info("{}", mapList);
        }
    }

    public void baseCategory(Map<Long, Product> productMap) {
        OutElements outElements = new OutElements();
       boolean categorySelect = true;
        while (categorySelect) {
            startMenu.menuCategory();
            int category = imputNumberService.readNumber("Выберите категорию");
            switch (category) {
                case 1:
                    Category fruits = Category.FRUITS;
                    for (Map.Entry<Long, Product> mapList: productMap.entrySet()){
                        if (mapList.getValue().getCategory().equals(fruits)) {
                            log.info("{}", outElements.outValueProduct(productMap, product));
                        }
                    }
                    break;
                case 2:
                    Category berries = Category.BERRIES;
                    for (Map.Entry<Long, Product> mapList: productMap.entrySet()){
                        if (mapList.getValue().getCategory().equals(berries)) {
                            log.info("{}", mapList);
                        }
                    }
                    break;
                case 3:
                    Category vegetables = Category.VEGETABLES;
                    for (Map.Entry<Long, Product> mapList: productMap.entrySet()){
                        if (mapList.getValue().getCategory().equals(vegetables)) {
                            log.info("{}", mapList);
                        }
                    }
                    break;
                case 4:
                    categorySelect = false;
                    break;
                default:
                    log.info("Попробуйте выбрать еще раз");
            }
        }
    }
}
