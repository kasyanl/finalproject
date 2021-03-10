package kasyanl.kasyanlfinalproject.util.proccesor;

import kasyanl.kasyanlfinalproject.util.enums.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FinePersonalProductTest {

    @Test
    public void personalProductProcessor() {

        List<Product> newList = new ArrayList<>();
        newList.add(new Product(7, Category.VEGETABLES, "Cucumber", 3.20, 20.0, 2.56));
        newList.add(new Product(8, Category.VEGETABLES, "Onion", 10.10, 40.0, 6.06));
        newList.add(new Product(9, Category.MILK_PRODUCT, "Sour cream", 15.10, 10.0, 13.59));
        newList.add(new Product(10, Category.MILK_PRODUCT, "Curd", 25.00, 00.0, 25.00));
        newList.add(new Product(11, Category.MILK_PRODUCT, "Yogurt", 20.50, 10.0, 18.45));
        newList.add(new Product(12, Category.MEAT, "Pork", 50.20, 30.0, 35.14));
        newList.add(new Product(13, Category.MEAT, "Beef", 66.15, 00.0, 66.15));
        newList.add(new Product(14, Category.MEAT, "Chicken meat", 15.10, 00.0, 15.10));

        Product expected = new Product(11, Category.MILK_PRODUCT, "Yogurt", 20.50, 10.0, 18.45);
        Product actual = FinePersonalProduct.personalProductProcessor(newList, 11);
        assertEquals(expected, actual);
    }

    @Test
    public void personalProductProcessorNotId() {

        List<Product> newList = new ArrayList<>();
        newList.add(new Product(7, Category.VEGETABLES, "Cucumber", 3.20, 20.0, 2.56));
        newList.add(new Product(8, Category.VEGETABLES, "Onion", 10.10, 40.0, 6.06));
        newList.add(new Product(9, Category.MILK_PRODUCT, "Sour cream", 15.10, 10.0, 13.59));
        newList.add(new Product(10, Category.MILK_PRODUCT, "Curd", 25.00, 00.0, 25.00));
        newList.add(new Product(11, Category.MILK_PRODUCT, "Yogurt", 20.50, 10.0, 18.45));
        newList.add(new Product(12, Category.MEAT, "Pork", 50.20, 30.0, 35.14));
        newList.add(new Product(13, Category.MEAT, "Beef", 66.15, 00.0, 66.15));
        newList.add(new Product(14, Category.MEAT, "Chicken meat", 15.10, 00.0, 15.10));

        Product expected = new Product();
        Product actual = FinePersonalProduct.personalProductProcessor(newList, 20);
        assertEquals(expected, actual);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void utilityClassTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        final Constructor<FinePersonalProduct> constructor = FinePersonalProduct.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InvocationTargetException e) {
            throw (UnsupportedOperationException) e.getTargetException();
        }
    }
}