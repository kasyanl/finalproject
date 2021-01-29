package kasyanl.kasyanlfinalproject.util.service.procces;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculaterActualPriceTest {
    Product product1;
    CalculaterActualPrice calculaterActualPrice;

    @Before
    public void setUp(){
        product1 = new Product();
        calculaterActualPrice = new CalculaterActualPrice(product1);
    }

    @Test
    public void calcuiating() {

        product1.setPrice(20.0);
        product1.setDiscount(50.0);
        double expected = 10.0;
        double actual = CalculaterActualPrice.calcuiating(20.0, 50.0);
        assertEquals(expected, actual, 0.0);
    }
}