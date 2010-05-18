package mastercrupt;

import static org.junit.Assert.assertEquals;
import mastercrupt.UI;

import org.junit.Test;
public class AcceptanceTest {
    @Test
    public void testLeeting() throws Exception {
        UI ui = new UI();
        assertEquals("Leeted: S3cr3t", ui.leetMessage("Secret"));
    }
}