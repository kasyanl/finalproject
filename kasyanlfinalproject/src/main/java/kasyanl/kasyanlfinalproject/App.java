package kasyanl.kasyanlfinalproject;

import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.service.menu.MenuStartService;

public class App {
    public static void main(String[] args) {
        MenuStartService menuStartService = new MenuStartService();
        ProductDataBase.createList();
        menuStartService.headMenu();

    }
}
