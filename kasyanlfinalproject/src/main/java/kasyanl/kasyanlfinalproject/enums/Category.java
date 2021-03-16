package kasyanl.kasyanlfinalproject.enums;

public enum Category {
    ALCOHOLIC_BEVERAGES ("Алкогольные напитки"),
    BERRIES ("Ягоды"),
    FRUITS ("Фрукты"),
    MILK_PRODUCT ("Молочные продукты"),
    MEAT ("Мясо"),
    VEGETABLES ("Овощи");

    final String categoryName;

    Category(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return categoryName;
    }
}