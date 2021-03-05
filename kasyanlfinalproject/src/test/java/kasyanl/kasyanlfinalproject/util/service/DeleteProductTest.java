package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.proccesor.InputNumber;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DeleteProductTest {

    @Test
    public void deleteProductService() {

        InputNumber inputNumber = mock(InputNumber.class);
        when(inputNumber.readNumber()).thenReturn(2);

        List<Product> newList = new ArrayList<>();
        newList.add(new Product(0, Category.FRUITS, "Apple", 10.0, 50.0, 5.0));
        newList.add(new Product(1, Category.FRUITS, "Orange", 12.10, 10.0, 10.89));
        newList.add(new Product(2, Category.FRUITS, "Banana", 9.50, 20.0, 7.63));
        newList.add(new Product(3, Category.BERRIES, "Cherry", 25.00, 5.0, 23.75));

        List<Product> expected = new ArrayList<>();
        expected.add(new Product(0, Category.FRUITS, "Apple", 10.0, 50.0, 5.0));
        expected.add(new Product(1, Category.FRUITS, "Orange", 12.10, 10.0, 10.89));
        expected.add(new Product(3, Category.BERRIES, "Cherry", 25.00, 5.0, 23.75));

        List<Product> actual = DeleteProduct.deleteProductService(newList, inputNumber);
        assertEquals(expected, actual);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void utilityClassTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        final Constructor<DeleteProduct> constructor = DeleteProduct.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InvocationTargetException e) {
            throw (UnsupportedOperationException) e.getTargetException();
        }
    }
}