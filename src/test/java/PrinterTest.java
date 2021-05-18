import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void setup(){
        printer = new Printer(100, 100);
    }


    @Test
    public void canGetAmountOfPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void canPrint10Pages(){
        printer.print(5,2);
        assertEquals(90, printer.getPaper());
    }

    @Test
    public void shouldNotPrintIfNotEnoughPaper(){
        printer.print(100, 5);
        assertEquals(100, printer.getPaper());
    }
    @Test
    public void shouldReduceTonerWhenPrinting(){
        printer.print(5, 2);
        assertEquals(90, printer.getToner());
    }


}
