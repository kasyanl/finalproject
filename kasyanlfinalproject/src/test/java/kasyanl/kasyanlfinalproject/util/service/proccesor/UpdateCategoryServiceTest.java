package kasyanl.kasyanlfinalproject.util.service.proccesor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UpdateCategoryServiceTest {

    @Test
    public void updateCategory() {
        UpdateCategoryServiceProcessor updateCategoryService = new UpdateCategoryServiceProcessor();
        InputNumber inputNumber = mock(InputNumber.class);
        when(inputNumber.readNumber()).thenReturn(1);

        String expected = "FRUITS";
        String actual = updateCategoryService.updateCategory(inputNumber);
        assertEquals(expected, actual);

    }

}