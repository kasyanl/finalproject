package kasyanl.kasyanlfinalproject.database;

import kasyanl.kasyanlfinalproject.bean.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.menu.StartMenu;
import kasyanl.kasyanlfinalproject.service.ImputNumberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.Map;

public class ProductDataBaseService {
    final Logger log = LoggerFactory.getLogger(ProductDataBaseService.class);

   // public static void writeObjectsToFile() {

//        List<Product> productBase = DataBase.createBase();
//
//        DataWriter dataWriter = new DataWriter(IOConstants.FILENAME);
//        try {
//            dataWriter.writeToFile(productBase);
//            System.out.println("Данные записаны в файл.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void readObjectsToFile() {
//        DataReader dataReader = new DataReader(IOConstants.FILENAME);
//        try {
//            List<Product> productBase = dataReader.readFromFile();
//            for (Product product : productBase){
//                System.out.println(product);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
    public void deleteProduct(Map<Long, Product> productMap) {
        ImputNumberService imputNumberService = new ImputNumberService();
        int id = imputNumberService.readNumber("Введите ID продукта: ");
        for(Iterator<Map.Entry<Long, Product>> mapRemove = productMap.entrySet().iterator(); mapRemove.hasNext(); ) {
            Map.Entry<Long, Product> entry = mapRemove.next();
            if(entry.getKey().equals(id)) {
                mapRemove.remove();
            }
        }
    }

    public void addProduct(Map<Long, Product> productMap, Product product) {
        productMap.put(product.getId(), product);
    }

//    public static void updateAnyProduct(List<Product> productBase) {
//        System.out.println("---------------------");
//        int id = CommandReader.readNumber("Введите номер продукта: ");
//        boolean updateLoop = true;
//        for (Product product : productBase) {
//            if (product.getId() == id) {
//                System.out.println(product);
//                while (updateLoop) {
//                    MenuText.menuAnyDataChange();
//                    int choice = CommandReader.readNumber("Ваш выбор: ");
//                    switch (choice) {
//                        case 1:
//                            String categoryChoice = CommandReader.readString("Введите одну из категорий 'ФРУКТЫ, ОВОЩИ, ЯГОДЫ': ");
//                            categoryChoice = categoryChoice.toUpperCase();
//                            Category category = Category.valueOf(categoryChoice);
//                            product.setCategory(category);
//                            break;
//                        case 2:
//                            String newName = CommandReader.readString("Введите новое название: ");
//                            product.setName(newName);
//                            System.out.println(product);
//                            break;
//                        case 3:
//                            double newPrice = CommandReader.readDouble("Введите новую цену: ");
//                            product.setPrice(BigDecimal.valueOf(newPrice));
//                            System.out.println(product);
//                            break;
//                        case 4:
//                            double newDiscount = CommandReader.readDouble("Введите новую скидку: ");
//                            product.setDiscount(BigDecimal.valueOf(newDiscount));
//                            System.out.println(product);
//                            break;
//                        case 5:
//                            String newDescription = CommandReader.readString("Введите новое описание: ");
//                            product.setDescription(newDescription);
//                            System.out.println(product);
//                            break;
//                        case 6:
//                            updateLoop = false;
//                            break;
//                        default:
//                            System.out.println("Такого варианта выбора нет, повторите его: ");
//                    }
//                }
//            }
//        }
//    }
//
//    public static void updateFromId(List<Product> productBase) {
//        System.out.println("---------------------");
//        int id = CommandReader.readNumber("Введите номер продукта: ");
//        for (Product product : productBase) {
//            if (product.getId() == id) {
//                String categoryChoice = CommandReader.readString("Введите одну из категорий 'ФРУКТЫ, ОВОЩИ, ЯГОДЫ': ");
//                categoryChoice = categoryChoice.toUpperCase();
//                Category category = Category.valueOf(categoryChoice);
//                product.setCategory(category);
//                String newName = CommandReader.readString("Введите новое название: ");
//                product.setName(newName);
//                double newPrice = CommandReader.readDouble("Введите новую цену: ");
//                product.setPrice(BigDecimal.valueOf(newPrice));
//                double newDiscount = CommandReader.readDouble("Введите новую скидку: ");
//                product.setDiscount(BigDecimal.valueOf(newDiscount));
//                String newDescription = CommandReader.readString("Введите новое описание: ");
//                product.setDescription(newDescription);
//            }
//        }
//        System.out.println("Изменения успешно внесены и сохранены.");
//    }
//
    public void showBase(Map<Long, Product> productMap) {

        for (Map.Entry<Long, Product> mapList: productMap.entrySet()){
            log.info("{}", mapList);
        }


    }

    public void baseCategory(Map<Long, Product> productMap) {
       StartMenu startMenu = new StartMenu();
        ImputNumberService imputNumberService = new ImputNumberService();
        boolean categorySelect = true;
        while (categorySelect) {
            startMenu.menuCategory();
            int category = imputNumberService.readNumber("Введите число");
            switch (category) {
                case 1:
                    Category fruits = Category.FRUITS;
                    for (Map.Entry<Long, Product> mapList: productMap.entrySet()){
                        if (mapList.getValue().getCategory().equals(fruits)) {
                            log.info("{}", mapList);
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
