package kasyanl.kasyanlfinalproject.util.service.proccesor;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class InputNumberTest {

    InputNumber inputNumber;

    @Before
    public void setUp(){
        inputNumber = new InputNumber(System.in);
    }

    @Test
    public void readString() {
        inputNumber = Mockito.mock(InputNumber.class);
        Mockito.when(inputNumber.readString()).thenReturn("test");

        String expected = inputNumber.readString();
        String actual = inputNumber.readString();
        assertEquals(expected, actual);
    }

    @Test
    public void readNumber() {
        inputNumber = Mockito.mock(InputNumber.class);
        Mockito.when(inputNumber.readNumber()).thenReturn(1);

        int expected = 1;
        int actual = inputNumber.readNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void readDouble() {
        inputNumber = Mockito.mock(InputNumber.class);
        Mockito.when(inputNumber.readDouble()).thenReturn(1.0);

        double expected = 1.0;
        double actual = inputNumber.readDouble();
        assertEquals(expected, actual, 0.0);
    }
}