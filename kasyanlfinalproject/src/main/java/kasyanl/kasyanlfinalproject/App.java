package kasyanl.kasyanlfinalproject;

import kasyanl.kasyanlfinalproject.util.menu.MenuStartService;
import kasyanl.kasyanlfinalproject.util.proccesor.InputNumber;

public class App {
    public static void main(String[] args) {
        InputNumber inputNumber = new InputNumber(System.in);
        MenuStartService.headMenu(inputNumber);

    }
}
