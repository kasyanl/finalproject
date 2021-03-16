package kasyanl.kasyanlfinalproject;

import kasyanl.kasyanlfinalproject.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.menu.MenuStartService;
import kasyanl.kasyanlfinalproject.proccesor.InputNumber;

public class App {

    public static void main(String[] args) {

        InputNumber inputNumber = new InputNumber(System.in);
        ProductDataBase.createList();
        MenuStartService.headMenu(inputNumber);
    }
}