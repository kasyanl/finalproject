package kasyanl.kasyanlfinalproject.util.service;

import kasyanl.kasyanlfinalproject.util.bean.Category;
import kasyanl.kasyanlfinalproject.util.bean.Product;
import kasyanl.kasyanlfinalproject.util.proccesor.InputNumber;
import kasyanl.kasyanlfinalproject.util.service.CreateProduct;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CreateProductTest {

    @Test
    public void createNewProduct() {
        CreateProduct createProduct = new CreateProduct();

        InputNumber input = Mockito.mock(InputNumber.class);
        Mockito.when(input.readNumber()).thenReturn(2);
        Mockito.when(input.readString()).thenReturn("Cocos");
        Mockito.when(input.readDouble()).thenReturn(20.0);

        Product expectedDiscout = new Product(0, Category.BERRIES, "Cocos", 20, 20.0, 16.0);
        Product actualDiscout = createProduct.createNewProduct(input);
        assertEquals(expectedDiscout, actualDiscout);
    }
}