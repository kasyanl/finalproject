package kasyanl.kasyanlfinalproject.util.menu;

import lombok.extern.slf4j.Slf4j;

import static kasyanl.kasyanlfinalproject.util.enums.MessageFormat.EMPTY_STRING;
import static kasyanl.kasyanlfinalproject.util.enums.MessageFormat.LINE_STRING;

@Slf4j
public final class MainMenu {

    private MainMenu() {
        throw new UnsupportedOperationException();
    }

    public static void headMenu() {
        log.info("{}{} Для выбора действия, выберите пункт из меню и введите в консоль соответствующую цифру:" +
                "\n1. Получить список всех продуктов;" +
                "\n2. Получить список продуктов одной категории;" +
                "\n3. Найти информацию о продукте по ID;" +
                "\n4. Добавить новый продукт;" +
                "\n5. Удалить продукт;" +
                "\n6. Обновить информацию продукта;" +
                "\n7. Установить единую скидку для одной категории продуктов;" +
                "\n8. Отсортировать базу данных;" +
                "\n9. Выйти из программы.{}", EMPTY_STRING, LINE_STRING, LINE_STRING);
    }

    public static void menuCategory() {
        log.info("{}{} Выберите категорию продукта:" +
                "\n1. Фрукты," +
                "\n2. Ягоды," +
                "\n3. Овощи" +
                "\n4. Молочные продукты" +
                "\n5. Мясо" +
                "\n6. Алкогольные напитки" +
                "\n7. Возврат в главное меню.{}", EMPTY_STRING, LINE_STRING, LINE_STRING);

    }

    public static void menuUpdateProduct() {
        log.info("{}{} Какое действие вы желаете сделать?" +
                "\n1. Изменить категорию продукта." +
                "\n2. Изменить наименование продукта." +
                "\n3. Изменить цену продукта." +
                "\n4. Изменить скидку продукта." +
                "\n5. Выход в предыдущее меню. {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
    }

    public static void menuSortDataBase() {
        log.info("{}{} Как отсортировать базу данных?" +
                "\n1. По названиям продуктов." +
                "\n2. По категориям." +
                "\n3. По первоначальной цене." +
                "\n4. По итоговой цене." +
                "\n5. По ID продуктов. {}", EMPTY_STRING, LINE_STRING, LINE_STRING);
    }
}