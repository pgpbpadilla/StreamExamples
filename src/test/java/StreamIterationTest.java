import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StreamIterationTest {
    @Test
    public void testPrintOperationExecution() throws Exception {
        StreamIteration si = new StreamIteration();
        si.printOperationExecution();
        assertTrue(true);
    }

}