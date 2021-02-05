package kasyanl.kasyanlfinalproject.util.menu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Menu {

    private Menu() {
        throw new UnsupportedOperationException();
    }

    static final Logger log = LoggerFactory.getLogger(Menu.class);
    public static final String ITERATOR = "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ";

    public static void firstMenu() {
        log.info("" +
                "\n{}" +
                "\nДля выбора действия, выберите пункт из меню и введите в консоль соответствующую цифру:" +
                "\n1. Получить список всех продуктов;" +
                "\n2. Получить список продуктов одной категории;" +
                "\n3. Найти информацию о продукте по ID;" +
                "\n4. Добавить новый продукт;" +
                "\n5. Удалить продукт;" +
                "\n6. Обновить информацию продукта;" +
                "\n7. Установить единую скидку для одной категории продуктов;" +
                "\n8. Отсортировать базу данных;" +
                "\n9. Выйти из программы." +
                "\n{}", ITERATOR, ITERATOR);
    }

    public static void menuCategory() {
        log.info("" +
                "\n{}" +
                "\nВыберите категорию продукта:" +
                "\n1. FRUITS," +
                "\n2. BERRIES," +
                "\n3. VEGETABLES" +
                "\n4. MILK_PRODUCT" +
                "\n5. MEAT" +
                "\n6. ALCOHOLIC_BEVERAGES" +
                "\n7. Возврат в главное меню." +
                "\n{}", ITERATOR, ITERATOR);

    }

    public static void menuUpdateProduct() {
        log.info("" +
                "\n{}" +
                "\nКакое действие вы желаете сделать?" +
                "\n1. Изменить категорию продукта." +
                "\n2. Изменить наименование продукта." +
                "\n3. Изменить цену продукта." +
                "\n4. Изменить скидку продукта." +
                "\n5. Выход в предыдущее меню." +
                "\n{}", ITERATOR, ITERATOR);
    }


    public static void menuSortDataBase() {
        log.info("" +
                "\n{}" +
                "\nКак отсортировать базу данных?" +
                "\n1. По названиям продуктов." +
                "\n2. По категориям." +
                "\n3. По первоначальной цене." +
                "\n4. По итоговой цене." +
                "\n5. По ID продуктов." +
                "\n{}", ITERATOR, ITERATOR);
    }

}
