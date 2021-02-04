package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FineCategoryTest {

    List<Product> newList;

    @Before
    public void setUp() {

        newList = new ArrayList<>();
        newList.add(new Product(0, Category.FRUITS, "Apple", 10.0, 50.0, 5.0));
        newList.add(new Product(1, Category.FRUITS, "Orange", 12.10, 10.0, 10.89));
        newList.add(new Product(2, Category.FRUITS, "Banana", 9.50, 20.0, 7.63));
        newList.add(new Product(3, Category.BERRIES, "Cherry", 25.00, 5.0, 23.75));
        newList.add(new Product(4, Category.BERRIES, "Marshmallow", 15.25, 60.0, 6.1));
        newList.add(new Product(5, Category.BERRIES, "Strawberry", 50.20, 15.0, 42.67));
        newList.add(new Product(6, Category.VEGETABLES, "Tomato", 5.50, 30.0, 3.85));
        newList.add(new Product(7, Category.VEGETABLES, "Cucumber", 3.20, 20.0, 2.56));
        newList.add(new Product(8, Category.VEGETABLES, "Onion", 10.10, 40.0, 6.06));
        newList.add(new Product(9, Category.MILK_PRODUCT, "Sour cream", 15.10, 10.0, 13.59));
        newList.add(new Product(10, Category.MILK_PRODUCT, "Curd", 25.00, 00.0, 25.00));
        newList.add(new Product(11, Category.MILK_PRODUCT, "Yogurt", 20.50, 10.0, 18.45));
        newList.add(new Product(12, Category.MEAT, "Pork", 50.20, 30.0, 35.14));
        newList.add(new Product(13, Category.MEAT, "Beef", 66.15, 00.0, 66.15));
        newList.add(new Product(14, Category.MEAT, "Chicken meat", 15.10, 00.0, 15.10));
        newList.add(new Product(15, Category.ALCOHOLIC_BEVERAGES, "Beer", 10.5, 00.0, 10.5));
        newList.add(new Product(16, Category.ALCOHOLIC_BEVERAGES, "Whisky", 100.00, 00.0, 100.00));
        newList.add(new Product(17, Category.ALCOHOLIC_BEVERAGES, "Wine", 40.10, 00.0, 40.10));
    }

    @Test
    public void fineCategoryForReadFruits() {
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(0, Category.FRUITS, "Apple", 10.0, 50.0, 5.0));
        expected.add(new Product(1, Category.FRUITS, "Orange", 12.10, 10.0, 10.89));
        expected.add(new Product(2, Category.FRUITS, "Banana", 9.50, 20.0, 7.63));

        List<Product> actual = FineCategoryProcessor.fineCategoryForRead(newList, Category.FRUITS);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }

    @Test
    public void fineCategoryForReadBERRIES() {
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(3, Category.BERRIES, "Cherry", 25.00, 5.0, 23.75));
        expected.add(new Product(4, Category.BERRIES, "Marshmallow", 15.25, 60.0, 6.1));
        expected.add(new Product(5, Category.BERRIES, "Strawberry", 50.20, 15.0, 42.67));

        List<Product> actual = FineCategoryProcessor.fineCategoryForRead(newList, Category.BERRIES);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }

    @Test
    public void fineCategoryForReadVEGETABLES() {
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(6, Category.VEGETABLES, "Tomato", 5.50, 30.0, 3.85));
        expected.add(new Product(7, Category.VEGETABLES, "Cucumber", 3.20, 20.0, 2.56));
        expected.add(new Product(8, Category.VEGETABLES, "Onion", 10.10, 40.0, 6.06));

        List<Product> actual = FineCategoryProcessor.fineCategoryForRead(newList, Category.VEGETABLES);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }

    @Test
    public void fineCategoryForReadMILK_PRODUCT() {
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(9, Category.MILK_PRODUCT, "Sour cream", 15.10, 10.0, 13.59));
        expected.add(new Product(10, Category.MILK_PRODUCT, "Curd", 25.00, 00.0, 25.00));
        expected.add(new Product(11, Category.MILK_PRODUCT, "Yogurt", 20.50, 10.0, 18.45));

        List<Product> actual = FineCategoryProcessor.fineCategoryForRead(newList, Category.MILK_PRODUCT);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }

    @Test
    public void fineCategoryForReadMEAT() {
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(12, Category.MEAT, "Pork", 50.20, 30.0, 35.14));
        expected.add(new Product(13, Category.MEAT, "Beef", 66.15, 00.0, 66.15));
        expected.add(new Product(14, Category.MEAT, "Chicken meat", 15.10, 00.0, 15.10));

        List<Product> actual = FineCategoryProcessor.fineCategoryForRead(newList, Category.MEAT);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }

    @Test
    public void fineCategoryForReadALCOHOLIC_BEVERAGES() {
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(15, Category.ALCOHOLIC_BEVERAGES, "Beer", 10.5, 00.0, 10.5));
        expected.add(new Product(16, Category.ALCOHOLIC_BEVERAGES, "Whisky", 100.00, 00.0, 100.00));
        expected.add(new Product(17, Category.ALCOHOLIC_BEVERAGES, "Wine", 40.10, 00.0, 40.10));

        List<Product> actual = FineCategoryProcessor.fineCategoryForRead(newList, Category.ALCOHOLIC_BEVERAGES);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }

    @Test
    public void fineCategoryForSelectDiscountFRUITS() {
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(0, Category.FRUITS, "Apple", 10.0, 50.0, 5.0));
        expected.add(new Product(1, Category.FRUITS, "Orange", 12.10, 50.0, 6.05));
        expected.add(new Product(2, Category.FRUITS, "Banana", 9.50, 50.0, 4.75));

        List<Product> actual = FineCategoryProcessor.fineCategoryForSelectDiscount(newList, Category.FRUITS, 50.0);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }

    @Test
    public void fineCategoryForSelectDiscountBERRIES() {
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(3, Category.BERRIES, "Cherry", 25.00, 50.0, 12.5));
        expected.add(new Product(4, Category.BERRIES, "Marshmallow", 15.25, 50.0, 7.625));
        expected.add(new Product(5, Category.BERRIES, "Strawberry", 50.20, 50.0, 25.10));

        List<Product> actual = FineCategoryProcessor.fineCategoryForSelectDiscount(newList, Category.BERRIES, 50.0);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }

    @Test
    public void fineCategoryForSelectDiscountVEGETABLES() {
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(6, Category.VEGETABLES, "Tomato", 5.50, 50.0, 2.75));
        expected.add(new Product(7, Category.VEGETABLES, "Cucumber", 3.20, 50.0, 1.60));
        expected.add(new Product(8, Category.VEGETABLES, "Onion", 10.10, 50.0, 5.05));

        List<Product> actual = FineCategoryProcessor.fineCategoryForSelectDiscount(newList, Category.VEGETABLES, 50.0);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }

    @Test
    public void fineCategoryForSelectDiscountMILK_PRODUCT() {
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(9, Category.MILK_PRODUCT, "Sour cream", 15.10, 50.0, 7.55));
        expected.add(new Product(10, Category.MILK_PRODUCT, "Curd", 25.00, 50.0, 25.00));
        expected.add(new Product(11, Category.MILK_PRODUCT, "Yogurt", 20.50, 50.0, 10.25));

        List<Product> actual = FineCategoryProcessor.fineCategoryForSelectDiscount(newList, Category.MILK_PRODUCT, 50.0);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }

    @Test
    public void fineCategoryForSelectDiscountMEAT() {
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(12, Category.MEAT, "Pork", 50.20, 50.0, 25.10));
        expected.add(new Product(13, Category.MEAT, "Beef", 66.15, 50.0, 30.075));
        expected.add(new Product(14, Category.MEAT, "Chicken meat", 15.10, 50.0, 7.55));

        List<Product> actual = FineCategoryProcessor.fineCategoryForSelectDiscount(newList, Category.MEAT, 50.0);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }

    @Test
    public void fineCategoryForSelectDiscountALCOHOLIC_BEVERAGES() {
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(15, Category.ALCOHOLIC_BEVERAGES, "Beer", 10.5, 50.0, 10.5));
        expected.add(new Product(16, Category.ALCOHOLIC_BEVERAGES, "Whisky", 100.00, 50.0, 100.00));
        expected.add(new Product(17, Category.ALCOHOLIC_BEVERAGES, "Wine", 40.10, 50.0, 40.10));

        List<Product> actual = FineCategoryProcessor.fineCategoryForSelectDiscount(newList, Category.ALCOHOLIC_BEVERAGES, 50.0);
        assertEquals(expected.equals(actual), actual.equals(expected));
    }

    @After
    public void tearDown() {
        newList.clear();

    }
    @Test(expected = UnsupportedOperationException.class)
    public void utilityClassTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        final Constructor<FineCategoryProcessor> constructor = FineCategoryProcessor.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InvocationTargetException e) {
            throw (UnsupportedOperationException) e.getTargetException();
        }
    }
}
