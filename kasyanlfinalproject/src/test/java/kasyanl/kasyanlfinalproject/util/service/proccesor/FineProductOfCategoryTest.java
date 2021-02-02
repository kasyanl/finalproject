package kasyanl.kasyanlfinalproject.util.service.proccesor;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FineProductOfCategoryTest {

    @Test
    public void selectCategoryByAllList1Category() {
        List<Product> newList = new ArrayList<>();
        newList.add(new Product(0, Category.FRUITS, "Apple", 10.0, 50.0, 5.0));
        newList.add(new Product(1, Category.FRUITS, "Orange", 12.10, 10.0, 10.89));
        newList.add(new Product(2, Category.FRUITS, "Banana", 9.50, 20.0, 7.63));

        List<Product> actual = FineProductOfCategoryProcessor.selectCategoryByAllList(newList, 1);
        assertEquals(newList, actual);
    }

    @Test
    public void selectCategoryByAllList2Category() {
        List<Product> newList = new ArrayList<>();
        newList.add(new Product(3, Category.BERRIES, "Cherry", 25.00, 5.0, 23.75));
        newList.add(new Product(4, Category.BERRIES, "Marshmallow", 15.25, 60.0, 6.1));
        newList.add(new Product(5, Category.BERRIES, "Strawberry", 50.20, 15.0, 42.67));

        List<Product> actual = FineProductOfCategoryProcessor.selectCategoryByAllList(newList, 2);
        assertEquals(newList, actual);
    }

    @Test
    public void selectCategoryByAllList3Category() {
        List<Product> newList = new ArrayList<>();

        newList.add(new Product(6, Category.VEGETABLES, "Tomato", 5.50, 30.0, 3.85));
        newList.add(new Product(7, Category.VEGETABLES, "Cucumber", 3.20, 20.0, 2.56));
        newList.add(new Product(8, Category.VEGETABLES, "Onion", 10.10, 40.0, 6.06));

        List<Product> actual = FineProductOfCategoryProcessor.selectCategoryByAllList(newList, 3);
        assertEquals(newList, actual);
    }

    @Test
    public void selectCategoryByAllList4Category() {
        List<Product> newList = new ArrayList<>();

        newList.add(new Product(9, Category.MILK_PRODUCT, "Sour cream", 15.10, 10.0, 13.59));
        newList.add(new Product(10, Category.MILK_PRODUCT, "Curd", 25.00, 00.0, 25.00));
        newList.add(new Product(11, Category.MILK_PRODUCT, "Yogurt", 20.50, 10.0, 18.45));

        List<Product> actual = FineProductOfCategoryProcessor.selectCategoryByAllList(newList, 4);
        assertEquals(newList, actual);
    }

    @Test
    public void selectCategoryByAllList5Category() {
        List<Product> newList = new ArrayList<>();
        newList.add(new Product(12, Category.MEAT, "Pork", 50.20, 30.0, 35.14));
        newList.add(new Product(13, Category.MEAT, "Beef", 66.15, 00.0, 66.15));
        newList.add(new Product(14, Category.MEAT, "Chicken meat", 15.10, 00.0, 15.10));

        List<Product> actual = FineProductOfCategoryProcessor.selectCategoryByAllList(newList, 5);
        assertEquals(newList, actual);
    }

    @Test
    public void selectCategoryByAllList6Category() {
        List<Product> newList = new ArrayList<>();

        newList.add(new Product(15, Category.ALCOHOLIC_BEVERAGES, "Beer", 10.5, 00.0, 10.5));
        newList.add(new Product(16, Category.ALCOHOLIC_BEVERAGES, "Whisky", 100.00, 00.0, 100.00));
        newList.add(new Product(17, Category.ALCOHOLIC_BEVERAGES, "Wine", 40.10, 00.0, 40.10));

        List<Product> actual = FineProductOfCategoryProcessor.selectCategoryByAllList(newList, 6);
        assertEquals(newList, actual);
    }

    @Test
    public void selectCategoryByAllListNoneCategory() {
        List<Product> newList = new ArrayList<>();
        newList.add(new Product(0, Category.FRUITS, "Apple", 10.0, 50.0, 5.0));
        newList.add(new Product(1, Category.FRUITS, "Orange", 12.10, 10.0, 10.89));
        newList.add(new Product(2, Category.FRUITS, "Banana", 9.50, 20.0, 7.63));

        List<Product> actual = FineProductOfCategoryProcessor.selectCategoryByAllList(newList, 9);
        assertEquals(newList, actual);
    }
}