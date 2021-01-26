package kasyanl.kasyanlfinalproject.menu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartMenu {

    final Logger log = LoggerFactory.getLogger(StartMenu.class);

    public void firstMenu(){
        System.out.println("______" +
                "\nЗдравствуйте! Вас приветствует Система учета продуктов." +
                "\nДля выбора действия, выберите пункт из меню и введите в консоль соответствующую цифру:" +
                "\n1. Добавить новый продукт;" +
                "\n2. Получить о группе продуктов по категории;" +
                "\n3. Получить список всех продуктов;" +
                "\n4. Удалить продукт.");
    }
    public void menuCategory() {
        System.out.println("Выберите категорию продукта:" +
                "\n1. FRUITS," +
                "\n2. BERRIES," +
                "\n3. VEGETABLES" +
                "\n4. Возврат в главное меню.");

    }

    public static void menuUpdateProduct() {
        System.out.println("Какое действие вы желаете сделать?"+
        "\n1. Изменить категорию продукта."+
        "\n2. Изменить наименование продукта."+
        "\n3. Изменить цену продукта."+
        "\n4. Изменить скидку продукта."+
        "\n5. Выход в предыдущее меню.");
    }

}
