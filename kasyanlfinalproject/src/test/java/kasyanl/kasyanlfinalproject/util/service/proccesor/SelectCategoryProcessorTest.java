package kasyanl.kasyanlfinalproject.util.service.proccesor;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class SelectCategoryProcessorTest {

    @Test
    public void selectNumberCategory() {

        assertEquals("FRUITS", SelectCategoryProcessor.selectNumberCategory(1));
        assertEquals("BERRIES", SelectCategoryProcessor.selectNumberCategory(2));
        assertEquals("VEGETABLES", SelectCategoryProcessor.selectNumberCategory(3));
        assertEquals("MILK_PRODUCT", SelectCategoryProcessor.selectNumberCategory(4));
        assertEquals("MEAT", SelectCategoryProcessor.selectNumberCategory(5));
        assertEquals("ALCOHOLIC_BEVERAGES", SelectCategoryProcessor.selectNumberCategory(6));
        assertEquals("Такого варианта выбора нет, повторите его:", SelectCategoryProcessor.selectNumberCategory(10));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void utilityClassTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        final Constructor<SelectCategoryProcessor> constructor = SelectCategoryProcessor.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InvocationTargetException e) {
            throw (UnsupportedOperationException) e.getTargetException();
        }
    }
}