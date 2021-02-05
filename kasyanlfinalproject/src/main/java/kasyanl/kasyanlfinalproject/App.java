package kasyanl.kasyanlfinalproject;

import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.menu.MenuStartService;
import kasyanl.kasyanlfinalproject.util.proccesor.InputNumber;

public class App {

    public static void main(String[] args) {

        MenuStartService menuStartService = new MenuStartService();
        InputNumber inputNumber = new InputNumber(System.in);
        ProductDataBase.createList();
        menuStartService.headMenu(inputNumber);

    }
}
