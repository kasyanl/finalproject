package kasyanl.kasyanlfinalproject.util.repository;

import kasyanl.kasyanlfinalproject.util.bean.Product;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static kasyanl.kasyanlfinalproject.util.enums.Category.*;
import static org.junit.Assert.*;

public class ProductDataBaseTest implements ProductRepository {

    @Test
    public void createBase() {
        List<Product> list = new ArrayList<>();
        list.add(new Product(0, FRUITS, "Apple", 10.0, 50.0, 5.0));
        list.add(new Product(1, FRUITS, "Orange", 12.10, 10.0, 10.89));
        list.add(new Product(2, FRUITS, "Banana", 9.50, 20.0, 7.63));
        list.add(new Product(3, BERRIES, "Cherry", 25.00, 5.0, 23.75));
        list.add(new Product(4, BERRIES, "Marshmallow", 15.25, 60.0, 6.1));
        list.add(new Product(5, BERRIES, "Strawberry", 50.20, 15.0, 42.67));
        list.add(new Product(6, VEGETABLES, "Tomato", 5.50, 30.0, 3.85));
        list.add(new Product(7, VEGETABLES, "Cucumber", 3.20, 20.0, 2.56));
        list.add(new Product(8, VEGETABLES, "Onion", 10.10, 40.0, 6.06));
        list.add(new Product(9, MILK_PRODUCT, "Sour cream", 15.10, 10.0, 13.59));
        list.add(new Product(10, MILK_PRODUCT, "Curd", 25.00, 00.0, 25.00));
        list.add(new Product(11, MILK_PRODUCT, "Yogurt", 20.50, 10.0, 18.45));
        list.add(new Product(12, MEAT, "Pork", 50.20, 30.0, 35.14));
        list.add(new Product(13, MEAT, "Beef", 66.15, 00.0, 66.15));
        list.add(new Product(14, MEAT, "Chicken meat", 15.10, 00.0, 15.10));
        list.add(new Product(15, ALCOHOLIC_BEVERAGES, "Beer", 10.5, 00.0, 10.5));
        list.add(new Product(16, ALCOHOLIC_BEVERAGES, "Whisky", 100.00, 00.0, 100.00));
        list.add(new Product(17, ALCOHOLIC_BEVERAGES, "Wine", 40.10, 00.0, 40.10));

        List<Product> expected = ProductDataBase.createList();
        List<Product> actual = ProductDataBase.createList();
        assertEquals(expected, actual);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void utilityClassTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        final Constructor<ProductDataBase> constructor = ProductDataBase.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InvocationTargetException e) {
            throw (UnsupportedOperationException) e.getTargetException();
        }
    }
}

