package kasyanl.kasyanlfinalproject.util.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.menu.MenuSort;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static kasyanl.kasyanlfinalproject.util.bean.Category.*;
import static org.junit.Assert.*;

public class MenuSortTest {

    List<Product> newList;

    @Before
    public void setUp(){

        newList = new ArrayList<>();
        newList.add(new Product(16, ALCOHOLIC_BEVERAGES, "Whisky", 100.00, 00.0, 100.00));
        newList.add(new Product(6, VEGETABLES, "Tomato", 5.50, 30.0, 3.85));
        newList.add(new Product(0, FRUITS, "Apple", 10.0, 50.0, 5.0));
    }

    @Test
    public void sortProductByName() {
        InputNumber inputNumber = Mockito.mock(InputNumber.class);
        Mockito.when(inputNumber.readNumber()).thenReturn(1);

        List<Product> expected = new ArrayList<>();
        expected.add(new Product(0, FRUITS, "Apple", 10.0, 50.0, 5.0));
        expected.add(new Product(6, VEGETABLES, "Tomato", 5.50, 30.0, 3.85));
        expected.add(new Product(16, ALCOHOLIC_BEVERAGES, "Whisky", 100.00, 00.0, 100.00));

        List<Product> actual = MenuSort.sortProduct(newList, inputNumber);
        assertEquals(expected, actual);
    }

    @Test
    public void sortProductByCategory() {
        InputNumber inputNumber = Mockito.mock(InputNumber.class);
        Mockito.when(inputNumber.readNumber()).thenReturn(2);

        List<Product> expected = new ArrayList<>();
        expected.add(new Product(16, ALCOHOLIC_BEVERAGES, "Whisky", 100.00, 00.0, 100.00));
        expected.add(new Product(0, FRUITS, "Apple", 10.0, 50.0, 5.0));
        expected.add(new Product(6, VEGETABLES, "Tomato", 5.50, 30.0, 3.85));

        List<Product> actual = MenuSort.sortProduct(newList, inputNumber);
        assertEquals(expected, actual);
    }
    @Test
    public void sortProductByPrice() {
        InputNumber inputNumber = Mockito.mock(InputNumber.class);
        Mockito.when(inputNumber.readNumber()).thenReturn(3);

        List<Product> expected = new ArrayList<>();
        expected.add(new Product(6, VEGETABLES, "Tomato", 5.50, 30.0, 3.85));
        expected.add(new Product(0, FRUITS, "Apple", 10.0, 50.0, 5.0));
        expected.add(new Product(16, ALCOHOLIC_BEVERAGES, "Whisky", 100.00, 00.0, 100.00));

        List<Product> actual = MenuSort.sortProduct(newList, inputNumber);
        assertEquals(expected, actual);
    }
    @Test
    public void sortProductByActualPrice() {
        InputNumber inputNumber = Mockito.mock(InputNumber.class);
        Mockito.when(inputNumber.readNumber()).thenReturn(4);

        List<Product> expected = new ArrayList<>();
        expected.add(new Product(6, VEGETABLES, "Tomato", 5.50, 30.0, 3.85));
        expected.add(new Product(0, FRUITS, "Apple", 10.0, 50.0, 5.0));
        expected.add(new Product(16, ALCOHOLIC_BEVERAGES, "Whisky", 100.00, 00.0, 100.00));

        List<Product> actual = MenuSort.sortProduct(newList, inputNumber);
        assertEquals(expected, actual);
    }
    @Test
    public void sortProductById() {
        InputNumber inputNumber = Mockito.mock(InputNumber.class);
        Mockito.when(inputNumber.readNumber()).thenReturn(5);

        List<Product> expected = new ArrayList<>();
        expected.add(new Product(0, FRUITS, "Apple", 10.0, 50.0, 5.0));
        expected.add(new Product(6, VEGETABLES, "Tomato", 5.50, 30.0, 3.85));
        expected.add(new Product(16, ALCOHOLIC_BEVERAGES, "Whisky", 100.00, 00.0, 100.00));

        List<Product> actual = MenuSort.sortProduct(newList, inputNumber);
        assertEquals(expected, actual);
    }
    @Test
    public void sortProductByFalse() {
        InputNumber inputNumber = Mockito.mock(InputNumber.class);
        Mockito.when(inputNumber.readNumber()).thenReturn(8);

        List<Product> expected = new ArrayList<>();
        expected.add(new Product(16, ALCOHOLIC_BEVERAGES, "Whisky", 100.00, 00.0, 100.00));
        expected.add(new Product(6, VEGETABLES, "Tomato", 5.50, 30.0, 3.85));
        expected.add(new Product(0, FRUITS, "Apple", 10.0, 50.0, 5.0));

        List<Product> actual = MenuSort.sortProduct(newList, inputNumber);
        assertEquals(expected, actual);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void utilityClassTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        final Constructor<MenuSort> constructor = MenuSort.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InvocationTargetException e) {
            throw (UnsupportedOperationException) e.getTargetException();
        }
    }
}