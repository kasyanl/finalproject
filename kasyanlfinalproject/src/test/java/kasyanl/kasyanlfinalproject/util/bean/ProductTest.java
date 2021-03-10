package kasyanl.kasyanlfinalproject.util.bean;

import kasyanl.kasyanlfinalproject.util.enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
    Product product;

    @Before
    public void setUp(){
        product = new Product();
    }

    @Test
    public void testEquals() {
        Product expected = new Product(2, Category.FRUITS, "Cocos", 20.0, 50.0, 10.0);
        Product actual = new Product(2, Category.FRUITS, "Cocos", 20.0, 50.0, 10.0);
        assertTrue(expected.equals(actual) && actual.equals(expected));
    }

    @Test
    public void testHashCode() {
        Product expected = new Product(2, Category.FRUITS, "Cocos", 20.0, 50.0, 10.0);
        Product actual = new Product(2, Category.FRUITS, "Cocos", 20.0, 50.0, 10.0);
        assertEquals(expected.hashCode(), actual.hashCode());
    }

    @Test
    public void testToString() {
        product.setId(2);
        product.setName("Cocos");
        product.setCategory(Category.FRUITS);
        product.setPrice(20.0000);
        product.setDiscount(50.0000);
        product.setActualPrice(10.0);
        String expected = "Продукт{" +
                "id = 2" +
                ", КАТЕГОРИЯ = Фрукты" +
                ", НАИМЕНОВАНИЕ = 'Cocos'" +
                ", ЦЕНА = 20.0 BYN" +
                ", СКИДКА = 50.0 %" +
                ", АКТУАЛЬНАЯ ЦЕНА = 10.0 BYN}";
        String actual = product.toString();
        assertEquals(expected, actual);
    }
}