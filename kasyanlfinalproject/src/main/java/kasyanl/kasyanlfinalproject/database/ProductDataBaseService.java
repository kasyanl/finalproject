package kasyanl.kasyanlfinalproject.database;

import kasyanl.kasyanlfinalproject.bean.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.menu.StartMenu;
import kasyanl.kasyanlfinalproject.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.service.OutElements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.List;


public class ProductDataBaseService {
    final Logger log = LoggerFactory.getLogger(ProductDataBaseService.class);

    ImputNumberService imputNumberService = new ImputNumberService();
    Product product = new Product();
    OutElements outElements = new OutElements(product);

    public void deleteProduct(List<Product> listProduct) {
        int id = imputNumberService.readNumber("Введите ID продукта");
        Iterator<Product> productIterator = listProduct.iterator();
        while (productIterator.hasNext()) {
            Product nextProduct = productIterator.next();
            if (nextProduct.getId() == id) {
                productIterator.remove();
            }
        }
    }

    public void addProduct(List<Product> listProduct, Product product) {

        listProduct.add((int) product.getId(), product);
    }

    public void updateAnyProduct(List<Product> listProduct) {
        System.out.println("---------------------");
        int id = imputNumberService.readNumber("Введите ID продукта: ");
        boolean updateProduct = true;
        for (Product product : listProduct) {
            if (product.getId() == id) {
                System.out.println(product);
                while (updateProduct) {
                    StartMenu.menuUpdateProduct();
                    int select = imputNumberService.readNumber("Ваш выбор: ");
                    switch (select) {
                        case 1:
                            String categorySelect = imputNumberService.readString("Введите одну из категорий:" +
                                    "\nFRUITS,"+
                                    "\nBERRIES,"+
                                    "\nVEGETABLES");
                            categorySelect = categorySelect.toUpperCase();
                            Category category = Category.valueOf(categorySelect);
                           product.setCategory(category);
                            break;
                        case 2:
                            String newName = imputNumberService.readString("Введите новое название: ");
                            product.setName(newName);
                            log.info("{}", outElements.outValueProduct(listProduct, product));
                            break;
                        case 3:
                            double newPrice = imputNumberService.readDouble("Введите новую цену: ");
                            product.setPrice(newPrice);
                            log.info("{}", outElements.outValueProduct(listProduct, product));
                            break;
                        case 4:
                            double newDiscount = imputNumberService.readDouble("Введите новую скидку: ");
                            product.setDiscount(newDiscount);
                            log.info("{}", outElements.outValueProduct(listProduct, product));
                            break;
                        case 5:
                            updateProduct = false;
                            break;
                        default:
                            System.out.println("Такого варианта выбора нет, повторите его: ");
                    }
                }
            }
        }
    }

    public void updateFromId(List<Product> listProduct) {
        System.out.println("---------------------");
        int id =  imputNumberService.readNumber("Введите номер продукта: ");
        for (Product product : listProduct) {
            if (product.getId() ==id) {
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

    public void showBase(List<Product> listProduct) {

        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    public void showPersonalProduct(List<Product> listProduct) {
        OutElements outElements = new OutElements(product);
        int id = imputNumberService.readNumber("Введите ID продукта");
        Iterator<Product> productIterator = listProduct.iterator();
        while (productIterator.hasNext()) {
            Product product1 = productIterator.next();
            for (Product product : listProduct)
                if (product.getId()==id) {
                log.info("{}", outElements.outValueProduct(listProduct, product));
            }
        }
    }

    public void baseCategory(List<Product> listProduct) {
        OutElements outElements = new OutElements(product);
       boolean categorySelect = true;
        while (categorySelect) {
            StartMenu.menuCategory();
            int category = imputNumberService.readNumber("Выберите категорию");
            switch (category) {
                case 1:
                    Category fruits = Category.FRUITS;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(fruits)) {
                            log.info("{}", outElements.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 2:
                    Category berries = Category.BERRIES;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(berries)) {
                            log.info("{}", outElements.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 3:
                    Category vegetables = Category.VEGETABLES;
                    for (Product product : listProduct) {
                        if (product.getCategory().equals(vegetables)) {
                            log.info("{}", outElements.outValueProduct(listProduct, product));
                        }
                    }
                    break;
                case 4:
                    categorySelect = false;
                    break;
                default:
                    log.info(""+
                            "\n__________"+
                            "\n!!!Такого пункта не существует. Попробуйте выбрать еще раз!!!"+
                            "\n__________");
            }
        }
    }
}
