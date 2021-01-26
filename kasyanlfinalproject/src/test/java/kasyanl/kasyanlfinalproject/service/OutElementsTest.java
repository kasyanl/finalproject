package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.bean.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


import static kasyanl.kasyanlfinalproject.bean.Category.FRUITS;
import static org.junit.Assert.*;

public class OutElementsTest {

    OutElements outElements;
    Product product1;
    Map<Long, Product> productMap;

    @Before
    public void setUp(){
        product1 = new Product();
        outElements = new OutElements();

        productMap = new HashMap<>();
    }

    @Test
    public void outValueProduct() {

        product1.setId(1L);
        product1.setCategory(FRUITS);
        product1.setName("Apple");
        product1.setPrice(10.0);
        product1.setDiscount(50.0);

        String expected = "Product information:" +
                "\nId: 1" +
                "\nCategory: FRUITS" +
                "\nName: Apple" +
                "\nRegular price: 10.0" +
                "\nDiscount: 50.0%" +
                "\nActual price: 5.0";
        String actual = outElements.outValueProduct(productMap, product1);
        assertEquals(expected, actual);
    }

    @Test
    public void calculating() {

        product1.setPrice(10.0);
        product1.setDiscount(50);
        double expected = 5.0;
        double actual = outElements.calculating();
        assertEquals(expected, actual, 0.0);
    }
}