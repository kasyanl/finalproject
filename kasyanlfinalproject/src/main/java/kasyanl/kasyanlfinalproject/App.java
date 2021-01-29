package kasyanl.kasyanlfinalproject;

import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.service.MenuStartService;

public class App {
    public static void main(String[] args) {
        MenuStartService menuStartService = new MenuStartService();

        ProductDataBase.createBase();
        menuStartService.headMenu();

    }
}
