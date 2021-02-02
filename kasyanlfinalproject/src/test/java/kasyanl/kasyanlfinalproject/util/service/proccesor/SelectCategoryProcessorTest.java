package kasyanl.kasyanlfinalproject.util.service.proccesor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectCategoryProcessorTest {
    SelectCategoryProcessor selectCategoryProcessor;

    @Before
    public void setUp() {
        selectCategoryProcessor = new SelectCategoryProcessor();
    }

    @Test
    public void selectNumberCategoryFRUITS() {

        String expected = "FRUITS";
        String actual = selectCategoryProcessor.selectNumberCategory(1);
        assertEquals(expected, actual);
    }

    @Test
    public void selectNumberCategoryBERRIES() {

        String expected = "BERRIES";
        String actual = selectCategoryProcessor.selectNumberCategory(2);
        assertEquals(expected, actual);
    }

    @Test
    public void selectNumberCategoryVEGETABLES() {

        String expected = "VEGETABLES";
        String actual = selectCategoryProcessor.selectNumberCategory(3);
        assertEquals(expected, actual);
    }

    @Test
    public void selectNumberCategoryMILK_PRODUCT() {

        String expected = "MILK_PRODUCT";
        String actual = selectCategoryProcessor.selectNumberCategory(4);
        assertEquals(expected, actual);
    }

    @Test
    public void selectNumberCategoryMEAT() {

        String expected = "MEAT";
        String actual = selectCategoryProcessor.selectNumberCategory(5);
        assertEquals(expected, actual);
    }

    @Test
    public void selectNumberCategoryALCOHOLIC_BEVERAGES() {

        String expected = "ALCOHOLIC_BEVERAGES";
        String actual = selectCategoryProcessor.selectNumberCategory(6);
        assertEquals(expected, actual);
    }

    @Test
    public void selectNumberCategoryNoneCategory() {

        String expected = "Такого варианта выбора нет, повторите его:";
        String actual = selectCategoryProcessor.selectNumberCategory(8);
        assertEquals(expected, actual);
    }


}