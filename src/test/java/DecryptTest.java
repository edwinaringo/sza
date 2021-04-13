import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecryptTest {
    @Test
    public void Decryption_savesMessage_String() {
        Decryption testVal = new Decryption("hello",3);
        assertEquals("hello", testVal.getTextMessage());
    }

    @Test
    public void Decryption_savesShiftValue_Integer() {
        Decryption testVal = new Decryption("hello",3);
        assertEquals(3, testVal.getShiftBy());
    }


}