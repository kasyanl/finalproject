package kasyanl.kasyanlfinalproject.menu;

import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.database.ProductDataBase;
import kasyanl.kasyanlfinalproject.database.ProductDataBaseService;
import kasyanl.kasyanlfinalproject.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.service.ProductService;

import java.util.Map;

public class MenuStartService {



    public static void headMenu() {
        StartMenu startMenu = new StartMenu();
        ImputNumberService imputNumberService = new ImputNumberService();
        ProductDataBaseService productDataBaseService = new ProductDataBaseService();
        boolean mainLoop = true;
        
        Map<Long, Product> productMap = ProductDataBase.createBase();
        while (mainLoop) {
            startMenu.firstMenu();
            int imputMemu = imputNumberService.readNumber("Смелее!!");
            switch (imputMemu) {
                case 1:
                    productDataBaseService.addProduct(productMap, ProductService.createNewProduct(productMap));
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
