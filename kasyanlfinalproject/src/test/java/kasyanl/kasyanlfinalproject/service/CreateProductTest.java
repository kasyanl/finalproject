package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.enums.Category;
import kasyanl.kasyanlfinalproject.bean.Product;
import kasyanl.kasyanlfinalproject.proccesor.InputNumber;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class CreateProductTest {

    @Test
    public void createNewProduct() {

        InputNumber input = Mockito.mock(InputNumber.class);
        Mockito.when(input.readNumber()).thenReturn(2);
        Mockito.when(input.readString()).thenReturn("Cocos");
        Mockito.when(input.readDouble()).thenReturn(20.0);

        Product expectedDiscout = new Product(0, Category.BERRIES, "Cocos", 20, 20.0, 16.0);
        Product actualDiscout = CreateProduct.createNewProduct(input);
        assertEquals(expectedDiscout, actualDiscout);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void utilityClassTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        final Constructor<CreateProduct> constructor = CreateProduct.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InvocationTargetException e) {
            throw (UnsupportedOperationException) e.getTargetException();
        }
    }
}