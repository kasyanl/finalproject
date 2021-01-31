package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;

import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.menu.DeleteProduct;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static kasyanl.kasyanlfinalproject.util.bean.Category.*;
import static kasyanl.kasyanlfinalproject.util.bean.Category.ALCOHOLIC_BEVERAGES;
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
        Product expected = new Product(2, Category.FRUITS, "Apple", 20.0, 50.0, 10.0);
        Product actual = ProductService.creatProduct(Category.FRUITS, "Apple", 20.0, 50.0);

        assertEquals(expected, actual);
    }
    @Test
    public void deleteProduct() {
        List<Product> list = new ArrayList<>();
        list.add(new Product(0, FRUITS, "Apple", 10.0, 50.0, 5.0));
        list.add(new Product(1, FRUITS, "Orange", 12.10, 10.0, 10.89));
        list.add(new Product(3, BERRIES, "Cherry", 25.00, 5.0, 23.75));
        list.add(new Product(4, BERRIES, "Marshmallow", 15.25, 60.0, 6.1));
        list.add(new Product(5, BERRIES, "Strawberry", 50.20, 15.0, 42.67));
        list.add(new Product(6, VEGETABLES, "Tomato", 5.50, 30.0, 3.85));
        list.add(new Product(7, VEGETABLES, "Cucumber", 3.20, 20.0, 2.56));
        list.add(new Product(8, VEGETABLES, "Onion", 10.10, 40.0, 6.06));
        list.add(new Product(9, MILK_PRODUCT, "Sour cream", 15.10, 10.0, 13.59));
        list.add(new Product(10, MILK_PRODUCT, "Curd", 25.00, 00.0, 25.00));
        list.add(new Product(11, MILK_PRODUCT, "Yogurt", 20.50, 10.0, 18.45));
        list.add(new Product(12, MEAT, "Pork", 50.20, 30.0, 35.14));
        list.add(new Product(13, MEAT, "Beef", 66.15, 00.0, 66.15));
        list.add(new Product(14, MEAT, "Chicken meat", 15.10, 00.0, 15.10));
        list.add(new Product(15, ALCOHOLIC_BEVERAGES, "Beer", 10.5, 00.0, 10.5));
        list.add(new Product(16, ALCOHOLIC_BEVERAGES, "Whisky", 100.00, 00.0, 100.00));
        list.add(new Product(17, ALCOHOLIC_BEVERAGES, "Wine", 40.10, 00.0, 40.10));

        List<Product> expected = list;

        ProductDataBase.createList();
        List<Product> actual = ProductService.deleteProduct(ProductDataBase.listProduct, 2);
        assertEquals(expected, actual);
    }
}