package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProductServiceTest {

    Product product;

    @Before
    public void setUp(){
        product = new Product();
    }

    @Test
    public void creatProduct() {
        product.setId(0);
        product.setCategory(Category.FRUITS);
        product.setName("Apple");
        product.setPrice(20.0);
        product.setDiscount(50.0);
        Product expected = new Product(0, Category.FRUITS, "Apple", 20.0, 50.0, 10.0);
        Product actual = ProductService.creatProduct(Category.FRUITS, "Apple", 20.0, 50.0);

        assertEquals(expected, actual);
    }

//    @Test
//    public void creatProductByZeroSize(){
//
//        List<Product> expected = new ArrayList<>();
//        expected.add(ProductService.creatProduct(Category.FRUITS, "Apple", 20.0, 50.0));
//        expected.add(ProductService.creatProduct(Category.FRUITS, "Apple", 20.0, 50.0));
//
//        //Product expected = new Product(0, Category.FRUITS, "Cocos", 20.0, 50.0, 10.0);
//        Product actual = ProductService.creatProduct(Category.FRUITS, "Apple", 20.0, 50.0);
//        assertEquals(expected, actual);
//    }

    @Test
    public void readProduct() {

    }
}