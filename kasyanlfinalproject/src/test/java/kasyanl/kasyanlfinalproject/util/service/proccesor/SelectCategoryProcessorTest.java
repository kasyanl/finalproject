package kasyanl.kasyanlfinalproject.util.service.proccesor;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectCategoryProcessorTest {

    @Test
    public void selectNumberCategory1() {

        String expected = "FRUITS";
        String actual = SelectCategoryProcessor.selectNumberCategory(1);
        assertEquals(expected, actual);
    }

    @Test
    public void selectNumberCategory2() {

        String expected = "BERRIES";
        String actual = SelectCategoryProcessor.selectNumberCategory(2);
        assertEquals(expected, actual);
    }
    @Test
    public void selectNumberCategory3() {

        String expected = "VEGETABLES";
        String actual = SelectCategoryProcessor.selectNumberCategory(3);
        assertEquals(expected, actual);
    }
    @Test
    public void selectNumberCategory4() {

        String expected = "MILK_PRODUCT";
        String actual = SelectCategoryProcessor.selectNumberCategory(4);
        assertEquals(expected, actual);
    }
    @Test
    public void selectNumberCategory5() {

        String expected = "MEAT";
        String actual = SelectCategoryProcessor.selectNumberCategory(5);
        assertEquals(expected, actual);
    }
    @Test
    public void selectNumberCategory6() {

        String expected = "ALCOHOLIC_BEVERAGES";
        String actual = SelectCategoryProcessor.selectNumberCategory(6);
        assertEquals(expected, actual);
    }
    @Test
    public void selectNumberCategoryNoneCategory() {

        String expected = "Такого варианта выбора нет, повторите его:";
        String actual = SelectCategoryProcessor.selectNumberCategory(8);
        assertEquals(expected, actual);
    }


}