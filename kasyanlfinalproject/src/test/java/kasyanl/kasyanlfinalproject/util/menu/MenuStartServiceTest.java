package kasyanl.kasyanlfinalproject.util.menu;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MenuStartServiceTest {

    @Test(expected = UnsupportedOperationException.class)
    public void utilityClassTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        final Constructor<MenuStartService> constructor = MenuStartService.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InvocationTargetException e) {
            throw (UnsupportedOperationException) e.getTargetException();
        }
    }

}