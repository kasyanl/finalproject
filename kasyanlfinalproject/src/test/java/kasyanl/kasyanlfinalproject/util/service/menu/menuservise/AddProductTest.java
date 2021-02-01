package kasyanl.kasyanlfinalproject.util.service.menu.menuservise;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AddProductTest {

    @Test
    public void addProduct() {

        List<Product> newList = new ArrayList<>();
        newList.add(new Product(0, Category.FRUITS, "Apple", 10.0, 50.0, 5.0));
        newList.add(new Product(1, Category.FRUITS, "Orange", 12.10, 10.0, 10.89));
        newList.add(new Product(2, Category.FRUITS, "Banana", 9.50, 20.0, 7.63));
        newList.add(new Product(3, Category.BERRIES, "Cherry", 25.00, 5.0, 23.75));

        List<Product> newList2 = new ArrayList<>();
        newList2.add(new Product(0, Category.FRUITS, "Apple", 10.0, 50.0, 5.0));
        newList2.add(new Product(1, Category.FRUITS, "Orange", 12.10, 10.0, 10.89));
        newList2.add(new Product(2, Category.FRUITS, "Banana", 9.50, 20.0, 7.63));

        List<Product> actual = AddProduct.addProduct(newList2, new Product(3, Category.BERRIES, "Cherry", 25.00, 5.0, 23.75));
   assertEquals(newList, actual);
    }
}