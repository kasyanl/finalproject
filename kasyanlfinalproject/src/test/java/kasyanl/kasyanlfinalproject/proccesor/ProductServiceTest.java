package kasyanl.kasyanlfinalproject.proccesor;

import kasyanl.kasyanlfinalproject.enums.Category;
import kasyanl.kasyanlfinalproject.bean.Product;

import kasyanl.kasyanlfinalproject.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.repository.ProductRepository;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static kasyanl.kasyanlfinalproject.enums.Category.FRUITS;
import static org.junit.Assert.assertEquals;

public class ProductServiceTest {

    Product product1;

    @Before
    public void setUp() {
        product1 = new Product();
    }

    @Test
    public void creatProductNullPozition() {

        ProductService.deleteProduct(ProductDataBase.createList(), 5);

        Product expected = new Product(5, Category.BERRIES, "Strawberry", 50.20, 15.0, 42.67);
        Product actual = ProductService.creatProduct(Category.BERRIES, "Strawberry", 50.20, 15.0);

        assertEquals(expected, actual);
        ProductRepository.listProduct.clear();
    }

    @Test
    public void creatProduct() {

        Product expected = new Product(0, FRUITS, "Apple", 20.0, 50.0, 10.0);
        Product actual = ProductService.creatProduct(FRUITS, "Apple", 20.0, 50.0);

        assertEquals(expected, actual);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void utilityClassTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        final Constructor<ProductService> constructor = ProductService.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InvocationTargetException e) {
            throw (UnsupportedOperationException) e.getTargetException();
        }
    }
}