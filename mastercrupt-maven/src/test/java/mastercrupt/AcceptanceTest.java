package mastercrupt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AcceptanceTest {
    @Test
    public void testLeeting() {
        UI ui = new UI();
        assertEquals("Leeted: S3cr3t", ui.leetMessage("Secret"));
    }
}
