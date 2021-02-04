package kasyanl.kasyanlfinalproject.util.bean;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

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
        String expected = "Product{" +
                "id=2" +
                ",category=FRUITS" +
                ", name='Cocos'" +
                ", price=20.0 BYN" +
                ", discount=50.0 %" +
                ", actualPrice=10.0 BYN}";
        String actual = product.toString();
        assertEquals(expected, actual);
    }
}