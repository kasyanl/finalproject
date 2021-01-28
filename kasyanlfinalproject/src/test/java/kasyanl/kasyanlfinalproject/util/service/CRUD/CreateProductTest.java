package kasyanl.kasyanlfinalproject.util.service.CRUD;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreateProductTest {

    CreateProduct createProduct;
    Product product;

    @Before
    public void setUp(){
        createProduct = new CreateProduct();
        product = new Product();
    }

    @Test
    public void addProduct() {

    }

    @Test
    public void creatProduct() {
        product.setName("Cocos");
        product.setCategory(Category.FRUITS);
        product.setPrice(20.0);
        product.setDiscount(50.0);
        product.setActualPrice(10.0);

        Product expected = new Product (0, Category.FRUITS, "Cocos", 20.0,50.0,10.0);
        Product actual = CreateProduct.creatProduct(product.getCategory(), product.getName(), product.getPrice(), product.getDiscount(), product.getActualPrice());
        assertEquals(expected, actual);
    }

    @Test
    public void createNewProduct() {
        product.setName("Cocos");
        product.setCategory(Category.FRUITS);
        product.setPrice(20.0);
        product.setDiscount(50.0);
        product.setActualPrice(10.0);

        Product expected = new Product (1, Category.FRUITS, "Cocos", 20.0,50.0,10.0);
        Product actual = CreateProduct.creatProduct(product.getCategory(), product.getName(), product.getPrice(), product.getDiscount(), product.getActualPrice());
        assertEquals(expected, actual);
    }
}