package kasyanl.kasyanlfinalproject.proccesor;

import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class UpdateCategoryServiceTest {


    @Test
    public void updateCategory() {

        InputNumber fru = Mockito.mock(InputNumber.class);
        InputNumber ber = Mockito.mock(InputNumber.class);
        InputNumber veg = Mockito.mock(InputNumber.class);
        InputNumber mil = Mockito.mock(InputNumber.class);
        InputNumber mea = Mockito.mock(InputNumber.class);
        InputNumber alc = Mockito.mock(InputNumber.class);
        InputNumber and = Mockito.mock(InputNumber.class);

        Mockito.when(fru.readNumber()).thenReturn(1);
        Mockito.when(ber.readNumber()).thenReturn(2);
        Mockito.when(veg.readNumber()).thenReturn(3);
        Mockito.when(mil.readNumber()).thenReturn(4);
        Mockito.when(mea.readNumber()).thenReturn(5);
        Mockito.when(alc.readNumber()).thenReturn(6);
        Mockito.when(and.readNumber()).thenReturn(8);

        assertEquals("FRUITS", UpdateCategoryService.updateCategory(fru));
        assertEquals("BERRIES", UpdateCategoryService.updateCategory(ber));
        assertEquals("VEGETABLES", UpdateCategoryService.updateCategory(veg));
        assertEquals("MILK_PRODUCT", UpdateCategoryService.updateCategory(mil));
        assertEquals("MEAT", UpdateCategoryService.updateCategory(mea));
        assertEquals("ALCOHOLIC_BEVERAGES", UpdateCategoryService.updateCategory(alc));
        assertEquals("Такого варианта выбора нет, повторите его:", UpdateCategoryService.updateCategory(and));
    }
    @Test(expected = UnsupportedOperationException.class)
    public void utilityClassTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        final Constructor<UpdateCategoryService> constructor = UpdateCategoryService.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InvocationTargetException e) {
            throw (UnsupportedOperationException) e.getTargetException();
        }
    }
}