package kasyanl.kasyanlfinalproject;

import kasyanl.kasyanlfinalproject.util.menu.MenuStartService;
import kasyanl.kasyanlfinalproject.util.proccesor.InputNumber;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;

public class App {

    public static void main(String[] args) {

        InputNumber inputNumber = new InputNumber(System.in);
        ProductDataBase.createList();
        MenuStartService.headMenu(inputNumber);

    }
}
