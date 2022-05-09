import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(20, 100);
    }

    @Test
    public void hasNumberOfSheetsOfPaperLeft(){
        assertEquals(20, printer.getNumberOfSheetsOfPaperLeft());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void testPrint(){
        printer.print(1, 5);
        assertEquals(15, printer.getNumberOfSheetsOfPaperLeft());
        assertEquals(95, printer.getToner());
    }

    @Test
    public void testWillNotPrint(){
        printer.print(10, 5);
        assertEquals(20, printer.getNumberOfSheetsOfPaperLeft());
        assertEquals(100, printer.getToner());
    }

}
