package kasyanl.kasyanlfinalproject;

import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.service.menu.MenuStartService;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumber;

public class App {
    public static void main(String[] args) {
        MenuStartService menuStartService = new MenuStartService();
        InputNumber inputNumber = new InputNumber(System.in, System.out);
        ProductDataBase.createList();
        menuStartService.headMenu(inputNumber);

    }
}
