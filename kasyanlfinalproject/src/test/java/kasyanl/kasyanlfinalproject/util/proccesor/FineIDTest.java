package kasyanl.kasyanlfinalproject.util.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import static kasyanl.kasyanlfinalproject.util.bean.Category.FRUITS;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FineIDTest {

    Product product;

    @Before
    public void setUp() {
        product = new Product(2, FRUITS, "Banana", 10.00, 20.0, 8.0);
    }

    @Test
    public void fineProductByIDSelectCategory() {
        InputNumber inputNumber = mock(InputNumber.class);
        when(inputNumber.readNumber()).thenReturn(1);

        Product expected = new Product(2, FRUITS, "Banana", 10.00, 20.0, 8.0);
        Product actual = FineID.fineProductByID(inputNumber, product);
        assertEquals(expected, actual);
    }

    @Test
    public void fineProductByIDSelectName() {
        InputNumber inputNumber = mock(InputNumber.class);
        when(inputNumber.readNumber()).thenReturn(2);

        Product expected = new Product(2, FRUITS, null, 10.00, 20.0, 8.0);
        Product actual = FineID.fineProductByID(inputNumber, product);
        assertEquals(expected, actual);
    }

    @Test
    public void fineProductByIDSelectPrice() {
        InputNumber inputNumber = mock(InputNumber.class);
        when(inputNumber.readNumber()).thenReturn(3);

        Product expected = new Product(2, FRUITS, "Banana", 0.0, 20.0, 8.0);
        Product actual = FineID.fineProductByID(inputNumber, product);
        assertEquals(expected, actual);
    }

    @Test
    public void fineProductByIDSelectDiscount() {
        InputNumber inputNumber = mock(InputNumber.class);
        when(inputNumber.readNumber()).thenReturn(4);

        Product expected = new Product(2, FRUITS, "Banana", 10.00, 00.0, 10.0);
        Product actual = FineID.fineProductByID(inputNumber, product);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void utilityClassTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        final Constructor<FineID> constructor = FineID.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InvocationTargetException e) {
            throw (UnsupportedOperationException) e.getTargetException();
        }
    }
}