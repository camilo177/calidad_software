package calculatorPkg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator(5, 3);
        assertEquals(8, calculator.getAddition(), 0.001);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator(10, 4);
        assertEquals(6, calculator.getSubtraction(), 0.001);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator(6, 2);
        assertEquals(12, calculator.getMultiplication(), 0.001);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator(15, 3);
        assertEquals(5, calculator.getDivision(), 0.001);
    }
}
