import com.example.calculator.models.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    Calculator calculator = new Calculator();
    @Test
    @DisplayName("Tests the add() method")
    //Tests the add() method
    public void testAdd() {
        calculator.add(1);
        assertEquals(calculator.getValue(), 1);
    }
    @Test
    @DisplayName("Tests the subtract() method")
    //Tests the subtract() method
    public void testSubtract() {
        calculator.subtract(1);
        assertEquals(calculator.getValue(), -1);
    }
    @Test
    @DisplayName("Tests the multiply() method")
    //Tests the multiply() method
    public void testMultiply() {
        calculator.setValue(8);
        calculator.multiply(5);
        assertEquals(calculator.getValue(), 40);
    }
    @Test
    @DisplayName("Tests the divide() method")
    //Tests the divide() method
    public void testDivide() {
        calculator.setValue(8);
        calculator.divide(2);
        assertEquals(calculator.getValue(), 4);
    }

    @Test
    @DisplayName("Tests the getValue() method")
    // Tests the getValue() method
    public void testSetValue() {
        calculator.setValue(3);
        assertEquals(calculator.getValue(),3);
    }
    @Test
    @DisplayName("Tests the reset() method")
    // Tests the reset() method
    public void testReset() {
        calculator.setValue(3);
        calculator.reset();
        assertEquals(calculator.getValue(),0);
    }

}
