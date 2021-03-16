package kasyanl.kasyanlfinalproject.enums;

public enum MessageFormat {
    LINE_STRING("\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n"),
    EMPTY_STRING ("\n"),
    DISCOUNT_MESSAGE ("\n"+
            "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n"+
            "Введите новую скидку для категории (%):\n"+
            "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ "),
    SELECT_NON_FOUND ("\"\\n\"+\n" +
            "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n" +
            "Такого выбора не существует, попробуйте еще раз\n"+
            "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");

    final String message;

    MessageFormat(String categoryName) {
        this.message = categoryName;
    }

    @Override
    public String toString() {
        return message;
    }
}