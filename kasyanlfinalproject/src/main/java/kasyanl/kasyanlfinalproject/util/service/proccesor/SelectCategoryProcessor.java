package kasyanl.kasyanlfinalproject.util.service.proccesor;

public class SelectCategoryProcessor {

    public String selectNumberCategory(int number) {
        switch (number) {
            case 1:
                return "FRUITS";
            case 2:
                return "BERRIES";
            case 3:
                return"VEGETABLES";
            case 4:
                return "MILK_PRODUCT";
            case 5:
                return "MEAT";
            case 6:
                return "ALCOHOLIC_BEVERAGES";
            default:
                return "Такого варианта выбора нет, повторите его:";
        }
    }
}
