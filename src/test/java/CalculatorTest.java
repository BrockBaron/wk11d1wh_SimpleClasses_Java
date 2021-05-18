import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

   @Before
    public void before(){
        calculator = new Calculator();
    }


    @Test
    public void add() {
        assertEquals(7, calculator.add(5,2), 0.0);
    }

    @Test
    public void subtract() {
        assertEquals(3, calculator.sub(5,2), 0.0);
    }

    @Test
    public void product() {
        assertEquals(10, calculator.prod(5,2), 0.0);
    }

    @Test
    public void divide() {
        assertEquals(2.5, calculator.div(5,2), 0.01);
    }
}
