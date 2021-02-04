package kasyanl.kasyanlfinalproject.util.service.menu;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MenuTest {

    @Test(expected = UnsupportedOperationException.class)
    public void utilityClassTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        final Constructor<Menu> constructor = Menu.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InvocationTargetException e) {
            throw (UnsupportedOperationException) e.getTargetException();
        }
    }
}