package kasyanl.kasyanlfinalproject.menu;

import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.database.ProductDataBase;
import kasyanl.kasyanlfinalproject.database.ProductDataBaseService;
import kasyanl.kasyanlfinalproject.service.ImputNumberService;
import kasyanl.kasyanlfinalproject.service.ProductService;

import java.util.ArrayList;
import java.util.List;



public class MenuStartService {

    Product product = new Product();
    ProductService productService = new ProductService();
    StartMenu startMenu = new StartMenu();
    ImputNumberService imputNumberService = new ImputNumberService();
    ProductDataBaseService productDataBaseService = new ProductDataBaseService();
    List<Product> listProduct = new ArrayList<>();

    public void headMenu() {

        boolean mainLoop = true;
        listProduct = ProductDataBase.createBase();
        while (mainLoop) {
            startMenu.firstMenu();
            int imputedMenu  = imputNumberService.readNumber("__________");
            switch (imputedMenu) {
                case 1:
                    productDataBaseService.showBase(listProduct);
                    break;
                case 2:
                    productDataBaseService.baseCategory(listProduct);
                    break;
                case 3:
                    productDataBaseService.showPersonalProduct(listProduct);
                    break;
                case 4:
                    productDataBaseService.addProduct(listProduct, productService.createNewProduct(listProduct));
                    productDataBaseService.showBase(listProduct);
                    break;
                case 5:
                    productDataBaseService.deleteProduct(listProduct);
                    break;
                case 6:
                    productDataBaseService.updateAnyProduct(listProduct);
                    break;
                case 7:
                    mainLoop = false;
                    System.out.println("Спасибо, что пользовались нашими услугами ))))");
                    break;
                default:
                    System.out.println("Такого варианта выбора нет, повторите его: ");
            }
        }
    }
}
