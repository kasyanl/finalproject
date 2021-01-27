package kasyanl.kasyanlfinalproject.menu;

import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.database.ProductDataBase;
import kasyanl.kasyanlfinalproject.database.ProductDataBaseService;
import kasyanl.kasyanlfinalproject.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.service.ProductService;

import java.util.HashMap;
import java.util.Map;


public class MenuStartService {

    Product product = new Product();
    ProductService productService = new ProductService();
    StartMenu startMenu = new StartMenu();
    ImputNumberService imputNumberService = new ImputNumberService();
    ProductDataBaseService productDataBaseService = new ProductDataBaseService();
    Map<Long, Product> productMap = new HashMap<>();

    public void headMenu() {

        boolean mainLoop = true;
        productMap = ProductDataBase.createBase();
        while (mainLoop) {
            startMenu.firstMenu();
            int imputedMenu  = imputNumberService.readNumber("__________");
            switch (imputedMenu) {
                case 1:
                    productDataBaseService.addProduct(productMap, productService.createNewProduct(productMap, product));
                    productDataBaseService.showBase(productMap);
                   // productDataBaseService.addProduct(productMap, productService.createNewProduct(productMap));
                    break;
                case 2:
                    productDataBaseService.baseCategory(productMap);
                    break;
                case 3:
                    productDataBaseService.showBase(productMap);
                    break;

                case 4:
                    productDataBaseService.deleteProduct(productMap);
                    break;
                case 5:
                    mainLoop = false;
                    System.out.println("Спасибо, что пользовались нашими услугами ))))");
                    break;
                default:
                    System.out.println("Такого варианта выбора нет, повторите его: ");
            }
        }
    }
}
