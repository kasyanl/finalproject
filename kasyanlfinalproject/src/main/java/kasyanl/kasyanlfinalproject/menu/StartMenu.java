package kasyanl.kasyanlfinalproject.menu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartMenu {

    final Logger log = LoggerFactory.getLogger(StartMenu.class);

    public void firstMenu(){
        log.info("______" +
                "Здравствуйте! Вас приветствует Система учета продуктов." +
                "Для выбора действия, выберите пункт из меню и введите в консоль соответствующую цифру:" +
                "1. Добавить новый продукт;" +
                "2. Получить о группе продуктов по категории;" +
                "3. Получить список всех продуктов;" +
                "4. Удалить продукт.");
    }
    public void menuCategory() {
        log.info("Выберите категорию продукта:" +
                "\n1. FRUITS," +
                "\n2. BERRIES," +
                "\n3. VEGETABLES" +
                "\n4. Возврат в главное меню.");

    }

}
