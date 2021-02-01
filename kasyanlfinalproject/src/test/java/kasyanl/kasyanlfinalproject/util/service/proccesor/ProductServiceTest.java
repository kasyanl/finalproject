package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;

import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import kasyanl.kasyanlfinalproject.util.service.proccesor.ProductService;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static kasyanl.kasyanlfinalproject.util.bean.Category.BERRIES;
import static org.junit.Assert.*;

public class ProductServiceTest {

    Product product1;
    ProductService productService;

    @Before
    public void setUp() {
        product1 = new Product();
        productService = new ProductService(0, Category.FRUITS, "Apple", 20.0, 50.0, 10.0, product1);
    }

    @Test
    public void creatProductNullPozition() {
        ProductDataBase.createList();
        ProductService.deleteProduct(ProductInterface.listProduct, 5);

        Product expected = new Product(0, Category.BERRIES, "Strawberry", 50.20, 15.0, 42.67);
        Product actual = ProductService.creatProduct(Category.BERRIES, "Strawberry", 50.20, 15.0);

        assertEquals(expected, actual);
        ProductInterface.listProduct.clear();
    }

    @Test
    public void creatProduct() {

        Product expected = new Product(0, Category.FRUITS, "Apple", 20.0, 50.0, 10.0);
        Product actual = ProductService.creatProduct(Category.FRUITS, "Apple", 20.0, 50.0);

        assertEquals(expected, actual);
    }

    @Test
    public void deleteProduct() {
        List<Product> newList = new ArrayList<>();
        newList.add(new Product(0, Category.FRUITS, "Apple", 10.0, 50.0, 5.0));
        newList.add(new Product(1, Category.FRUITS, "Orange", 12.10, 10.0, 10.89));
        newList.add(new Product(2, Category.FRUITS, "Banana", 9.50, 20.0, 7.63));
        newList.add(new Product(3, Category.BERRIES, "Cherry", 25.00, 5.0, 23.75));

        List<Product> newList2 = new ArrayList<>();
        newList2.add(new Product(0, Category.FRUITS, "Apple", 10.0, 50.0, 5.0));
        newList2.add(new Product(1, Category.FRUITS, "Orange", 12.10, 10.0, 10.89));
        newList2.add(new Product(2, Category.FRUITS, "Banana", 9.50, 20.0, 7.63));

        List<Product> actual = ProductService.deleteProduct(newList, 3);
        assertEquals(newList2, actual);

    }
}
