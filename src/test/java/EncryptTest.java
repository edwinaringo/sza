
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EncryptTest {
    @Test
    public void encryptDecrypt_savesMessage_String() {
        EncryptDecrypt testVal = new EncryptDecrypt("hello",3);
        assertEquals("hello", testVal.getTextMessage());
    }

    @Test
    public void encryptDecrypt_savesShiftValue_Integer() {
        EncryptDecrypt testVal = new EncryptDecrypt("hello",3);
        assertEquals(3, testVal.getShiftBy());
    }

}