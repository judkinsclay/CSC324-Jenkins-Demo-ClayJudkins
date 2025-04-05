import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test void testAdd() { assertEquals(5, calc.add(2, 3)); }
    @Test void testDivideByZero() { assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0)); }
}
//This is a test comment for Jenkins trigger.
