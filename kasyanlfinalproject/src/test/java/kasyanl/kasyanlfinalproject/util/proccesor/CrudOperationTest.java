package kasyanl.kasyanlfinalproject.util.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;

import kasyanl.kasyanlfinalproject.util.repository.ProductDataBase;
import kasyanl.kasyanlfinalproject.util.repository.ProductInterface;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static kasyanl.kasyanlfinalproject.util.bean.Category.FRUITS;
import static org.junit.Assert.*;

public class CrudOperationTest {

    Product product1;

    @Before
    public void setUp() {
        product1 = new Product();
    }

    @Test
    public void creatProductNullPozition() {
        ProductDataBase.createList();
        CrudOperation.deleteProduct(ProductInterface.listProduct, 5);

        Product expected = new Product(5, Category.BERRIES, "Strawberry", 50.20, 15.0, 42.67);
        Product actual = CrudOperation.creatProduct(Category.BERRIES, "Strawberry", 50.20, 15.0);

        assertEquals(expected, actual);
        ProductInterface.listProduct.clear();
    }

    @Test
    public void creatProduct() {

        Product expected = new Product(0, FRUITS, "Apple", 20.0, 50.0, 10.0);
        Product actual = CrudOperation.creatProduct(FRUITS, "Apple", 20.0, 50.0);

        assertEquals(expected, actual);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void utilityClassTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        final Constructor<CrudOperation> constructor = CrudOperation.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InvocationTargetException e) {
            throw (UnsupportedOperationException) e.getTargetException();
        }
    }
}
