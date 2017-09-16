import java.util.HashMap;

import static org.testng.Assert.*;

public class listToMapTest {
    @org.testng.annotations.Test
    public void testListToMap() throws Exception {
        listToMap ltm = new listToMap();

        HashMap m = ltm.listToMap();
        assertNotNull(ltm);
    }

}