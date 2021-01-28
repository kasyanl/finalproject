package kasyanl.kasyanlfinalproject.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartMenu {

    private StartMenu() {
    }

    static final Logger log = LoggerFactory.getLogger(StartMenu.class);

    public static void firstMenu() {
        log.info("" +
                "\n" +
                "\nЗдравствуйте! Вас приветствует Система учета продуктов." +
                "\nДля выбора действия, выберите пункт из меню и введите в консоль соответствующую цифру:" +
                "\n1. Получить список всех продуктов;" +
                "\n2. Получить о группе продуктов по категории;" +
                "\n3. Получить информацию о конкретном продукте по ID;" +
                "\n4. Добавить новый продукт;" +
                "\n5. Удалить продукт;" +
                "\n6. Обновить информацию о продукте;" +
                "\n7. Установить единую скидку для одной категории продуктов," +
                "\n8. Выйти из программы.");
    }

    public static void menuCategory() {
        log.info("" +
                "\n" +
                "\nВыберите категорию продукта:" +
                "\n1. FRUITS," +
                "\n2. BERRIES," +
                "\n3. VEGETABLES" +
                "\n4. MILK_PRODUCT" +
                "\n5. MEAT" +
                "\n6. ALCOHOLIC_BEVERAGES" +
                "\n7. Возврат в главное меню.");

    }

    public static void menuUpdateProduct() {
        log.info("" +
                "\n" +
                "\nВыберите действие:" +
                "\n1. Изменить категорию продукта." +
                "\n2. Изменить наименование продукта." +
                "\n3. Изменить цену продукта." +
                "\n4. Изменить скидку продукта." +
                "\n5. Выход в предыдущее меню.");
    }
}

