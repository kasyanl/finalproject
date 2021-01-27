package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static kasyanl.kasyanlfinalproject.util.bean.Category.FRUITS;
import static org.junit.Assert.*;

public class OutElementsServiceTest {

    OutElementsService outElementsService;
    Product product1;
    List<Product> listProduct;

    @Before
    public void setUp(){
        product1 = new Product();
        outElementsService = new OutElementsService(product1);

        listProduct = new ArrayList<>();
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
        String actual = OutElementsService.outValueProduct(listProduct, product1);
        assertEquals(expected, actual);
    }

}