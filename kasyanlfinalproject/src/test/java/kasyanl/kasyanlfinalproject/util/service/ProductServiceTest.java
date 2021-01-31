package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductServiceTest {

    Product product1;
    ProductService productService;

    @Before
    public void setUp(){
        product1 = new Product();
        productService = new ProductService(0, Category.FRUITS, "Apple", 20.0, 50.0, 10.0, product1);
    }

    @Test
    public void creatProduct() {
        product1.setId(0);
        product1.setCategory(Category.FRUITS);
        product1.setName("Apple");
        product1.setPrice(20.0);
        product1.setDiscount(50.0);
        Product expected = new Product(0, Category.FRUITS, "Apple", 20.0, 50.0, 10.0);
        Product actual = ProductService.creatProduct(Category.FRUITS, "Apple", 20.0, 50.0);

        assertEquals(expected, actual);
    }
}