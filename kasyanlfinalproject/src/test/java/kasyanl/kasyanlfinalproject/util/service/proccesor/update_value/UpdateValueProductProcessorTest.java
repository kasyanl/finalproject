package kasyanl.kasyanlfinalproject.util.service.proccesor.update_value;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.service.proccesor.InputNumber;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static kasyanl.kasyanlfinalproject.util.bean.Category.BERRIES;
import static kasyanl.kasyanlfinalproject.util.bean.Category.FRUITS;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UpdateValueProductProcessorTest {

    Product product;

    @Before
    public void setUp() {
        product = new Product(2, FRUITS, "Banana", 10.00, 20.0, 8.0);
    }

    @Test
    public void selectCategory() {
        InputNumber inputNumber = mock(InputNumber.class);
        when(inputNumber.readNumber()).thenReturn(2);

        Product expected = new Product(2, BERRIES, "Banana", 10.00, 20.0, 8.0);
        Product actual = UpdateValueProductProcessor.selectCategory(inputNumber, product);
        assertEquals(expected, actual);
    }

    @Test
    public void selectName() {
        InputNumber inputNumber = mock(InputNumber.class);
        when(inputNumber.readString()).thenReturn("Cocos");

        Product expected = new Product(2, FRUITS, "Cocos", 10.00, 20.0, 8.0);
        Product actual = UpdateValueProductProcessor.selectName(inputNumber, product);
        assertEquals(expected, actual);
    }

    @Test
    public void selectPrice() {
        InputNumber inputNumber = mock(InputNumber.class);
        when(inputNumber.readDouble()).thenReturn(20.0);

        Product expected = new Product(2, FRUITS, "Banana", 20.00, 20.0, 16.0);
        Product actual = UpdateValueProductProcessor.selectPrice(inputNumber, product);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }

    @Test
    public void selectDiscount() {
        InputNumber inputNumber = mock(InputNumber.class);
        when(inputNumber.readDouble()).thenReturn(40.0);

        Product expected = new Product(2, FRUITS, "Banana", 10.00, 40.0, 6.0);
        Product actual = UpdateValueProductProcessor.selectDiscount(inputNumber, product);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }
    @Test(expected = UnsupportedOperationException.class)
    public void utilityClassTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        final Constructor<UpdateValueProductProcessor> constructor = UpdateValueProductProcessor.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InvocationTargetException e) {
            throw (UnsupportedOperationException) e.getTargetException();
        }
    }
}