import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTwoTest {

    CalculatorTwo calculatorTwo;

    @Before
    public void before(){
        calculatorTwo = new CalculatorTwo();
    }

    @Test
    public void testAdd(){
        assertEquals(16, calculatorTwo.add(10, 6));
    }

    @Test
    public void testSubtract(){
        assertEquals(4, calculatorTwo.subtract(10, 6));
    }

    @Test
    public void testMultiply(){
        assertEquals(60, calculatorTwo.multiply(10, 6));
    }

    @Test
    public void testDivide(){
        assertEquals(2.50, calculatorTwo.divide(10.00, 4.00), 0.0);
    }

}
