package kasyanl.kasyanlfinalproject.database;

import kasyanl.kasyanlfinalproject.bean.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ProductDataBaseServiceTest {

    Product product1;
    Map<Long, Product> productMap;
    ProductDataBaseService productDataBaseService;

    @Before
    public void setUp(){
        product1 = new Product();
        productMap = new HashMap<>();
        productDataBaseService = new ProductDataBaseService();
    }

    @Test
    public void deleteProduct() {
    }

    @Test
    public void addProduct() {
    }

    @Test
    public void showBase() {
    }

    @Test
    public void baseCategory() {
    }
}